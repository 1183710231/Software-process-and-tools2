package version1;

import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class time extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String DEFAULT_TIME_FORMAT = "mm:ss";
	Window w;
	SimpleDateFormat dateFormatter = new SimpleDateFormat(DEFAULT_TIME_FORMAT);
	int a, b, c, d, e, f;
	String current;
	Timer tmr;
	JLabelTimerTask task;

	public time(Window w) {
		this.w = w;
		String past = dateFormatter.format(new Date());
		a = Integer.parseInt(past.substring(0, 2));
		b = Integer.parseInt(past.substring(3, 5));
		tmr = new Timer();
		JLabelTimerTask task = new JLabelTimerTask();
		tmr.scheduleAtFixedRate(task, new Date(), 1000);
	}

	public void stop() {
		if (task != null)
			task.cancel();
		if (tmr != null)
			tmr.cancel();
	}

	protected class JLabelTimerTask extends TimerTask {
		@Override
		public void run() {
			current = dateFormatter.format(Calendar.getInstance().getTime());
			c = Integer.parseInt(current.substring(0, 2));
			d = Integer.parseInt(current.substring(3, 5));
			f = d - b;
			e = c - a;
			if (d < b) {
				f = d - b + 60;
				e = c - a - 1;
			}
			if (c < a) {
				e = c - a + 60;
			}
			w.lable2.setText(e + ":" + f);
		}
	}
}