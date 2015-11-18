// ヒープソート
// 計算量:O(nlog(n))
public class Heap {
	// a[l]から　a[r] までヒープ化
	private static void downHeap (int[] a, int l, int r) {
		int t = a[l];	// 根
		int child;		// 最大の子
		int parent;		// 親
		for (parent = l; parent < (r+1)/2; parent = child) {
			int cl = parent * 2 + 1;	// 左の子
			int cr = cl + 1;			// 右の子
			child = (cr <= r && a[cr] > a[cl]) ? cr : cl;	// 最大を子に決める
			if (t >= a[child])
				break;
			a[parent] = a[child];
		}
		a[parent] = t;
	}

	public static int[] sort(int[] a) {
		int l = a.length;
		for (int i = (l-1)/2 ; i >= 0; i--)
			downHeap(a, i, l-1);	// a[i]から　a[l-1] までヒープ化
		for (int i = l - 1; i > 0; i--) {
			int t = a[0];
			a[0] = a[i];
			a[i] = t;
			downHeap(a, 0, i-1);	// a[0]から　a[i-1] までヒープ化
		}
		return a;
	}
}