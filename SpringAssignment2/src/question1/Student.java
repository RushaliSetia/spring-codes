package question1;

import java.util.Iterator;
import java.util.Set;

public class Student {

	private int sid;
	private String name;
	private Set<Course> course;

	public Student() {
		super();
	}

	public Student(int sid, String name, Set<Course> course) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	public void printInfo() {
		System.out.println("---------displaying student information--------");
		System.out.println("student id:" + getSid() + "\nstudent name:" + getName());
		System.out.println("---------course information of student is---------");
		Iterator<Course> itr = course.iterator();
		while (itr.hasNext()) {
			Course course = itr.next();
			System.out.println("course id:" + course.getCid());
			System.out.println("course name:" + course.getName());
			System.out.println("course fee is:" + course.getFee());
		}
	}

}
