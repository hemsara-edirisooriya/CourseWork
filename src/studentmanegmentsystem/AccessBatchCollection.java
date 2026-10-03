/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanegmentsystem;

/**
 *
 * @author TECH YARD
 */
public class AccessBatchCollection {
    private BatchCollection batchCollection;
    private StudentCollection studentCollection;
    
        private static AccessBatchCollection accessBatchCollection;
        private AccessBatchCollection(){
		studentCollection=new StudentCollection();
	}
	public static AccessBatchCollection getInstance(){
		if(accessBatchCollection==null){
			accessBatchCollection=new AccessBatchCollection();
		}
		return accessBatchCollection;
	}
	public BatchCollection getBatchCollection(){
		return batchCollection;
	}
}
