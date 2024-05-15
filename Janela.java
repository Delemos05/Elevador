package com.senac.elevador;

import java.awt.Component;
import java.awt.Font;

import javax.swing.*;


public class Janela extends JFrame {

	private JButton btnAbrir, btnFechar;
	private JButton [] btnAndar;
	private JLabel lblInicio;
	
	public Janela() {
		inicio();
	}
	
	private void inicio() {
		setTitle("Programa Elevador!");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		criarPainel();
		setVisible(true);
	}

	private void criarPainel() {
		add(criarLabel());
		criarBtnAbrirFechar();
		criarBtnAndares();
	}

	
	
	private void criarBtnAndares() {
		btnAndar = new JButton[5];
		int x = 45;
		for(int i = 0; i < btnAndar.length; i++) {
			btnAndar[i] = new JButton(" " + (i + 1) + "°");
			btnAndar[i].setBounds(x, 460, 125, 60);
			x+=145;
			add(btnAndar[i]);
		}
		
		
	}

	private void criarBtnAbrirFechar() {
		btnAbrir = new JButton("Abrir");
		btnFechar = new JButton("Fechar");
		btnAbrir.setBounds(160, 285, 220, 60);
		btnFechar.setBounds(400, 285, 220, 60);
		add(btnAbrir);
		add(btnFechar);
	}

	private Component criarLabel() {
		
		lblInicio = new JLabel("Seja Benvindo(a): Escolhe um Andar.");
		lblInicio.setFont(new Font("Arial", Font.PLAIN, 18));
		lblInicio.setHorizontalAlignment(JLabel.CENTER);
		//lblInicio.setVerticalAlignment(JLabel.CENTER);
		lblInicio.setBounds(0, 60, 800, 30);
		return lblInicio;
	}
} 
