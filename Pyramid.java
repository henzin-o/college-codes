package schoolshiz;

public class Pyramid {

	public static void main (String[] args) {
		      String name= "AARONHENZNOVALES";
		      
		        int i = 0;       
		        int totalRows = 6;    

		        
		        for (int row = 1; row <= totalRows; row++) {
		         
		            for (int space = 1; space <= totalRows - row; space++) {
		                System.out.print(" ");
		            }
 
		            
		            for (int col = 1; col <= row; col++) {
		            	if (i< name.length()) {
		            		 System.out.print(name.charAt(i) + " ");
				                i++;
		            	}
		               
		            }

		            
		            System.out.println();
		        }
		    }
		

    }