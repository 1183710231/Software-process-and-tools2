package version1;

import java.awt.event.ActionEvent;
import java.net.MalformedURLException;

public class action {
	time t;
	int n=0;
	public void actionPerformed(ActionEvent e, Window w){
		
		judge j = new judge();
		// the number of problem
		if (e.getSource() == w.combobox && w.sign == 0) {
			w.ques_amount = (w.combobox.getSelectedIndex() + 1) * 5;
			// System.out.print(ques_amount);
		}
		if (e.getSource() == w.btn4&&n%2==0) {
			n++;
			w.lable2.setText("");
			t = new time(w);
			w.btn4.setText("停止");
		}
		else if (e.getSource() == w.btn4&&n%2!=0) {
			n++;
			t.stop();
			w.btn4.setText("开始计时");
		}
		// begin
		if (e.getSource() == w.btn && w.sign == 0) {
			
			w.sign = 1;
			w.jtf_answer.setText("");
			w.m.make_question(w.ques_amount, w);
			w.answer0 = j.answer(w);
			//System.out.println("answer0="+w.answer0);
			// w.ques_num = 1;
			w.right = 0;
			w.error = 0;
		}
		// next problem
		if (e.getSource() == w.btn2 && w.sign == 1) {
			int answer = Integer.parseInt(w.jtf_answer.getText());
			//System.out.println("answer="+answer+"answer0="+w.answer0);
			if (answer == w.answer0) {
				w.right++;
				w.result.set(w.ques_num-1, w.result.get(w.ques_num-1).concat("\t"+answer+"\t"+"right"));
			}
			else {
				w.result.set(w.ques_num-1, w.result.get(w.ques_num-1).concat("\t"+answer+"\t"+"wrong"));
				w.error++;
			}
			w.jtf_right.setText("正确个数: " + w.right);
			w.jtf_error.setText("错误个数: " + w.error);
			w.ques_num++;
			if (w.ques_num == w.ques_amount + 1) {
				w.sign = 0;
				w.jtf_ques.setText("答题结束");
				w.lable2.setText("");
				w.jtf_answer.setText("");
				new result_window(w.ques_amount,w);
			}
			// System.out.print(ques_num+"+"+ques_amount);
			else {
				w.answer0 = j.answer(w);
				//System.out.println("answer0="+w.answer0);
			}
			w.jtf_answer.setText("");
		}
		// push
		if (w.sign == 1 && e.getSource() == w.btn3) {
			if(w.ques_num < w.ques_amount + 1)
				for(int i=w.ques_num;i<w.ques_amount + 1;i++) {
					System.out.println(w.question.size()+"??");
					System.out.println(w.ques_amount + 1);
					System.out.println(w.ques_num);
					w.result.set(w.ques_num-1, w.result.get(w.ques_num-1).concat("\t"+"未作答"+"\t"+"未作答"));
					System.out.print(w.result.get(w.ques_num-1));
					w.ques_num++;
					if(w.ques_num < w.ques_amount + 1)
						j.answer(w);
				}
			w.sign = 0;
			w.jtf_ques.setText("答题结束");
			w.jtf_answer.setText("");
			new result_window(w.ques_amount,w);
		}
	}
}
