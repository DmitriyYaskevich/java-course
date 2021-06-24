package by.traning.emap.algoritmithmization;

import java.util.Random;
import java.util.Scanner;

public class Unin2 {

	public static void WorkWithArray(int[] mas){
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mas.length; i++){
			System.out.println("ar[" + i + "] = ");
			mas[i] = sc.nextInt();
		}
	}
	private static void enterArrayRandom(int[] mas){
		Random rand = new Random();
		for(int i = 0; i < mas.length; i++)
			mas[i] = rand.nextInt(100);
		
	}
	
	private static void enterArrayRandom2(double[] mas){
		Random rand = new Random();
		for(int i = 0; i < mas.length; i++)
			mas[i] = rand.nextDouble();
		
	}
	
	private static void printArray(int[] mas){
		for(int i = 0; i < mas.length; i++)
			System.out.println("ar[" + i + "] = " + mas[i]);
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
	
	public static void main(String[] args) {
		//task01();
		//task02();
		task03();

	}

	
	public static void task01(){
		//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
		int k = 3;
		int sum = 0;
		
		int n = scannerInt("Введите число элементов массива");
		int[] array = new int[n];
		enterArrayRandom(array);
		for(int i = 0; i < array.length; i++)
			{if(array[i] % k == 0){
				sum += array[i];}}
		
		System.out.println("Сумма элементов = " + sum);
		}
		
	
	private static void task02(){
		/*2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все 
				ее члены, больше данного Z, этим числом. Подсчитать количество замен.*/
				
		int z = 100;
		int k;
		double t;
		int count = 0;
		k = scannerInt("Введите количество элементов массива");
		
		int[] mas = new int[k];
		enterArrayRandom(mas);
	
		printArray(mas);
		for (int i = 0; i < mas.length; i++)
			{if(mas[i] > k)
				{mas[i] = k;
				count++;}}
		printArray(mas);
		System.out.println("Количество замен = " + count);
			
}
	
	private static void task03(){
		//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных 
		//и нулевых элементов
		int n;
		int count0 = 0;
		int count1 = 0; 
		int count2 = 0;
		
		n = scannerInt("Введите количество элементов массива");
		double[] mas = new double [n];
		enterArrayRandom2(mas);
		for(int i = 0; i < mas.length; i++)
			System.out.println("ar[" + i + "] = " + mas[i]);
		
		for(int i =0; i < mas.length; i++)
		{if(mas[i] == 0)
			count0++;
		if(mas[i] > 0)
			count1++;
		if(mas[i] < 0)
			count2++;
		
		}
		System.out.println("Нулевый элементов = " + count0);
		System.out.println("Положительных элементов = " + count1);
		System.out.println("Отрицательных элементов = " + count2);
		
	}
}
