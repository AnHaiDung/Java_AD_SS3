package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Trc Java 8
        Date date = new Date(); // Tra ve gian cua he thong theo mili s
        System.out.println("mili s: "+ date.getTime());
        System.out.println(date);
//        Tao 1 ngay 02-02-2007
//        Date Time API
        LocalDate today = LocalDate.now();
        LocalDate time = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(today);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(zonedDateTime);

        LocalDate bornIn = LocalDate.of(2006,7,6);

        Period age = Period.between(bornIn,today);
        System.out.println("Tuoi: "+age);

        LocalDate nextDate = bornIn.plusDays(100);
        System.out.println(nextDate);

//        Optional
        Optional<Integer> op1 = Optional.empty();
        Optional<Integer> op2 = Optional.of(1);
        Optional<Integer> op3 = Optional.ofNullable(2);

        if (op3.isPresent()){
//             co gia tri khac null
//            lay ra gia tri
            System.out.println(op3.get());
        }
//        Lay truc tiep gia tri neu no ton tai hoac 1 gia tri chi dinh
        Integer value = op3.orElse(100);
//        Lay truc tiep gia tri hoac nem ngoai le
        Integer val = op3.orElseThrow(() -> new RuntimeException("Loi gi do"));

//        vd:
        List<Integer> randomList = Stream.generate(() -> new Random().nextInt())
                .limit(10)
                .toList();

//        tim gia tri lon nhat trong ds
//        Tim gia tri dau tien chia het cho 3 trong ds
        Integer max = randomList.stream().max(Integer::compareTo).orElse(Integer.MAX_VALUE);
//
        Integer find = randomList.stream().filter(value1 -> value1%3 == 0)
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Khong co so nao chia het cho 3"));

        System.out.println(find);
    }
}
