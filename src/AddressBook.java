import java.util.*;

public class AddressBook {

	ArrayList<BuddyInfo> budList = new ArrayList<BuddyInfo>();



public void addBuddy (BuddyInfo buddy){
	budList.add(buddy);

}

public void removeBuddy (BuddyInfo buddy){
	budList.remove(buddy);
}


public static void main(String[] args){
	System.out.println("AddressBook");
	


	AddressBook list = new AddressBook();
	BuddyInfo x = new BuddyInfo();
	BuddyInfo y = new BuddyInfo();	
	list.addBuddy(x);
	list.addBuddy(y);
	list.removeBuddy(y);
	
	}


}
