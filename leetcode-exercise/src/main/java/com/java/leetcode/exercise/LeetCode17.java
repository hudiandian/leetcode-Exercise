package com.java.leetcode.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode17 {
	
	
	
	    /**
	     * 电话号码的字母组合
	     * @param digits
	     * @return
	     */
	    public List<String> letterCombinations(String digits) {
	    	
	    	List<String> res = new ArrayList<String>();
	    	
	    	// 判断空
	    	if (digits == null || digits.length() <= 0) {
	    		return res;
	    	}
	    		
	    	//char[] charArray = digits.toCharArray();
	    	
	    	if (digits.length() == 1) {
	    		return Arrays.asList(this.getStrByNumber(digits));
	    	}
	    	
	    	
	    	
	    
	    	

	    	return res;

	    }
	    
	    public String[] getStrByNumber(String number) {	
	    	switch (number) {
			case "2":
				String[] a1= {"a","b","c"};
				return  a1;			
			case "3":
				String[] a2= {"d","e","f"};
				return  a2;
			case "4":
				String[] a3= {"g","h","i"};
				return  a3;
			case "5":
				String[] a4= {"j","k","l"};
				return  a4;
			case "6":
				String[] a5= {"m","n","o"};
				return  a5;
			case "7":
				String[] a6= {"p","q","r","s"};
				return  a6;
			case "8":
				String[] a7= {"t","u","v"};
				return  a7;
			case "9":
				String[] a8= {"w","x","y","z"};
				return  a8;
			default:
				break;
			}
			return null;	    	
	    }
	    
	    
	
}
