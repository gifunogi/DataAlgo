// �o�u���\�[�g
// �v�Z��:O(n^2)
public class Bubble {
	static int[] sort(int[] a) {
		int l = a.length;
		for (int i = 0; i < l; i++ ) {
			for (int j = 0; j < l-1; j++) {	//�e�אڗv�f�𒀎���r�E����
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
