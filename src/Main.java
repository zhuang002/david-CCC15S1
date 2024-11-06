import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i=0;i<n;i++) {
			int data = sc.nextInt();
			if (data == 0) {
				if (!list.isEmpty()) {
					list.remove(list.size()-1);
				}
			} else {
				list.add(data);
			}
		}
		int sum = 0;
		/*
		 * is equivilent to:
		 * 
		 * for (int i=0;i<list.size();i++) {
		 * 	int d = list.get(i);
		 * }
		 * */
		for (int d:list) {
			sum += d;
		}
		System.out.println(sum);
	}

}
