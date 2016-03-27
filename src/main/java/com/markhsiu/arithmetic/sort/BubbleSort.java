package com.markhsiu.arithmetic.sort;


/**
 *  冒泡排序 O(n^2)
 * 
 * @author MarkHsiu
 *
 */
public class BubbleSort extends InitData{

	@Override
	public void sortArray(){
		
		for (int i = data.length; i > 0; i--) {			
			for (int j = 1; j < i; j++) {	
				if(data[j-1] > data[j]){
					swap(j-1, j);
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		  new BubbleSort().display();
		
	}
	
	
}
