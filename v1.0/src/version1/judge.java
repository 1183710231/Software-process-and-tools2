package version1;

import java.util.Random;

public class judge {
	public int answer(Window w) {
		if (new Random().nextInt(100) % 2 == 0 && w.question.get(w.ques_num * 2 - 2)>=w.question.get(w.ques_num * 2 - 1)) {
			w.jtf_ques.setText(w.question.get(w.ques_num * 2 - 2) + "-" + w.question.get(w.ques_num * 2 - 1));
			return w.question.get(w.ques_num * 2 - 2) - w.question.get(w.ques_num * 2 - 1);
		} else {
			w.jtf_ques.setText(w.question.get(w.ques_num * 2 - 2) + "+" + w.question.get(w.ques_num * 2 - 1));
			return w.question.get(w.ques_num * 2 - 2) + w.question.get(w.ques_num * 2 - 1);
		}
	}
}
