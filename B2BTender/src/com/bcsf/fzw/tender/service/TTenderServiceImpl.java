package com.bcsf.fzw.tender.service;

import com.bcsf.fzw.tender.dao.TTenderDAO;
import com.bcsf.fzw.tender.model.TTender;
import com.bcsf.fzw.tender.service.itfc.ITTenderService;

public class TTenderServiceImpl implements ITTenderService{

	private TTenderDAO tenderDAO;
	
	public void tenAdd(TTender tender) {
		tenderDAO.save(tender);
	}

	public TTenderDAO getTenderDAO() {
		return tenderDAO;
	}

	public void setTenderDAO(TTenderDAO tenderDAO) {
		this.tenderDAO = tenderDAO;
	}
	
}
