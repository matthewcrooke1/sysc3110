
public class BuddyInfo {
		String name;
		int phonenumber;
		String address;
	public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(int phonenumber) {
			this.phonenumber = phonenumber;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo x = new BuddyInfo();
		String buddy = "Homer";
		x.setName(buddy);
		System.out.println("Hello" + " " + x.getName());
		System.out.println("Goodbye" + " " + x.getName());
	
	
	}

}