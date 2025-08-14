package guide.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "all_Data")
public class ModelClass {
   
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String UserId;
	private double DataUsage;
	private String Networktype;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public double getDataUsage() {
		return DataUsage;
	}
	public void setDataUsage(double dataUsage) {
		DataUsage = dataUsage;
	}
	public String getNetworktype() {
		return Networktype;
	}
	public void setNetworktype(String networktype) {
		Networktype = networktype;
	}

}
