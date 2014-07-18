package com.midix;

public class Main {

	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("Usage :");
			System.out.println("java -jar karotz.jar projectName");
			System.exit(0);
		}
		String name = args[0];
		Generator.generateDirectory(name);
		Generator.generateUtils(name);
		Generator.generateDescriptor(name);
		Generator.generateScreen(name);
		Generator.generateMain(name);
	}

}
