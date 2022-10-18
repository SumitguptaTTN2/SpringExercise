package Question4;

import Question3.ISorting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
@Configuration
public class BinarySearchImpl {


    @Autowired
    ISorting iSorting;




    public int binarySearch(int[] array, int numberToSearch) {
        int[] res = iSorting.Sort(array);
        System.out.print("Sorted Array ");
        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.println();
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == numberToSearch) {
                return mid;
            }

            if (array[mid] < numberToSearch)
                left = mid + 1;

            else
                right = mid - 1;
        }
        return -1;
    }

}
