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
		int ans = 0;
		System.out.println("リスク共有(リスク移転)に該当するものはどれか。");
		System.out.println("１：損失の発生率を低下させること");
		System.out.println("２：保険への加入などで，他者との間でリスクを分散すること");
		System.out.println("３：リスクの原因を除去すること");
		System.out.println("４：リスクを扱いやすい単位に分解するか集約すること");
		System.out.print("回答：");
		ans = sc.nextInt();
		if(ans == 2) {
			System.out.println("正解");
			point += 3;
		}else {
			System.out.println("不正解");
		}
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
