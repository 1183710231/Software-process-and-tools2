package version1;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class result_window extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton btn = new JButton("关闭");
	JFrame frm = new JFrame();
	public result_window(int ques_num,Window w) {
		frm.setBackground(Color.WHITE);
		frm.setBounds(100, 100, 500, 500);
		btn.setBounds(350, 400 ,113, 33);
		btn.addActionListener(this);
		frm.getContentPane().add(btn);
		JTextArea jtf_result = new JTextArea(ques_num+1,30);
		jtf_result.setBackground(Color.WHITE);
		jtf_result.setBounds(100, 100, 500, 500);
		jtf_result.append("题目"+"\t"+"标准答案"+"\t"+"你的答案"+"\t"+"结果"+"\t\n");
		for(int i=1;i<ques_num+1;i++) {
			jtf_result.append(w.result.get(i-1)+"\r\n");
		}
		frm.getContentPane().add(jtf_result);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			frm.dispose();
		}
	}
	
}
