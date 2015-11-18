// �q�[�v�\�[�g
// �v�Z��:O(nlog(n))
public class Heap {
	// a[l]����@a[r] �܂Ńq�[�v��
	private static void downHeap (int[] a, int l, int r) {
		int t = a[l];	// ��
		int child;		// �ő�̎q
		int parent;		// �e
		for (parent = l; parent < (r+1)/2; parent = child) {
			int cl = parent * 2 + 1;	// ���̎q
			int cr = cl + 1;			// �E�̎q
			child = (cr <= r && a[cr] > a[cl]) ? cr : cl;	// �ő���q�Ɍ��߂�
			if (t >= a[child])
				break;
			a[parent] = a[child];
		}
		a[parent] = t;
	}

	public static int[] sort(int[] a) {
		int l = a.length;
		for (int i = (l-1)/2 ; i >= 0; i--)
			downHeap(a, i, l-1);	// a[i]����@a[l-1] �܂Ńq�[�v��
		for (int i = l - 1; i > 0; i--) {
			int t = a[0];
			a[0] = a[i];
			a[i] = t;
			downHeap(a, 0, i-1);	// a[0]����@a[i-1] �܂Ńq�[�v��
		}
		return a;
	}
}