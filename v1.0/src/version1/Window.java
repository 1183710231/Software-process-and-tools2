package version1;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.Font;
import java.awt.SystemColor;

public class Window extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Integer> question = new ArrayList<Integer>();
	make m = new make();
	JButton btn = new JButton("��ʼ����");
	JButton btn2 = new JButton("��һ��");
	JButton btn3 = new JButton("�ύ");
	JTextField jtf_right = new JTextField("��ȷ����: 0", 30);
	JTextField jtf_error = new JTextField("�������: 0", 30);
	JTextField jtf_ques = new JTextField("������", 30);
	JTextField jtf_answer = new JTextField("��", 30);
	Integer[] amount_list = { 5, 10, 15, 20 };
	JComboBox<Integer> combobox = new JComboBox<Integer>(amount_list);
	int ques_num = 1, sign = 0, right = 0, error = 0, ques_amount = 10;
	int answer0 = 0;
	JLabel label = new JLabel(new ImageIcon("src\\version1\\2.jpg"));

	public Window() {
		JFrame frm = new JFrame();
		frm.setBackground(Color.WHITE);
		frm.getContentPane().setBackground(Color.WHITE);
		frm.setBounds(100, 100, 600, 500);
		frm.setTitle("Calculate Training");
		// Container c=frm.getContentPane();
		frm.getContentPane().setLayout(null);// ���������ΪnullĬ�ϣ���ť������������ݿ򣬵�ס������ɫ
		combobox.setBounds(52, 13, 113, 33); // ǰ����������λ�ã��������Ǵ�С
		combobox.setFont(new Font("����", Font.PLAIN, 20));
		combobox.setBackground(Color.WHITE);
		combobox.setForeground(Color.BLACK);
		combobox.addActionListener(this);
		frm.getContentPane().add(combobox);
		btn.setForeground(Color.BLACK);
		btn.setFont(new Font("����", Font.PLAIN, 20));
		btn.setBackground(UIManager.getColor("Button.background"));

		btn.setBounds(431, 13, 134, 33);
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("����", Font.PLAIN, 20));
		btn2.setBackground(UIManager.getColor("Button.background"));
		btn2.setBounds(24, 407, 108, 33);
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("����", Font.PLAIN, 20));
		btn3.setBackground(UIManager.getColor("Button.background"));
		btn3.setBounds(477, 407, 88, 33);
		btn.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		frm.getContentPane().add(btn);
		frm.getContentPane().add(btn2);
		frm.getContentPane().add(btn3);
		jtf_ques.setForeground(Color.BLACK);
		jtf_ques.setFont(new Font("����", Font.PLAIN, 20));
		jtf_ques.setBackground(Color.WHITE);

		jtf_ques.setBounds(24, 296, 119, 33);
		jtf_answer.setForeground(Color.BLACK);
		jtf_answer.setFont(new Font("����", Font.PLAIN, 20));
		jtf_answer.setBackground(Color.WHITE);
		jtf_answer.setBounds(24, 331, 119, 33);
		jtf_right.setFont(new Font("����", Font.PLAIN, 20));
		jtf_right.setForeground(Color.BLACK);
		jtf_right.setBackground(Color.WHITE);
		jtf_right.setBounds(452, 309, 119, 33);
		jtf_error.setFont(new Font("����", Font.PLAIN, 20));
		jtf_error.setForeground(Color.BLACK);
		jtf_error.setBackground(Color.WHITE);
		jtf_error.setBounds(452, 351, 119, 33);
		frm.getContentPane().add(jtf_answer);
		frm.getContentPane().add(jtf_ques);
		frm.getContentPane().add(jtf_right);
		frm.getContentPane().add(jtf_error);
		label.setSize(551, 426);
		label.setLocation(14, 14);
		frm.getContentPane().add(label);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}

	/*
	 * class Window_result extends JFrame implements ActionListener{ JFrame
	 * frm_result=new JFrame(); frm_result.setBounds(100, 100, 500, 250);
	 * frm_result.setTitle("Result"); JButton btn_result = new JButton("�رմ���");
	 * btn_result.setBounds(200, 100, 100, 40); btn_result.addActionListener(this);
	 * frm_result.add(btn_result); public void actionPerformed(ActionEvent e) {
	 * 
	 * } }
	 */
	public static void main(String[] args) {
		System.out.println("hhh");
		new Window();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		new action().actionPerformed(e, this);
	}
}
