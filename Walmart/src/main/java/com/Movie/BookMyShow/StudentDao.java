package com.Movie.BookMyShow;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.Movie.modelObjects.StudentUser;

public class StudentDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	/*
	 * public List<StudentUser> ById(String mobNumber){ String
	 * sql="select * from user_table where USER_MOB=?"; //return
	 * template.queryForObject(sql, new Object[]{mobNumber},new
	 * BeanPropertyRowMapper<StudentUser>(StudentUser.class)); // return
	 * template.query(sql, new ResultSetExtractor<List<StudentUser>>()); }
	 */

	public List<StudentUser> ById(String USER_MOB) {
		
		//template.
		return template.query("SELECT * FROM user_table" ,
				new ResultSetExtractor<List<StudentUser>>() {

					public List<StudentUser> extractData(ResultSet rs) throws SQLException, DataAccessException {
						// TODO Auto-generated method stub
						List<StudentUser> list = new ArrayList<StudentUser>();
						while (rs.next()) {
							StudentUser e = new StudentUser();
							e.setEmailId(rs.getString(1));
							e.setMobNumber(rs.getString(1));

							list.add(e);
						}
						return list;

					}
				});
	}

}
