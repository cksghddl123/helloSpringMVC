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
	//���ڵ带 �о ������Ʈ�� �����ϴ� �޼ҵ�
	public Subjects getSubjects(String name) {
		String sqlStatement = "select * from subjects where name=?";
			
		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[]{name}, new SubjectsMapper()); //subjectsMapper()��ü�� �����ؼ� �Ѱ��ش�.
	}
	// querying and returning multiple objects
	public List<Subjects> getSubjects() {	//�޴� �̸��� ���ش�.
		String sqlStatement = "select * from subjects";	//������ ����.
			
		return jdbcTemplateObject.query(sqlStatement, new SubjectsMapper());	//subjectsMapper()��ü�� �����ؼ� �Ѱ��ش�.
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
		return (jdbcTemplateObject.update(sqlStatement,new Object[]{year,semester,code,name,seperate,grade})==1);	//jdbcTemplateObject.update �� ��� update �ƴ��� ������ �Ѿ�´�.
			
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
		return (jdbcTemplateObject.update(sqlStatement,new Object[]{year,semester,code,name,seperate,grade})==1);	//jdbcTemplateObject.update �� ��� update �ƴ��� ������ �Ѿ�´�.
				
	}
}
