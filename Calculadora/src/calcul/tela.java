package calcul;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela {

	private JFrame frmCalculadoraDeJairo;
	private JTextField txtField;
	double numero1;
	double numero2;
	double resultado;
	String operacao;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadoraDeJairo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadoraDeJairo = new JFrame();
		frmCalculadoraDeJairo.setIconImage(Toolkit.getDefaultToolkit().getImage(tela.class.getResource("/imagens/images.jpeg")));
		frmCalculadoraDeJairo.setTitle("Calculadora de Jairo");
		frmCalculadoraDeJairo.getContentPane().setBackground(new Color(0, 0, 128));
		frmCalculadoraDeJairo.setBounds(100, 100, 289, 351);
		frmCalculadoraDeJairo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadoraDeJairo.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setHorizontalAlignment(SwingConstants.TRAILING);
		txtField.setFont(new Font("Arial Black", Font.PLAIN, 18));
		txtField.setBackground(new Color(240, 248, 255));
		txtField.setBounds(10, 11, 244, 34);
		frmCalculadoraDeJairo.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn8.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn8.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn8.setBounds(75, 127, 55, 34);
		frmCalculadoraDeJairo.getContentPane().add(btn8);
		
		JButton btnC_1 = new JButton("C");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnC_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnC_1.setBounds(206, 82, 55, 34);
		frmCalculadoraDeJairo.getContentPane().add(btnC_1);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn7.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn7.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn7.setBounds(10, 127, 55, 34);
		frmCalculadoraDeJairo.getContentPane().add(btn7);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn9.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn9.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn9.setBounds(141, 127, 55, 34);
		frmCalculadoraDeJairo.getContentPane().add(btn9);
		
		JButton btnsoma = new JButton("+");
		btnsoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "+";
				
			}
		});
		btnsoma.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnsoma.setBounds(206, 127, 55, 34);
		frmCalculadoraDeJairo.getContentPane().add(btnsoma);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn4.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn4.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn4.setBounds(10, 172, 55, 34);
		frmCalculadoraDeJairo.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn5.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn5.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn5.setBounds(75, 172, 55, 34);
		frmCalculadoraDeJairo.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn6.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn6.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn6.setBounds(141, 172, 55, 34);
		frmCalculadoraDeJairo.getContentPane().add(btn6);
		
		JButton btnmenos = new JButton("-");
		btnmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "-";
			}
		});
		btnmenos.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnmenos.setBounds(206, 172, 55, 34);
		frmCalculadoraDeJairo.getContentPane().add(btnmenos);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn1.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn1.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn1.setBounds(10, 217, 55, 34);
		frmCalculadoraDeJairo.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn2.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn2.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn2.setBounds(75, 217, 55, 34);
		frmCalculadoraDeJairo.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn3.getText();
				txtField.setText(IngressarNumero);
			}
		});
		btn3.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn3.setBounds(141, 217, 55, 34);
		frmCalculadoraDeJairo.getContentPane().add(btn3);
		
		JButton btnmult = new JButton("X");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "*";
			}
		});
		btnmult.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnmult.setBounds(206, 217, 55, 34);
		frmCalculadoraDeJairo.getContentPane().add(btnmult);
		
		JButton btnvirg = new JButton(",");
		btnvirg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ponto = ".";
				String IngressarNumero = txtField.getText()+ponto;
				txtField.setText(IngressarNumero);
			}
		});
		btnvirg.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnvirg.setBounds(10, 262, 55, 34);
		frmCalculadoraDeJairo.getContentPane().add(btnvirg);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IngressarNumero = txtField.getText() + btn0.getText();
				txtField.setText(IngressarNumero);
		
			}
		});
		btn0.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btn0.setBounds(75, 262, 55, 34);
		frmCalculadoraDeJairo.getContentPane().add(btn0);
		
		JButton btnig = new JButton("=");
		btnig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numero2 = Double.parseDouble(txtField.getText());
						if(operacao.equals("+")) {
								resultado = numero1+numero2;
								txtField.setText(String.valueOf(resultado));
			}
			else if(operacao.equals("-")) {
				resultado = numero1-numero2;
				txtField.setText(String.valueOf(resultado));
			}
			else if(operacao.equals("*")) {
				resultado = numero1*numero2;
				txtField.setText(String.valueOf(resultado));
			}
			else if(operacao.equals("/")) {
				resultado = numero1/numero2;
				txtField.setText(String.valueOf(resultado));
				}
			}
		});
		btnig.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btnig.setBounds(141, 262, 55, 34);
		frmCalculadoraDeJairo.getContentPane().add(btnig);
		
		JButton btndiv = new JButton("÷");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "/";
			}
		});
		btndiv.setFont(new Font("Arial Black", Font.PLAIN, 18));
		btndiv.setBounds(206, 262, 55, 34);
		frmCalculadoraDeJairo.getContentPane().add(btndiv);
	}
}
