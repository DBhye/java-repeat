package com.first.baseball;

import java.util.Scanner;

public class MyBall {
	private int[] myArr;
	private Scanner scan;

	public MyBall(int num) {
		init(num);
	}

	private void init(int num) {
		myArr = new int[num];
		scan = new Scanner(System.in);
	}

	public void setNumbers() {
		for (int i = 0; i < myArr.length; i++) {
			System.out.printf("%d번째 숫자", i + 1);
			String val = scan.nextLine();

			try {
				myArr[i] = Integer.parseInt(val);

			} catch (Exception e) {
				i--;
				System.out.print("숫자만 입력하세요.");
				continue;
			}

			if (myArr[i] < 0 || myArr[i] > 9) {
				i--;
				System.out.print("1부터 9까지의 숫자만 입력하세요");
			}
			for (int z = 0; z < i; z++) {
				if (myArr[i] == myArr[z]) {
					i--;
					System.out.print("이미 같은 숫자가 존재합니다.");
					break;
				}
			}
		}

	}

	public int get(int idx) {
		return myArr[idx];
	}
}
