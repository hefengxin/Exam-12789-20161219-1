   
	 /**     
     * @description 创建数据库连接工具，实现数据库连接
     * @author 王志南       
     * @created 2016-12-19 上午11:16:37    
     * tags     
     * see_to_target     
     */
    
package com.cn.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

    /**        
 * Title: DbUtils.java    
 * Description: 数据库连接类
 * @author 王志南       
 * @created 2016-12-19 上午11:16:37    
 */

public class DbUtils {
	private static Properties properties=null;//创建配置对象
 	static{
		try {
			InputStream in=DbUtils.class.getClassLoader().getResourceAsStream("/dbproperties.properties");
			properties=new Properties();
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Class.forName(properties.getProperty("driverclassname"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	} 
	    /**     
	     * @description 连接数据库
	     * @author 王志南       
	     * @created 2016-12-17 下午8:59:05     
	     * @return  con对象   
	     */ 
	public Connection connection(){
		Connection con=null;
		try {
			con=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("password"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
