package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		int unit = 50000;
		int money = sc.nextInt();
		int flag = 1;		
		int[] wallet = new int[10];
		while(unit>money) { // 단위오류
			if(flag==1) {
				unit = unit / 5;
				flag*=-1;
		}
			else if(flag==-1) {
				unit = unit / 2;
				flag*=-1;
			}
		}
		for (int i = 0; i < wallet.length; i++) {
			if(money!=0&&unit!=0)
			if (money/unit!= 0) {
				wallet[i] = money / unit;
				money = money - (money / unit * unit);
				System.out.println(unit + "원 : " + wallet[i] + "개");
				if (flag == 1)
					unit = unit / 5;
				else
					unit = unit / 2;
				flag = flag * -1;
			} else {
				
			}
		}
		sc.close();
	}
}
