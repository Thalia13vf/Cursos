package dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercicio {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
		
		Iterator<String> iterator = nomes.iterator();
		
		while(iterator.hasNext()) 
		{
			System.out.println("-->" + iterator.next());
		}
		
		nomes.set(2, "Roberto");
		
		System.out.println(nomes.get(1));
		
		nomes.remove(4);
		
		System.out.println(nomes);
		System.out.println("Contém João? " + nomes.contains("João"));
		
		nomes.remove("João");
		System.out.println("Contém João 2? " + nomes.contains("João"));
		
		System.out.println("Tamanho da Lista: " + nomes.size());
		
		System.out.println("Tem juliano? " + nomes.contains("Juliano"));
		
		List<String> nomes2 = new ArrayList<String>();
		nomes2.add("Ismael");
		nomes2.add("Rodrigo");
		
		nomes.addAll(nomes2);
		
		System.out.println("Duas listas juntas " + nomes);
		
		Collections.sort(nomes);
		System.out.println("Lista ordenada " + nomes);
		
		System.out.println("A lista está vazia? " + nomes.isEmpty());
		
	}
}
