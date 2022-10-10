package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String chaine = "12";
		int a = 1;
		int b = 2;
		int result ;
		// Converti le String en Int
		int recup = Integer.parseInt(chaine);
		
		System.out.println(recup);
		
		result = Integer.compare(a, b);
		//Si 0 alors egal 
		//Si -1 a plus petit
		//Si 1 a plus grand
		System.out.println(result);
	}
	
}
