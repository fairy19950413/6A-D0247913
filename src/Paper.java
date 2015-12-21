import java.util.ArrayList;


public class Paper extends TestSystem {

	ArrayList<Question> question = new ArrayList<Question>();
	
	public void addQuestion(Question q){
		
		question.add(q);
	}
	
	public void removeQuestion(){
		
		question.remove(question.size()); //移掉陣列的最後一個
	}
	
	// 改寫繼承的print
	public void print() {
		
		for(int i=0;i<question.size();i++){
			question.get(i).print();
		}
	} 
}

