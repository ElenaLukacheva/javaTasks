package example0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamClass2Example {
    public static void main(String[] args) {
        List<String> email = Arrays.asList(
                "oleg@gmail.com",
                "fake@gmail.com",
                "ogo@mail.com",
                "thread@thread.com",
                "fake@gmail.com",
                "randommax@gmail.com",
                "fake12фыв3@gmail.com");


        List<String> unig = email.stream().distinct().collect(Collectors.toList());
        System.out.println(unig);

        List<String> gmails = email.stream().filter(x ->x.endsWith("@gmail.com")).collect(Collectors.toList());
        System.out.println(gmails);

        String firstGmail = email.stream().filter(x ->x.endsWith("gmail.com")).findFirst().get();

        String randomGmail = email.stream().filter(x ->x.endsWith("gmail.com")).findAny().get();

        String randomGmailParallet = email.stream().parallel().filter(x ->x.endsWith("gmail.com")).findAny().get();

        Random random = new Random();
        int randomNumber = random.nextInt(email.size());
        System.out.println(email.get(randomNumber));

        System.out.println(firstGmail);
        System.out.println(randomGmail);
        System.out.println(randomGmailParallet);

        boolean isAllEmailsEndsWithGmail = email.stream().allMatch(x ->x.endsWith("@gmail.com"));
        boolean isEmailsNotStartsWithyandex = email.stream().noneMatch(x -> x.startsWith("yandex"));

        System.out.println(isAllEmailsEndsWithGmail);
        System.out.println(isEmailsNotStartsWithyandex);

    }
}