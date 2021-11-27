package edyoda5;
import java.io.*;
import java.util.*;
public class rotateArray {

        public static void main(String[] args)
        {

            List<Integer> my_list = new ArrayList<>();
            my_list.add(10);
            my_list.add(20);
            my_list.add(30);
            my_list.add(40);
            my_list.add(50);
            my_list.add(60);
            System.out.println(
                    "List Before Rotation : "
                            + Arrays.toString(my_list.toArray()));

            for (int i = 0; i < 2; i++) {

                int temp = my_list.get(5);

                for (int j = 5; j > 0; j--) {
                    my_list.set(j, my_list.get(j - 1));
                }
                my_list.set(0, temp);
            }
            System.out.println(
                    "List After Rotation :  "
                            + Arrays.toString(my_list.toArray()));
        }
    }
