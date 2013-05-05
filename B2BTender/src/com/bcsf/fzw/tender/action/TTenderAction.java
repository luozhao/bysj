package com.bcsf.fzw.tender.action;

import java.util.List;

import com.bcsf.fzw.tender.model.TTender;
import com.bcsf.fzw.tender.service.itfc.ITTenderService;
import com.opensymphony.xwork2.ActionSupport;

public class TTenderAction extends ActionSupport{

	private ITTenderService tenderService;
	
	private TTender tender;
	private List<TTender> listTender;
	
	public String tenAdd(){
		tenderService.tenAdd(tender);
		return tenList();
	}
	
	public String tenList(){
		listTender = tenderService.getAll();
		System.out.println(listTender.get(0).getTenTitle());
		return "okList";
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

	public List<TTender> getListTender() {
		return listTender;
	}

	public void setListTender(List<TTender> listTender) {
		this.listTender = listTender;
	}
	
}
