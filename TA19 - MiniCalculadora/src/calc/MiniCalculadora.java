package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class MiniCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField operando1entrada;
	private JTextField operando2entrada;
	private JTextField resultadoEntrada;
	
	double x;
	double y;
	double resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniCalculadora frame = new MiniCalculadora();
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
	public MiniCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		operando1entrada = new JTextField();
		operando1entrada.setHorizontalAlignment(SwingConstants.CENTER);
		operando1entrada.setBounds(74, 98, 86, 20);
		contentPane.add(operando1entrada);
		operando1entrada.setColumns(10);
		
		operando2entrada = new JTextField();
		operando2entrada.setHorizontalAlignment(SwingConstants.CENTER);
		operando2entrada.setBounds(229, 98, 86, 20);
		contentPane.add(operando2entrada);
		operando2entrada.setColumns(10);
		
		resultadoEntrada = new JTextField();
		resultadoEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		resultadoEntrada.setBounds(150, 393, 86, 20);
		contentPane.add(resultadoEntrada);
		resultadoEntrada.setColumns(10);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(285, 11, 89, 23);
		contentPane.add(btnSalir);
		
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(operando1entrada.getText());
				y = Double.parseDouble(operando2entrada.getText());
				
				resultado = x + y;

				resultadoEntrada.setText(String.valueOf(resultado));
				
			}
		});
		btnSuma.setBounds(74, 178, 86, 58);
		contentPane.add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(operando1entrada.getText());
				y = Double.parseDouble(operando2entrada.getText());
				
				resultado = x - y;

				resultadoEntrada.setText(String.valueOf(resultado));
			}
		});
		btnResta.setBounds(229, 178, 86, 58);
		contentPane.add(btnResta);
		
		JButton btnMulti = new JButton("X");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(operando1entrada.getText());
				y = Double.parseDouble(operando2entrada.getText());
				
				resultado = x * y;

				resultadoEntrada.setText(String.valueOf(resultado));
			}
		});
		btnMulti.setBounds(74, 271, 86, 58);
		contentPane.add(btnMulti);
		
		JButton btnDiv = new JButton("÷");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(operando1entrada.getText());
				y = Double.parseDouble(operando2entrada.getText());
				
				resultado = x / y;

				resultadoEntrada.setText(String.valueOf(resultado));
			}
		});
		btnDiv.setBounds(229, 271, 86, 58);
		contentPane.add(btnDiv);
		
		JLabel operando1 = new JLabel("Operando 1");
		operando1.setHorizontalAlignment(SwingConstants.CENTER);
		operando1.setBounds(74, 56, 86, 14);
		contentPane.add(operando1);
		
		JLabel operando2 = new JLabel("Operando 2");
		operando2.setHorizontalAlignment(SwingConstants.CENTER);
		operando2.setBounds(229, 56, 86, 14);
		contentPane.add(operando2);
		
		JLabel resultado = new JLabel("Resultado");
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setBounds(150, 368, 86, 14);
		contentPane.add(resultado);
	}
}
