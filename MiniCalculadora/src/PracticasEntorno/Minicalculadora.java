package PracticasEntorno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Minicalculadora {

	private JFrame frmMinicalculadora;
	private JTextField caja;
	public float primernumero;
	public float segundonumero;
	public String operador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Minicalculadora window = new Minicalculadora();
					window.frmMinicalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Minicalculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMinicalculadora = new JFrame();
		frmMinicalculadora.setTitle("Minicalculadora");
		frmMinicalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\AdolfoSaladoLopez\\Downloads\\calculator-stationary-icon-by-Vexels.png"));
		frmMinicalculadora.getContentPane().setBackground(new Color(135, 206, 250));
		frmMinicalculadora.setBounds(100, 100, 346, 456);
		frmMinicalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMinicalculadora.getContentPane().setLayout(null);

		caja = new JTextField();
		caja.setFont(new Font("Consolas", Font.PLAIN, 18));
		caja.setHorizontalAlignment(SwingConstants.RIGHT);
		caja.setBounds(10, 11, 310, 43);
		frmMinicalculadora.getContentPane().add(caja);
		caja.setColumns(10);

		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText("");
			}
		});
		clear.setFont(new Font("Tahoma", Font.BOLD, 12));
		clear.setBounds(10, 64, 70, 60);
		frmMinicalculadora.getContentPane().add(clear);

		JButton dividir = new JButton("/");
		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero = Float.parseFloat(caja.getText());
				operador = "/";
				caja.setText("");
			}
		});
		dividir.setFont(new Font("Tahoma", Font.BOLD, 12));
		dividir.setBounds(90, 65, 70, 60);
		frmMinicalculadora.getContentPane().add(dividir);

		JButton multiplicar = new JButton("*");
		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero = Float.parseFloat(caja.getText());
				operador = "*";
				caja.setText("");
			}
		});
		multiplicar.setFont(new Font("Tahoma", Font.BOLD, 12));
		multiplicar.setBounds(170, 65, 70, 60);
		frmMinicalculadora.getContentPane().add(multiplicar);

		JButton restar = new JButton("-");
		restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero = Float.parseFloat(caja.getText());
				operador = "-";
				caja.setText("");
			}
		});
		restar.setFont(new Font("Tahoma", Font.BOLD, 12));
		restar.setBounds(250, 65, 70, 60);
		frmMinicalculadora.getContentPane().add(restar);

		JButton siete = new JButton("7");
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "7");
			}
		});
		siete.setFont(new Font("Tahoma", Font.BOLD, 12));
		siete.setBounds(10, 135, 70, 60);
		frmMinicalculadora.getContentPane().add(siete);

		JButton ocho = new JButton("8");
		ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "8");
			}
		});
		ocho.setFont(new Font("Tahoma", Font.BOLD, 12));
		ocho.setBounds(90, 136, 70, 60);
		frmMinicalculadora.getContentPane().add(ocho);

		JButton nueve = new JButton("9");
		nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "9");
			}
		});
		nueve.setFont(new Font("Tahoma", Font.BOLD, 12));
		nueve.setBounds(170, 136, 70, 60);
		frmMinicalculadora.getContentPane().add(nueve);

		JButton cuatro = new JButton("4");
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "4");
			}
		});
		cuatro.setFont(new Font("Tahoma", Font.BOLD, 12));
		cuatro.setBounds(10, 206, 70, 60);
		frmMinicalculadora.getContentPane().add(cuatro);

		JButton cinco = new JButton("5");
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "5");
			}
		});
		cinco.setFont(new Font("Tahoma", Font.BOLD, 12));
		cinco.setBounds(90, 206, 70, 60);
		frmMinicalculadora.getContentPane().add(cinco);

		JButton seis = new JButton("6");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "6");
			}
		});
		seis.setFont(new Font("Tahoma", Font.BOLD, 12));
		seis.setBounds(170, 207, 70, 60);
		frmMinicalculadora.getContentPane().add(seis);

		JButton uno = new JButton("1");
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "1");
			}
		});
		uno.setFont(new Font("Tahoma", Font.BOLD, 12));
		uno.setBounds(10, 277, 70, 60);
		frmMinicalculadora.getContentPane().add(uno);

		JButton dos = new JButton("2");
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "2");
			}
		});
		dos.setFont(new Font("Tahoma", Font.BOLD, 12));
		dos.setBounds(90, 277, 70, 60);
		frmMinicalculadora.getContentPane().add(dos);

		JButton tres = new JButton("3");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "3");
			}
		});
		tres.setFont(new Font("Tahoma", Font.BOLD, 12));
		tres.setBounds(170, 278, 70, 60);
		frmMinicalculadora.getContentPane().add(tres);

		JButton sumar = new JButton("+");
		sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero = Float.parseFloat(caja.getText());
				operador = "+";
				caja.setText("");
			}
		});
		sumar.setFont(new Font("Tahoma", Font.BOLD, 12));
		sumar.setBounds(250, 136, 70, 130);
		frmMinicalculadora.getContentPane().add(sumar);

		JButton cero = new JButton("0");
		cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(caja.getText() + "0");
			}
		});
		cero.setFont(new Font("Tahoma", Font.BOLD, 12));
		cero.setBounds(10, 348, 150, 60);
		frmMinicalculadora.getContentPane().add(cero);

		JButton igualar = new JButton("=");
		igualar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				segundonumero = Float.parseFloat(caja.getText());

				switch(operador) {
				case "+": 
					caja.setText(Float.toString(primernumero + segundonumero));
					break;
				case "-":
					caja.setText(Float.toString(primernumero - segundonumero));
					break;
				case "*":
					caja.setText(Float.toString(primernumero * segundonumero));
					break;
				case "/":
					caja.setText(Float.toString(primernumero / segundonumero));
					break;
				}

			}
		});
		igualar.setFont(new Font("Tahoma", Font.BOLD, 12));
		igualar.setBounds(250, 277, 70, 130);
		frmMinicalculadora.getContentPane().add(igualar);

		JButton punto = new JButton(".");
		punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!(caja.getText().contains("."))) {
					caja.setText(caja.getText()+ ".");
				}
			}
		});
		punto.setFont(new Font("Tahoma", Font.BOLD, 12));
		punto.setBounds(170, 349, 70, 60);
		frmMinicalculadora.getContentPane().add(punto);
	}
}
