package prob02;

import java.util.Scanner;

public class Prob02 {
	public static void main(String args[]) {
		Scanner in = new Scanner( System.in );
        int intArray[] = new int[5];
        double sum = 0;
        
        System.out.println("5개의 숫자를 입력하세요.");
        for(int i=0; i<intArray.length; i++) {
        	intArray[i] = in.nextInt();
        	sum += intArray[i];
        }
        
        System.out.println("평균은 "+(double)sum/5+" 입니다.");
        in.close();
	}
}
