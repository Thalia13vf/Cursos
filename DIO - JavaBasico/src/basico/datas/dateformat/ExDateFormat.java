package basico.datas.dateformat;

import java.text.DateFormat;
import java.util.Date;

public class ExDateFormat {
	public static void main(String[] args) {
		
		Date agora = new Date();
		
		String data = DateFormat.getInstance().format(agora);
		//O padr�o default � SHORT SHORT
		System.out.println(data);
		
		String date = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
		System.out.println(date);
		
		String data2 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);
		System.out.println(data2);
		
		String data3 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL).format(agora);
		System.out.println(data3);
		
		
	}
}
