package org.pluralsight.singleton;

public class DbSingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbSingleton dbsingleton=DbSingleton.getInstance();
		System.out.println(dbsingleton);
		DbSingleton dbsingleton1=DbSingleton.getInstance();
		System.out.println(dbsingleton1);
	}

}
