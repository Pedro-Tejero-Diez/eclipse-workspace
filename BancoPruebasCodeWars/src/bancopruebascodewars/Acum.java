package bancopruebascodewars;

import java.util.ArrayList;
import java.util.HashMap;

public class Acum {

	public static HashMap<String,ArrayList<Integer>> getPeaks(int[] arr) {
		  
		String posiciones="";
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
		
		for (int i=1; i<arr.length;i++ ) {
			if (arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
				list.add(arr[i]);
				posiciones +=i;
			}
		}
		map.put(posiciones, list);
		 	 
	    return map;
	}
}