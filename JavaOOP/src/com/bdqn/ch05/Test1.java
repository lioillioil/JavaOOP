package com.bdqn.ch05;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 两数相除
 * 
 * @author LILIBO
 *
 */
public class Test1 {

	public static void main(String[] args) {
		System.out.println(test());
	}
	
	public static int test() {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("请输入被除数：");
			int num1 = input.nextInt(); // 获取一个整数
			System.out.println("请输入除数：");
			int num2 = input.nextInt();
			System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
			return 1;
		} catch (InputMismatchException e) { // 异常类型 异常对象
//			e.printStackTrace(); // 打印异常堆栈信息
			System.out.println("出现错误：被除数和除数必须是整数。");
			return 2;
		} catch (ArithmeticException e) {
//			e.printStackTrace(); // 打印异常堆栈信息
			System.out.println("出现错误：除数不能为零。");
			return 3;
		} catch (Exception e) {
			System.out.println("程序出现错误！");
			return 4;
		} finally {
			System.out.println("感谢使用本程序！");
		}
	}
}
