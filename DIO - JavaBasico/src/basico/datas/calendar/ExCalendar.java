package basico.datas.calendar;

import java.util.Calendar;

public class ExCalendar {
	public static void main(String[] args) {
		Calendar agora = Calendar.getInstance();
		System.out.println("Data correta" + agora.getTime());
		//Thu Jan 16 18:42:21 BRT 2020
		
		agora.add(Calendar.DATE, -15);
		System.out.println("15 dias atr�s: " + agora.getTime());
		
		agora.add(Calendar.MONTH, 4);
		System.out.println("4 meses depois: " +agora.getTime());
		
		agora.add(Calendar.YEAR, 2);
		System.out.println("2 anos depois: " + agora.getTime());
	}
}
