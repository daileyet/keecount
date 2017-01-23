package com.openthinks.app.keecount.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 
 * </p>
 *
 * @author Dailey Dai
 * @since 2017-01-23
 */
@TableName("s_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String password;
	private String email;
	private String phone;


	public Long getId() {
		return id;
	}

	public User setId(Long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public User setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public User setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public User setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public static final String ID = "id";

	public static final String NAME = "name";

	public static final String PASSWORD = "password";

	public static final String EMAIL = "email";

	public static final String PHONE = "phone";

}
