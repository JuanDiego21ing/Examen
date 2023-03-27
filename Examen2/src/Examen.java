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
import javax.swing.JTextField;

public class Examen extends JFrame{

	
	
	public Examen() {
		
		//PANEL PRINCIPAL////////////////////////////////////////////////
		this.setVisible(true);
		this.setSize(500,600);
		this.setLayout(null);
		this.setTitle("Examen2");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(100,100);
		this.setLocationRelativeTo(null); 
		this.getContentPane().setBackground(Color.decode("#989BD1"));
		
		//MENU BAR////////////////////////////////////////////////////////
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
		
		//PANEL ACCESO////////////////////////////////////////////////////////
		
		JPanel log = new JPanel();
		log.setVisible(false);
		log.setSize(400,600);
		log.setLocation(40,40);
		log.setBackground(Color.decode("#293845"));
		log.setLayout(null);
		add(log);
		
		JLabel tag = new JLabel("Accede a tu Cuenta");
		tag.setFont(new Font("Comic Sans", Font.ROMAN_BASELINE, 23));
		tag.setSize(200,40);
		tag.setLocation(100,130);
		tag.setForeground(Color.white);
		tag.setOpaque(true);
		tag.setBackground(Color.decode("#293845"));
		log.add(tag);
		
		JLabel ingresName = new JLabel("Ingrese su Correo:");
		ingresName.setSize(300,30);
		ingresName.setLocation(70,180);
		ingresName.setForeground(Color.white);
		ingresName.setFont(new Font("Arial", Font.BOLD, 15));
		log.add(ingresName);
		
		JTextField mail = new JTextField();
		mail.setSize(300,30);
		mail.setLocation(50,220);
		mail.setFont(new Font("Comic Sans", Font.ITALIC, 15));
		log.add(mail);
		
		JLabel ingresContra = new JLabel("Ingrese su Contraseña:");
		ingresContra.setSize(300,30);
		ingresContra.setLocation(70,260);
		ingresContra.setForeground(Color.white);
		ingresContra.setFont(new Font("Arial", Font.BOLD, 15));
		log.add(ingresContra);
		
		JPasswordField password = new JPasswordField();
		password.setSize(300,30);
		password.setLocation(50,300);
		password.setFont(new Font("Comic Sans", Font.BOLD, 15));
		log.add(password);
		
		JButton boton = new JButton("A C C E D E R");
		boton.setSize(120,30);
		boton.setLocation(50,350);
		boton.setBackground(Color.decode("#91CD91"));
		log.add(boton);
		
		JButton borrar = new JButton("BORRAR");
		borrar.setSize(120,30);
		borrar.setLocation(190,350);
		borrar.setBackground(Color.decode("#CD9A91"));
		log.add(borrar);
		
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		borrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				mail.setText("");
				password.setText("");
				
			}});
		
		//PANEL REGISTRO/////////////////////////////////////////////////////////
		
		JPanel sign = new JPanel();
		sign.setVisible(true);
		sign.setSize(400,600);
		sign.setLocation(40,40);
		sign.setBackground(Color.decode("#8ABD8E"));
		sign.setLayout(null);
		add(sign);
		
		JLabel tag2 = new JLabel("Registro de Usuario");
		tag2.setFont(new Font("Comic Sans", Font.ROMAN_BASELINE, 23));
		tag2.setSize(250,40);
		tag2.setLocation(90,60);
		tag2.setForeground(Color.black);
		tag2.setOpaque(true);
		tag2.setBackground(Color.decode("#8ABD8E"));
		sign.add(tag2);
		
		JLabel nombre = new JLabel("Ingrese su Nombre:");
		nombre.setSize(300,30);
		nombre.setLocation(70,110);
		nombre.setForeground(Color.black);
		nombre.setFont(new Font("Arial", Font.BOLD, 15));
		sign.add(nombre);
		
		JTextField Tnombre = new JTextField();
		Tnombre.setSize(300,30);
		Tnombre.setLocation(50,140);
		Tnombre.setFont(new Font("Comic Sans", Font.ITALIC, 15));
		sign.add(Tnombre);
		
		JLabel usuario = new JLabel("Ingrese su Usuario:");
		usuario.setSize(300,30);
		usuario.setLocation(70,180);
		usuario.setForeground(Color.black);
		usuario.setFont(new Font("Arial", Font.BOLD, 15));
		sign.add(usuario);
		
		JTextField Tusuario = new JTextField();
		Tusuario.setSize(300,30);
		Tusuario.setLocation(50,210);
		Tusuario.setFont(new Font("Comic Sans", Font.ITALIC, 15));
		sign.add(Tusuario);
		
		JLabel correo = new JLabel("Ingrese su Correo:");
		correo.setSize(300,30);
		correo.setLocation(70,250);
		correo.setForeground(Color.black);
		correo.setFont(new Font("Arial", Font.BOLD, 15));
		sign.add(correo);
		
		JTextField Tcorreo = new JTextField();
		Tcorreo.setSize(300,30);
		Tcorreo.setLocation(50,280);
		Tcorreo.setFont(new Font("Comic Sans", Font.ITALIC, 15));
		sign.add(Tcorreo);
		
		JLabel contraseña = new JLabel("Ingrese una Contraseña:");
		contraseña.setSize(300,30);
		contraseña.setLocation(70,320);
		contraseña.setForeground(Color.black);
		contraseña.setFont(new Font("Arial", Font.BOLD, 15));
		sign.add(contraseña);
		
		JPasswordField Tcontraseña = new JPasswordField();
		Tcontraseña.setSize(300,30);
		Tcontraseña.setLocation(50,350);
		Tcontraseña.setFont(new Font("Comic Sans", Font.BOLD, 15));
		sign.add(Tcontraseña);
		
		JButton boton2 = new JButton("R E G I S T R A R");
		boton2.setSize(150,30);
		boton2.setLocation(40,410);
		boton2.setBackground(Color.decode("#989BD1"));
		sign.add(boton2);
		
		JButton borrar2 = new JButton("BORRAR");
		borrar2.setSize(150,30);
		borrar2.setLocation(210,410);
		borrar2.setBackground(Color.decode("#CD9A91"));
		sign.add(borrar2);
		
		boton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		borrar2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Tnombre.setText("");
				Tusuario.setText("");
				Tcorreo.setText("");
				Tcontraseña.setText("");
				
			}});
		
		this.repaint();
		this.revalidate();
		
	}

}
