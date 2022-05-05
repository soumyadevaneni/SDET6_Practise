package String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="We Love testing";
      String rev="";
      for(int i=s.length()-1;i>=0;i--) {
    	  rev=rev+s.charAt(i);
      }
      System.out.println("Reverse of string is:"+rev);
	}

}
