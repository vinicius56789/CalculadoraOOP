package calculadora;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.print.DocFlavor.URL;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtResultado;
	private Double valor_1;
	private Double valor_2;
	private String sinal;
	private Boolean ponto = false;
	

	public Double getValor_1() {
		return this.valor_1;
	}

	public void setValor_1(Double valor_1) {
		this.valor_1 = valor_1;
	}

	public Double getValor_2() {
		return this.valor_2;
	}

	public void setValor_2(Double valor_2) {
		this.valor_2 = valor_2;
	}

	public String getSinal() {
		return this.sinal;
	}

	public void setSinal(String sinal) {
		this.sinal = sinal;
	}
	
	public Boolean getPonto() {
		return this.ponto;
	}
	
	public void setPonto(Boolean ponto) {
		this.ponto = ponto;
	}

	/**
	 * Launch the application.
	 */
	
	java.net.URL caminhoImagem;
	Image iconeTitulo;

	public void Icone(){
		this.setIconImage(new ImageIcon(getClass().getResource("/calculadora/download.png")).getImage());
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		
		Icone();
				
		//TAMANHO DA ABA
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// FONTE
		Font fonte = new Font("Times new roman", 1, 20);
		Font fonte_2 = new Font("Comic sans", 1, 20);
		
		//BOTÕES
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+1);
			}
		});
		button.setBounds(38, 93, 49, 41);
		contentPane.add(button);
		
		JButton button_0 = new JButton("2");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+2);
			}
		});
		button_0.setBounds(97, 93, 49, 41);
		contentPane.add(button_0);
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+3);
			}
		});
		button_1.setBounds(156, 93, 49, 41);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+4);
			}
		});
		button_2.setBounds(38, 145, 49, 41);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+5);
			}
		});
		button_3.setBounds(97, 145, 49, 41);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+6);
			}
		});
		button_4.setBounds(156, 145, 49, 41);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+7);
			}
		});
		button_5.setBounds(38, 197, 49, 41);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+8);
			}
		});
		button_6.setBounds(97, 197, 49, 41);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+9);
			}
		});
		button_7.setBounds(156, 197, 49, 41);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+0);
			}
		});
		button_8.setBounds(38, 249, 108, 41);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("+");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor_1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText(null);
				sinal = "+";
				setPonto(false);
			}
		});
		button_9.setBounds(274, 93, 49, 41);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor_1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText(null);
				sinal = "-";
				setPonto(false);
			}
		});
		button_10.setBounds(274, 145, 49, 41);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor_1 = Double.valueOf(txtResultado.getText());
				txtResultado.setText(null);
				sinal = "*";
				setPonto(false);
			}
		});
		button_11.setBounds(215, 93, 49, 41);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor_1 = Double.valueOf(txtResultado.getText());
				txtResultado.setText(null);
				sinal = "/";
				setPonto(false);
			}
		});
		button_12.setBounds(215, 145, 49, 41);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("<");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero = txtResultado.getText();
				if(numero.length() > 0) {
					String str = numero.substring(0,numero.length()-1);
					txtResultado.setText(str);
				}
			}
		});
		button_13.setBounds(274, 197, 49, 93);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor_2 = Double.parseDouble(txtResultado.getText());
				if(sinal == "+") {
					txtResultado.setText(String.valueOf(valor_1 + valor_2));
				}else if(sinal == "-"){
					txtResultado.setText(String.valueOf(valor_1 - valor_2));
				}else if(sinal == "*") {
					txtResultado.setText(String.valueOf(valor_1 * valor_2));
				}else if(sinal == "/"){
					txtResultado.setText(String.valueOf(valor_1 / valor_2));
				}
				setPonto(true);
			}
		});
		button_14.setBounds(215, 197, 49, 93);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton(",");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(getPonto() == false) {
					txtResultado.setText(txtResultado.getText()+".");
					setPonto(true);
				}
			}
		});
		button_15.setBounds(156, 249, 49, 41);
		contentPane.add(button_15);
		
		// CAMPO DE TEXTO
		txtResultado = new JTextField();
		txtResultado.setBounds(38, 41, 285, 41);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		txtResultado.setFont(fonte_2);
		txtResultado.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
		txtResultado.setEditable(false);
		txtResultado.setBackground(Color.WHITE);
		
		// ESCRITA CALCULADORA BÁSICA
		JLabel lblNewLabel = new JLabel("Calculadora básica");
		lblNewLabel.setFont(fonte);
		lblNewLabel.setBounds(38, 11, 285, 29);
		contentPane.add(lblNewLabel);
	}
	
}
