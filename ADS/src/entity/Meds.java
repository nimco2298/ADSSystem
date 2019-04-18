/**
 * 
 */
package entity;


/**Medication class stores info about a specific medication. 
 * A nurse is able to modify meds and a pharm tech is able to add/remove meds
 * @author Nimco
 *
 */
public class Meds {


	/** Med ID */
	private int  medID;
	
	/** Med Name */
	private String medName;
	
	/** Med Dosage amount */
	private int medDosage;
	
	/** Med expiration date. Must be in MM/DD/YY Format */
	private String expirationDate;
	
	//Constructor
	public Meds(int medID,String medName, int medDosage, String expDate) {
		this.medID = medID;
		this.medName =medName;
		this.medDosage = medDosage;
		this.expirationDate = expDate;
	}
	
	
	/**Method will return boolean value based on the expired date 
	 * 
	 */
	public Boolean isExpired(String expDate) {
		if(expDate == this.expirationDate) {
			return true;
		}
		return false;
	}
	



	/**Getter method
	 * @return the med_id
	 */
	public int getMed_id() {
		return medID;
	}




	/**Setter method
	 * @param med_id the med_id to set
	 */
	public void setMed_id(int med_id) {
		this.medID = med_id;
	}




	/**Getter method
	 * @return the med_name
	 */
	public String getMed_name() {
		return medName;
	}




	/**Setter method
	 * @param med_name the med_name to set
	 */
	public void setMed_name(String med_name) {
		this.medName = med_name;
	}




	/**Getter method
	 * @return the med_dosage
	 */
	public int getMed_dosage() {
		return medDosage;
	}




	/**Setter method
	 * @param med_dosage the med_dosage to set
	 */
	public void setMed_dosage(int med_dosage) {
		this.medDosage = med_dosage;
	}




	/**Getter method
	 * @return the expiration_date
	 */
	public String getExpiration_date() {
		return expirationDate;
	}




	/**Setter method
	 * @param expiration_date the expiration_date to set
	 */
	public void setExpiration_date(String expiration_date) {
		this.expirationDate = expiration_date;
	}
	
	@Override
	/**Method will return String containing all fields of a medication
	 * @return medication details
	 */
	public String toString() {
		String result = "";
		
		result = result + "Med ID: " +  this.medID + "\n" + 
				 "Med Name: " +  this.medName + "\n" +
				 "Med Dosage: " +  this.medDosage + "\n" +
				 "Expiration Date: " +  this.expirationDate + "\n";
		return result;
	}

}
