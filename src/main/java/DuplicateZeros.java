import java.util.Arrays;

public class DuplicateZeros {

    //Given a fixed-length integer array arr, duplicate each occurrence of zero,
    // shifting the remaining elements to the right.
    //
    //Note that elements beyond the length of the original array are not written.
    // Do the above modifications to the input array in place and do not return anything.

    public static void main(String[] args) {
        int[] input = {1,0,2,3,0,4,5,0};
        duplicateZeros(input);
    }

    public static void duplicateZeros(int[] inputList) {
        int position = inputList.length - 1;

        for (int index = position; index >= 0; index--) {

            if (inputList[index] == 0 && index < inputList.length - 1) {
                int internalPosition = position;

                while (internalPosition >= index + 1) {
                    inputList[internalPosition] = inputList[internalPosition - 1];
                    internalPosition--;
                }

                inputList[index + 1] = 0;
            }
        }
        System.out.println("expected:" + "1,0,0,2,3,0,0,4");
        System.out.println("actual:" + Arrays.toString(inputList));
    }
}
