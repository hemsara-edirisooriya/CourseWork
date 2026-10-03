/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanegmentsystem;

/**
 *
 * @author TECH YARD
 */
public class Batch {
    private int batchNameArray;
	private int batchStatusArray;
	
	public Batch(){
		
	}
	
	public Batch(int batchNameArray, int batchStatusArray){
		this.batchNameArray = batchNameArray;
		this.batchStatusArray = batchStatusArray;
	}
	
	public void setbatchNameArray(int batchNameArray){
		this.batchNameArray = batchNameArray;
	}
	
	public void setbatchStatusArray(int batchStatusArray){
		this.batchStatusArray = batchStatusArray;
	}
	
	public int getbatchNameArray(){
		return batchNameArray;
	}
	
	public int getbatchStatusArray(){
		return batchStatusArray;
	}
        
        
}
