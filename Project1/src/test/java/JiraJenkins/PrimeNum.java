package JiraJenkins;
public class PrimeNum {
public static void main(String[] args) {
	int n=4;
	boolean flag=false;
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			flag =true;
		}
	}
	if(flag==false) {
		System.out.println("it is prime");
	}
	else
		System.out.println("It is not a prime");
}
}
