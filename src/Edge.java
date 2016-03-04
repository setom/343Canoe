
public class Edge {

	//the weight of the edge(cost)
	private int weight;
	private Node nextNode;
	
	//constructor
	public Edge(int w, Node n){
		weight = w;
		nextNode = n;
	}
	
	//getter/setter for the edges/nodes
	public int getWeight(){
		return weight;
	}
	
	public void setWeight(int newWeight){
		weight = newWeight;
	}
	
	public Node getNextNode(){
		return nextNode;
	}
	
	public void setNextNode(Node newNext){
		nextNode = newNext;
	}
	
	public void printEdge(){
		System.out.println("Edge weight: "+weight+" destination: "+ nextNode.getElement());
	}
}
