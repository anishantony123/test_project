package com.pos.dto;

public class VendorDTO {
	private Long id;
	private String label;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	@Override
	public String toString() {
		return "VendorDTO [id=" + id + ", label=" + label + "]";
	}

}
