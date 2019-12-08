package com.class29;

public class PhoneTest {

	public static void main(String[] args) {
		//you cannot directly create an object of an abstract class that is not 100% defined
	    //Phone phone=new Phone();CE: cannot instanciate
		
		//we can create it indirectly by accessing the child class
		
		Phone phone=new iPhone();
		phone.makeCall();
		phone.sendText();
		phone.takePictures();
		phone.playGames();

	}

}
