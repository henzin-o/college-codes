package schoolshiz;

public class Cone {

	public static void main (String[] args) {
		      String name= "AARONHENZNOVALES";
		      
		        int i = 0;      
		        int totalRows = 5;    
         
		        for (int row = 1; row <= totalRows; row++) {
		           
		            for (int space = 1; space <= (row - 1); space++) {
		                System.out.print("   ");
		            }
 
		            
		            for (int col = 1; col <=(totalRows - row + 1); col++) {
		            	if (i< name.length()) {
		            		 System.out.print(name.charAt(i) + "    ");
				                i++;
		            	}
		               
		            }

		           
		            System.out.println();
		        }
		    }
		

    }
