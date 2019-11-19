package com.dao;
import java.util.List;

import object.*;

public interface ScoreDao {
	public void insertScore(Score sc);
	public void updateScore(Score sc);
	public void deleteScore(Score sc);
	public Score getScore(String sid,String cid);
	public List<Score> getScoreBySql(String mysql);
	public void insertPScore(Score sc);
}
