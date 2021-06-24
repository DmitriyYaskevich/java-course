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
			System.out.println("Вы ввели неверное значение!");
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
			System.out.println("Вы ввели неверное значение!");
		}

		k = sc.nextInt();
		return k;
	}
	
	
	private  static void task01(){
		/*Найти значение функции: z = ((a-3) * b/2) +c*/
		
		double z;
		double a;
		double b;
		double c;
		
		a = scannerDouble("Введите число a ");
		b = scannerDouble("Введите число b ");
		c = scannerDouble("Введите число c ");
		
		z = ((a - 3) * b/2 +c);
		
		System.out.println("z = " + z);
	}
	
	
	private static void task02(){
		/*Вычислить значение выражения по формуле(все переменные принимают действительные значения)*/
		
		double a;
		double b;
		double c;
		double z;
		
		a = scannerDouble("Введите число a ");
		b = scannerDouble("Введите число b ");
		c = scannerDouble("Введите число c ");
		
		z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a))
				- Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.println("Результат z = " + z);
		
	}
	
	private static void task03(){
		/*Вычислить значение выражения по формуле(все переменные принимают действительные значения)*/
	
		double x;
		double y;
		double rez;

		double xRad;
		double yRad;

		y = scannerDouble("Введите значение y: ");
		x = scannerDouble("Введите значение x: ");
		xRad = x * Math.PI / 180;
		yRad = y * Math.PI / 180;

		rez = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math
				.tan(x * y));

		System.out.println("Результат  = " + rez);
	}
	
	private static void task04(){
		/*4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях)
    Поменять местами дробную и целую части числа и вывести полученное значение числа.
*/		
		double x;
		double y;
		double z;
		double rez;
		
		x = scannerDouble("Введите число х: ");
		
		y = (int)x * 0.001;
		
		
		z  = x * 1000 - ((int)x * 1000);
		rez = z + y;
		System.out.println("Результат = " + rez);
	}
	
	/**
	 * 
	 */
	private static void task05(){
		/*5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
        Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
		*/
		
		int T ;
		int hour;
		int min;
		int sec;
		
		T = scannerInt("Введите натурное число");
		hour  = T / 3600;
		
		min = (T - hour * 3600) / 60;
		
		sec = T - hour * 3600 - min * 60;
		System.out.println(hour + "ч " + min + "мин " + sec + "c");
		
	}
	
	private static void task06(){
		/*6. Для данной области составить линейную программу, которая печаете true
				если точка с координатами (х,у) принадлежит закрашенной области, и false - в противном случае*/
		
		int x;
		int y;
		
		x = scannerInt("Введите координату х");
		y = scannerInt("Введите координату y");
		
		if((x <= 4 && x >= -4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y <=4 && y >= 0))
			System.out.println("true");
		else System.out.println("False");
	}
	
	
	private static void task07(){
		/*7. Даны 2 угла треугольника (в градусах). Определить, сущестует ли такой
				треугольник, и если да, то буудет ли он прямоугольным*/
	
	int alfa;
	int betta;
	int sum;
	
	alfa = scannerInt("Введите первый угол:");
	betta = scannerInt("Введите второй угол:");
	sum = alfa + betta;
	
	if(sum < 180){
		System.out.println("Треугольник существует!");
	} else System.out.println("Треугольник не существует!!");
	
	if(( alfa == 90 || betta == 90) && sum < 180)
		System.out.println("Треугольник прямоугольный!");
	
	}
	
	private static void task08(){
		//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
		int x1;
		int x2;
		int x3;
		int y1;
		int y2;
		int y3;
		double z;
		double g;
		
		x1 = scannerInt ("Введите х1");
		x2 = scannerInt ("Введите x2");
		x3 = scannerInt ("Введите х3");
		y1 = scannerInt ("Введите y1");
		y2 = scannerInt ("Введите y2");
		y3 = scannerInt ("Введите y3");
		
		z = ((x2 - x1) / (x3 - x1));
		g = ((y2 - y1) / (y3 - y1));
		
		if( z == g){
			System.out.println("Точки лежат на одной прямой");}
		else System.out.println("Точки не лежат на одной прямой");
		
	}
	
	private static void task12(){
		int a;
		int sum = 0;
		a = scannerInt("Введите положительное число!");
		if(a > 0) {
			for(int i = 1; i <= a; i++)
				sum += i;
			System.out.println(sum);
		} else System.out.println("Вы ввели отрицательное число!");
		
		
	}
}
