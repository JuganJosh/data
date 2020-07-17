package com.xworkz.calamities.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="CALAMITY_TABLE")
public class CalamitiesDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name = "CALAMITY_ID")
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private Integer calId;
	@Column(name = "PLACE")
	private String place;
	@Column(name = "CAL_DATE")
	private String date;
	@Column(name = "CAPTURED_BY")
	private String capturedBy;
	@Column(name = "CALAMITY_TYPE")
	private String calamityType;
	@Column(name = "CALAMITY_AREA")
	private Integer area;
	@Column(name = "AVERAGE_LOSS")
	private String averageLoss;
	@Column(name = "NO_OF_DEATHS")
	private Integer noOfDeaths;
	@Column(name = "NO_OF_INJURED")
	private Integer noOfInjured;
	
	
	public Integer getCalId() {
		return calId;
	}
	public void setCalId(Integer calId) {
		this.calId = calId;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCapturedBy() {
		return capturedBy;
	}
	public void setCapturedBy(String capturedBy) {
		this.capturedBy = capturedBy;
	}
	public String getCalamityType() {
		return calamityType;
	}
	public void setCalamityType(String calamityType) {
		this.calamityType = calamityType;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public String getAverageLoss() {
		return averageLoss;
	}
	public void setAverageLoss(String averageLoss) {
		this.averageLoss = averageLoss;
	}
	public Integer getNoOfDeaths() {
		return noOfDeaths;
	}
	public void setNoOfDeaths(Integer noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
	}
	public Integer getNoOfInjured() {
		return noOfInjured;
	}
	public void setNoOfInjured(Integer noOfInjured) {
		this.noOfInjured = noOfInjured;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "CalamitiesDTO [calId=" + calId + ", place=" + place + ", date=" + date + ", capturedBy=" + capturedBy
				+ ", calamityType=" + calamityType + ", area=" + area + ", averageLoss=" + averageLoss + ", noOfDeaths="
				+ noOfDeaths + ", noOfInjured=" + noOfInjured + "]";
	}
	
	

}
