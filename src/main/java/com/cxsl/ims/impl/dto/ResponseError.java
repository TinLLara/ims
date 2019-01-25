package com.cxsl.ims.impl.dto;

public class ResponseError {
	private String errMsg;
	private String errorCode;
	private String detailMsg;
	
	
	private String zhMsg;
	private String zhDetailMsg;
	
	public String getZhMsg() {
		return zhMsg;
	}

	public void setZhMsg(String zhMsg) {
		this.zhMsg = zhMsg;
	}

	public String getZhDetailMsg() {
		return zhDetailMsg;
	}

	public void setZhDetailMsg(String zhDetailMsg) {
		this.zhDetailMsg = zhDetailMsg;
	}

	public String getDetailMsg() {
		return detailMsg;
	}

	public void setDetailMsg(String detailMsg) {
		this.detailMsg = detailMsg;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}


}
