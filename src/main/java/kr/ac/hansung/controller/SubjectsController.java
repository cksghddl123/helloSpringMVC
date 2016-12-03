package kr.ac.hansung.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.hansung.model.Subjects;
import kr.ac.hansung.service.SubjectsService;


@Controller
public class SubjectsController {
	
	private SubjectsService SubjectsService;
	
	@Autowired
	public void setCourseService(SubjectsService SubjectsService) {
		this.SubjectsService = SubjectsService;
	}

	@RequestMapping("/semesterinquiry")
	public String showSemesterInquiry(Model model) {
		
		List<Subjects> subjects = SubjectsService.getCurrent();
		
		HashMap<String,Integer> map = new  HashMap<String,Integer>();
		
		for(Subjects cour: subjects) {	//�ڵ带 �����ͼ� ã�´�.
			int sum=0;
			String key = cour.getYear()+"-"+cour.getSemester();
		
			if(map.get(key)==null) 
				sum = map.getOrDefault(key,0)+1;
			else
				sum = map.get(key)+1;
			map.put(key, sum);
		}
		
		model.addAttribute("gradeForSemester", map);		//semesterinquiry.jsp�� ���� �Ѿ��.
		
		return "semesterinquiry";
	}
	
	@RequestMapping("/divisiongrade")
	public String showDivisionInquiry(Model model) {
		List<Subjects> course = SubjectsService.getCurrent();
		HashMap<String,Integer> map = new  HashMap<String,Integer>();
		
		for(Subjects cour: course) {	//�ڵ带 �����ͼ� ã�´�.
			int sum=0;
			String key = cour.getSeperate();
			if(map.get(key)==null) 
				sum = map.getOrDefault(key, cour.getGrade());
			else
				sum = map.get(key)+cour.getGrade();
			map.put(key, sum);
		}
		
		model.addAttribute("gradeSemester", map);
		return "divisiongrade";
	}
	
	@RequestMapping("/semestergrade")
	public String showSemesterGrade(Model model,@RequestParam(value="key")String key) {
		
		List<Subjects> course = SubjectsService.getCurrent();
		
		
		String[] split=key.split("-");
		int year = Integer.parseInt(split[0]);
		int semester = Integer.parseInt(split[1]);
		
		ArrayList<Subjects> list = new ArrayList<Subjects>();
		
		for(Subjects cour: course) {	//�ڵ带 �����ͼ� ã�´�.
			if((cour.getYear()==year) && (cour.getSemester()==semester)) {
				list.add(cour);
			}
		}
		
		System.out.println(list);
		model.addAttribute("list", list);		//semesterinquiry.jsp�� ���� �Ѿ��.
		
		return "semestergrade";
	}
	
	@RequestMapping("/createcourse")
	public String showcreatecourse(Model model) {
		
		return "createcourse";
	}
	
	//@RequestMapping(value="/docreate", method=RequestMethod.POST)
	
	@RequestMapping("/docreate")
	public String doCreate(Model model,Subjects course) { 
		course.setYear(2017);
		course.setSemester(1);
		SubjectsService.insert(course);

		return "coursecreated";
		
	}
	
	@RequestMapping("/checkcreatedcourse")
	public String checkCreatedCourse(Model model) {
		
		List<Subjects> course = SubjectsService.getCurrent();
		System.out.println("check");

		ArrayList<Subjects> list = new ArrayList<Subjects>();
		
		for(Subjects cour: course) {	//�ڵ带 �����ͼ� ã�´�.
			if((cour.getYear()==2017)) {
				list.add(cour);
			}
		}
		
		model.addAttribute("list", list);		//semesterinquiry.jsp�� ���� �Ѿ��.
		
		return "checkcreatedcourse";
	}
}
