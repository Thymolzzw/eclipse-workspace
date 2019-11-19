package object;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.DaoBase;
import com.dao.StudentDao;


public class StudentDaoImplement extends DaoBase implements StudentDao{

	@Override
	public void insertPStudent(Student stu) {
		// TODO 自动生成的方法存根
		Connection con=getConnection();
		PreparedStatement ps=null;
		String sql="insert into student values(?,?,?,?)";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, stu.getSid());
			ps.setString(2,stu.getSna());
			ps.setString(3, stu.getSex());
			ps.setInt(4, stu.getAge());
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
	public void insertStudent(Student stu) {
		// TODO 自动生成的方法存根
		Connection con=getConnection();
		Statement s=null;
		String sql="insert into student values('"+stu.getSid()+"','"+stu.getSna()+"','"+stu.getSex()+"',"+stu.getAge()+")";
		try {
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
	public void updateStudent(Student stu) {
		// TODO 自动生成的方法存根
		Connection con=getConnection();
		PreparedStatement ps=null;
		String sql="update student"+"\n"
				+ "set sna=?,sex=?,age=?"+"\n"
				+ "where sid=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, stu.getSna());
			ps.setString(2,stu.getSex());
			ps.setInt(3, stu.getAge());
			ps.setString(4, stu.getSid());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			
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
	public void deleteStudent(Student stu) {
		// TODO 自动生成的方法存根
		Connection con=getConnection();
		PreparedStatement ps=null;
		String sql="delete from student"+"\n"
				+ "where sid=?";
		try {
			
			ps=con.prepareStatement(sql);
			ps.setString(1, stu.getSid());
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
	public Student getStudent(String sid) {
		// TODO 自动生成的方法存根
		Student stu=new Student();
		PreparedStatement ps=null;
		Connection con=getConnection();
		String sql="select sid,sna,sex,age from student"+"\n"
				+ "where sid=?";
		ResultSet rs=null;
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, sid);
			rs=ps.executeQuery();
			if(rs.next()) {
				stu.setSid(rs.getString("sid"));
				stu.setSna(rs.getString("sna"));
				stu.setSex(rs.getString("sex"));
				stu.setAge(rs.getInt("age"));
			}else {
				stu=null;
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
		return stu;
	}

	@Override
	public List<Student> getStudentBySql(String mysql) {
		// TODO 自动生成的方法存根
		List<Student> stulist=new ArrayList<Student>();
		String sql="select sid,sna,sex,age from student";
		Connection con=null;
		Statement ps=null;
		ResultSet rs=null;
		if(mysql!=null&&!mysql.equals("")) {
			sql=sql+" where "+mysql;
		}
		con=getConnection();
		try {
			ps=con.createStatement();
			rs=ps.executeQuery(sql);
			while(rs.next()) {
				Student stu=new Student();
				stu.setSid(rs.getString("sid"));
				stu.setSna(rs.getString("sna"));
				stu.setSex(rs.getString("sex"));
				stu.setAge(rs.getInt("age"));
				stulist.add(stu);
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
		
		return stulist;
	}
	
}
