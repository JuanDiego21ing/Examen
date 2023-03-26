//DISEÑADO Y PROGRAMADO POR JUAN DIEGO VEGA ROMERO

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Examen extends JFrame {
	
	public Examen() {
	
			// PANEL PRINCIPAL
			this.setVisible(true);
			this.setSize(500,600);
			this.setLayout(null);
			this.setTitle("Examen segunda unidad");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocation(100,100);
			this.setLocationRelativeTo(null);
			this.getContentPane().setBackground(Color.decode("#A8C6E6"));
			
			//MENU BAR
			JMenuBar jmb = new JMenuBar();
			jmb.setSize(this.getWidth(),40);
			jmb.setVisible(true);
			this.add(jmb);
			 
			JMenu jm1 = new JMenu("Cuenta");
			JMenu jm2 = new JMenu("Usuarios");
			JMenu jm3 = new JMenu("Ayuda");
			 
			jmb.add(jm1);
			jmb.add(jm2);
			jmb.add(jm3);
			
			JMenuItem jmi1 = new JMenuItem("Mi Cuenta");
			JMenuItem jmi2 = new JMenuItem("Cerrar Sesion");
			 
			JMenuItem jmi3 = new JMenuItem("Lista de Usuarios");
			JMenuItem jmi4 = new JMenuItem("Crear Usuario");
			
			JMenuItem jmi5 = new JMenuItem("¿Como Crear Usuarios?");
			
			jm1.add(jmi1);
			jm1.add(jmi2);
			
			jm2.add(jmi3);
			jm2.add(jmi4);
			
			jm3.add(jmi5);
			
			//PANEL ACCEDER CUENTA
			
			JPanel Acceder = new JPanel();
			Acceder.setVisible(true);
			Acceder.setSize(500,600);
			Acceder.setBackground(Color.decode("#A8C6E6"));
			Acceder.setLayout(null);
			add(Acceder);
			
			JLabel tag0 = new JLabel ("ACCEDE A TU CUENTA");
			tag0.setFont(new Font("Comic Sans",Font.BOLD,23));
			tag0.setSize(300,40);
			tag0.setLocation(100,150);
			tag0.setOpaque(true);
			tag0.setBackground(Color.decode("#A8C6E6"));
			Acceder.add(tag0);
			
			JLabel tag1 = new JLabel ("Correo Electronico:");
			tag1.setSize(300,30);
			tag1.setLocation(100,200);
			tag1.setFont(new Font("Arial",Font.BOLD,15));
			Acceder.add(tag1);
			 
			JTextField mail = new JTextField();
			mail.setSize(300,30);
			mail.setLocation(100,230);
			mail.setFont(new Font("Comic Sans",Font.ITALIC,15));
			Acceder.add(mail);
			
			JLabel tag2 = new JLabel ("Ingrese su Contraseña:");
			tag2.setSize(300,30);
			tag2.setLocation(100,260);
			tag2.setFont(new Font("Arial",Font.BOLD,15));
			Acceder.add(tag2);
			 
			JPasswordField pwd = new JPasswordField();
			pwd.setSize(300,30);
			pwd.setLocation(100,290);
			Acceder.add(pwd);
			
			JButton boton1 = new JButton("Iniciar Sesion");
			boton1.setSize(120,30);
			boton1.setLocation(260,360);
			boton1.setBackground(Color.decode("#ADE6A8"));
			Acceder.add(boton1);
			
			JButton boton2 = new JButton("Cancelar");
			boton2.setSize(120,30);
			boton2.setLocation(120,360);
			boton2.setBackground(Color.decode("#E6A9A8"));
			Acceder.add(boton2);
			
			//PANEL ¿COMO CREAR USUARIOS?
			JPanel Crear = new JPanel();
			Crear.setVisible(true);
			Crear.setSize(500,600);
			Crear.setBackground(Color.decode("#A8C6E6"));
			Crear.setLayout(null);
			add(Crear);
			
		    	JTextArea pasos = new JTextArea();
		    	pasos.setSize(100,100);
		    	pasos.setLocation(50,100);
		    	pasos.setText("hola");
		    	Crear.add(pasos);
			
			JLabel tag3 = new JLabel ("¿Como Crear Usuarios?");
			tag3.setSize(300,30);
			tag3.setLocation(115,70);
			tag3.setFont(new Font("Arial",Font.BOLD,22));
			Crear.add(tag3);
			
			
			 
			 jmi5.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					add(Crear);
					remove(Acceder);
					repaint();
					
				}});
			
			boton2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					mail.setText("");
					pwd.setText("");
					
				}});

			 
			this.repaint();
			this.revalidate();
			
			

       }
	
	
	
}
