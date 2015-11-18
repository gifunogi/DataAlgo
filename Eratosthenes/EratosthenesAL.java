// ArratyList<Integer>を利用したエラトステネスふるいによる素数判定
// 入力された自然数以下の自然数配列から素数以外を取り除く
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class EratosthenesAL {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		Scanner stdIn = new Scanner(System.in);
		System.out.println("入力された自然数n以下の素数を全て表示します．");
		int n = stdIn.nextInt();
		for (int i = 2; i <= n; i++) {	// 2 から　n までの自然数配列
			numList.add(i);
		}
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		primeList = eratosthenes(numList);
		System.out.println("\nエラトステネスのふるいのアルゴリズムより素数のみ出力します．");
		System.out.println(numList);
	}

	// エラトステネスのふるいアルゴリズム
	public static ArrayList<Integer> eratosthenes (ArrayList<Integer> numList) {
		int max = Collections.max(numList);
		int sizeSq = (int)Math.sqrt(numList.size());	//配列のサイズの確認
		for (int i = 0; i < sizeSq; i++) {
			int p = numList.get(i);						// 素数pの決定
			for (int j = p; p*j <= max; j++) {			// 配列中のpの倍数を取り除く
				numList.remove((Integer)(p*j));
			}
			sizeSq = (int)Math.sqrt(numList.size());	//配列のサイズの再決定
		}
		return numList;
	}
}