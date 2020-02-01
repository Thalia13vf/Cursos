package dio.collections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exercicio {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Juliana");
		fila.add("Pedro");
		fila.add("Carlos");
		fila.add("Larissa");
		fila.add("João");
		
		Iterator<String> iterator = fila.iterator();
		
		while(iterator.hasNext()) 
		{
			System.out.println("Nome: " + iterator.next());
		}
		
		System.out.println("Primeiro da Fila: " + fila.peek());
		String i = fila.poll();
		System.out.println("Primeiro e remover " + i);
		fila.add("Daniel");
		
		System.out.println(fila);
		
		System.out.println("Tamanho: " + fila.size());
		System.out.println("Vazia? " + fila.isEmpty());
		System.out.println("Contém Carlos? " +fila.contains("Carlos"));
	
	}
}
