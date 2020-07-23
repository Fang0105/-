import java.util.Scanner;
import java.math.BigInteger;
public class Main {
	static BigInteger arrFa[] = new BigInteger[2005];
	static BigInteger _1 = new BigInteger("1");
	static BigInteger _2 = new BigInteger("2");
	static BigInteger _0 = new BigInteger("0");
	static BigInteger fa(BigInteger b) {
		int n1 = b.intValue();
		if(b.equals(_2)) {
			arrFa[2] = new BigInteger("1");
		}else if(b.equals(_1)) {
			arrFa[1] = new BigInteger("1");
		}else {
			BigInteger k = new BigInteger("1");
			BigInteger j = new BigInteger("2");
			BigInteger d = new BigInteger("0");
			BigInteger q = new BigInteger("0");
			d = b.subtract(k);
			q = b.subtract(j);
			
			if(arrFa[n1].equals(_0)) {
				arrFa[n1] = fa(d).add(fa(q));
			}
		}
		return arrFa[n1];
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<=2004;i++) {
			arrFa[i] = new BigInteger("0");
		}
		BigInteger f = fa(new BigInteger("2000"));
		int n;
		
		for(int i=1;i<=2000;i++) {
			System.out.println(i+" "+arrFa[i]);
		}
		while((n=scan.nextInt())!=0) {
			System.out.println(arrFa[n]);
		}
		
		
	}

}

