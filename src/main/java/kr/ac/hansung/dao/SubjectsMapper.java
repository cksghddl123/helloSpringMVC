package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.model.Subjects;

public class SubjectsMapper implements RowMapper<Subjects>{

	@Override
	public Subjects mapRow(ResultSet rs, int rowNum) throws SQLException {
		Subjects course  = new Subjects();
		
		course.setId(rs.getInt("id"));
		course.setSemester(rs.getInt("semester"));
		course.setYear(rs.getInt("year"));
		course.setCode(rs.getString("code"));
		course.setName(rs.getString("name"));
		course.setSeperate(rs.getString("seperate"));
		course.setGrade(rs.getInt("grade"));
		
		return course;
	}

}
