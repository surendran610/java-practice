/**
 * 
 */
package com.test;

/**
 * @author Shrisuren
 *
 */
public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] a = {1,3,5,6};
		System.out.println(searchInsert(a, 3));
				
	}
	public static void ex() {
		try {
			int i =10/0;
		}finally {
			System.out.println("finnaly");
		}
	}
	public static int searchInsert(int[] nums, int target) {
		//List<Integer>sortedInt=Arrays.asList(nums);
        //Collections.sort(sortedInt);
		for(int i=0;i<nums.length;i++){  
		      if(nums[i]==target){
			    return i;
			  }else{
			    
			  }
		}
		return target;
    }
}
