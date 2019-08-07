package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);	
		boolean flag = false;
		int cnt = 1;
		int minNum = 1;
		int maxNum = 100;	
		while(!flag) {				
			Random random = new Random();
			int correctNum = random.nextInt(maxNum) + minNum;
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			flag = false;
			while(!flag) {
				System.out.println(minNum+"-"+maxNum);
				System.out.print(cnt + ">>");
				int chkNum = sc.nextInt();
				cnt++;
				if (chkNum<correctNum) {
					System.out.println("더 높게");
					minNum = chkNum;
				} else if(chkNum>correctNum) {
					System.out.println("더 낮게");
					maxNum = chkNum;
				} else {
					System.out.println("맞았습니다.");
					System.out.print("다시 하시겠습니까(y/n)>>");
					String answer = sc.next();
					if (answer.equals("y")) {
						minNum = 1;
						maxNum = 100;
						cnt = 1;
						flag = false;
					} else {
						flag = true;
					}
				}			
			}
			sc.close();		
		}		 
	}
}
