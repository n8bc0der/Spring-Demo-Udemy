/**
 * 
 */
package com.udemy.springDemo;

import java.util.Random;

/**
 * @author Akki4lfc
 *
 */
public class RandomFortune implements RandomFortuneService {

	/* (non-Javadoc)
	 * @see com.udemy.springDemo.RandomFortuneService#getRandomFortune()
	 */
	@Override
	public String getRandomFortune() {
		
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		String[] fortuneArray = {"You have done the practice, now relax and can opt for swimming or spa",
								"You should go see your Family for enjoyment",
								"You should eat healthy always,avoid taking sugar in large quantity"};
		
		int randomIndex = random.nextInt(fortuneArray.length);
		
		System.out.println("Inside getRandomFortune method - " + fortuneArray[randomIndex]);
		
		return fortuneArray[randomIndex];
	}

}
