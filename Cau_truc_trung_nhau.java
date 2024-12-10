import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Cau_truc_trung_nhau {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0 ; i <numRows ; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j = 1 ; j < i ; j++){
                int val = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                row.add(val);
            }
            if(i > 0){
                row.add(1);
            }
            triangle.add(row);
        }
        return triangle;
    }


    public static void main(String[] args) {

//        List<List<Integer>> listOfLists = new ArrayList<>();
//        List<Integer> sublist1 = new ArrayList<>();
//        sublist1.add(1);
//        sublist1.add(2);
//        sublist1.add(3);
//        sublist1.add(4);
//
//        List<Integer> sublist2 = new ArrayList<>();
//        sublist2.add(5);
//        sublist2.add(6);
//        sublist2.add(7);
//        sublist2.add(8);
//
//        listOfLists.add(sublist1);
//        listOfLists.add(sublist2);

//        listOfLists.get(1).add(11);
//        listOfLists.get(1).add(12);
//        listOfLists.get(1).add(13);
//        listOfLists.get(1).remove(4);
//        listOfLists.get(1).remove(2);
//        listOfLists.get(1).remove(3);
//        listOfLists.remove(1);
//        listOfLists.remove(0);
//        System.out.println(listOfLists);

//        int value = listOfLists.get(0).get(0);
//        int value1 = listOfLists.get(0).get(1);
//        int value2 = listOfLists.get(0).get(2);
//        int value3 = listOfLists.get(0).get(3);
//        System.out.println(value + value1 + value2 + value3);
//        System.out.println(listOfLists.get(1).get(3));
    }
}
