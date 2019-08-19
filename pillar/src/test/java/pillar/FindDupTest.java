package pillar;
import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FindDupTest {
	FindDup findDup;
	@Before
	public void setUp() {
		findDup = new FindDup();
	}	
	
	@Test
	public void FindAllDuplicatesTest() {
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> expectedResult = new ArrayList<Integer>(); 
		expectedResult.add(1); 
		expectedResult.add(2); 
		result = findDup.findAllDuplicates(new int[] {1,2,2,1,1});
		System.out.println(result.toString());
		assertEquals(expectedResult,result);
	}
	@After
	public void tearDown() {
		findDup = null;
	}
	
}
