package com.yodlee.design.patterns.creational;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FilterNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,3,4,5,5,6,7,8);
        List<Integer> addedNumbers = new ArrayList<>();
        for(Integer i: numbers){
            if( i % 2 == 0) {
                addedNumbers.add(i + 2);
            }
        }
        for(Integer i: addedNumbers){
           // System.out.println(i);
        }

        List<Integer> filteredList = addedNumbers.stream()
                .filter( i -> i%2 ==0)
                .peek(System.out::println)
                .map(i ->i +2)
                .collect(Collectors.toList());

        //filteredList.stream().forEach((c) ->System.out.println(c));

        List<String> transformed = Arrays.asList("Praveen", "Vinay", "Vikram", "Ramesh")
                .stream()
                .map(s -> s.concat(" Kumar"))
                .collect(Collectors.toList());

        //System.out.println(transformed);

        List<User> users = Arrays.asList(
                new User(1,"Kiran","Prasad"),
                new User(2,"Vinay","Kumar"),
                new User(3,"Hari","Prabhu"),
                new User(4,"Siva","Gupta"),
                new User(5,"Vishnu","Goel"),
                new User(6,"Mahesh","Raj"),
                new User(7,"Praveen","Gilda")
                );

      //  Optional<String> name = users.stream().map((u)-> u.getFirstName()).sorted((fname1, fname2)-> fname1.compareTo(fname2)).limit(3).findFirst();

       // name.ifPresent(System.out::println);

       /* Consumer<User> consumer = (user) -> System.out.println(user.getFirstName() +" "+ user.getLastName());

        consumer.accept(new User(5,"Vishnu","Goel"));

        Supplier<User> supplier = ()->  new User(6,"Mahesh","Raj");

        System.out.println(supplier.get().getFirstName());
*/
        users.stream().map(User::getFirstName)
                .parallel()
                .sorted()
                .limit(4)
                .skip(2)
                .findFirst()
                .orElseGet(()-> "");




       /*boolean flag = first.isPresent();
       if(flag){
           System.out.println(first.get());
       }*/

        /*Function<String, Integer> parseInteger1 = (str)->Integer.parseInt(str);
        Function<String, Integer> parseInteger2 = Integer::parseInt;

        parseInteger1.apply("45");
        */
    }


    public Optional<User> findUserById(int id){
        // User user = dao.findById(id);
        User user = null;
        return Optional.of(user);
    }


}

class User{
    private int id;
    private String firstName;
    private String lastName;

    public User(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}