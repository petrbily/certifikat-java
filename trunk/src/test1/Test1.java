package test1;

import java.util.ArrayList;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("ahoj");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		System.out.println(list.hashCode());
	}

}