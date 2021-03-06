package basico.datas.novaapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class ExDateTimeFormatada {
	public static void main(String[] args) 
	{
		//hora formatada
		LocalTime hora = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		String text = hora.format(formatter);
		hora = LocalTime.parse(text, formatter);
		
		  LocalDate date = LocalDate.now();
//		  DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-YYYY");
//		  String texto = date.format(f);
//		  date= LocalDate.parse(texto, f);
		
		System.out.println("Hora formatada: " + hora);
		System.out.println("Data formatada: " + date);
	}
}
