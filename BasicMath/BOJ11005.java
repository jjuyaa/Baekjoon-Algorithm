package BasicMath;

import java.io.*;

public class BOJ11005 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = br.readLine();
		String[] s = S.split(" ");
		int N = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		
		char[] output = new char[1000000];
		int count = 0;
		
		while (N != 0) {
			if (N%B > 9)
				output[count] = (char)(N%B-10 + 'A');
			else 
				output[count] = (char)(N%B + '0');
			N = N / B;
			count++;
		}
		
		for (int i = count; i > 0; i--)
			System.out.print(output[i]);
	}
}