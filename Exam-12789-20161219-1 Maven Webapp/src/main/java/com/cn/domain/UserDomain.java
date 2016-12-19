package com.cn.domain;
    /**        
     * Title: UserDomain.java    
     * Description: 获取用户实体类
     * @author 王志南       
     * @created 2016-12-19 上午11:15:16    
     */      
    
public class UserDomain {
	private String name;//用户名
	
	
	public UserDomain() {
		super();
	}

	public UserDomain(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
