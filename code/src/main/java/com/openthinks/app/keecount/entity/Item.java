package com.openthinks.app.keecount.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
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
@TableName("b_item")
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;

	private Long id;
	private Long uid;
	private Float money;
	private Long cid;
	private Long sid;
	private Integer type;
	@TableField("create_date")
	private Date createDate;
	private String note;


	public Long getId() {
		return id;
	}

	public Item setId(Long id) {
		this.id = id;
		return this;
	}

	public Long getUid() {
		return uid;
	}

	public Item setUid(Long uid) {
		this.uid = uid;
		return this;
	}

	public Float getMoney() {
		return money;
	}

	public Item setMoney(Float money) {
		this.money = money;
		return this;
	}

	public Long getCid() {
		return cid;
	}

	public Item setCid(Long cid) {
		this.cid = cid;
		return this;
	}

	public Long getSid() {
		return sid;
	}

	public Item setSid(Long sid) {
		this.sid = sid;
		return this;
	}

	public Integer getType() {
		return type;
	}

	public Item setType(Integer type) {
		this.type = type;
		return this;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public Item setCreateDate(Date createDate) {
		this.createDate = createDate;
		return this;
	}

	public String getNote() {
		return note;
	}

	public Item setNote(String note) {
		this.note = note;
		return this;
	}

	public static final String ID = "id";

	public static final String UID = "uid";

	public static final String MONEY = "money";

	public static final String CID = "cid";

	public static final String SID = "sid";

	public static final String TYPE = "type";

	public static final String CREATE_DATE = "create_date";

	public static final String NOTE = "note";

}
