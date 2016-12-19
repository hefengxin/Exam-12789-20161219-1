package com.cn.domain;

import java.util.List;

  
    /**        
 * Title: FilmDomain.java    
 * Description: film类实例化
 * @author 王志南       
 * @created 2016-12-19 下午1:15:15    
 */

public class FilmDomain {
	private int id;
	private String title;
	private String description;
	private String language;
	private List<Language> languageList;
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
