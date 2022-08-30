package bancopruebascodewars;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class Acum {

		    
		    public static Map<String, List<Integer>> getPeaks(int[] arr) {
				String pos = "";
				ArrayList<Integer> peaks = new ArrayList<Integer>();
				Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
				for (int i = 1; i < arr.length; i++) {
					if (arr[i] > arr[i - 1]) {
						if (arr[i] > arr[i + 1]) {
							peaks.add(arr[i]);
							pos += i;
						} else if (arr[i] == arr[i + 1]) {
							for (int j = i; j < arr.length; j++) {
								if (arr[j] < arr[i]) {
									peaks.add(arr[i]);
									pos += i;
								}
							}
						}
					}

				}

				map.put(pos, peaks);

				return map;
		    }
		}