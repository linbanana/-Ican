package random;

import java.util.Scanner;

public class Java99 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		Scanner input = new Scanner(System.in);
		int x, y;//�O�п�J
		String which;//�O�п�J
		
		
		while (true) {			
			System.out.println("�п�J��ܬd�ߤ�k�G" + "1�G�ۭq\t2�G�Ʀr�d��\t3:99���k�`��");
			which = input.nextLine();	
			
			if (which.equals("1")) {//�ۭq�Ʀr�ۭ�

				System.out.println("�п�J�n�ۭ����Ʀr");
				System.out.print("�Ʀr:");
				x = input.nextInt();
				System.out.print("�Ʀr:");
				y = input.nextInt();
				System.out.println("�ۭ����G:" + x * y);
				break;
				
			} else if (which.equals("2")) {//��Jn�h�C�Xn�����k��
				
				System.out.println("�п�J�Ʀr�d��");
				x = input.nextInt();
				for (int i = 1; i <= 9; i++) {
					System.out.println(x + "*" + i + "=" + i * x);
				}
				break;

			} else if (which.equals("3")) {//99���k��
				
				for (int i = 1; i <= 9; i++) {
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d*%d=%d\t", j, i, i * j);
					}
					System.out.println();
				}
				break;

			} else {//�ҥ~�B�z				
				System.out.println("Error�G�п�J���T�ﶵ");				
			}
			
		}

	}

}
