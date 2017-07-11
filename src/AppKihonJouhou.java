import java.util.Scanner;

public class AppKihonJouhou {
	int point;
	int total;
	static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
	}
	public int question1(){
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
		int i = 0;

		System.out.println("質問6:サプライチェーンマネジメントを説明したものはどれか。");
		System.out.println("1.購買，生産，販売及び物流を結ぶ一連の業務を，企業間で全体最適の視点から見直し，納期短縮や在庫削減を図る。");
		System.out.println("2.個人が持っているノウハウや経験などの知的資産を共有して，創造的な仕事につなげていく。");
		System.out.println("3.社員のスキルや行動特性を管理し，人事戦略の視点から適切な人員配置・評価などを行う。");
		System.out.println("4.多様なチャネルを通して集められた顧客情報を一元化し，活用することで，顧客との関係を密接にしていく。");



		System.out.println("解答:" + i = sc.nextInt());
		if(i == 1) {
			System.out.println("正解");
			point += 1;
		}
		else if(i == 2){
			System.out.println("不正解");
		}
		else if(i == 3){
			System.out.println("不正解");
		}
		else if(i == 4){
			System.out.println("不正解");
		}
		else{
			System.out.println("1～4を入力してください");
		}
		    return point;
	}

}
