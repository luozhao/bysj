package com.bcsf.fzw.tender.action;

import com.bcsf.fzw.tender.model.TTender;
import com.bcsf.fzw.tender.service.itfc.ITTenderService;
import com.opensymphony.xwork2.ActionSupport;

public class TTenderAction extends ActionSupport{

	private ITTenderService tenderService;
	
	private TTender tender;
	
	public String tenAdd(){
		tenderService.tenAdd(tender);
		return "okAdd";
	}

	public ITTenderService getTenderService() {
		return tenderService;
	}

	public void setTenderService(ITTenderService tenderService) {
		this.tenderService = tenderService;
	}

	public TTender getTender() {
		return tender;
	}

	public void setTender(TTender tender) {
		this.tender = tender;
	}
}
