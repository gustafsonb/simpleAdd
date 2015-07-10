import java.util.Scanner;

public class SimpleAdd {
	public static void main( String[] args ){
		
		int a, b, c;
		String answer ="Y";
		Scanner in = new Scanner(System.in);
		
            while(answer.equals("Y")){
            
		System.out.println("First number");
                    a = in.nextInt();
		System.out.println("Second number");
                    b = in.nextInt();
		
                    c = a + b;
		
		System.out.println("Sum of inputs  "+c);
		
		System.out.println("Again?????");
                    
                    answer = in.next(); 
            }
        }
}
	
