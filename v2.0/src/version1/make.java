package version1;

import java.util.Random;

public class make {
	public void make_question(int n,Window w){
		Random r = new Random();
		for(int i=0;i<2*n;i++) 
			w.question.add(r.nextInt(100));
	}
}
