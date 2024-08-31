package section3_2;

public class CellCollectionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellCollection cel=new CellCollection(5);
		
		cel.add(new Cell());
		cel.add(new Cell());
		cel.add(new Cell());
		cel.add(new Cell());
		cel.add(new Cell());
		
		cel.getCell(1).setData("Primeira Celula preenchida");
		cel.getCell(2).setData("Segunda Celula preenchida");
		cel.getCell(3).setData("Terceira Celula preenchida");
		
		
		System.out.println(cel.getCell(1));
		System.out.println(cel.getCell(2));
		System.out.println(cel.getCell(3));
		
		System.out.println();
	}

}
