package stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer value: list){
            if(value == 2){
                list.remove(value);
            }
        }
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            if(iterator.next() == 1){
                iterator.remove();
            }
        }
        System.out.println(list);
//        Tao stream : ARRAY va COLLECTION
        int[] arr = {1,2,3,4,5};
        IntStream streamInt = Arrays.stream(arr);

        Stream<Integer> stream2 = list.stream();

//        Thao tac trung gian: sorted, limit, distinct, filter, map, ...
        IntStream stream3 = streamInt.filter(value -> value%2 == 0);
//        Thao tac dau cuoi: sum, foreach,reduce, count, findFist,FindAny, anyMatch, allMatch, min ,max
         OptionalDouble avg = stream3.average();
        System.out.println("avg: "+avg.getAsDouble());
//        Tao 1 list 1000 so nguyen ngau nhien tu -200 den 200
//        1. Loc va in cac so nguyen duong
//        2. Loai bo cac so trung lap
//        3. Sap xep cac so theo thu tu tu lon den be
//        4. Tinh min max
//        5. Tinh tong tat cac phan tu
//        6. kiem tra gia tri n nhap vao co ton tai trong danh sach khong
//        7. chuyen cac so am thanh so doi cua no
        List<Integer> randomList = Stream.generate(()-> new Random().nextInt(400)-200)
                .limit(1000)
                .toList();
//        1.
        randomList.stream().filter(value -> value>0).forEach(integer -> System.out.print(integer));
//        2.
        List<Integer> distinctList = randomList.stream().distinct().toList();
        System.out.println("\ndistinct: "+ distinctList);
//        3.
        randomList.stream().sorted(Comparator.reverseOrder()).forEach(integer -> System.out.print(integer));
//        4.
        Integer min = randomList.stream().min(Comparator.comparingInt(o -> o)).get();
        Integer max = randomList.stream().max(Comparator.comparingInt(o -> o)).get();
        System.out.println("\nmin: "+min);
        System.out.println("max: "+max);
//        5.
//        Integer sum = randomList.stream().reduce(0,(temp, value) -> temp+value );
        Integer sum = randomList.stream().reduce(0,Integer::sum );
        System.out.println("Tong: "+sum);
//        6.
        boolean isExist = randomList.stream().anyMatch(num -> num == 100);
        System.out.println("So 100 co ton tai hay kho: "+ isExist);
//        7.
        List<Integer> mapInteger = randomList.stream().map(num -> num <0? - num :num).toList();
        System.out.println("Map: "+ mapInteger);

    }
}
