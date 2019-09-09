package com.zhangkai.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @ClassName: User
 * @Description: User实体类
 * @author: ZK
 * @date: 2019年9月9日 上午8:55:33
 */
public class User implements Serializable {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 6323292697829400330L;
	/**
	 * @fieldName: id
	 * @fieldType: Integer
	 * @Description: 主键
	 */
	private Integer id;
	/**
	 * @fieldName: name
	 * @fieldType: String
	 * @Description: 姓名
	 */
	private String name;
	/**
	 * @fieldName: gender
	 * @fieldType: String
	 * @Description: 性别
	 */
	private String gender;
	/**
	 * @fieldName: mobile
	 * @fieldType: String
	 * @Description: 电话
	 */
	private String mobile;
	/**
	 * @fieldName: email
	 * @fieldType: String
	 * @Description: 邮箱
	 */
	private String email;
	/**
	 * @fieldName: birthday
	 * @fieldType: Date
	 * @Description: 生日
	 */
	private Date birthday;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", mobile=" + mobile + ", email=" + email
				+ ", birthday=" + birthday + "]";
	}

}
