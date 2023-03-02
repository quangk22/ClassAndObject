package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] std = new Student[2];
		intput(std);
		print(std);
	}

	private static void print(Student[] std) {
		// TODO Auto-generated method stub
		for (int i = 0; i < std.length; i++) {
			System.out.println("Sinh viên " + (i +1));
			System.out.println("Tên :" +std[i].getName());
			System.out.println("Tuổi :" +std[i].getAge());
			System.out.println("Địa chỉ :" + std[i].getAdd());
			System.out.println("số điện thoại : " + std[i].getPhone());
			System.out.println("Điểm TB : " + std[i].getDiemTB());
		}
	}

	private static void intput(Student[] std) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < std.length; i++) {
			System.out.println("Sinh viên " + (i+1));
			System.out.println("Tên :");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println("Tuổi :");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("Địa chỉ :");
			String add = sc.nextLine();
			sc.nextLine();
			System.out.println("Số điện thoại :");
			String phone = sc.nextLine();
			sc.nextLine();
			System.out.println("Điểm TB :");
			double diemTB = sc.nextDouble();
			std[i] = new Student(name,age,add,phone,diemTB);
		}
		sc.close();
	}

}
