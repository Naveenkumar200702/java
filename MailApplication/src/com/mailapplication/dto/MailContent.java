package com.mailapplication.dto;

public class MailContent {
	private String from;
	private String to;
	private String date;
	private String time;
	private String content;

	public String getFrom() {
		return from;
	}

	public MailContent(String from, String to, String content, String date, String time) {
		this.from = from;
		this.to = to;
		this.date = date;
		this.content = content;
		this.time = time;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
