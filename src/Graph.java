import java.util.LinkedList;

public class Graph {
	private Node startNode;
	private LinkedList<Node> myNodes;
	
	public Graph(Node firstNode){
		startNode = firstNode;
		myNodes = new LinkedList<Node>();
	}
	
	public void addNode(Node inputNode){
		myNodes.add(inputNode);
	}
	
	public LinkedList<Node> getNodes(){
		return myNodes;
	}
	
	public int size(){
		return myNodes.size();
	}
	
	public void printGraph(){
		LinkedList<Node> nodes = getNodes();
		LinkedList<Edge> edges;
		Node cur;
		Edge edge;
		for(int i = 0; i < size(); i++){
			cur = nodes.get(i);
			edges = cur.getEdges();
			System.out.println("Node: " + cur.getElement());
			for(int j=0; j < edges.size(); j++){
				edge = edges.get(j);
				edge.printEdge();
			}
		}
	}
	
}

