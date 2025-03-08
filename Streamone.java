import java.util.Arrays;
public class Streamone {
    public static void main(String [] args) {
        String [] courses = {"Math", "Science", "English", "javascript", "java-springboot","AWS","AZURE"};
        // for (int i = 0; i <courses.length; i++) {
        //     String newVlaue = courses[i].toUpperCase();
        //     System.out.println(newVlaue);
        // }
        // Arrays.stream(courses).map(course -> course.toUpperCase() + " - " + 1234).forEach(System.out::println);
    Arrays.stream(courses).filter(course -> course.startsWith("A")).map(course -> course.toLowerCase()).forEach(System.out::println);
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    Arrays.stream(numbers).filter(num -> num % 2 != 0).forEach(System.out::println);
        }

    }


