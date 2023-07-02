import java.util.*;
public class FirstUniqueChar {

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
      String s= "leetcode";
      int ans=-1;
      int len = s.length();
      
   
      int[] arr = new int[26];
      
      for(char c : s.toCharArray()){
          arr[c - 'a']++;
      }
      
      for(int i=0; i<len; i++){
          if(arr[s.charAt(i) - 'a'] == 1){
              ans= i;
              break;
          }
      }
         
      System.out.println(ans);
	}  

}        
