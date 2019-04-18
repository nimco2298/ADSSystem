/**
 * 
 */
package entity;

import java.util.ArrayList;
import java.util.LinkedList;

/**Machine is on one floor, has list of its Patients on its floor.
 * 
 * @author nimco
 *
 */
public class Machine {

	/** Current flow machine is on **/
	private int floorNum;
	
	/** List of drawers **/
	private ArrayList<Integer> drawers;
	
	/** List of patients on a floow*/
	public LinkedList<Patients> patients;
	
	//Constructor
	public Machine(int floorNum, ArrayList<Integer> drawers, LinkedList<Patients> patients) {
		this.setFloorNum(floorNum);
		this.setDrawers(drawers);
		this.patients = patients;
	}
	
   /**Method discharges a patient from the ADS system
    * 
    * @param patientID
    */
	public void removePatient(int patientID) {
		
	}
	
	/**Method transfers a patient to another floor within the ADS System 
	 * @param newFloor new floor patient is transferring to
	 */
	public void transferPatient(int patientID, int newFloor) {
		
		
	}
	
	
	/**Method adds a new patient to a machine within the ADS System 
	 * @param newFloor new floor patient is transferring to
	 */
	public void addPatient2Floor(Patients patient) {
		
	}
	
	
	/**Method will
	 * 
	 * 
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	}

	/**
	 * @return the floorNum
	 */
	public int getFloorNum() {
		return floorNum;
	}

	/**
	 * @param floorNum the floorNum to set
	 */
	public void setFloorNum(int floorNum) {
		this.floorNum = floorNum;
	}

	/**
	 * @return the drawers
	 */
	public ArrayList<Integer> getDrawers() {
		return drawers;
	}

	/**
	 * @param drawers the drawers to set
	 */
	public void setDrawers(ArrayList<Integer> drawers) {
		this.drawers = drawers;
	}

}
