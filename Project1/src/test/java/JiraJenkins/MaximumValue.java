package JiraJenkins;
import java.util.Arrays;
public class MaximumValue {
public static void main(String[] args) {
	int[] value= {3,9,5,7,8};
	for(int i=0;i<value.length;i++) {
		for(int j=0;j<value.length;j++) {
			if(value[i]<value[j]) {
				value[i]=value[i]+value[j];
				value[j]=value[i]-value[j];
				value[i]=value[i]-value[j];}}}
	System.out.println("The Minimum Value is: "+value[0]);
	int[] value2= {2,6,8,9,1};
	Arrays.sort(value2);
	System.out.println(value2[0]);
}}
