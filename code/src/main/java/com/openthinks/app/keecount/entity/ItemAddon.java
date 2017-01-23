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
@TableName("b_item_addon")
public class ItemAddon implements Serializable {

    private static final long serialVersionUID = 1L;

	private Long iid;
	@TableField("record_date")
	private Date recordDate;
	private String member;
	private String project;
	private String address;
	private byte[] photo;


	public Long getIid() {
		return iid;
	}

	public ItemAddon setIid(Long iid) {
		this.iid = iid;
		return this;
	}

	public Date getRecordDate() {
		return recordDate;
	}

	public ItemAddon setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
		return this;
	}

	public String getMember() {
		return member;
	}

	public ItemAddon setMember(String member) {
		this.member = member;
		return this;
	}

	public String getProject() {
		return project;
	}

	public ItemAddon setProject(String project) {
		this.project = project;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public ItemAddon setAddress(String address) {
		this.address = address;
		return this;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public ItemAddon setPhoto(byte[] photo) {
		this.photo = photo;
		return this;
	}

	public static final String IID = "iid";

	public static final String RECORD_DATE = "record_date";

	public static final String MEMBER = "member";

	public static final String PROJECT = "project";

	public static final String ADDRESS = "address";

	public static final String PHOTO = "photo";

}
