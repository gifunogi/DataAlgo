// バブルソート
// 計算量:O(n^2)
public class Bubble {
	static int[] sort(int[] a) {
		int l = a.length;
		for (int i = 0; i < l; i++ ) {
			for (int j = 0; j < l-1; j++) {	//各隣接要素を逐次比較・交換
				if (a[i] < a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		return a;
	}
}
