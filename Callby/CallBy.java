// 配列の参照渡し(Call by Reference)の確認
// testArray1,2の代入では元の値の変更が起きる
//　testArray3,4の代入では元の値の変更が起きない
import java.util.Arrays;

class CallBy {
	public static void main(String[] args) {
		int[] array = {0, 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(array));
		testArray1(array);
		testArray2(array);
		testArray3(array);
		testArray4(array);
		System.out.println(Arrays.toString(array));
	}

	public static void testArray1(int[] array) {
		array[1] = 0;
	}

	public static void testArray2(int[] array) {
		int[] subArray = array;
		subArray[2] = 0;
	}

	public static void testArray3(int[] array) {
		int[] subArray = array.clone();
		subArray[3] = 0;
	}

	public static void testArray4(int[] array) {
		int[] subArray = new int[array.length];
		for (int i = 0, l = array.length; i < l; i++) {
			subArray[i] = array[i];
		}
		subArray[4] = 0;
	}
}
// [0, 1, 2, 3, 4, 5, 6]
// [0, 0, 0, 3, 4, 5, 6]
