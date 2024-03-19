package no1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Stackpractice01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List <String> A = new ArrayList<String>();
		
		int Q = sc.nextInt();
		int cmd;
		
		for(int i = 0; i < Q; i++) {
			cmd = sc.nextInt();
			
			if(cmd == 1) {
				A.add(sc.nextLine());
			} else if(cmd == 2) {
				System.out.println(A.getLast());
				A.removeLast();
			}else {
				System.out.println("無効なコマンド");
			}
			for(int j = 0; j < A.size(); j++) {
				System.out.print(A.get(j) + " ");
			}
			cmd = 0;
		}		
		for(int i = 0; i < A.size();i++) {
			System.out.println(A.get(i));
		}
	}
}