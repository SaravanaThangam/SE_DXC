package basic;

public class MultiArray {
		   public static void main(String[] args) {
		     int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		     int a,b;
		     a=myNumbers.length;
		     System.out.println(a);
//		     b=myNumbers[i].length;     
//		     System.out.println(b);
		     for (int i = 0; i < myNumbers.length; ++i) {
		        for(int j = 0; j < myNumbers[i].length; ++j) {
		           System.out.println(myNumbers[i][j]);
		        }
		     }
		   }
}
