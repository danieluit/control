package org.phone;
import org.phone.Externalstorage;
public class Internalstorage {
	private void processorName() {
		// TODO Auto-generated method stub
System.out.println("Processor name is pentium ");

	}
	private void ramsize() {
		// TODO Auto-generated method stub
System.out.println("Ram size is 8 GB");

	
	}
	public static void main(String[] args) {
		Internalstorage i=new Internalstorage();
		i.processorName();
		i.ramsize();
		Externalstorage e=new Externalstorage();
		e.size();
		
	}
	
	
	
	
	
	
	
	
	

}
