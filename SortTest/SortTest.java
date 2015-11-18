// �e�\�[�g�A���S���Y���̊m�F
// ������:�o�u���\�[�g�C�q�[�v�\�[�g
import java.util.Random;
import java.util.Arrays;

class SortTest {
	public static void main(String[] args) {
		final int SIZE = 20;		// �z��̑傫���̒�`
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

	// �z��v�f�̃��Z�b�g
	// 0����99�̐����������_���ɔz��Ɋi�[
	private static void numReset (int[] num) {
		int l = num.length;
		Random rand = new Random();
		for (int i = 0; i < l; i++) {
			num[i] = rand.nextInt(100);
		}
		// ���Z�b�g�̊m�F
		System.out.println("--reset");
	}
}
