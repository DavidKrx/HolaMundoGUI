package dad.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HolaMundo {

	public static void main(String[] arg) {
	
	//creamos la etiqueta para mostrar el saludo
	Label saludoLabel=new Label();
	saludoLabel.setText("Aqui saldrá el saludo");
	saludoLabel.setBounds(20, 20, 120, 50);
	
	//creamos el boton para saludar
	Button saludarButton=new Button();
	saludarButton.setLabel("Saludar");
	saludarButton.setBounds(20, 80, 120, 30);
	saludarButton.addActionListener(e-> saludoLabel.setText("Hola!!!"));
	//Panel (contenedor) que contiene las etiquetas
	Panel rootPanel=new Panel();
	rootPanel.setLayout(null);
	rootPanel.add(saludoLabel);
	rootPanel.add(saludarButton);
	
	//ventana
	Frame frame=new Frame();
	frame.setTitle("Hola Mundo");
	frame.setSize(320,200);
	frame.setResizable(false);
	frame.setLocationRelativeTo(null);
	frame.add(rootPanel);
	frame.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			frame.dispose();
		}
	});
	frame.setVisible(true);
	}
}
