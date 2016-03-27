package com.markhsiu.arithmetic.sort;

import java.util.Random;

public abstract class InitData {

	protected  int[] data  = new int[25];
	
	public InitData(){
		init();
	}
	private   void init(){		
		Random random = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i]  = random.nextInt(100);
		}
	}

	public abstract void sortArray();
	
	protected void swap(int indexA, int indexB){
		int temp = 0;
		temp = data[indexA];
		data[indexA] = data[indexB];
		data[indexB] = temp;
	}
	
	public  void display(){
		  for (int i = 0; i < this.data.length; i++) {
				System.out.print(this.data[i]+"，");
			  }
		     this.sortArray();
			  System.out.println();
			  for (int i = 0; i < this.data.length; i++) {
					System.out.print(this.data[i]+"，");
			  }
	}
	
	
}
