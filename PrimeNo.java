
public class PrimeNo {

	public static void main(String[] args) {
		// last prime no

				for(int i=650;i>=600;i--) {
					
					int num = i; 
					int a=0;
					for(int b=1;b<=num;b++) {
						if(num % b== 0) a++;
						
					}//for p
					if(a == 2) {
						System.out.println("last prime number..."+num);
						break;
					}// if counter
			
				}// for i
	}			
	}