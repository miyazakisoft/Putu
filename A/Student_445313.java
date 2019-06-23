/*
学生番号：g445313
氏名：宮崎光

Evaluator.javaはスライドに書いてある通り.
*/
public class Student_445313 {
	
	String number;
	String name;
		
	int MathScore;
	int JapaneseScore;
	int EnglishScore;

	Student_445313(String number, String name) {
		this.number = number;
		this.name = name;
	}

	void setMathScore(int MathScore) {
		this.MathScore = MathScore;
	}

	void setJapaneseScore(int JapaneseScore) {
		this.JapaneseScore = JapaneseScore;
	}

	void setEnglishScore(int EnglishScore) {
		this.EnglishScore = EnglishScore;
	}

	int getAverage() {
		return (MathScore + JapaneseScore + EnglishScore)/3;
	}

	int getMax() {
		int max = MathScore;
	    if (JapaneseScore > max) max = JapaneseScore;
	    if (EnglishScore > max) max = EnglishScore;
	    return max;
	}

	int getMin() {
		int min = MathScore;
	    if (JapaneseScore < min) min = JapaneseScore;
	    if (EnglishScore < min) min = EnglishScore;
	    return min;
	}
}
