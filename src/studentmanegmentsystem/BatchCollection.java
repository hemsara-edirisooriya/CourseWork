/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanegmentsystem;

/**
 *
 * @author TECH YARD
 */
public class BatchCollection {
    public static Batch[] batchNameArray ={
		new Batch( 105, 0),
		new Batch( 106, 0),
		new Batch( 107, 0),
		new Batch( 107, 0),
		new Batch( 108, 0),
		new Batch( 109, 1),
		new Batch( 110, 1),
	};
    
        public static boolean checkNo(int batchNo){
		for(int i = 0; i<batchNameArray.length; i++){
			if(batchNameArray[i].getbatchNameArray() == batchNo){
				return false;
			}
		}
		return true;
	}
        
        
        public static void addNewBatchNo(int batchNo){
		Batch[] tempbatchNameArray = new Batch[batchNameArray.length + 1];
		for(int i=0; i<batchNameArray.length; i++){
			tempbatchNameArray[i] = batchNameArray[i];
		}
		batchNameArray = tempbatchNameArray;
		//tempbatchNameArray[batchNameArray.length] = batchNo;
		//batchNameArray = tempbatchNameArray;
		
		Batch b1 = new Batch( batchNo, 0);
		batchNameArray[batchNameArray.length - 1] = b1;
	}
}
