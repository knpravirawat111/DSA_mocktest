package DSA_Test;
import java.util.*;
public class MoveZeros { 
	
  

public static void main (String [] args) {
	     int nums []= {0,1,0,3,12};
		
	     int j=0;     
	       int i=0;
	       if(nums.length==0||nums.length==1){
	           return;
	       }
	       while(i<nums.length){
	           if(nums[i]==0){
	               i++;
	           }else{
	           int temp=nums[i];
	           nums[i]=nums[j];
	           nums[j]=temp;
	               j++;
	               i++;
	           }
	       }
	       System.out.println(Arrays.toString(nums));
	    		 
}

}
