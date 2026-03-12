import java.util.Scanner;

public class Ass3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = new String[10];
        int[] grades = new int[10];

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter student name: ");
            names[i] = scanner.nextLine();

            System.out.print("Enter grade: ");
            grades[i] = scanner.nextInt();
            scanner.nextLine(); 
        }

        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += grades[i];
        }

        double average = (double) sum / 10;
        System.out.println("Average Grade: " + average);

        
        for (int i = 0; i < grades.length - 1; i++) {
            for (int j = 0; j < grades.length - i - 1; j++) {
                if (grades[j] > grades[j + 1]) {

                   
                    int tempGrade = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = tempGrade;

                    
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }

        
        System.out.println("Sorted Grades (Ascending):");
        for (int i = 0; i < 10; i++) {
            System.out.println(names[i] + " - " + grades[i]);
        }

        
        System.out.print("Enter student name to search: ");
        String search = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < 10; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                System.out.println("Student found: " + names[i] + " - Grade: " + grades[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        scanner.close();
    }
}