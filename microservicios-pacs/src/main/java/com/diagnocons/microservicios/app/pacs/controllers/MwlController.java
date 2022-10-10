package com.diagnocons.microservicios.app.pacs.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aguirre.microservicios.commons.controllers.CommonController;
import com.diagnocons.microservicios.app.pacs.models.entity.MwlItem;
import com.diagnocons.microservicios.app.pacs.services.MwlItemService;

@RestController
@RequestMapping("mwl-items")
public class MwlController extends CommonController<MwlItem, MwlItemService>{

	
	
}
