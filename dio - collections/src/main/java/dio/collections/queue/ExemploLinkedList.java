package dio.collections.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList 
{
	public static void main(String[] args) {
		Queue<String> filaBanco = new LinkedList<String>();
		filaBanco.add("Pamela");
		filaBanco.add("Patricia");
		filaBanco.add("Roberto");
		filaBanco.add("Flávio");
		filaBanco.add("Anderson");
		
		System.out.println(filaBanco);
		
		String clienteASerAtendido = filaBanco.poll();
		
		System.out.println(clienteASerAtendido);
		
		System.out.println(filaBanco);
		//filaBanco.clear();
		String primeiro = filaBanco.peek();
		
		System.out.println(primeiro);
		System.out.println(filaBanco);
		
		String primeiroClienteOuErro = filaBanco.element();
		System.out.println(primeiroClienteOuErro);
		System.out.println(filaBanco);
		
		//Navegar na fila
		for(String cliente : filaBanco) 
		{
			System.out.println(cliente);
		}
		
		Iterator<String> iterator = filaBanco.iterator();
		
		while(iterator.hasNext()) 
		{
			System.out.println("---> "+iterator.next());
		}
		
		System.out.println(filaBanco.size());
		
		filaBanco.clear();
		
		System.out.println(filaBanco.isEmpty());
		
	}
}
