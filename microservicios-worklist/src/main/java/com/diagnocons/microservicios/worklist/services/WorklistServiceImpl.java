package com.diagnocons.microservicios.worklist.services;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.diagnocons.microservicios.worklist.models.entity.Worklist;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.app.Connection;
import ca.uhn.hl7v2.app.Initiator;
import ca.uhn.hl7v2.llp.LLPException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.Parser;


@Service
public class WorklistServiceImpl implements WorklistService {

	@Override
	public boolean registrarEnWorklist(Worklist worklist) {
		
		boolean useTls = false; // Should we use TLS/SSL?
		
		HapiContext context = new DefaultHapiContext();
	
		
		context.getParserConfiguration().setValidating(false);

		Parser p = context.getPipeParser();
		Message adt = null;
		Connection connection = null;
		boolean success = false;
		
		try {
			adt = p.parse(worklist.getMensaje()); // el otro usa p.enconde
			// Remember, we created our HAPI Context above like so:
			// HapiContext context = new DefaultHapiContext();
			// A connection object represents a socket attached to an HL7 server
			connection = context.newClient(worklist.getHost(), worklist.getPort(), useTls);

			// The initiator is used to transmit unsolicited messages
			Initiator initiator = connection.getInitiator();
			Message response = null;

			response = initiator.sendAndReceive(adt);
			String responseString = p.encode(response);
			System.out.println(worklist.getMensaje());
			System.out.println("Received response:\n" + responseString);
			success = true;
		} catch (HL7Exception | LLPException | IOException ex) {
			ex.printStackTrace(System.out);
		} finally {
			connection.close();
		}
		return success;
	}
	
	
	
}

