package JiraJenkins;

public class ReverseString {
public static void main(String[] args) {
	String[] value= {"ab","cd","ef","fg"};
	for(int i=value.length-1;i>=0;i--) {
		System.out.println(value[i]);
	}
	String word="Sowmiya";
	String[] wordCt=word.split("");
	for(int i=wordCt.length-1;i>=0;i--) {
		System.out.print(wordCt[i]);
	}
}
}

