package assignmentString;

import java.util.Arrays;

public class Removeduplicatechar {
static String  removeDuplicate(char str[],int n) {
	int starting=0;
	for(int i=0;i<n;i++) {
		int j;
		for( j=0;j<i;j++) {
			if(str[i]==str[j]) {
				break;
			}
		}
			if(j==i) {
				str[starting++]=str[i];
		}
	}
	return String.valueOf(Arrays.copyOf(str, starting));
	
}
	public static void main(String[] args) {
		char str[]="sravaniprasad chengannagari".toCharArray();
        int n=str.length;
        System.out.println(removeDuplicate(str,n));
	}

}
