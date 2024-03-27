package westview.ds;
public class City {
	String state;
	String city;
	int confirmed;
	
	public City() {
		state = "";
		city = "";
		confirmed = 0;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}

	
}
