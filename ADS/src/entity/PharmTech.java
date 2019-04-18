/**
 * 
 */
package entity;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author nimco
 *
 */
public class PharmTech extends Account {

	//Will each pharmtech have a designate list of machines?
		/** List of floors to navigate **/
	public ArrayList<Integer> floors;
	
	/** List of machines  */
	private LinkedList<Machine> machines;
	
	public PharmTech(ArrayList<Integer> floors) {
		this.floors = floors;
	}
	
	/**
	 * 
	 * @param floor
	 * @return String all the details of meds on a floor
	 */
	public String auditDrawer(int floor){
		
	}
	
	/**Method that will get Account details for a pharm tech!
	 * 
	 */
	public String getAcctDetails() {
	//getStaffID
	//getUsername
	//getPassword
	//getFirstName()
	//getLastName()
	
	}
}
