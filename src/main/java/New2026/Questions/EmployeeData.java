package New2026.Questions;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees() {

        return Arrays.asList(

                // =========================
                // IT - INDIA
                // =========================

                new Employee("Vaibhav", "Male", 85000, "India", "IT", 32, 7, true),
                new Employee("Priya", "Female", 95000, "India", "IT", 29, 5, true),
                new Employee("Karan", "Male", 150000, "India", "IT", 42, 18, true),
                new Employee("Monika", "Female", 89000, "India", "IT", 31, 6, true),
                new Employee("Rohit", "Male", 86000, "India", "IT", 30, 5, false),
                new Employee("Kusum", "Female", 71000, "India", "IT", 29, 5, true),
                new Employee("Raj", "Male", 96000, "India", "IT", 36, 9, true),
                new Employee("Rashmi", "Female", 134000, "India", "IT", 39, 13, true),
                new Employee("Omkar", "Male", 89000, "India", "IT", 31, 6, true),
                new Employee("Shreya", "Female", 138000, "India", "IT", 40, 14, false),

                // =========================
                // IT - USA
                // =========================

                new Employee("Nikhil", "Male", 75000, "USA", "IT", 29, 6, true),
                new Employee("Neha", "Female", 110000, "USA", "IT", 34, 9, true),
                new Employee("Sachin", "Male", 115000, "USA", "IT", 37, 11, true),
                new Employee("Komal", "Female", 125000, "USA", "IT", 35, 10, true),
                new Employee("Sagar", "Male", 78000, "USA", "IT", 32, 6, true),
                new Employee("Isha", "Female", 118000, "USA", "IT", 37, 11, true),
                new Employee("Mansi", "Female", 99000, "USA", "IT", 31, 6, false),
                new Employee("Tarun", "Male", 145000, "USA", "IT", 43, 19, true),
                new Employee("Priti", "Female", 112000, "USA", "IT", 36, 10, true),
                new Employee("Vishal", "Male", 127000, "USA", "IT", 41, 15, true),

                // =========================
                // IT - UK
                // =========================

                new Employee("Sneha", "Female", 75000, "UK", "IT", 31, 6, true),
                new Employee("Swati", "Female", 140000, "UK", "IT", 39, 14, true),
                new Employee("Ganesh", "Male", 81000, "UK", "IT", 39, 13, false),
                new Employee("Vijay", "Male", 73000, "UK", "IT", 35, 9, true),
                new Employee("Preeti", "Female", 79000, "UK", "IT", 33, 7, false),
                new Employee("Hemant", "Male", 113000, "UK", "IT", 40, 14, true),
                new Employee("Shubham", "Male", 99000, "UK", "IT", 30, 6, true),
                new Employee("Divya", "Female", 138000, "UK", "IT", 40, 14, true),

                // =========================
                // IT - CANADA
                // =========================

                new Employee("Kavita", "Female", 130000, "Canada", "IT", 36, 10, true),
                new Employee("Vivek", "Male", 97000, "Canada", "IT", 34, 8, true),
                new Employee("Dinesh", "Male", 93000, "Canada", "IT", 33, 7, true),
                new Employee("Archana", "Female", 108000, "Canada", "IT", 36, 10, true),
                new Employee("Shankar", "Male", 101000, "Canada", "IT", 37, 10, false),
                new Employee("Asha", "Female", 121000, "Canada", "IT", 37, 11, true),

                // =========================
                // IT - AUSTRALIA
                // =========================

                new Employee("Vikas", "Male", 90000, "Australia", "IT", 33, 7, true),
                new Employee("Shweta", "Female", 98000, "Australia", "IT", 32, 7, true),
                new Employee("Poonam", "Female", 91000, "Australia", "IT", 34, 8, true),
                new Employee("Shailesh", "Male", 84000, "Australia", "IT", 35, 8, true),
                new Employee("Vinod", "Male", 87000, "Australia", "IT", 32, 7, true),
                new Employee("Shilpa", "Female", 102000, "Australia", "IT", 35, 9, true),
                new Employee("Varsha", "Female", 128000, "Australia", "IT", 41, 15, true),
                new Employee("Sonal", "Female", 104000, "Australia", "IT", 34, 8, true),

                // =========================
                // HR - INDIA
                // =========================

                new Employee("Amit", "Male", 45000, "India", "HR", 26, 2, false),
                new Employee("Pooja", "Female", 55000, "India", "HR", 27, 3, true),
                new Employee("Ravi", "Male", 54000, "India", "HR", 28, 3, true),
                new Employee("Mitali", "Female", 61000, "India", "HR", 25, 3, true),
                new Employee("Bhavna", "Female", 64000, "India", "HR", 29, 4, true),
                new Employee("Aditya", "Male", 67000, "India", "HR", 27, 3, true),
                new Employee("Chirag", "Male", 68000, "India", "HR", 28, 4, true),
                new Employee("Ankita", "Female", 63000, "India", "HR", 26, 3, true),

                // =========================
                // HR - USA
                // =========================

                new Employee("Rahul", "Male", 65000, "USA", "HR", 35, 8, true),
                new Employee("Anjali", "Female", 60000, "USA", "HR", 28, 4, false),
                new Employee("Simran", "Female", 69000, "USA", "HR", 28, 4, true),
                new Employee("Sameer", "Male", 62000, "USA", "HR", 30, 5, true),
                new Employee("Mayur", "Male", 83000, "USA", "HR", 34, 8, true),

                // =========================
                // HR - UK
                // =========================

                new Employee("Ramesh", "Male", 58000, "UK", "HR", 34, 7, false),
                new Employee("Madhuri", "Female", 47000, "UK", "HR", 24, 2, false),
                new Employee("Reshma", "Female", 52000, "UK", "HR", 26, 3, true),
                new Employee("Nitin", "Male", 56000, "UK", "HR", 30, 5, false),
                new Employee("Harish", "Male", 52000, "UK", "HR", 28, 3, false),
                new Employee("Radhika", "Female", 58000, "UK", "HR", 25, 2, false),
                new Employee("Mukesh", "Male", 48000, "UK", "HR", 25, 2, false),

                // =========================
                // HR - CANADA
                // =========================

                new Employee("Manoj", "Male", 50000, "Canada", "HR", 25, 3, false),
                new Employee("Atul", "Male", 47000, "Canada", "HR", 24, 1, true),
                new Employee("Nandini", "Female", 73000, "Canada", "HR", 31, 6, false),
                new Employee("Rekha", "Female", 59000, "Canada", "HR", 24, 2, true),
                new Employee("Chetan", "Male", 73000, "Canada", "HR", 29, 4, true),

                // =========================
                // HR - AUSTRALIA
                // =========================

                new Employee("Aarti", "Female", 45000, "Australia", "HR", 23, 1, true),
                new Employee("Sanjay", "Male", 44000, "Australia", "HR", 25, 2, false),
                new Employee("Juhi", "Female", 57000, "Australia", "HR", 26, 3, true),
                new Employee("Bharat", "Male", 55000, "Australia", "HR", 26, 2, true),
                new Employee("Kajal", "Female", 77000, "Australia", "HR", 28, 4, true),
                new Employee("Leena", "Female", 96000, "Australia", "HR", 32, 6, true),

                // =========================
                // FINANCE - INDIA
                // =========================

                new Employee("Suresh", "Male", 70000, "India", "Finance", 40, 15, true),
                new Employee("Riya", "Female", 80000, "India", "Finance", 30, 5, true),
                new Employee("Mahesh", "Male", 69000, "India", "Finance", 33, 7, true),
                new Employee("Payal", "Female", 93000, "India", "Finance", 30, 5, true),
                new Employee("Abhishek", "Male", 71000, "India", "Finance", 29, 4, true),
                new Employee("Manisha", "Female", 94000, "India", "Finance", 35, 8, true),
                new Employee("Anand", "Male", 91000, "India", "Finance", 34, 8, true),

                // =========================
                // FINANCE - USA
                // =========================

                new Employee("Akash", "Male", 120000, "USA", "Finance", 38, 12, true),
                new Employee("Nisha", "Female", 88000, "USA", "Finance", 30, 5, true),
                new Employee("Ajay", "Male", 135000, "USA", "Finance", 41, 16, true),
                new Employee("Shruti", "Female", 67000, "USA", "Finance", 27, 4, false),
                new Employee("Yogesh", "Male", 109000, "USA", "Finance", 42, 17, true),
                new Employee("Sakshi", "Female", 85000, "USA", "Finance", 29, 5, true),
                new Employee("Sonia", "Female", 82000, "USA", "Finance", 33, 7, false),

                // =========================
                // FINANCE - UK
                // =========================

                new Employee("Sneha", "Female", 75000, "UK", "Finance", 31, 6, true),
                new Employee("Rohit", "Male", 40000, "UK", "Finance", 24, 1, false),
                new Employee("Namrata", "Female", 74000, "UK", "Finance", 30, 5, false),
                new Employee("Sunil", "Male", 74000, "UK", "Finance", 34, 8, false),
                new Employee("Alka", "Female", 56000, "UK", "Finance", 26, 2, true),
                new Employee("Rupal", "Female", 72000, "UK", "Finance", 28, 4, true),
                new Employee("Mrunal", "Female", 81000, "UK", "Finance", 30, 5, false),

                // =========================
                // FINANCE - CANADA
                // =========================

                new Employee("Akash", "Male", 120000, "Canada", "Finance", 38, 12, true),
                new Employee("Pallavi", "Female", 76000, "Canada", "Finance", 29, 5, true),
                new Employee("Prakash", "Male", 63000, "Canada", "Finance", 36, 9, true),
                new Employee("Rupali", "Female", 116000, "Canada", "Finance", 38, 12, true),
                new Employee("Pranav", "Male", 88000, "Canada", "Finance", 31, 6, true),
                new Employee("Roshni", "Female", 66000, "Canada", "Finance", 30, 5, true),
                new Employee("Pradeep", "Male", 76000, "Canada", "Finance", 29, 5, true),

                // =========================
                // FINANCE - AUSTRALIA
                // =========================

                new Employee("Deepak", "Male", 72000, "Australia", "Finance", 29, 5, true),
                new Employee("Sonali", "Female", 73000, "Australia", "Finance", 28, 4, false),
                new Employee("Rakesh", "Male", 102000, "Australia", "Finance", 38, 12, true),
                new Employee("Geeta", "Female", 87000, "Australia", "Finance", 32, 6, true),
                new Employee("Gaurav", "Male", 79000, "Australia", "Finance", 33, 7, true),
                new Employee("Lokesh", "Male", 124000, "Australia", "Finance", 38, 11, true),
                new Employee("Ravindra", "Male", 98000, "Australia", "Finance", 36, 9, true)
        );
    }

}
