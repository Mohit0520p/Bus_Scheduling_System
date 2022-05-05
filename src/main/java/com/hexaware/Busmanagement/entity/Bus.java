package com.hexaware.Busmanagement.entity;
import javax.persistence.Entity;


//import java.util.ArrayList;
import java.util.Date;
//import java.util.List;

//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;

@Entity
public class Bus {

	public Bus() {
		// TODO Auto-generated constructor stub
	}
	// ========================================//
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long busId;
	
	private String busCapacity;
	private String busType; // ac non ac
	
	private Date busBoardingdateandtime;
	private Date busDestinationdateandtime;
	
	private String busBoardingloc;
	private String busDestinationloc;
	// ================================================//
	public Long getBusId() {
		return busId;
	}
	public void setBusId(Long busId) {
		this.busId = busId;
	}
	public String getBusCapacity() {
		return busCapacity;
	}
	public void setBusCapacity(String busCapacity) {
		this.busCapacity = busCapacity;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public Date getBusBoardingdateandtime() {
		return busBoardingdateandtime;
	}
	public void setBusBoardingdateandtime(Date busBoardingdateandtime) {
		this.busBoardingdateandtime = busBoardingdateandtime;
	}
	public Date getBusDestinationdateandtime() {
		return busDestinationdateandtime;
	}
	public void setBusDestinationdateandtime(Date busDestinationdateandtime) {
		this.busDestinationdateandtime = busDestinationdateandtime;
	}
	public String getBusBoardingloc() {
		return busBoardingloc;
	}
	public void setBusBoardingloc(String busBoardingloc) {
		this.busBoardingloc = busBoardingloc;
	}
	public String getBusDestinationloc() {
		return busDestinationloc;
	}
	public void setBusDestinationloc(String busDestinationloc) {
		this.busDestinationloc = busDestinationloc;
	}
	//=========================================================//
	public Bus(String busCapacity, String busType, Date busBoardingdateandtime, Date busDestinationdateandtime,
			String busBoardingloc, String busDestinationloc) {
		super();
		this.busCapacity = busCapacity;
		this.busType = busType;
		this.busBoardingdateandtime = busBoardingdateandtime;
		this.busDestinationdateandtime = busDestinationdateandtime;
		this.busBoardingloc = busBoardingloc;
		this.busDestinationloc = busDestinationloc;
	}
	
	
	
}
