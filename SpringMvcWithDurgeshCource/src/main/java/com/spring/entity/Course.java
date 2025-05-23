package com.spring.entity;

public class Course {
	private long id ;
	private String titale;
	private String Description;
	public Course(long id, String titale, String description) {
		super();
		this.id = id;
		this.titale = titale;
		Description = description;
	}
	public Course() {
		super();
		
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", titale=" + titale + ", Description=" + Description + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitale() {
		return titale;
	}
	public void setTitale(String titale) {
		this.titale = titale;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

}
