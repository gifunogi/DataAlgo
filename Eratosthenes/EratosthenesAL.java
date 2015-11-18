// ArratyList<Integer>�𗘗p�����G���g�X�e�l�X�ӂ邢�ɂ��f������
// ���͂��ꂽ���R���ȉ��̎��R���z�񂩂�f���ȊO����菜��
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class EratosthenesAL {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		Scanner stdIn = new Scanner(System.in);
		System.out.println("���͂��ꂽ���R��n�ȉ��̑f����S�ĕ\�����܂��D");
		int n = stdIn.nextInt();
		for (int i = 2; i <= n; i++) {	// 2 ����@n �܂ł̎��R���z��
			numList.add(i);
		}
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		primeList = eratosthenes(numList);
		System.out.println("\n�G���g�X�e�l�X�̂ӂ邢�̃A���S���Y�����f���̂ݏo�͂��܂��D");
		System.out.println(numList);
	}

	// �G���g�X�e�l�X�̂ӂ邢�A���S���Y��
	public static ArrayList<Integer> eratosthenes (ArrayList<Integer> numList) {
		int max = Collections.max(numList);
		int sizeSq = (int)Math.sqrt(numList.size());	//�z��̃T�C�Y�̊m�F
		for (int i = 0; i < sizeSq; i++) {
			int p = numList.get(i);						// �f��p�̌���
			for (int j = p; p*j <= max; j++) {			// �z�񒆂�p�̔{������菜��
				numList.remove((Integer)(p*j));
			}
			sizeSq = (int)Math.sqrt(numList.size());	//�z��̃T�C�Y�̍Č���
		}
		return numList;
	}
}