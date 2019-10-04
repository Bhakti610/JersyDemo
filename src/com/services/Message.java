package com.services;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message
{
	private int id;
	private String msg;
	private LocalDate doc;
	
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(int id, String msg, LocalDate doc) {
		super();
		this.id = id;
		this.msg = msg;
		this.doc = doc;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public LocalDate getDoc() {
		return doc;
	}

	public void setDoc(LocalDate doc) {
		this.doc = doc;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", msg=" + msg + ", doc=" + doc + "]";
	}
}
