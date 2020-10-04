package controller;

import model.Node;

public class Fila<T> {
	private Node<T> start;
	
	public Fila() {
		this.start = null;
	}
	
	public void add(T dado) {
		Node<T> n = new Node<T>(dado);
		if(vazia()) {
			this.start = n;
		}else {
			Node<T> aux = this.start;
			while(aux.getProx()!=null) {
				aux = aux.getProx();
			}
			aux.setProx(n);
		}
	}
	
	public T remove() {
		if(!vazia()) {
			T r = this.start.getDado();
			this.start = this.start.getProx();
			return r;
		}
		return null;
	}
	
	public String mostra() {
		String r;
		StringBuffer buffer = new StringBuffer("A lista é: \n");
		if(!vazia()) {
			Node<T> aux = this.start;
			while(aux!=null) {
				buffer.append(aux.getDado() + "\n");
				aux = aux.getProx();
			}
		}
		r = buffer.toString();
		return r;
	}
	
	private boolean vazia() {
		return this.start == null;
	}
}
