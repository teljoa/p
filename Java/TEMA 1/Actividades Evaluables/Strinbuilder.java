package aparte;

public class Strinbuilder {

	public static void main(String[] args) {
		/*Recorre de al menos dos formas distintas el contenido de un objeto StringBuilder, a
		continuación modifica parte de su contenido y finalmente vacía el StringBuilder de dos
		modos diferentes.
		*/
		
		StringBuilder stringB=new StringBuilder();
		
		stringB.append("Hola");
		System.out.println(stringB);
		stringB.setCharAt(3, 'g');
		System.out.println(stringB);
		
		
		for(int i=0;i<stringB.length();i++) {
			System.out.println(stringB.charAt(i));
		}
		
		int i=0;
		
		while(i<stringB.length()) {
			System.out.println(stringB.charAt(i));
			i++;
		}
		
		stringB.delete(0, stringB.length());
		
		System.out.println(stringB);
	}

}
