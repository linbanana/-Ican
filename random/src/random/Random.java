package random;

import java.util.*;

public class Random {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();// �x��

		int count, minnum, maxnum;
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int size = numbers.size();
		int which;// �O�п�J

		System.out.println("�аݱz�n��X�����P�����B�Ʀr?");
		count = input.nextInt();
		System.out.println("�]�w�Ʀr�d��A�̤p�Ʀr�P�̤j�Ʀr");
		System.out.println("�̤p�Ʀr�O�h�֩O?");
		minnum = input.nextInt();
		System.out.println("�̤j�Ʀr�O�h�֩O?");
		maxnum = input.nextInt();

		if (maxnum - minnum + 1 >= count) {
			System.out.println("�п�J��ܬd�ߤ�k�G" + "1:Random�@2:ArrayList");// Random��bug..
			which = input.nextInt();

			if (which == 1) {
				try {
					for (int i = 0; i <= maxnum - minnum; i++)
						numbers.add(minnum + i);

					int[] result = new int[count];
					for (int i = 0; i < result.length; i++) {

						int index = (int) (Math.random() * (maxnum - minnum + 1)) + minnum;//Random
						result[i] = index;
						numbers.remove(new Integer(index));

					}

					Arrays.sort(result);//�Ƨ�
					System.out.println("Lucky numbers: ");
					for (int i : result) {
						System.out.print(i + " ");
					}

				} catch (Exception e) {
					e.toString();

				}
			} else if (which == 2) {//ArrayList

				for (int i = 0; i <= maxnum - minnum; i++)
					numbers.add(minnum + i);

				int index[] = new int[count];
				Collections.shuffle(numbers); //�H���Ƨ�
				System.out.println("Lucky numbers: ");
				
				for (int i = 0; i < count; i++) {
					index[i] = numbers.get(i);
					System.out.print(index[i] + " ");
				}

			} else {
				System.out.println("�п�J���T�ﶵ");
			}

		} else {
			System.out.print("�̤p��+�̤j�����j�󵥩�������");
		}

		System.exit(0);//JVM���~�ư�
	}

	private int nextInt(int minnum, int maxnum) {
		// TODO �۰ʲ��ͪ���k Stub
		return 0;
	}

}
