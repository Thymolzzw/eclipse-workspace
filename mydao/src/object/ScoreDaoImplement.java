package object;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.DaoBase;
import com.dao.ScoreDao;

public class ScoreDaoImplement extends DaoBase implements ScoreDao{

	@Override
	public void insertPScore(Score sc) {
		// TODO 自动生成的方法存根
		Connection con=null;
		PreparedStatement ps=null;
		String sql="insert into score values(?,?,?)";
		
		try {
			con=getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, sc.getSid());
			ps.setString(2, sc.getCid());
			ps.setInt(3, sc.getScore());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(ps!=null) {
					ps.close();
				}
				
				
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

	@Override
	public void insertScore(Score sc) {
		// TODO 自动生成的方法存根
		Connection con=null;
		Statement s=null;
		String sql="insert into score values('"+sc.getSid()+"','"+sc.getCid()+"',"+sc.getScore()+")";
		
		try {
			con=getConnection();
			s=con.createStatement();
			s.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(s!=null) {
					s.close();
				}
				
				
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void updateScore(Score sc) {
		// TODO 自动生成的方法存根
		Connection con=null;
		PreparedStatement ps=null;
		String sql="update score"+"\n"
				+ "set score=?"+"\n"
				+ "where sid=? and cid=?";
		
		try {
			con=getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(2, sc.getSid());
			ps.setString(3, sc.getCid());
			ps.setInt(1, sc.getScore());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(ps!=null) {
					ps.close();
				}
				
				
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void deleteScore(Score sc) {
		// TODO 自动生成的方法存根
		Connection con=null;
		PreparedStatement ps=null;
		String sql="delete from score"+"\n"
				+ "where sid=? and cid=?";
		
		try {
			con=getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, sc.getSid());
			ps.setString(2, sc.getCid());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(ps!=null) {
					ps.close();
				}
				
				
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}

	@Override
	public Score getScore(String sid, String cid) {
		// TODO 自动生成的方法存根
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Score sc=new Score();
		String sql="select sid,cid,score from score"+"\n"
				+ "where sid=? and cid=?";
		
		try {
			con=getConnection();
			ps=con.prepareStatement(sql);
			ps.setString(1, sc.getSid());
			ps.setString(2, sc.getCid());
			rs=ps.executeQuery();
			if(rs.next()) {
				sc.setSid(rs.getString("sid"));
				sc.setCid(rs.getString("cid"));
				sc.setScore(rs.getInt("score"));
			}else {
				sc=null;
			}
			
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(ps!=null) {
					ps.close();
				}
				if(rs!=null) {
					rs.close();
				}
				
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		return sc;
	}

	@Override
	public List<Score> getScoreBySql(String mysql) {
		// TODO 自动生成的方法存根
		List<Score> list=new ArrayList<Score>();
		String sql="select sid,cid,score from score"+"\n";
		if(mysql!=null&&!mysql.equals("")){
			sql=sql+" where "+mysql;
		}
		Connection con=null;
		Statement s=null;
		ResultSet rs=null;
		try {
			con=getConnection();
			s=con.createStatement();
			rs=s.executeQuery(sql);
			while(rs.next()) {
				Score sc=new Score();
				sc.setSid(rs.getString("sid"));
				sc.setCid(rs.getString("cid"));
				sc.setScore(rs.getInt("score"));
				list.add(sc);
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			try {
				if(con!=null) {
					con.close();
				}
				if(s!=null) {
					s.close();
				}
				if(rs!=null) {
					rs.close();
				}
				
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		return list;
	}

}
