package kr.ac.hansung.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Subjects;


@Repository
public class SubjectsDAO {
	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public int getRowCount() {
		String sqlStatement = "select count(*) from subjects";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	
	// querying and returning a single object
	//레코드를 읽어서 오브젝트에 저장하는 메소드
	public Subjects getSubjects(String name) {
		String sqlStatement = "select * from subjects where name=?";
			
		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[]{name}, new SubjectsMapper()); //subjectsMapper()객체를 생성해서 넘겨준다.
	}
	// querying and returning multiple objects
	public List<Subjects> getSubjects() {	//받는 이름을 없앤다.
		String sqlStatement = "select * from subjects";	//조건이 없다.
			
		return jdbcTemplateObject.query(sqlStatement, new SubjectsMapper());	//subjectsMapper()객체를 생성해서 넘겨준다.
	}
		
		
	//insert 
	public boolean insert(Subjects subjects) {
			
		int year = subjects.getYear();
		int semester = subjects.getSemester();
		String code = subjects.getCode();
		String name = subjects.getName();
		String seperate = subjects.getSeperate();
		int grade = subjects.getGrade();
			
		String sqlStatement = "insert into subjects (year, semester, code, name, seperate, grade) values (?,?,?,?,?,?)";
		return (jdbcTemplateObject.update(sqlStatement,new Object[]{year,semester,code,name,seperate,grade})==1);	//jdbcTemplateObject.update 는 몇개가 update 됐는지 개수가 넘어온다.
			
	}
		
	//update 
	public boolean update(Subjects subjects) {
			
		int year = subjects.getYear();
		int semester = subjects.getSemester();
		String code = subjects.getCode();
		String name = subjects.getName();
		String seperate = subjects.getSeperate();
		int grade = subjects.getGrade();
				
		String sqlStatement = "update subjectss set year=?, semester=?, code=?, name=?, seperate=?, grade=? where id=?";
		return (jdbcTemplateObject.update(sqlStatement,new Object[]{year,semester,code,name,seperate,grade})==1);	//jdbcTemplateObject.update 는 몇개가 update 됐는지 개수가 넘어온다.
				
	}
}
