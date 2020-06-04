package com.sriyanksiddhartha.realmdemo.model;


import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class User extends RealmObject {

	@PrimaryKey
	private String id;
	private String name;
	private int age;
	private SocialAccount socialAccount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public SocialAccount getSocialAccount() {
		return socialAccount;
	}



	public void setSocialAccount(SocialAccount socialAccount) {
		this.socialAccount = socialAccount;
	}
}
