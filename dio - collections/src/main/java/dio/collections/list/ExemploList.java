package dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledEditorKit.ItalicAction;

public class ExemploList {
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Carlos");
		nomes.add("Pedro");
		nomes.add("Juliana");
		nomes.add("Anderson");
		nomes.add("Maria");
		nomes.add("João");
		
		System.out.println(nomes);
		
		nomes.set(2, "Larissa");
		//altera para larissa o index 2
		
		System.out.println(nomes);
		
		//Collections é uma classe
		
		Collections.sort(nomes); 
		//ordena em ordem alfabética
		
		nomes.set(2, "Wesley");
		System.out.println(nomes);
		
		nomes.remove(4); 
		//remove o elemento no indice 4
		System.out.println(nomes);
		
		nomes.remove("Wesley");
		//remove o elemento passado como parâmetro
		System.out.println(nomes);
		
		String nome = nomes.get(3);
		//retorna o valor do indice 3
		System.out.println(nome);
		
		int posicao = nomes.indexOf("Wesley");
		//procura a posição do objeto na lista
		//caso não encontre retorna -1
		System.out.println("Posição na lista " + posicao);
		
		int tamanhoDaLista = nomes.size();
		System.out.println(tamanhoDaLista);
		
		nomes.remove("Larissa");
		tamanhoDaLista = nomes.size();
		System.out.println(tamanhoDaLista);
		
		boolean tem = nomes.contains("Anderson");
		//verifica se o elemento passado por parâmetro existe na lista
		System.out.println(tem);
		
		boolean tem2 = nomes.contains("Fernando");
		System.out.println(tem2);
		
		boolean listaVazia = nomes.isEmpty();
		//verifica se a lista está vazia 
		System.out.println("Vazia? " +listaVazia);
		
		
		for(String nomeDoItem: nomes) 
		{
			System.out.println("--------> " +nomeDoItem);
		}
		
		Iterator<String> i = nomes.iterator();
		//O iterartor tem o hasNext que retorna um boolean
		//retorna false quando acabar a lista
		
		//O next retorna o objeto da lista que está sendo 
		//iterado no momento
		while(i.hasNext()) 
		{
			System.out.println("-------->>> " + i.next());
		}
		
		
		nomes.clear();
		//limpa a lista
		listaVazia = nomes.isEmpty();
		System.out.println("Vazia? " + listaVazia);
		
		
	}
}
