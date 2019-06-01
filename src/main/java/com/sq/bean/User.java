/**
 * 
 */
package com.sq.bean;

/**
 * @author tsqki
 *
 */
public class User {
	private Long id;
	private String name;
	private String gender;
	private Integer age;
	private String password;

	public User() {
		super();
	}

	public User(Long id, String name, String gender, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
