package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.SubjectsDAO;
import kr.ac.hansung.model.Subjects;

@Service
public class SubjectsService {
	
	private SubjectsDAO SubjectsDao;
	
	@Autowired
	public void setSubjectsDao(SubjectsDAO SubjectsDao) {
		this.SubjectsDao = SubjectsDao;
	}
	
	public List<Subjects> getCurrent() {
		return SubjectsDao.getSubjects();
	}

	public void insert(Subjects Subjects) {
		SubjectsDao.insert(Subjects);
	}
}
