package by.epam.java.basic_of_software_code_development;

import java.util.Scanner;



public class Unit01 {
	public static void main(String[] args) {
   /*  task01();
     task02();*/
		//task04();
		//task05();
		//task06();
		//task07();
		task12();
		
    }
	private static double scannerDouble(String message) {
		Scanner sc = new Scanner(System.in);

		double k;
		System.out.println(message);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("�� ����� �������� ��������!");
		}

		k = sc.nextDouble();
		return k;
	}
	
	
	private static int scannerInt(String message) {
		Scanner sc = new Scanner(System.in);

		int k;
		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("�� ����� �������� ��������!");
		}

		k = sc.nextInt();
		return k;
	}
	
	
	private  static void task01(){
		/*����� �������� �������: z = ((a-3) * b/2) +c*/
		
		double z;
		double a;
		double b;
		double c;
		
		a = scannerDouble("������� ����� a ");
		b = scannerDouble("������� ����� b ");
		c = scannerDouble("������� ����� c ");
		
		z = ((a - 3) * b/2 +c);
		
		System.out.println("z = " + z);
	}
	
	
	private static void task02(){
		/*��������� �������� ��������� �� �������(��� ���������� ��������� �������������� ��������)*/
		
		double a;
		double b;
		double c;
		double z;
		
		a = scannerDouble("������� ����� a ");
		b = scannerDouble("������� ����� b ");
		c = scannerDouble("������� ����� c ");
		
		z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a))
				- Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.println("��������� z = " + z);
		
	}
	
	private static void task03(){
		/*��������� �������� ��������� �� �������(��� ���������� ��������� �������������� ��������)*/
	
		double x;
		double y;
		double rez;

		double xRad;
		double yRad;

		y = scannerDouble("������� �������� y: ");
		x = scannerDouble("������� �������� x: ");
		xRad = x * Math.PI / 180;
		yRad = y * Math.PI / 180;

		rez = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math
				.tan(x * y));

		System.out.println("���������  = " + rez);
	}
	
	private static void task04(){
		/*4. ���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������)
    �������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����.
*/		
		double x;
		double y;
		double z;
		double rez;
		
		x = scannerDouble("������� ����� �: ");
		
		y = (int)x * 0.001;
		
		
		z  = x * 1000 - ((int)x * 1000);
		rez = z + y;
		System.out.println("��������� = " + rez);
	}
	
	/**
	 * 
	 */
	private static void task05(){
		/*5. ���� ����������� ����� �, ������� ������������ ������������ ���������� ������� � ��������. 
        ������� ������ �������� ������������ � �����, ������� � �������� � ��������� �����: ��� ����� SSc.
		*/
		
		int T ;
		int hour;
		int min;
		int sec;
		
		T = scannerInt("������� �������� �����");
		hour  = T / 3600;
		
		min = (T - hour * 3600) / 60;
		
		sec = T - hour * 3600 - min * 60;
		System.out.println(hour + "� " + min + "��� " + sec + "c");
		
	}
	
	private static void task06(){
		/*6. ��� ������ ������� ��������� �������� ���������, ������� ������� true
				���� ����� � ������������ (�,�) ����������� ����������� �������, � false - � ��������� ������*/
		
		int x;
		int y;
		
		x = scannerInt("������� ���������� �");
		y = scannerInt("������� ���������� y");
		
		if((x <= 4 && x >= -4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y <=4 && y >= 0))
			System.out.println("true");
		else System.out.println("False");
	}
	
	
	private static void task07(){
		/*7. ���� 2 ���� ������������ (� ��������). ����������, ��������� �� �����
				�����������, � ���� ��, �� ������ �� �� �������������*/
	
	int alfa;
	int betta;
	int sum;
	
	alfa = scannerInt("������� ������ ����:");
	betta = scannerInt("������� ������ ����:");
	sum = alfa + betta;
	
	if(sum < 180){
		System.out.println("����������� ����������!");
	} else System.out.println("����������� �� ����������!!");
	
	if(( alfa == 90 || betta == 90) && sum < 180)
		System.out.println("����������� �������������!");
	
	}
	
	private static void task08(){
		//���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������.
		int x1;
		int x2;
		int x3;
		int y1;
		int y2;
		int y3;
		double z;
		double g;
		
		x1 = scannerInt ("������� �1");
		x2 = scannerInt ("������� x2");
		x3 = scannerInt ("������� �3");
		y1 = scannerInt ("������� y1");
		y2 = scannerInt ("������� y2");
		y3 = scannerInt ("������� y3");
		
		z = ((x2 - x1) / (x3 - x1));
		g = ((y2 - y1) / (y3 - y1));
		
		if( z == g){
			System.out.println("����� ����� �� ����� ������");}
		else System.out.println("����� �� ����� �� ����� ������");
		
	}
	
	private static void task12(){
		int a;
		int sum = 0;
		a = scannerInt("������� ������������� �����!");
		if(a > 0) {
			for(int i = 1; i <= a; i++)
				sum += i;
			System.out.println(sum);
		} else System.out.println("�� ����� ������������� �����!");
		
		
	}
}
