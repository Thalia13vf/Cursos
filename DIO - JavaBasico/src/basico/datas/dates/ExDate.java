package basico.datas.dates;

import java.util.Date;

public class ExDate {
	public static void main(String[] args) {
		Date novaData = new Date();
		System.out.println(novaData);
		//Retorna Tue Jan 14 20:08:00 BRT 2020
		
		System.out.println("-----------------------------------");
		
		Long milissegundo = System.currentTimeMillis();
		System.out.println("Milissegundo Atual "+milissegundo);
		Date data = new Date(milissegundo);
		System.out.println(data);
		
		System.out.println("---------------------------------");
		System.out.println(novaData.after(data)); //false
		System.out.println(novaData.before(data));//true
		System.out.println(novaData.compareTo(data)); // -1 novaData � antes de Data
		
		
		
	}
	
}
