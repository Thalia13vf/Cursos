package basico.datas.novaapi;

import java.time.LocalDate;

public class ExLocalDate2 {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDate ontem = hoje.minusDays(1);
		LocalDate amanha = hoje.plusDays(1);
		LocalDate noProximoMes = hoje.plusMonths(1);
		
		System.out.println(ontem);
		System.out.println(hoje);
		System.out.println(amanha);
		System.out.println(noProximoMes);
		
		
		
	}
	
}
