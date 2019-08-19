package pillar;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindDup {
	public static List<Integer> findAllDuplicates(int[] arr) {
		Set<Integer> resultSet= new HashSet<Integer>();
		for(int i = 0; i< arr.length;i++) {
			int index = Math.abs(arr[i])-1;
			if(arr[index] < 0) {
				resultSet.add(Math.abs(arr[i]));
			}else {
				arr[index] = -arr[index];
			}
		}
		
		for(int i = 0; i< arr.length;i++) {
			arr[i] = Math.abs(arr[i]);
		}
		
		return new ArrayList(resultSet);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputarr = new int[] {1,2,2};
		List<Integer> expectedResult = new ArrayList<Integer>(); 
		//expectedResult.add(1); 
		//expectedResult.add(2);
		expectedResult = findAllDuplicates(inputarr);
		System.out.println(expectedResult.toString());
		
	}

}
