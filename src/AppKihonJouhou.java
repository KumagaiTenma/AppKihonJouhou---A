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
	  int ans;
	  int point;

	  do{
	    System.out.println("問４\n" + "主記憶装置の高速化の技法として，\n" + "主記憶を幾つかのアクセス単位に分割し，\n" + "各アクセス単位をできるだけ並行動作させることによって,\n" +  "実効的なアクセス時間を短縮する方法を何というか。");
	    System.out.print("１：仮想記憶  ２：パイプライン  ３：マイクロプログラム  ４：メモリインタリーブ  --> ");
	    ans = sc.nextInt();
	  } while( ans < 1 || 4 < ans );
	  if( ans == 4 ){
	    System.out.println("正解！");
	    point = 1;
	  }
	  else{
	    System.out.println("不正解...");
	    point = 0;
	  }
    return point;
	}
	public int question5(){
		    return point;
	}
	public int question6(){
		    return point;
	}

}
