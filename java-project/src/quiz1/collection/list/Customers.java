package quiz1.collection.list;

public class Customers {

	private String name, address, tel;
	
	public Customers() {
		
		this.name="noName";
		this.address="noadd";
		this.tel="no tel";
	}
	
	
	
	
	public Customers(String name, String address, String tel) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Customers [name=" + name + ", address=" + address + ", tel=" + tel + "]";
	}
	
	
}
