package graph;

public class GraphMain {

	public static void main(String[] args) {
			
		GraphLogic obj=new GraphLogic(6);
		
		obj.addEdges(3, 7);
		obj.addEdges(3, 6);
		obj.addEdges(3, 2);
		obj.addEdges(7, 4);
		obj.addEdges(7, 2);
		obj.addEdges(6, 2);
		obj.addEdges(4, 9);
		obj.addEdges(2, 9);
		
		obj.print();

	}

}
