package com.wb.kafka.configuration;

import org.springframework.util.StringUtils;
public class Response<T> {

	private String code;
	private String message;
	private T body;
	private String url;
	private Long[] id;
	//前端数据
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	public Long[] getId() {
		return id;
	}

	public void setId(Long... id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	public static Response getSuccessResult() {
		Response<String> bean = new Response<>();
		bean.setCode("0");
		bean.setMessage("SUCCESS");
		bean.setBody("");
		return bean;
	}

	public static Response getErrorResult() {
		Response<String> bean = new Response<>();
		bean.setCode("-1");
		bean.setMessage("error");
		bean.setBody("系统错误，请联系管理员。");
		return bean;
	}

	public static <T> Response<T> getErrorResult(T obj) {
		Response<T> bean = new Response<T>();
		bean.setCode("-1");
		bean.setMessage("ERROR");
		bean.setBody(obj);
		return bean;
	}

	public static <T> Response<T> getSuccessResult(T obj) {
		Response<T> bean = new Response<T>();
		bean.setCode("0");
		bean.setMessage("SUCCESS");
		bean.setBody(obj);
		return bean;
	}

	public static <T> Response<T> getSuccessResultForLog(Long... id) {
		Response<T> bean = new Response<T>();
		bean.setCode("0");
		bean.setMessage("SUCCESS");
		bean.id = id;
		return bean;
	}

	public Response() {
	}

	public Response(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public boolean isSuccess() {
		return StringUtils.isEmpty(code) || "0".equals(this.code) || "200".equals(this.code);
	}

	public boolean isFail() {
		return !isSuccess();
	}

	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public static <T> Response<T> getIndexSuccessResult(T obj) {
		Response<T> bean = new Response<T>();
		bean.setCode("200");
		bean.setMessage("ok");
		bean.setData(obj);
		return bean;
	}

	public static <T> Response<T> getIndexFailResult(String message) {
		Response<T> bean = new Response<T>();
		bean.setCode("0");
		bean.setMessage(message);
		return bean;
	}

	public static <T> Response<T> getFailResult(String message) {
		Response<T> bean = new Response<T>();
		bean.setCode("-1");
		bean.setMessage(message);
		return bean;
	}
}
