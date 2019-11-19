package com.dao;

import object.*;

public class DaoFactory {
	
	private volatile static DaoFactory instance=null;
	private DaoFactory(){
	}
	public static DaoFactory getInstance() {
		if(instance==null) {
			synchronized (DaoFactory.class) {
				instance=new DaoFactory();
			}
		}
		return instance;
	}
	public StudentDao getStudentDao() {
		return new StudentDaoImplement();
	}
	public ScoreDao getScoreDao() {
		return new ScoreDaoImplement();
	}
	
}
