package view;

import javax.swing.JOptionPane;

import controller.Fila;

public class Test {

	public static void main(String[] args) {
		Fila<String> fila = new Fila<String>();
		int opc = 0;
		while(opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n"
					+ "1- Adicionar\n"
					+ "2- Remover\n"
					+ "3- Mostrar\n"
					+ "9- Sair\n"));
			switch(opc) {
				case 1: String dado = JOptionPane.showInputDialog("Insira um cargo");
					fila.add(dado);
					break;
				case 2: System.out.println("O cargo " + fila.remove() + " foi removido");
					break;
				case 3: System.out.println(fila.mostra());
					break;
				case 9: System.out.println("Saindo");
					break;
				default: System.err.println("Opc errada");
			}
		}

	}

}
