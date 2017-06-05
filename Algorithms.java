package algorithms;

public class Algorithms {

	public int findMaximum(int[] array){
		int maximum = array[0];
		for(int i = 0; i < array.length; i++){
			if(array[i] > maximum)
				maximum = array[i];
		}
		
		return maximum;
	}
	
	public int findMinimum(int[] array){
		int minimum = array[0];
		for (int i = 0; i < array.length; i++){
			if(array[i] < minimum)
				minimum = array[i];
		}
		
		return minimum;
	}
	
}
