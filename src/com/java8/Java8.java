package com.java8;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class  Nodes{
    int id;
    String tagName;
    int count;

     Nodes(int id,String tagName,int count){
        this.id=id;
        this.tagName=tagName;
        this.count=count;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

class Employee{
    private int id;
    private String name;
    private int age;
    private long salary;
    public Employee(int id, String name, int age, long salary) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}
class Person1{
    int id;
    String name;
    Person1(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Java8 {
    public static void main(String[] args) {
        //input
        int[] arr=new int[]{9,10,15,8,49,25,98,32,10};
        List<Integer> list = Arrays.asList(11,10,15,8,49,25,98,32,10);

        // 1. to filter even nos from list
        /*list.stream().filter(i -> i%2 ==0).forEach(System.out::println);
        list.stream().forEach((k) -> {
            System.out.print(k + " ");
        });*/

        //Arrays.stream(arr).filter(i ->i %2 == 0).forEach(System.out::println);

        // 2.Given a list of integers, find out all the numbers starting with 1 using Stream functions
        /*list.stream().map(s-> s + " " ).filter(s -> s.startsWith("1")).forEach((k) ->{
            System.out.println(k + " ");
        });

         Arrays.stream(arr).mapToObj(s -> s + " ").filter(s -> s.startsWith("1")).forEach((k) ->{
            System.out.println(k + " ");
        });*/

        // 3 .How to find duplicate elements in a given integers list in java using Stream functions
        /* Set<Integer> set = new HashSet<>();
        list.stream().filter(n ->!set.add(n)).forEach(System.out::println);

        Arrays.stream(arr).filter(n ->!set.add(n)).forEach(System.out::println);*/

        // 4 .Given the list of integers, find the first element of the list using Stream functions
        /*list.stream().findFirst().ifPresent(System.out::println);
        Arrays.stream(arr).findFirst().ifPresent(System.out::println);*/

        // 5 .Given a list of integers, find the total number of elements present in the list using Stream functions
        /*System.out.println("count of list is ::"+list.stream().count());
        System.out.println("count of array is ::"+Arrays.stream(arr).count());*/

        // 6.find the maximum value element present in it using Stream functions
        /*System.out.println("Maximum ::"+list.stream().max(Integer::compare).get());
        System.out.println("Maximum ::"+Arrays.stream(arr).max().getAsInt());*/

        // 7. find the first non-repeated character in it using Stream functions input.chars().mapToObj().collect(,,).entrySet().filter().map().getFirst().get()
        String input = "Java articles are Awesome";
        Character ch = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char)s))).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new , Collectors.counting())).entrySet()
                        .stream().filter(entry -> entry.getValue() ==1).map(entry -> entry.getKey()).findFirst().get();
        System.out.println("first character non repeating::"+ch);

        // 8.Given a String, find the first repeated character in it using Stream functions
        /*Character ch1 = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char)s))).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new , Collectors.counting())).entrySet()
                .stream().filter(entry -> entry.getValue() >1).map(entry -> entry.getKey()).findFirst().get();
        System.out.println("first character  repeating::"+ch1);*/
        /*String input = "Java articles are Awesome";
        String[] i = input.split("");
        Map<String, Long> collect = Stream.of(i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);*/

        // 9. a list of integers, sort all the values present in it using Stream functions
        /*list.stream().sorted().forEach(System.out::println);
        Arrays.stream(arr).sorted().forEach(System.out::println);*/

        // 10.Given a list of integers, sort all the values present in it in descending order using Stream functions
        //list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        //Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).forEach(System.out::println);

        // 11.Given an integer array nums, return true if any value appears at least twice in the array,
        // and return false if every element is distinct
        List<Integer> numList=Arrays.stream(arr).boxed().collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(numList);
        boolean res=false;
        if(numList.size() == set.size()){
             res=false;
        }
        else{
            res=true;
        }
        System.out.println("value appearing twice::"+res);

        // 12.  How will you get the current date and time using Java 8 Date and Time API
        System.out.println("Current Local Date: " + java.time.LocalDate.now());
        //Used LocalDate API to get the date
        System.out.println("Current Local Time: " + java.time.LocalTime.now());
        //Used LocalTime API to get the time
        System.out.println("Current Local Date and Time: " + java.time.LocalDateTime.now());
        //Used LocalDateTime API to get both date and time

        // 13. Write a Java 8 program to concatenate two Streams?
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");
        Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());

        // Concatenated the list1 and list2 by converting them into Stream

        concatStream.forEach(k -> {
            System.out.print(k + " ");});

        // 14. Java 8 program to perform cube on list elements and filter numbers greater than 50
        //list.stream().map(i-> i*i*i).filter(i ->i>50).collect(Collectors.toList()).forEach(System.out::println);

        //Arrays.stream(arr).map(i-> i*i*i).filter(i ->i>50).boxed().collect(Collectors.toList()).forEach(System.out::println);

        // 15. Write a Java 8 program to sort an array and then convert the sorted array into Stream
        Arrays.parallelSort(arr);
        Arrays.stream(arr).forEach(System.out::println);

        //16 . How to use map to convert object into Uppercase in Java 8
        List<String> names = Arrays.asList(new String[] { "Aa", "Bb", "Cc", "Dd","Aa" });
        System.out.println(names.stream().map(String::toLowerCase).collect(Collectors.toList()));

        //17. How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
        Map<String, Long> map=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        // 18. How to find only duplicate elements with its count from the String ArrayList in Java8
        Map<String, Long> mapDuplicate=names.stream().filter(x->Collections.frequency(names,x)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("dup"+mapDuplicate);

        //19. How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
        Nodes node1=new Nodes(1,"vee",1);
        Nodes node2=new Nodes(2,"viv",2);
        List<Nodes> nodesList=new ArrayList<>();
        nodesList.add(node1);
        nodesList.add(node2);

        Optional.ofNullable(nodesList).orElseGet(Collections::emptyList).stream().filter(Objects::nonNull).map(Nodes::getTagName).forEach(s->System.out.println("tag names is:"+s));

        //20. Program to find the Maximum element in an array
        System.out.println(list.stream().max(Integer::compare).get());
        System.out.println(Arrays.stream(arr).max().getAsInt());

        //21. program to print the count of each character in a String?
        String s = "string data to count each character";
        Map<String,Long> countMap= Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(str -> str,LinkedHashMap::new,Collectors.counting()));
        System.out.println(countMap);

        // 21. sort employee by salary in ascending order
        List < Employee > employees = new ArrayList < Employee > ();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "John", 29, 350000));
        employees.add(new Employee(30, "Tom", 30, 450000));
        employees.add(new Employee(40, "Pramod", 29, 500000));
        employees.add(new Employee(50, "Pramodini", 31, 500000));

        List<Employee> resultAsc=employees.stream().sorted(((o1, o2) -> (int)(o1.getSalary()- o2.getSalary()))).collect(Collectors.toList());
        System.out.println("Ascending order::"+resultAsc);
        System.out.println(employees.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList()));

        List<Employee> resultDesc=employees.stream().sorted(((o1, o2) -> (int)(o2.getSalary()- o1.getSalary()))).collect(Collectors.toList());
        System.out.println("Descending order::"+resultDesc);
        System.out.println(employees.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList()));

        //second Highest Salary
        //System.out.println("Second Highest salary::");
          //      employees.stream().collect(Collectors.groupingBy(Employee::getSalary)).entrySet();

        //22. odd even sum
        int[] arr1= new int[]{1,2,4,6,7};

        System.out.println(Arrays.stream(arr1).boxed().filter(v -> v % 2 == 0)
                .collect(Collectors.summingInt(Integer::intValue)));

        System.out.println(Arrays.stream(arr1).boxed()
                .filter(v -> v % 2 == 0).mapToInt(Integer::intValue).sum());

        //sum of odd and even 8 12
        System.out.println(Arrays.stream(arr1).mapToObj(ob -> Integer.valueOf(ob)).collect(Collectors.groupingBy(t-> t%2 == 0 ?"ODD" : "EVEN")));

        Map<String, Integer> map1 = Arrays.stream(arr1).boxed().collect(Collectors.groupingBy(e -> e % 2 == 0 ? "OddSum" : "EvenSum", Collectors.summingInt(Integer::intValue)));
        System.out.println("map::"+map1);

        //23. FindDuplicatesUsingStreamDistinctMethod
        String[] companies = new String[]{
                "Meta","Apple","Amazon","Netflix","Meta","Google","Apple" // duplicate
        };
        System.out.println("1. Original String[] Array with duplicates : \n");
        Arrays.stream(companies).forEach(System.out::println);

       //24. convert list to map
        List<Person1> listPerson = new ArrayList<>();
        listPerson.add(new Person1(1,"vna"));
        listPerson.add(new Person1(2,"vid"));
        Map<Integer,Person1> mapPerson = listPerson.stream().collect(Collectors.toMap(Person1::getId,Function.identity()));
        System.out.println(mapPerson);

        //25.Find word count of the words in string
        // o/p this -1, is-2 ,word-2,count-1,for-1
        String  str = "this is word count for word is good";
        Map<String,Long> mapStr=Arrays.stream(str.split(" ")).filter(x->Collections.frequency(Arrays.asList(str.split(" ")),x)>=1).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println(mapStr);

        // o/p  is-2 ,word-2,this -1,count-1,for-1
       Arrays.stream(str.split(" "))
                .filter(x->Collections.frequency(Arrays.asList(str.split(" ")),x)>=1)
               .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream()
               .sorted(Map.Entry.<String, Long> comparingByValue().reversed()
                       .thenComparing(Map.Entry.comparingByKey())).forEach(System.out::println);

    }
}
