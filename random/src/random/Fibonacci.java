package random;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		Scanner input = new Scanner(System.in);

		int num1 = 0, num2 = 1, num3;
		System.out.print("�п�J�z�n��ܪ��O��ƦC�`�ơG");
		int count = input.nextInt();//�O��ƦC�`��

		System.out.print(num1 + " " + num2);

		for (int i = 2; i < count; ++i)//�w��"0"�M"1"�A�ҥH"i"�q"2"�}�l
		{
			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}

	}

}
