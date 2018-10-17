package org.wecancodeit.instructorsandcourses;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CourseController {
	
	@Resource
	InstructorRepository instructorRepo;

	@Resource
	CourseTopicRepository courseTopicRepo;
	
	@GetMapping("/")
	public String home() {
		return "redirect:coursetopics";
	}
	
	@GetMapping("/coursetopics")
	public String getCourseTopics(Model model) {
		model.addAttribute("courseTopics", courseTopicRepo.findAll());
		return "coursetopics";
	}
	
	@GetMapping("/instructors")
	public String getInstructors(Model model) {
		model.addAttribute("instructors", instructorRepo.findAll());
		return "instructors";
	}
	
	@GetMapping("/coursetopics/{id}")
	public String getCourseTopic(@PathVariable(value = "id") Long id, Model model) {
		model.addAttribute("courseTopic", courseTopicRepo.findById(id).get());
		model.addAttribute("instructors", instructorRepo);
		return "coursetopic";
	}
	
	@GetMapping("/instructors/{id}")
	public String getInstructor(@PathVariable(value="id") Long id, Model model) {
		model.addAttribute("instructor", instructorRepo.findById(id).get());
		return "instructor";
	}
}
