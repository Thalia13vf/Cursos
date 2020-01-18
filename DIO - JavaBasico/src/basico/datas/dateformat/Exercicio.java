package basico.datas.dateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio {
	public static void main(String[] args) {
		Date agora = new Date();
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:SSS");
		
		String data = s.format(agora);
		System.out.println(data);
	}
}
