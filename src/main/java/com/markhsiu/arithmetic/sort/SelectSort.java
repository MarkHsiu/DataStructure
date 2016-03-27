package com.markhsiu.arithmetic.sort;

/**
 *  选择排序
 *  
 * @author MarkHsiu
 *
 */
public class SelectSort  extends InitData{

	@Override
	public void sortArray() {
		
		int  min = 0 ;
		 for (int i = data.length; i > 0  ; i--) {
			for (int j = 1+i; j < data.length; j++) {
				 if(data[j] < data[min]){
					 min = j;
				 }
			}
			swap(i, min);
		}
	}
	
	public static void main(String[] args) {
		  new BubbleSort().display();
		
	}

	 
}
