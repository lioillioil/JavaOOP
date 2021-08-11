package com.bdqn.ch05;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * 使用Log4j记录日志
 * 
 * @author LILIBO
 *
 */
public class Test3 {
	
	private static Logger logger = Logger.getLogger(Test3.class);

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("请输入被除数：");
			int num1 = input.nextInt(); // 获取一个整数
			logger.debug("输入的被除数是：" + num1);
			System.out.println("请输入除数：");
			int num2 = input.nextInt();
			logger.debug("输入的除数是：" + num2);
			System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
		} catch (InputMismatchException e) { // 异常类型 异常对象
			logger.error("出现错误：被除数和除数必须是整数。");
		} catch (ArithmeticException e) {
			logger.error("出现错误：除数不能为零。");
		} catch (Exception e) {
			logger.error("程序出现错误！");
		} finally {
			logger.info("感谢使用本程序！");
		}
	}
}
