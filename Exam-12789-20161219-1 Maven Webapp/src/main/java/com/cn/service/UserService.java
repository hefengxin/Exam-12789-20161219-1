package com.cn.service;

import java.util.ArrayList;
import java.util.List;

import com.cn.dao.UserDao;
import com.cn.domain.FilmDomain;
import com.cn.domain.UserDomain;
  
public class UserService {
	private  UserDao userDao=new UserDao();
	public boolean findByName(String name){
		boolean find=false;
		UserDomain user2=userDao.findByNama(name);
		if(name.equalsIgnoreCase(user2.getName())){
			find =true;
		}
		return find;
	}
	public boolean deleteFilm(int id) {
		boolean find=false;
		int i=userDao.deleteFilm(id);
		if(i==1){
			 find = true;
		}
		return find;
	}
	
	public List<FilmDomain> getList(){
		List<FilmDomain> film = userDao.getFilm();
		System.out.println(film);
		return userDao.getFilm();
		
	}
	public FilmDomain find(int id){
		FilmDomain filmDomain=userDao.findById(id);
		if(filmDomain!=null){
			return filmDomain;
		}
		return null;
	}
	public void edit(FilmDomain film) {
		userDao.edit(film);
		
	}
}
