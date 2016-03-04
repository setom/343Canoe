import java.util.LinkedList;

import javax.swing.tree.TreeNode;

public class Node {
	private LinkedList<Edge> myEdges; 
	private Integer myElement;
	private int totalEdges = 0;


	public Node(int element){
		myElement = element;
		myEdges = new LinkedList<Edge>();

	}

	public void addEdge(Edge edge){
		myEdges.add(edge);
		totalEdges++;
	}

	public int getElement(){
		return myElement;
	}

	public LinkedList<Edge> getEdges(){
		return myEdges;
	}

	public boolean isEmpty(){
		return myElement.equals(null);
	}

	public boolean containsEdge(Integer edge){
		return myEdges.contains(edge);
	}
	
	public Integer edgeAmount(){
		return totalEdges;
	}
}
