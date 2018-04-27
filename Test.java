import java.util.Arrays;
import java.util.Scanner;

public class Test{
	static int a = 100;
	
	static void test(){
		int n = 100;
		System.out.println(n);
		System.out.println(++n);
		System.out.println(n++);
		System.out.println(n);
	}
	
	static void test1(){
		int a = 100;
		int b = 100;
		int c = 100;
		int d = 100;
		System.out.println(a++);
		System.out.println(++b);
		System.out.println(c--);
		System.out.println(--c);
		a = 100;
		b = 100;
		c = 100;
		d = 100;
		b = ++a;
		System.out.println("a = " + a + " b = " + b);
		d = c++;
		System.out.println("c = " + c + " d = " + d);
	}
	static void test2(){
		System.out.println(3 % 0);
	}
	
	static void test3(){
		String str = "";
		for(int i = 0; i < 100; i++){
			str += Integer.toString(i);
		}
		System.out.println(str);
	}
	
	static void test4(){
		String[] ary = {"a", "b", "c"};
		String sty = Arrays.toString(ary);
		System.out.println(sty);
	}
	
	static void test5(){
		Scanner sc = new Scanner(System.in);
		String str = "";
		str = sc.next();
		System.out.println(str.equals("yes") ? "yes" : "no");
	}
	
	static void test6(int num){
		num = 1;
	}
	
	static void test7(int[] ary){
		ary[0] = 1;
	}
	
	static void test8(int n){
		n++;
	}
	
	static void test9(){
		boolean[] test = new boolean[100];
		for(int i = 0; i < 100; i++){
			System.out.println(test[i] ? "true" : "false");
		}
	}
	public static void main(String[] args){
		//test();
		//test1();
		//test2();
		//test3();
		//test4();
		//test5();
		
		test9();
		System.out.println(a);
	}
}