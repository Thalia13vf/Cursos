package basico.datas.dates;

import java.util.Date;

public class ExercicioDate {
	public static void main(String[] args) {
		Date dataNascimento = new Date(889828801000L);
		System.out.println(dataNascimento);
		
		Date data = new Date(1273963201000L);
		System.out.println(data);
		
		System.out.println("Posterior " + dataNascimento.after(data));
		System.out.println("Anterior " + dataNascimento.before(data));
	}
}
