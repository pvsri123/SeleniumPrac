package com.gcritshop.master;

import java.io.IOException;

public class ExeLibrary {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Library Lib = new Library();
		String Res =Lib.OpenApplication("http://www.gcrit.com/build3/admin/login.php");
		System.out.println(Res);	
		Thread.sleep(3000);
		Lib.AdminLogin("admin","admin@123");
		System.out.println("Login sucessful");
		
	}

}
