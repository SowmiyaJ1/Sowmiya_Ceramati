package JiraJenkins;
public class AddTwoIntegers {
public static void main(String[] args) {
	int[] a= {2,8,6,8,7,5,8,9};
	int[] b= {7,9,6,4,5};
	int sum=0;
	if(a.length<=b.length) { 
		for(int i=0;i<=a.length;i++) { 
			for(int j=i;j<b.length;j++) {
				try {
					sum=a[i]+b[j];
					System.out.println(sum);
					break;
				}
				catch(IndexOutOfBoundsException e){
					sum=b[j];
					System.out.println(sum);
				}
			}
			}
	}
	else if(a.length>=b.length) { 
		for(int i=0;i<=b.length;i++) { 
			for(int j=i;j<a.length;j++) {
				try {
					sum=a[i]+b[j];
					System.out.println(sum);
					break;
				}
				catch(IndexOutOfBoundsException e){
					sum=a[j];
					System.out.println(sum);
				}
			}
			}
	}
}
}
