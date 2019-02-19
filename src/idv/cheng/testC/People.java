package idv.cheng.testC;

import idv.cheng.advice.MyAfter;

public class People extends MyAfter {

	private Teacher teacher;

	public People() {
		super();
		// TODO Auto-generated constructor stub
	}

	public People(Teacher teacher3) {
		super();
		this.teacher = teacher3;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	/**
	 * Description:
	 * 
	 * @author chengmark Feb 15, 2019 11:46:54 AM
	 * @return
	 */
	@Override
	public String toString() {
		return "People [teacher=" + teacher + "]";
	}

}
