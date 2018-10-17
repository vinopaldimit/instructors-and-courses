package org.wecancodeit.instructorsandcourses;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CourseTopic {
	
	@Id
	@GeneratedValue
	private long id;
	private String courseName;
	private String courseDesc;
	private long instructorId;
	
	public CourseTopic() {}
	
	public CourseTopic(String courseName, String courseDesc, long instructorId) {
		super();
		this.courseName = courseName;
		this.courseDesc = courseDesc;
		this.instructorId = instructorId;
	}

	public long getId() {
		return id;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public String getCourseDesc() {
		return courseDesc;
	}
	
	public long getInstructorId() {
		return instructorId;
	}
	
	
	
}
