package basico.datas.dates;

import java.util.Date;

public class ExDate2 {
	public static void main(String[] args) {
		Date dataPassado = new Date(1513124807691L);
		//Tue Dec 12 22:26:47 BRST 2017
		
		Date dataFuturo = new Date(1613124807691L);
		//Fri Feb 12 08:13:27 BRST 2021
		
	//Comparando se a dataPassado é posterior a dataFuturo
		boolean isAfter = dataPassado.after(dataFuturo);
		System.out.println(isAfter);
	//Comparando se a dataPassado é antes que dataFuturo
		boolean isBefore = dataPassado.before(dataFuturo);
		System.out.println(isBefore);
		
		
	}
}
