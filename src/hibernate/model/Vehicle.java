package hibernate.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	@Id @GeneratedValue
	private int vehicle_id;
	private String vehicle_Name;
	
	//@ManyToMany
	//private Collection<UserDetails> user= new ArrayList<UserDetails>();
	
	
//	public Collection<UserDetails> getUser() {
//		return user;
//	}
//	public void setUser(Collection<UserDetails> user) {
//		this.user = user;
//	}
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getVehicle_Name() {
		return vehicle_Name;
	}
	public void setVehicle_Name(String vehicle_Name) {
		this.vehicle_Name = vehicle_Name;
	}
	
	
}
