import java.util.HashSet;
import java.util.Set;

/**
 * The CommonElementsFinder class provides a method for finding common elements
 * between two arrays of integers.
 */
public class CommonElementsFinder {

    /**
     * Finds the common elements between two arrays of integers.
     *
     * @param array1 the first array of integers
     * @param array2 the second array of integers
     * @return a Set<Integer> containing the integers that are present in both arrays
     */
    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
    //     List<Integer> common = new ArrayList<>();
    //     for (int i : array1) {
    //         for (int y : array2) {
    //             if (i == y && !common.contains(i)) {
    //                 common.add(i);
    //             }
    //         }
    //     }
    //     return common;
    // }
        Set<Integer> i = new HashSet<>();
        Set<Integer> common = new HashSet<>();
        for (int num : array1) {
            i.add(num);
        }
        for (int num : array2) {
            if (i.contains(num)) {
                common.add(num);
            }
        }
        return common;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        Set<Integer> common = findCommonElements(array1, array2);
        System.out.println("Common elements: " + common);
    }
}
