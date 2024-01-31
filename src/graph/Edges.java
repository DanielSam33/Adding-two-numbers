package graph;

public class Edges {
	
	int source;
	int destination;
	
	public Edges(int source,int destination) {
		this.destination=destination;
		this.source=source;
	}
	
	public void setSource(int source) {
		this.source = source;
	}
	
	public void setDestination(int destination) {
		this.destination = destination;
	}
	
	public int getSource() {
		return source;
	}
	
	public int getDestination() {
		return destination;
	}

}
