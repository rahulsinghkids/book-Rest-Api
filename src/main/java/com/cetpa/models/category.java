package com.cetpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class category
{
	@Id
	@GeneratedValue(generator = "cat_seq")
	@SequenceGenerator(name = "cat_seq",initialValue = 1)
	private int catid;
	private String catname;
	
	public String getCatname() {
		return catname;
	}
	public void setCatname(String catname) {
		this.catname = catname;
	}
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	
	
	

}
