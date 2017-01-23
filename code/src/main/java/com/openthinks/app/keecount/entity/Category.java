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
@TableName("b_category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Long parent;
	private String icon;


	public Long getId() {
		return id;
	}

	public Category setId(Long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Category setName(String name) {
		this.name = name;
		return this;
	}

	public Long getParent() {
		return parent;
	}

	public Category setParent(Long parent) {
		this.parent = parent;
		return this;
	}

	public String getIcon() {
		return icon;
	}

	public Category setIcon(String icon) {
		this.icon = icon;
		return this;
	}

	public static final String ID = "id";

	public static final String NAME = "name";

	public static final String PARENT = "parent";

	public static final String ICON = "icon";

}
