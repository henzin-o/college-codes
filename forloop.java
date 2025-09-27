package schoolshiz;

public class forloop {

    public static void main(String[] args) {

        for (int i = 100; i >= 10; i--) {
        if(i%10==0)
        	
            System.out.print(" "+ i);
        
        
        }
        System.out.println("\n");
        
        int  y = 100;
        while (y>=10) {
        System.out.println("\n\n"+y);
        y-=10 ;
        }
        System.out.println("\n");
        
    	
    	int x = 10;
        do {
        if(x%10==0)
    	System.out.print("   "+x);	
    	x++;
        }
        
    	while (x<=100);
    }
}
