package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation[] tabOp = new Operation[4];
		
		tabOp[0] = new Debit("2015-09-31",500);
		tabOp[1] = new Debit("2020-04-03",80);
		tabOp[2] = new Credit("2011-11-11",10000);
		tabOp[3] = new Credit("7700-47-78",5);
		
		int total=0;
		
		for(int loop=1;loop<=tabOp.length;loop++) {
			
			System.out.println(tabOp[loop-1].toString());
			
			if(tabOp[loop-1].getType()=="Debit") {
				total=tabOp[loop-1].getMontantOpe()+total;
			}
			else {
				total=tabOp[loop-1].getMontantOpe()-total;
			}
		}
		System.out.println("Montant total des opération = "+total);
	}

}
