package kr.ac.hansung.model;

public class Subjects {
	private int id;
	private int year;
	private int semester;
	private String code;
	private String name;
	private String seperate;
	private int grade;
	
	public Subjects() {
		
	}
	
	public Subjects(int year, int semester, String code, String name, String seperate, int grade) {		
		this.year = year;
		this.semester = semester;
		this.code = code;
		this.name = name;
		this.seperate = seperate;
		this.grade = grade;
	}
	
	public Subjects(int id, int year, int semester, String code, String name, String seperate, int grade) {
		this.id = id;
		this.year = year;
		this.semester = semester;
		this.code = code;
		this.name = name;
		this.seperate = seperate;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeperate() {
		return seperate;
	}

	public void setSeperate(String seperate) {
		this.seperate = seperate;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", 년도=" + year + ", 학기=" + semester + ", 코드=" + code + ", 과목명=" + name
				+ ", 분반=" + seperate + ", 학점=" + grade + "]";
	}

	

	
}
