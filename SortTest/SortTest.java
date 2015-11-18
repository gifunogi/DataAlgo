// 各ソートアルゴリズムの確認
// 実装済:バブルソート，ヒープソート
import java.util.Random;
import java.util.Arrays;

class SortTest {
	public static void main(String[] args) {
		final int SIZE = 20;		// 配列の大きさの定義
		int[] num = new int[SIZE];
		numReset(num);
		System.out.println("origin ->	" + Arrays.toString(num));
		int [] bnum = Bubble.sort(num);
		System.out.println("bubble ->	" + Arrays.toString(bnum));
		numReset(num);
		System.out.println("origin ->	" + Arrays.toString(num));
		int [] hnum = Heap.sort(num);
		System.out.println("origin ->	" + Arrays.toString(num));
	}

	// 配列要素のリセット
	// 0から99の整数をランダムに配列に格納
	private static void numReset (int[] num) {
		int l = num.length;
		Random rand = new Random();
		for (int i = 0; i < l; i++) {
			num[i] = rand.nextInt(100);
		}
		// リセットの確認
		System.out.println("--reset");
	}
}
