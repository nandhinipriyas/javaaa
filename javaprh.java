import java.util.Scanner;

public class class5 {
	public static void main(String [] args){

class Checknumber{
		int [] numbers = new int [5];
		Scanner inn = new Scanner(System.in);
		boolean b = true;
		int i=0;
		int a=-1;
		void set()
		{
		    System.out.println("Write five numbers");
		    for(int i = 0; i < numbers.length; i++){
		    numbers [i] = inn.nextInt();
		System.out.print("\nNumbers that are repeated: ");
		for(i= 0; i < numbers.length; i++){

		    if(!b){
		        System.out.print(a + " ");
		    }

		    b = true;
		    a = numbers[i];
		    for(int j = 0; j < numbers.length; j++){
		        if(i != j && a == numbers[j] && numbers[j] != -2){
		            b = false; numbers[j] = -2;
		        }
		    }		}
		 Checknumber c=new  Checknumber();
		 c.set();
		}
		
		}}
	

}}