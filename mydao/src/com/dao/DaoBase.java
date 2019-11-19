package com.dao;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import object.Student;

public class DaoBase implements Dao{

	@Override
	public Connection getConnection() {
		// TODO 自动生成的方法存根
		Connection con=null;
		String url=null;
		String classname=null;
		try {
			DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=dFactory.newDocumentBuilder();
			Document doc=builder.parse(new File("src/dbconfig.xml"));
			
			NodeList nl=doc.getElementsByTagName("classname");
			Node classNode=nl.item(0).getFirstChild();
			
			classname=classNode.getNodeValue().trim();
//			System.out.println(classname);
			
			NodeList nl1=doc.getElementsByTagName("url");
			Node urlNode=nl1.item(0).getFirstChild();
			url=urlNode.getNodeValue().trim();
//			System.out.println(url);
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Class.forName(classname);
			con=DriverManager.getConnection(url);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		return con;
	}


}
