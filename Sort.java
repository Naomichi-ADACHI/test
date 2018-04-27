import java.util.Scanner;
import java.util.Arrays;

public class Sort{
	static final int N = 10;
	
	/*
	static void init(int[] ary){
		for(int i = 0; i < N; i++){
			ary[i] = (int)(Math.random() * 100);
		}
	}
	*/
	
	//quicksort
	static void quicksort(int[] ary, int left, int right){
		if(right - left > 0){
			int pos = (right + left) / 2;
			int l = left;
			int r = right;
	
			while(true){
				//System.out.println(l + " " + pos + " " + r);
				
				//left
				while(ary[l] < ary[pos]){
					if(l == pos){
						break;
					}
					l++;
					//System.out.print("l = " + l + " ");
				}
				
				//right
				while(ary[r] >= ary[pos]){
					if(r == pos){
						break;
					}
					r--;
					//System.out.println("r = " + r);
				}
				
				//swap(ary[l], ary[r])
				if(l < r){
					int tmp = ary[l];
					ary[l] = ary[r];
					ary[r] = tmp;
					
					if(l == pos){
						pos = r;
					}else if(r == pos){
						pos = l;
					}
				}else{
					break;
				}
			}
			quicksort(ary, left, pos - 1);
			//print(ary);
			
			quicksort(ary, pos + 1, right);
			//print(ary);
		}else{
			return;
		}
	}
	
	//sentaku sort
	static void sort(int[] ary){
		for(int i = 0; i < ary.length; i++){
			for(int j = i + 1; j < ary.length; j++){
				if(ary[i] > ary[j]){
					int tmp = ary[i];
					ary[i] = ary[j];
					ary[j] = tmp;
				}
			}
		}
	}
	
	//print array
	static void print(int[] ary){
		for(int i = 0; i < ary.length; i++){
			System.out.print(ary[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int[] ary = new int[N];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input " + N + " number");
		//init(ary);
		
		for(int i = 0; i < N; i++){
			ary[i] = sc.nextInt();
		}
		
		System.out.println("Before Sort");
		print(ary);
		
		//sort(ary);
		quicksort(ary, 0, N - 1);
		System.out.println("After Sort");
		print(ary);
	}
}