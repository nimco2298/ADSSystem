/**
 * 
 */
package entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nimco
 *
 */
public class Orders {

	
	/** Order ID **/
	public int  orderID;
	
	/** Order status: if an order **/
	public boolean orderStatus;
	
	//public LinkedList<Meds> medList;
	
	Map<Integer, Meds> map = new HashMap<Integer, Meds>();
	
	
	//Creating Order will set the status of order to true.
	public Orders(int orderID, Meds medication) {
		// add medication to a new order
		this.map.put(orderID, medication); 
		
		//Creating Order will set the status of order to true.
		this.orderStatus = true;
	}
	
	/**Method will search for a medication and return that medication in the Order
	 * 
	 */
	public Meds searchForMeds(String med) {
		return null;
	}
	

	
	/**Method will modify a medication within an Order
	 * 
	 * @param med Medication to be modified
	 */
	 
	public void changeOrder(Meds med) {
		
	}
	
	
	
	
	
}

