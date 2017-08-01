package com.pos.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ACTIVITY_LOG")
public class ActivityLog {

	public ActivityLog() {
	}

	public ActivityLog(String user, String target, String targetId,
			String operation, Date datetime) {
		this.user = user;
		this.target = target;
		this.targetId = targetId;
		this.operation = operation;
		this.datetime = datetime;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "USER")
	private String user;

	@Column(name = "TARGET")
	private String target;

	@Column(name = "TARGET_ID")
	private String targetId;

	@Column(name = "OPERATION")
	private String operation;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "DATE_TIME", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date datetime;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public String getTargetId() {
		return targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

}
