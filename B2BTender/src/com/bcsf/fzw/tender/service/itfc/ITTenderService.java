package com.bcsf.fzw.tender.service.itfc;

import java.util.List;

import com.bcsf.fzw.tender.model.TTender;

public interface ITTenderService {

	public void tenAdd(TTender tender);
	
	public List<TTender> getAll();
}
