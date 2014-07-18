package com.midix;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Generator {

	public static void generateDirectory(String name){
		File dir = new File(name);
		dir.mkdir();
	}
	
	public static void generateUtils(String dirPath){
		File utils = new File(dirPath+"/"+"util.js");
		Writer writer = null;
		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream(utils), "utf-8"));
		    writer.write(Templates.UTILS);
		} catch (IOException ex) {
		  // report
		} finally {
		   try {writer.close();} catch (Exception ex) {}
		}
	}
	
	public static void generateDescriptor(String dirPath){
		File descriptor = new File(dirPath+"/"+"descriptor.xml");
		Writer writer = null;
		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream(descriptor), "utf-8"));
		    writer.write(Templates.DESCRIPTOR);
		} catch (IOException ex) {
		  // report
		} finally {
		   try {writer.close();} catch (Exception ex) {}
		}
	}
	
	public static void generateScreen(String dirPath){
		File screen = new File(dirPath+"/"+"screen.xml");
		Writer writer = null;
		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream(screen), "utf-8"));
		    writer.write(Templates.DESCRIPTOR);
		} catch (IOException ex) {
		  // report
		} finally {
		   try {writer.close();} catch (Exception ex) {}
		}
	}
	
	public static void generateMain(String dirPath){
		File main = new File(dirPath+"/"+"main.js");
		Writer writer = null;
		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream(main), "utf-8"));
		    writer.write(Templates.MAIN);
		} catch (IOException ex) {
		  // report
		} finally {
		   try {writer.close();} catch (Exception ex) {}
		}
	}
}
