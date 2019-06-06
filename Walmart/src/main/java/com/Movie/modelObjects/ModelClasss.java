package com.Movie.modelObjects;

import java.util.ArrayList;

import javax.validation.constraints.Size;

public class ModelClasss {

	
	@Size(min=5, max=10)
	private String box1;
	private Integer box2;
	private String box3;
	private Double box4;
	
	private Long box5;
	
	
	private ArrayList<String> skillSet;

	public String getBox1() {
		return box1;
	}

	public void setBox1(String box1) {
		this.box1 = box1;
	}

	
	public String getBox3() {
		return box3;
	}

	public void setBox3(String box3) {
		this.box3 = box3;
	}

	public Double getBox4() {
		return box4;
	}

	public void setBox4(Double box4) {
		this.box4 = box4;
	}

	public Integer getBox2() {
		return box2;
	}

	public void setBox2(Integer box2) {
		this.box2 = box2;
	}

	public ArrayList<String> getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(ArrayList<String> skillSet) {
		this.skillSet = skillSet;
	}

	public Long getBox5() {
		return box5;
	}

	public void setBox5(Long box5) {
		this.box5 = box5;
	}
	
}
