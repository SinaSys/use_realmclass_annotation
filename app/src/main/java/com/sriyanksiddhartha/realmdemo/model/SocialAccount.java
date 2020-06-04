package com.sriyanksiddhartha.realmdemo.model;


import io.realm.RealmObject;

public class SocialAccount extends RealmObject {

	private String name;
	private String status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
