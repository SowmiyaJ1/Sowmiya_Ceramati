package JiraJenkins;
public class SwapFirstAndLastWord {
	public static void main(String[] args) {
	String given="My name is Sowmiya";
	String[] value=given.split(" ");
	String temp=value[0];
	value[0]=value[value.length-1];
	value[value.length-1]=temp;
	for(int i=0;i<=value.length-1;i++) {
		System.out.println(value[i]);
	}
	
}
}
