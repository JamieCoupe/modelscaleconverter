package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class ModelScaleConverterGui {

	private JFrame frame;
	private JTextField outputField;
	private JTextField feetToConvert;
	private JTextField inchesToConvert;
	private JTextField fractionOfInchesToConvert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModelScaleConverterGui window = new ModelScaleConverterGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ModelScaleConverterGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JToggleButton tglbtnCalculate = new JToggleButton("Calculate");
		tglbtnCalculate.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				System.out.println(ModelScaleConverter.convertFeetToScaleMM("N", Float.parseFloat(feetToConvert.getText()), Float.parseFloat(inchesToConvert.getText()), Float.parseFloat(fractionOfInchesToConvert.getText())));
				Float measurementAsFloat = (ModelScaleConverter.convertFeetToScaleMM("N", Float.parseFloat(feetToConvert.getText()), Float.parseFloat(inchesToConvert.getText()), Float.parseFloat(fractionOfInchesToConvert.getText())));
				outputField.setText(measurementAsFloat.toString());;
			
			}
		});
		tglbtnCalculate.setBounds(84, 202, 161, 29);
		frame.getContentPane().add(tglbtnCalculate);
		
		JLabel lblFeet = new JLabel("Feet");
		lblFeet.setBounds(95, 57, 61, 16);
		frame.getContentPane().add(lblFeet);
		
		JLabel lblInches = new JLabel("Inches");
		lblInches.setBounds(77, 85, 61, 16);
		frame.getContentPane().add(lblInches);
		
		JLabel lblFractionOfInches = new JLabel("Fraction of Inches");
		lblFractionOfInches.setBounds(84, 118, 119, 16);
		frame.getContentPane().add(lblFractionOfInches);
		
		outputField = new JTextField();
		outputField.setBounds(233, 176, 130, 26);
		frame.getContentPane().add(outputField);
		outputField.setColumns(10);
		
		feetToConvert = new JTextField();
		feetToConvert.setBounds(233, 52, 130, 26);
		frame.getContentPane().add(feetToConvert);
		feetToConvert.setColumns(10);
		
		inchesToConvert = new JTextField();
		inchesToConvert.setBounds(233, 80, 130, 26);
		frame.getContentPane().add(inchesToConvert);
		inchesToConvert.setColumns(10);
		
		fractionOfInchesToConvert = new JTextField();
		fractionOfInchesToConvert.setBounds(233, 113, 130, 26);
		frame.getContentPane().add(fractionOfInchesToConvert);
		fractionOfInchesToConvert.setColumns(10);
	}
}
