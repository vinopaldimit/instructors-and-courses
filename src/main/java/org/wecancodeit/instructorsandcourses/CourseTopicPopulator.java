package org.wecancodeit.instructorsandcourses;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class CourseTopicPopulator implements CommandLineRunner {

	@Resource
	CourseTopicRepository courseTopicRepo;
	
	@Resource
	InstructorRepository instructorRepo;
	
	@Override
	public void run(String... args) throws Exception {
		Instructor one = new Instructor("Brian","Forsythe");
		instructorRepo.save(one);
		Instructor two = new Instructor("Donny","Hamilton");
		instructorRepo.save(two);
		Instructor three = new Instructor("Alan","Kostrick");
		instructorRepo.save(three);
		
		courseTopicRepo.save(new CourseTopic("Spring", "", one.getId()));
		courseTopicRepo.save(new CourseTopic("HTML", "", two.getId()));
		courseTopicRepo.save(new CourseTopic("Javascript", "", two.getId()));
		courseTopicRepo.save(new CourseTopic("Java", "", three.getId()));
	}

}
