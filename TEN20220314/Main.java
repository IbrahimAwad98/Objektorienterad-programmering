package TEN20220314;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
         User user = new User("Ibrahim", 1, Email.getInstance("iawad@kth.se"));
        System.out.println(user);
        Bid bid = new Bid(user,5000);
        System.out.println(bid);
        Auction auction = new Auction(user,"MacBook", LocalDateTime.now().plusHours(1));
        System.out.println(auction);
         */


        /*
         User user = new User("Ibrahim", 1, Email.getInstance("iawad@kth.se"));
        List<Account> accountList = new ArrayList<>();
        accountList.add(new SavingsAccount(user, "51681599", 5000));
        accountList.add(new CreditAccount(user, "51668899", 1000, 10000));
        for (Account a : accountList) {
            a.deposite(500);
            System.out.println(a);
        }
        accountList.get(1).withdraw(50);
        System.out.println(accountList.get(1));
         */


        Queue<String> queue = new Queue<>(5);

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        System.out.println(queue); // [A, B, C]

        System.out.println("Removed: " + queue.dequeue()); // A

        queue.enqueue("D");
        queue.enqueue("E");
        queue.enqueue("F"); // triggar ev. cirkulär logik

        System.out.println(queue); // [B, C, D, E, F]

        Object[] arr = queue.getAll();

        System.out.println("getAll():");
        for (Object s : arr) {
            System.out.println(s);
        }
    }
}
