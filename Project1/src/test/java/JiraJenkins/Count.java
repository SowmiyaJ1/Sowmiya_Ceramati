package JiraJenkins;

import java.util.ArrayList;
import java.util.List;

public class Count {
public static void main(String[] args) {
	String value="aabbbcddf";
	String[] valuenum = value.split("");
	int aCount=0;
	int bCount=0;
	int cCount=0;
	int dCount=0;
	int fCount=0;
	for(int i=0;i<valuenum.length;i++) {
		if(valuenum[i].contains("a")) {aCount++;}
		if(valuenum[i].contains("b")) {bCount++;}
		if(valuenum[i].contains("c")){cCount++;}
		if(valuenum[i].contains("d")) {dCount++;}
		if(valuenum[i].contains("f")){fCount++;}
	}
	System.out.print("a"+aCount+"b"+bCount+"c"+cCount+"d"+dCount+"f"+fCount);
}
}
