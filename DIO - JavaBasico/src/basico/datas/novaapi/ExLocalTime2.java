package basico.datas.novaapi;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExLocalTime2 {
	public static void main(String[] args) {
		LocalTime agora = LocalTime.now();
		
		System.out.println(agora);
		
		LocalTime maisUmaHora = agora.plusHours(1);
		System.out.println(maisUmaHora);
		System.out.println(maisUmaHora.isAfter(agora));
		
		
	}
}
