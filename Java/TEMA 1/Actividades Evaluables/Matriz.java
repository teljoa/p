package aparte;

import java.util.Arrays;

public class Matriz {
	
	public static void matrix(int num) {
		int[][] matriz=new int[num][num];
		
		for(int i=0;i<num;i++) {
			matriz[i][i]=1;
			System.out.println(Arrays.toString(matriz));
		}
	}

	public static void main(String[] args) {
		
		int num=4;
		
		matrix(num);
	}

}
