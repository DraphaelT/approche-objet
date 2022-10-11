package Geometrie;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjetGeometrique[] tabObj = new ObjetGeometrique[2];
		
		tabObj[0] = new Cercle(8);
		tabObj[1] = new Rectangle(5,8);
		
		for(int loop=1;loop<=tabObj.length;loop++) {
			System.out.println("Le Perimetre est : "+tabObj[loop-1].perimetre());
			System.out.println("La Surface est : "+tabObj[loop-1].surface());
		}
	}
}
