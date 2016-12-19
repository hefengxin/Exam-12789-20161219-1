package com.cn.domain;

public class Language {
	private int language;
	private String name;
	public Language() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Language(int language, String name) {
		super();
		this.language = language;
		this.name = name;
	}
	public int getLanguage() {
		return language;
	}
	public void setLanguage(int language) {
		this.language = language;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
