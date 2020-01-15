package basico.tipos;

public class Primitivos {
	public static void main(String[] args) {
		byte b;//tem 8 bits no máximo
		byte b1 = 127;
		//byte b2 = 128; utrapassa o tamanho de byte, já é int
		byte b2 = -128;
		//byte b3 = -129; //já é int
		
		char c; //16 bits, alfanumérico
		char c1 = 'A';
		char c2 = 15;
		//char c3 = 'AA'; é mais de 1 caractere
		char c3 = 10000;
		//char c4 = -100;
		
		short s; //16 bits 
		short s1 = 32767;  //número maximo positivo no short
		short s2 = -32768; //número minimo positivo no short
		
		int i = 2147483647; //32 bits - número máximo +
		int i2 = -2147483648; //número máximo -
		
		long l = 9223372036854775807l; //64 bits
		long l2 = -9223372036854775808l;
		
		//FLUTUANTES
		float f = 65f; //32 bits pode ter números inteiros e reais
		float f2 = 65.0f;
		float f3 = -0.5f;
		
		double d = 1024.99; //64 bits
		double d2 = 10.2456;
		
		boolean bo = true; //apenas aceita true ou false
		boolean bo2 = false;
		
		//System.out.println("Byte " + b);

	}
}
