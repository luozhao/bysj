package com.bcsf.fzw.tender.model;

/**
 * TTender entity. @author MyEclipse Persistence Tools
 */

public class TTender implements java.io.Serializable {

	// Fields

	private Integer tenId;
	private String tenTitle;
	private String tenUp;
	private String tenCdown;
	private String openTime;
	private String closTime;
	private String placeBidOpen;
	private String tenNoticeFile;
	private String bidAgent;
	private String tenNotice;

	// Constructors

	/** default constructor */
	public TTender() {
	}

	/** full constructor */
	public TTender(String tenTitle, String tenUp, String tenCdown,
			String openTime, String closTime, String placeBidOpen,
			String tenNoticeFile, String bidAgent, String tenNotice) {
		this.tenTitle = tenTitle;
		this.tenUp = tenUp;
		this.tenCdown = tenCdown;
		this.openTime = openTime;
		this.closTime = closTime;
		this.placeBidOpen = placeBidOpen;
		this.tenNoticeFile = tenNoticeFile;
		this.bidAgent = bidAgent;
		this.tenNotice = tenNotice;
	}

	// Property accessors

	public Integer getTenId() {
		return this.tenId;
	}

	public void setTenId(Integer tenId) {
		this.tenId = tenId;
	}

	public String getTenTitle() {
		return this.tenTitle;
	}

	public void setTenTitle(String tenTitle) {
		this.tenTitle = tenTitle;
	}

	public String getTenUp() {
		return this.tenUp;
	}

	public void setTenUp(String tenUp) {
		this.tenUp = tenUp;
	}

	public String getTenCdown() {
		return this.tenCdown;
	}

	public void setTenCdown(String tenCdown) {
		this.tenCdown = tenCdown;
	}

	public String getOpenTime() {
		return this.openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getClosTime() {
		return this.closTime;
	}

	public void setClosTime(String closTime) {
		this.closTime = closTime;
	}

	public String getPlaceBidOpen() {
		return this.placeBidOpen;
	}

	public void setPlaceBidOpen(String placeBidOpen) {
		this.placeBidOpen = placeBidOpen;
	}

	public String getTenNoticeFile() {
		return this.tenNoticeFile;
	}

	public void setTenNoticeFile(String tenNoticeFile) {
		this.tenNoticeFile = tenNoticeFile;
	}

	public String getBidAgent() {
		return this.bidAgent;
	}

	public void setBidAgent(String bidAgent) {
		this.bidAgent = bidAgent;
	}

	public String getTenNotice() {
		return this.tenNotice;
	}

	public void setTenNotice(String tenNotice) {
		this.tenNotice = tenNotice;
	}

}