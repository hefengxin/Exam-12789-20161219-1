
    
package com.cn.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cn.domain.FilmDomain;
import com.cn.domain.UserDomain;


public class UserDao {
	public UserDomain findByNama(String name){
		DbUtils dbUtils=new DbUtils();
		UserDomain user=new UserDomain();
		Connection con=dbUtils.connection();
		if(con!=null){
			try {
				Statement sta=con.createStatement();
				String sql="select * from customer where first_name='"+name+"'";
				ResultSet set=sta.executeQuery(sql);
				while(set.next()){
					user.setName(set.getString("first_name"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		 return user;
	}

	public int deleteFilm(int id){
		DbUtils dbUtils=new DbUtils();
		Connection con=dbUtils.connection();
		int i=0;
		if(con!=null){
			try {
				Statement sta=con.createStatement();
				String sql="delete from language l,film f where l.language_id=f.language_id and film_id="+id;
				sta.executeUpdate(sql);
				i=1;
				System.out.println(id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return i;
	}
    

	public List<FilmDomain> getFilm(){
		DbUtils dbUtils=new DbUtils();
		List<FilmDomain> list =new ArrayList<FilmDomain>();
		Connection con=dbUtils.connection();
		FilmDomain film=null;
		if(con!=null){
			try {
				Statement sta=con.createStatement();
				String sql="select  film_id,title,description,name from film f, language l where l.language_id=f.language_id";
				ResultSet set=sta.executeQuery(sql);
				while(set.next()){
					film=new FilmDomain();
					film.setId(set.getInt("film_id"));
					film.setTitle(set.getString("title"));
					film.setDescription(set.getString("description"));
					film.setLanguage(set.getString("name"));
					list.add(film);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public FilmDomain findById(int id){
		FilmDomain filmDomain=new FilmDomain();
		DbUtils dbUtils=new DbUtils();
		Connection con=dbUtils.connection();
		if(con!=null){
			try {
				Statement sta=con.createStatement();
				String sql="select  title,description,name from film f, language l where l.language_id=f.language_id and film_id="+id;
				ResultSet set=sta.executeQuery(sql);
				while (set.next()) {
					filmDomain.setTitle(set.getString("title"));
					filmDomain.setDescription(set.getString("description"));
					filmDomain.setLanguage(set.getString("name"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return filmDomain;
	}

	public void edit(FilmDomain film) {
			DbUtils dbUtils=new DbUtils();
			Connection con=dbUtils.connection();
			findLa(film.getLanguage());
			if(con!=null){
				try {
					Statement sta=con.createStatement();
					String sql="update film set title='"+film.getTitle()+"',description='"+film.getDescription()+"'where film_id="+film.getId();
					sta.executeUpdate(sql);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}	
	}
	
	public void findLa(String la){
		DbUtils dbUtils=new DbUtils();
		Connection con=dbUtils.connection();
		if(con!=null){
			try {
				Statement sta=con.createStatement();
				String sql="";
				sta.executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
	}
	
	
}
