/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanners;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Cliftonb
 */
public class Oldest {
	public static void main(String[] args) throws IOException{
		String input = "James 32 John 44 Peter 85 Paul 17 Michael 12 Kyle 22";
		Scanner sc2 = new Scanner(new File("test.txt"));
		Scanner sc = new Scanner(input);
		String oldestName = sc.next();
		int oldestAge = sc.nextInt();

		while(sc.hasNext()){
			String currentName = sc.next();
			int currentAge2 = sc.nextInt();
			
			if(currentAge2 > oldestAge){
				oldestName = currentName;
				oldestAge = currentAge2;
			}
		}

		System.out.println("The oldest person is + " + oldestName + " and is " + oldestAge + " years old");

	}
		
}
