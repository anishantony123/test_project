package com.pos.entity.embeddable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable 
public class Audit {
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;
}