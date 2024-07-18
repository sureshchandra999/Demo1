package com.suresh.Jan;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;


public class ThirdHighestElement {
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 1, 2, 3, -3, 4, -4, 5,5};

        //Optional<Integer> thirdHighest = findThirdHighest(myArr);

        OptionalInt thirdHighest = findThirdHighest(myArr);
        if(thirdHighest.isPresent()){
            System.out.println("The 3d highest elememt is:"+ thirdHighest.getAsInt());
        } else{
            System.out.println("The array does not contain 3rd highest element");
        }
       /*thirdHighest.ifPresentOrElse(
                value -> System.out.println("The 3rd highest element is: " + value),
                () -> System.out.println("There is no 3rd highest element")
        );*/
    }

    /*public static Optional<Integer> findThirdHighest(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst();
    }*/

    public static OptionalInt findThirdHighest(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .mapToInt(Integer::intValue)
                .findFirst();
    }
}