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
		int i = 0;

		System.out.println("問題：ルータの機能に関する記述として，適切なものはどれか。");
		System.out.println("１．LAN同土やLANとWANを接続して，ネットワーク層での中継処理を行う。");
		System.out.println("２．データ伝送媒体上の信号を物理層で増幅して中継する。");
		System.out.println("３．データリンク層でネットワーク同士を接続する。");
		System.out.println("４．二つ以上のLANを接続し，LAN上のMACアドレスを参照して，データフレームをほかのセグメントに流すかどうかの判断を行う。");



		System.out.println("解答：" + i = sc.nextInt());
		if(i  == 1){
			System.out.println("正解");
			point = 1;
		}
		else if(i >= 2 && i < 4){
			System.out.println("不正解");
		}
		else
			System.out.println("1から4の数字を選択してください");
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
