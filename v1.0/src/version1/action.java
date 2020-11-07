package version1;

import java.awt.event.ActionEvent;

public class action {
	
	public void actionPerformed(ActionEvent e, Window w) {
		judge j = new judge();
		// the number of problem
		if (e.getSource() == w.combobox && w.sign == 0) {
			w.ques_amount = (w.combobox.getSelectedIndex() + 1) * 5;
			// System.out.print(ques_amount);
		}
		// begin
		if (e.getSource() == w.btn && w.sign == 0) {
			w.sign = 1;
			w.jtf_answer.setText("");
			w.m.make_question(5, w);
			w.answer0 = j.answer(w);
			System.out.println("answer0="+w.answer0);
			// w.ques_num = 1;
			w.right = 0;
			w.error = 0;
		}
		// next problem
		if (e.getSource() == w.btn2 && w.sign == 1) {
			int answer = Integer.parseInt(w.jtf_answer.getText());
			System.out.println("answer="+answer+"answer0="+w.answer0);
			if (answer == w.answer0)
				w.right++;
			else
				w.error++;
			w.jtf_right.setText("正确个数: " + w.right);
			w.jtf_error.setText("错误个数: " + w.error);
			w.ques_num++;
			if (w.ques_num == w.ques_amount + 1) {
				w.sign = 0;
				w.jtf_ques.setText("答题结束");
			}
			// System.out.print(ques_num+"+"+ques_amount);
			else {
				w.answer0 = j.answer(w);
				System.out.println("answer0="+w.answer0);
			}
			w.jtf_answer.setText("");
		}
		// push
		if (w.sign == 1 && e.getSource() == w.btn3) {
			w.sign = 0;
			w.jtf_ques.setText("答题结束");
			w.jtf_answer.setText("");
		}
	}
}
