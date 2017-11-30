package com.web.app;

import java.util.Arrays;

/**
 * Main-Entry Point Class
 * @author kwonyul.choi
 *
 */
public class Application {
	
	/**
	 * Main Entry Point Method
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("WebClient Application Start -> " + args.length);
		
		Arrays.asList(args).forEach((arg) -> {System.out.println("arg->" + arg);});
		
		StudentRunner runner = new StudentRunner();
		if (args.length >= 2) {
			runner.run(args[0], args[1]);
		} else {
			runner.run("Aaa", "Bbbb");	
		}

		System.out.println("WebClient Application Finish");
	}

	
}
