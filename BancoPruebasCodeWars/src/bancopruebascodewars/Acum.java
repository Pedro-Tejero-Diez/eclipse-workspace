package bancopruebascodewars;

import java.util.Arrays;

public class Acum {

	public static long nextSmaller(long n) {
		Long i = n-1, j=n;
		char[] seq = String.valueOf(n).toCharArray();
		char[] seq2=null;
		while (i>0 && !Arrays.equals(seq, seq2)) {
			seq2= String.valueOf(i).toCharArray();
			Arrays.sort(seq);
			Arrays.sort(seq2);			
			i--;
			j--;
		}
		if (j==1) {
			j=(long) -1;
		}
		return j;
	}
}