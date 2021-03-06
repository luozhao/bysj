package com.bcsf.fzw.tender.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bcsf.fzw.login.dao.TUserDAO;
import com.bcsf.fzw.tender.model.TTender;

public class TTenderDAO extends HibernateDaoSupport {

	private static final Logger log = LoggerFactory.getLogger(TTenderDAO.class);
	
	public void save(TTender tender){
		log.debug("saving TTender tender");
		try {
			getHibernateTemplate().save(tender);
			log.debug("save successful");
		} catch (RuntimeException e) {
			log.error("save failed", e);
			throw e;
		}
	}
	
	public List<TTender> getAll(){
		log.debug("getAll");
		try {
			log.debug("getAll successful");
			return getHibernateTemplate().find("FROM TTender");
		} catch (RuntimeException e) {
			log.error("getAll failed",e);
			throw e;
		}
	}
	
}
