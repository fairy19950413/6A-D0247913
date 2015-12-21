
public class Main {

	public static void main(String[] args) {
		
		Paper p = new Paper();
		p.addQuestion(new Question("Q1"));
		p.print();
		p.addQuestion(new Question("Q2"));
		p.print();
	}

}
