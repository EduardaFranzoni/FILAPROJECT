package model;

public class Node<T> {
	private T dado;
	private Node<T> prox;
	
	public Node(T dado) {
		this.dado = dado;
		this.prox = null;
	}

	public T getDado() {
		return dado;
	}

	public void setDado(T dado) {
		this.dado = dado;
	}

	public Node<T> getProx() {
		return prox;
	}

	public void setProx(Node<T> prox) {
		this.prox = prox;
	}
	
	
}
