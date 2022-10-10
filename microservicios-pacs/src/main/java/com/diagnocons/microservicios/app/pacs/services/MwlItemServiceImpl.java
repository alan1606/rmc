package com.diagnocons.microservicios.app.pacs.services;

import org.springframework.stereotype.Service;

import com.aguirre.microservicios.commons.services.CommonServiceImpl;
import com.diagnocons.microservicios.app.pacs.models.entity.MwlItem;
import com.diagnocons.microservicios.app.pacs.models.repository.MwlItemRepository;

@Service
public class MwlItemServiceImpl extends CommonServiceImpl<MwlItem, MwlItemRepository> implements MwlItemService{

}
