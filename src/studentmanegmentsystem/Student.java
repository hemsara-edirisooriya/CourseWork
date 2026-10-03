/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanegmentsystem;

/**
 *
 * @author TECH YARD
 */
public class Student {
    private String regNoArray;
    private String nicArray;
    private String nameArray;
    private int prfArray;
    private int dbmsArray;
    
        public String getregNoArray(){
		return regNoArray;
	}
	
	public String getnameArray(){
		return nameArray;
	}
	
	public String getnicArray(){
		return nicArray;
	}
	
	public int getprfArray(){
		return prfArray;
	}
	
	public int getdbmsArray(){
		return dbmsArray;
	}
	
	public void setnicArray(String nicArray){
		this.nicArray = nicArray;
	}
	
	public void setnameArray(String nameArray){
		this.nameArray = nameArray;
	}
	
	public void setregNoArray(String regNoArray){
		this.regNoArray = regNoArray;
	}
	
	public void setprfArray(int prfArray){
		this.prfArray = prfArray;
	}
	
	public void setdbmsArray(int dbmsArray){
		this.dbmsArray = dbmsArray;
	}
	
	public Student (String regNoArray, String nicArray, String nameArray, int prfArray, int dbmsArray){
		this.regNoArray = regNoArray;
		this.nicArray = nicArray;
		this.nameArray = nameArray;
		this.prfArray = prfArray;
		this.dbmsArray = dbmsArray;
	}
}
