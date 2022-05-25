package One_To_Many_Bi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String getadd;
	private String web;
	@OneToMany(mappedBy = "h")
	private List<Branch> bra;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGetadd() {
		return getadd;
	}

	public void setGetadd(String getadd) {
		this.getadd = getadd;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public List<Branch> getBra() {
		return bra;
	}

	public void setBra(List<Branch> bra) {
		this.bra = bra;
	}

}
