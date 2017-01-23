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
@TableName("b_source")
public class Source implements Serializable {

    private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Long parent;
	private String icon;


	public Long getId() {
		return id;
	}

	public Source setId(Long id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Source setName(String name) {
		this.name = name;
		return this;
	}

	public Long getParent() {
		return parent;
	}

	public Source setParent(Long parent) {
		this.parent = parent;
		return this;
	}

	public String getIcon() {
		return icon;
	}

	public Source setIcon(String icon) {
		this.icon = icon;
		return this;
	}

	public static final String ID = "id";

	public static final String NAME = "name";

	public static final String PARENT = "parent";

	public static final String ICON = "icon";

}
