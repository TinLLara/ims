package com.cxsl.ims.impl.dto;

import java.util.HashMap;
import java.util.Map;

public class BodyData {
	/**
	 * 错误信息,格式为:{msg:'no data';errorCode:"100"}
	 */
	private ResponseError error;

	/**
	 * 响应报文
	 */
	private Object content;
	
	private Boolean status=true;
		
	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public ResponseError getError() {
		return error;
	}

	public void setError(ResponseError error) {
		this.error = error;
	}

	public void setError(String errorCode, String errorMsg) {
		setError(errorCode, errorMsg, null);
	}

	public void setError(String errorCode, String errorMsg, String detailMsg) {
		if (error == null) {
			error = new ResponseError();
		}
		error.setErrorCode(errorCode);
		error.setErrMsg(errorMsg);
		error.setDetailMsg(detailMsg);
	}
	
	public void setErrorZh(String errorCode, String zhMsg, String zhDetailMsg) {
		if (error == null) {
			error = new ResponseError();
		}
		error.setErrorCode(errorCode);
		error.setZhMsg(zhMsg);;
		error.setZhDetailMsg(zhDetailMsg);;
	}
	

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	public static BodyData make(Object data, ResponseError e) {
		BodyData rb = new BodyData();
		rb.setError(e);
		rb.setContent(data);
		return rb;
	}
	
	public static BodyData make(Boolean status) {
		BodyData rb = new BodyData();
		rb.setStatus(status);
		return rb;
	}

	public static BodyData make(Object data) {
		return make(data, null);
	}

	public static BodyData make(ResponseError e) {
		return make(null, e);
	}

	public static BodyData makeWithErrorInfo(String errorCode, String errorMsg) {
		return makeWithErrorInfo(errorCode, errorMsg, null);
	}
	
	
	public static BodyData makeWithErrorInfo(String errorCode, String errorMsg,String detailMsg,Boolean status) {
		BodyData bd = make();
		bd.setError(errorCode, errorMsg, detailMsg);
		bd.setStatus(status);
		return bd;
	}

	public static BodyData makeWithErrorInfo(String errorCode, String errorMsg,
			String detailMsg) {
		BodyData bd = make();
		bd.setError(errorCode, errorMsg, detailMsg);
		return bd;
	}

	public static BodyData make() {
		return make(null, null);
	}

	public static <T> BodyData makeWithData(String key, T value) {
		Map<String, T> data = new HashMap<String, T>();
		data.put(key, value);
		return make(data);
	}

}
