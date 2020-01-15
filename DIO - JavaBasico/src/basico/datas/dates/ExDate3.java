package basico.datas.dates;

import java.util.Date;

public class ExDate3 {
	public static void main(String[] args) {
		Date dataNoPassado = new Date(1513124807691L);
		//Tue Dec 12 22:26:47 BRST 2017
		Date DataNoFuturo = new Date(1613124807691L);
		//Fri Feb 12 08:13:27 BRST 2021
		Date mesmaDataNoFuturo = new Date(1613124807691L);
		//Fri Feb 12 08:13:27 BRST 2021
		
		/*Comparando se as datas s�o iguais*/
		boolean isEquals = DataNoFuturo.equals(mesmaDataNoFuturo);
		System.out.println(isEquals);//true
		
		/*Comparando uma data com a outra*/
		int compareCase1 = dataNoPassado.compareTo(DataNoFuturo);
		// passado -> futuro
		int compareCase2 = DataNoFuturo.compareTo(dataNoPassado);
		// futuro -> passado
		int compareCase3 = DataNoFuturo.compareTo(mesmaDataNoFuturo);
		// futuro -> mesma data no futuro
		
		System.out.println(compareCase1);
		System.out.println(compareCase2);
		System.out.println(compareCase3);
		
		/* -1 est� no passado
		 * 1 est� no futuro
		 * 0 datas iguais
		 * */
		
		
	}
}
