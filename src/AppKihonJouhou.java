import java.util.Scanner;

public class AppKihonJouhou {
	int point;
	int total;
	static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
	}
	public int question1(){
		System.out.print("問１：プログラム中のアイディアやアルゴリズムは保護しないが，");
		System.out.println("プログラムのコード化された表現を保護する法律はどれか。");
		System.out.println("1:意匠法　2:商標法　3:著作権法　4:特許法");
		int num = sc.nextInt();
		if(num == 3) {
			System.out.println("正解です！");
			point = 10;
		} else {
			System.out.println("不正解です");
			point = 0;
		}
		return point;
    }
	public int question2(){
		    return point;
	}
	public int question3(){
		    return point;
	}
	public int question4(){
		    return point;
	}
	public int question5(){
		    return point;
	}
	public int question6(){
		    return point;
	}

}
