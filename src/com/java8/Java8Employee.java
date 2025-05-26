package java8;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class EmployeeDetails {
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", dep='" + dept + '\'' +
                ", doj=" + doj +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }

    int id;
    String name;
    int age;
    String gender;
    String dept;
    LocalDate doj;
    double salary;

    String city;

    public EmployeeDetails(int id, String name, int age, String gender, String dept, LocalDate doj, double salary, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dept = dept;
        this.doj = doj;
        this.salary = salary;
        this.city = city;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDep(String dep) {
        this.dept = dept;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

public class Java8Employee {
    public static void main(String[] args) {
        List<EmployeeDetails> empList = new ArrayList<>();
        empList.add(new EmployeeDetails(1, "John", 30, "Male", "HR", LocalDate.of(2023, 3, 15), 26000.0, "Bangalore"));
        empList.add(new EmployeeDetails(2, "Maya", 29, "Female", "Sales", LocalDate.of(2022, 11, 7), 19500.0, "Chennai"));
        empList.add(new EmployeeDetails(3, "Mira", 26, "Female", "Administartion", LocalDate.of(2021, 8, 22), 19600.0, "Pune"));
        empList.add(new EmployeeDetails(4, "Sundar", 29, "Male", "Development", LocalDate.of(2023, 5, 1), 34000.0, "Delhi"));
        empList.add(new EmployeeDetails(5, "Thomas", 25, "Male", "HR", LocalDate.of(2022, 9, 30), 23000.0, "Noida"));
        empList.add(new EmployeeDetails(6, "Immanuel", 40, "Male", "Maintenance", LocalDate.of(2020, 12, 12), 13000.0, "Hyderabad"));
        empList.add(new EmployeeDetails(7, "Joseph", 30, "Male", "Finance", LocalDate.of(2023, 1, 18), 30000.0, "Mysore"));
        empList.add(new EmployeeDetails(8, "Linda", 33, "Female", "Development", LocalDate.of(2021, 6, 5), 34000.0, "Bhuvaneshwar"));
        empList.add(new EmployeeDetails(9, "Mark", 34, "Male", "Sales", LocalDate.of(2022, 4, 25), 15000.0, "Coimbator"));
        empList.add(new EmployeeDetails(10, "Ali", 36, "Male", "Maintenance", LocalDate.of(2023, 7, 10), 16500.0, "Bangalore"));
        empList.add(new EmployeeDetails(11, "Vladimir", 37, "Male", "Administartion", LocalDate.of(2021, 2, 14), 19900., "Chennai"));
        empList.add(new EmployeeDetails(12, "Jacob", 25, "Male", "Development", LocalDate.of(2023, 10, 3), 31300., "Kolkata"));
        empList.add(new EmployeeDetails(13, "Jackson", 29, "Male", "Finance", LocalDate.of(2022, 3, 8), 29000., "Gurugram"));
        empList.add(new EmployeeDetails(14, "Mary", 28, "Female", "Sales", LocalDate.of(2021, 5, 19), 20000., "Hyderabad"));
        empList.add(new EmployeeDetails(15, "Vivek", 26, "Male", "Administartion", LocalDate.of(2023, 2, 28), 14000., "Bangalore"));
        empList.add(new EmployeeDetails(16, "Abdul", 36, "Male", "Development", LocalDate.of(2020, 10, 31), 30000., "Pune"));
        empList.add(new EmployeeDetails(17, "Kamala", 32, "Female", "Development", LocalDate.of(2023, 12, 25), 49500., "Mangalore"));

        //group by city
        System.out.println("Employees by city");
        empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getCity)).forEach((city, employees) -> {
            System.out.println(city + " : ");
            employees.forEach(System.out::println);
        });

        //group by age
        System.out.println("Employees by age");
        empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getAge)).forEach((age, employees) -> {
            System.out.println(age + ":");
            employees.forEach(System.out::println);
        });

        //Find the count of male and female employees present in the organization.
        System.out.println("Employees based on gender ");
        Map<String, Long> genderMap = empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getGender, Collectors.counting()));
        genderMap.forEach((gender, count) -> {
            System.out.println(gender + " " + count);
        });

        //Find the count of male and female employees present in each department .
        System.out.println("department wise employees based on gender ");
        Map<String, Map<String, Long>> genderDeptMap = empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept, Collectors.groupingBy(EmployeeDetails::getGender, Collectors.counting())));
        genderDeptMap.forEach((dept, genderDept) -> {
            System.out.println(dept + " " + genderDept);
        });

        //Print the names of all departments in the organization.
        System.out.println("Departments in the organization:");
        empList.stream().map(EmployeeDetails::getDept).distinct().forEach(System.out::println);

        //Print employee details whose age is greater than 28.
        String employeeByAge = empList.stream().filter(emp -> emp.getAge() > 28).
                map(EmployeeDetails::getName).collect(Collectors.joining(" "));
        System.out.println("Employees with age greater than 28 in organisation: " + employeeByAge);

        //Find maximum age of employee.
        empList.stream().mapToInt(EmployeeDetails::getAge).max().ifPresent(maxAge -> System.out.println("Maximum age of employee::" + maxAge));

        //Print the number of employees in each department.
        System.out.println("No of employees in each dept ");
        empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept, Collectors.counting())).forEach((dept, count) -> {
            System.out.println(dept + " " + count);

        });

        //Print Average age of Male and Female Employees in the organisation.
        System.out.println("Average age of Male and Female Employees in organisation::");
        Map<String, Double> averageAgeGender = empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getGender,
                Collectors.averagingInt(EmployeeDetails::getAge)));
        System.out.println(averageAgeGender);


        //Print Average age of Male and Female Employees in each department.
        System.out.println("Average age of Male and Female Employees in each department::");
        Map<String, Map<String, Double>> deptWiseAverageAgeGender = empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept, Collectors.groupingBy(EmployeeDetails::getGender, Collectors.averagingInt(EmployeeDetails::getAge))));
        System.out.println(deptWiseAverageAgeGender);


        //Find oldest employee by age.
        empList.stream().max(Comparator.comparingInt(EmployeeDetails::getAge)).ifPresent(maxAgeEmp -> {
            System.out.println("oldest employee by age:: " + maxAgeEmp);
        });

        // Find longest serving employees in the organization.
        empList.stream().max(Comparator.comparing(EmployeeDetails::getDoj)).ifPresent(longestServingEmp -> {
            System.out.println("oldest serving employee:: " + longestServingEmp);
        });

        //Find longest serving employee in each department
        System.out.println("Longest serving employee in each department ");
        empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept,
                Collectors.minBy(Comparator.comparing(EmployeeDetails::getDoj)))).forEach(
                (dept, employee) -> {
                    employee.ifPresent(emp -> System.out.println(dept + " " + emp.getName() + " " + emp.getDoj()));

                }
        );
        //Find youngest employee in the organisation
        empList.stream().min(Comparator.comparingInt(EmployeeDetails::getAge)).ifPresent(youngestEmp -> {
            System.out.println("Youngest employee in the organisation:: " + youngestEmp);
        });

        //Find youngest employee in each department
        System.out.println("Youngest employee in each department:: ");
        empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept, Collectors.minBy(Comparator.comparingInt(EmployeeDetails::getAge)))).
                forEach((dept, emp) -> emp.ifPresent(System.out::println));

        //Find employees whose age is greater than 30 and less than 30.
        empList.stream().collect(Collectors.partitioningBy(employeeDetails -> employeeDetails.getAge() > 30)).
                forEach((greaterOrNot, emp) -> {
                    System.out.println(greaterOrNot ? "Employees whose age is greater than 30" : "Employees whose age is less than 30");
                    emp.forEach(System.out::println);
                });

        //Find the department name which has the highest number of employees.
        empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).
                ifPresent(dept -> System.out.println("Department with highest no of employees " + dept.getKey() + " " + dept.getValue()));

        //Find if there any employees from HR Department.
        System.out.println("Employee from HR Department ");
        empList.stream().filter(emp -> Objects.equals(emp.getDept(), "HR")).findAny().ifPresent(System.out::println);

        //Find the department names that these employees work for, where the number of employees in the department is over 3.
        empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept, Collectors.counting())).entrySet().stream().
                filter(entry -> entry.getValue() > 3).forEach(System.out::println);

        //Find all employees who lives in 'Blore' city, sort them by their name and print the names of employees.
        System.out.println("Employees who lives in Bangalore sorted by name");
        empList.stream().filter(e -> e.city.equalsIgnoreCase("Bangalore")).sorted(Comparator.comparing(EmployeeDetails::getName)).
                forEach(e -> System.out.println(e.getName())
                );

        //No of employees in the organisation.
        System.out.println("Total no of employees in the organisation" + empList.stream().count());

        //Find employee count in every department
        System.out.println("Employee count in every department");
        empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept, Collectors.counting())).forEach((dept, count) -> {
            System.out.println(dept + " " + count);
        });

        //Find the department which has the highest number of employees.
        System.out.println("Department which has the highest number of employees" +
                empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept, Collectors.counting())).
                        entrySet().stream().max(Map.Entry.comparingByValue()));

        //Sorting a Stream by age and name fields.
        System.out.println("Sorting a Stream by age and name fields");
        empList.stream().sorted(Comparator.comparing(EmployeeDetails::getAge)
                .thenComparing(EmployeeDetails::getName)).forEach(System.out::println);

        //Print average and total salary of the organization.
        DoubleSummaryStatistics avgTotalSal = empList.stream().collect(Collectors.summarizingDouble(EmployeeDetails::getSalary));
        System.out.println("Total salary: " + avgTotalSal.getSum());
        System.out.println("Average salary: " + avgTotalSal.getAverage());

        //Print Average salary of each department.
        empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept, Collectors.averagingDouble(EmployeeDetails::getSalary))).forEach((key, value) -> System.out.println("Average salary in " + key + " sal " + value
        ));

        //Imp : To get a list of employees from each department whose salary is greater than the average salary of their department
        empList.stream().filter(employeeDetails -> employeeDetails.getSalary() > empList.stream()
                        .filter(e -> e.getDept().equals(employeeDetails.getDept()))
                        .collect(Collectors.averagingDouble(EmployeeDetails::getSalary)))
                .forEach(System.out::println);

        //Find Highest salary in the organisation.
        System.out.println("Highest salary in the organisation: ");
        empList.stream().max(Comparator.comparingDouble(EmployeeDetails::getSalary)).ifPresent(System.out::println);

        //Find second highest salary in the organisation.
        System.out.println("Second highest salary in the organisation: ");
        empList.stream().sorted(Comparator.comparingDouble(EmployeeDetails::getSalary).reversed()).skip(1).findFirst().ifPresent(System.out::println);

        //Find second highest salary in the organisation.
        System.out.println("Nth highest salary in the organisation: ");
        int n = 4;
        empList.stream().sorted(Comparator.comparingDouble(EmployeeDetails::getSalary).reversed()).skip(n - 1).findFirst().ifPresent(System.out::println);

        //Print the top 3 highest salary earned employees
        System.out.println("Top 3 highest salary earned employees in organisation: ");
        empList.stream().sorted(Comparator.comparing(EmployeeDetails::getSalary).reversed()).limit(3).forEach(System.out::println);

        //Print the top 3 highest salary earned employees in each department
        System.out.println("Top 3 highest salary earned employees in each department: ");
        empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept)).
                forEach((dept, employees) -> {
                    employees.stream().sorted(Comparator.comparing(EmployeeDetails::getSalary).reversed()).limit(3).forEach(System.out::println);
                });

        //Find highest paid salary in the organisation based on gender.
        System.out.println("highest paid salary in the organisation based on gender.");
        empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getGender,Collectors.maxBy(Comparator.comparing(EmployeeDetails::getSalary)))).
                forEach((gender,sal)->
                        System.out.println(gender + " " + sal));

        //Find lowest paid salary in the organisation
        System.out.println("Lowest paid salary in the organisation: ");
        empList.stream().min(Comparator.comparing(EmployeeDetails::getSalary)).ifPresent(System.out::println);

        //Find lowest paid salary in the department
        System.out.println("Find lowest paid salary in each department ");
        empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept,Collectors.minBy(Comparator.comparing(EmployeeDetails::getSalary)))).
                forEach((department,lowestSalEmp)-> lowestSalEmp.ifPresent( emp -> System.out.println("dept " + department + " " + emp)));

        //Find lowest paid salary in the department based on the gender.
        System.out.println("Find lowest paid salary in each department based on the gender.");
        empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept,Collectors.groupingBy(EmployeeDetails::getGender,Collectors.minBy(Comparator.comparing(EmployeeDetails::getSalary))))).
                forEach((department,genderSalMap)->  genderSalMap.forEach( (gender,lowestEmp) -> {
                            System.out.println(department + " " +  gender + " " + lowestEmp);
                        })
                        );

        //Sort the employees salary in the organisation in ascending order
        System.out.println("Sort the employees salary in the organisation in ascending order");
        empList.stream().sorted(Comparator.comparing(EmployeeDetails::getSalary)).forEach(System.out::println);


        //Sort the employees salary in the organisation in descending order
        System.out.println("Sort the employees salary in the organisation in descending order");
        empList.stream().sorted(Comparator.comparing(EmployeeDetails::getSalary).reversed()).forEach(System.out::println);

        //Highest salary based on department.
        System.out.println("Highest salary based on department: ");
        empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept,
                Collectors.maxBy(Comparator.comparing(EmployeeDetails::getSalary)))).forEach(
                (dept,employee)->
                        employee.ifPresent(emp -> System.out.println(dept + " " + emp))

        );


        //Sort the employees salary in each department in ascending order
        System.out.println("Sort the employees salary in each department in ascending order");
        empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept,
                Collectors.collectingAndThen(Collectors.toList(),
                        list->list.stream().sorted(Comparator.comparingDouble(EmployeeDetails::getSalary)).toList()))).
                        forEach((dept,sortedEmployees) -> {System.out.println(dept + " : " );
                        sortedEmployees.forEach(System.out::println);
                        });


        //Sort the employees salary in  each departmentn in descending order
        System.out.println("Sort the employees salary in each department in descending order");
        empList.stream().collect(Collectors.groupingBy(EmployeeDetails::getDept,
                        Collectors.collectingAndThen(Collectors.toList(),
                                list->list.stream().sorted(Comparator.comparingDouble(EmployeeDetails::getSalary)).toList()))).
                forEach((dept,sortedEmployees) -> {System.out.println(dept + " : " );
                    sortedEmployees.forEach(System.out::println);
                });

        //Find list of employees whose age is less than 30 in Department HR
        System.out.println("List of employees whose age is less than 30 in Department HR");
        empList.stream().filter(e-> e.getAge() > 30 && e.getDept().equalsIgnoreCase("HR")).forEach(System.out::println);

        //Find the employees whose name start with J.
        empList.stream().filter(e -> e.getName().toLowerCase().startsWith("j")).map(EmployeeDetails::getName).forEach(name -> System.out.println("Name starts with J: " + name));


    }
}

