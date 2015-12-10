package test.clientsample;

import test.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        HelloWorldService service1 = new HelloWorldService();
	        System.out.println("Create Web Service...");
	        HelloWorld port1 = service1.getHelloWorldPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.product(12,3));
	        System.out.println("Server said: " + port1.sum(8,4));
	        System.out.println("Server said: " + port1.sayHello("Final"));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        HelloWorld port2 = service1.getHelloWorldPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.product(10,5));
	        System.out.println("Server said: " + port1.sum(8,12));
	        System.out.println("Server said: " + port1.sayHello("Finalmente Alessandro"));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
