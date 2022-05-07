package _06_schoolManagementSystem;

import java.util.*;

public class Processes {
    static Map<Integer, String> menu = new HashMap<>();
    static Scanner scan = new Scanner(System.in);
    static String memberType;
    static Map<Integer, String> teachers = new HashMap<>();
    static Map<Integer, String> students = new HashMap<>();


    public static void createDatabase() {
        Student student1 = new Student("Roseanne Fellows", "124141414", 24, 1, 1001);
        Student student2 = new Student("Cally Whittaker", "1242141421", 22, 3, 1002);
        Student student3 = new Student("Gerald Holland", "5342141419", 19, 2, 1003);
        Student student4 = new Student("Ilyas Frame", "2692141490", 19, 2, 1004);
        Student student5 = new Student("Martin Donnelly", "2902151620", 18, 2, 1005);
        students.put(student1.getStudentNumber(), student1.toString());
        students.put(student2.getStudentNumber(), student2.toString());
        students.put(student3.getStudentNumber(), student3.toString());
        students.put(student4.getStudentNumber(), student4.toString());
        students.put(student5.getStudentNumber(), student5.toString());

        Teacher teacher1 = new Teacher("Sanah Yang", "5624325687", 35, "Biology", 111901);
        Teacher teacher2 = new Teacher("Andre Beach", "2837495021", 42, "English", 111902);
        Teacher teacher3 = new Teacher("Sanya Salazar", "1524786324", 33, "Maths", 111903);
        Teacher teacher4 = new Teacher("Charlie Blaese", "8372910284", 46, "Physics", 111904);
        Teacher teacher5 = new Teacher("Mischa Hammond", "8472910235", 35, "History", 111901);
        teachers.put(teacher1.getRegistryNumber(), teacher1.toString());
        teachers.put(teacher2.getRegistryNumber(), teacher2.toString());
        teachers.put(teacher3.getRegistryNumber(), teacher3.toString());
        teachers.put(teacher4.getRegistryNumber(), teacher4.toString());
        teachers.put(teacher5.getRegistryNumber(), teacher5.toString());
        System.out.println();
        System.out.println("================================================");
        System.out.println("======Welcome to School Management System=======");
        System.out.println("================================================");
    }


    public static void mainMenu() {
        System.out.println();
        System.out.println("Please select a transaction.");
        System.out.println("1-Student transactions\n2-Teacher transactions\nQ-Exit");
        System.out.println();
        System.out.print("Your choice : ");
        String choice = scan.nextLine().toUpperCase();
        switch (choice) {
            case "1":
                memberType = "Student";
                transactions();
                break;
            case "2":
                memberType = "Teacher";
                transactions();
                break;
            case "Q":
                exit();
                break;
            default:
                System.out.println("Wrong entry");
                mainMenu();
                break;
        }
    }

    private static void exit() {
        System.out.println();
        System.out.println("Have a nice day.");
        System.exit(0);
    }

    public static void transactions() {
        System.out.println();
        System.out.println("Welcome to " + memberType + " Transactions Menu");
        System.out.println("Please select a transaction.");
        System.out.println("1-Register " + memberType + "\n2-Find " + memberType + "\n3-List " + memberType + "s" +
                "\n4-Remove " + memberType + "\n5-Return to main menu\n0-Exit");
        System.out.println();
        System.out.print("Your choice : ");

        String choice = scan.nextLine();

        switch (choice) {
            case "1":
                register();
                transactions();
                break;
            case "2":
                find();
                transactions();
                break;
            case "3":
                list();
                transactions();
                break;
            case "4":
                remove();
                transactions();
                break;
            case "5":
                mainMenu();
                break;
            case "0":
                exit();
                break;
            default:
                System.out.println("Wrong entry");
                transactions();
                break;
        }
    }

    private static void register() {
        System.out.println();
        System.out.println(memberType + " Registration Menu");
        System.out.println("Please enter the asked information to register.");
        String nameSurname, IDNo, branch = null;
        Integer age, registryNumber = 0, studentNumber = 0,studentClass = 0;
        do {
            System.out.print("Name and Surname with one blank between them : ");
            nameSurname = scan.nextLine();
            String temp = nameSurname;
            temp = temp.replaceAll("[a-zA-ZüÜıİÖöğĞşŞçÇ ]", "");
            if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
            if (!nameSurname.contains(" ")) System.out.println("Invalid information. Please try again.");
            else break;
        } while (true);
        do {
            System.out.print("IDNo : ");
            IDNo = scan.nextLine();
            String temp = IDNo;
            temp = temp.replaceAll("\\d", "");
            if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
            else break;
        } while (true);
        do {
            try {
                System.out.print("Age : ");
                age = Integer.parseInt(scan.nextLine());
                if (age > 100 || age < 7) {
                    System.out.println("Invalid information. Please try again.");
                } else break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid information. Please try again.");
            }
        } while (true);
        if (memberType.equals("Student")) {
            do {
                try {
                    System.out.print("Student Number : ");
                    studentNumber = Integer.parseInt(scan.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid information. Please try again.");
                }
            } while (true);

            do {
                try {
                    System.out.print("Student Class : ");
                    studentClass = Integer.parseInt(scan.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid information. Please try again.");
                }
            } while (true);

        } else {
            do {
                try {
                    System.out.print("Registry Number : ");
                    registryNumber = Integer.parseInt(scan.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid information. Please try again.");
                }
            } while (true);

            do {
                System.out.print("Branch : ");
                branch = scan.nextLine();
                String temp = branch;
                temp = temp.replaceAll("[a-zA-ZüÜıİÖöğĞşŞçÇ]", "");
                if (!temp.equals("")) System.out.println("Invalid information. Please try again.");
                else break;
            } while (true);
        }
        if (memberType.equals("Student")) {
            Student studentnew = new Student(nameSurname, IDNo, age, studentClass, studentNumber);
            students.put(studentnew.getStudentNumber(), studentnew.toString());
        } else {
            Teacher teachernew = new Teacher(nameSurname, IDNo, age, branch, registryNumber);
            teachers.put(teachernew.getRegistryNumber(), teachernew.toString());
        }
        System.out.println();
        System.out.println("Registration successful.");
        mainMenu();
    }

    private static void find() {
        System.out.println();
        System.out.println(memberType + " Search Menu");
        int counter = 0;
        if (memberType.equals("Student")) {
            int requestedStudentNumber;
            while (true) {
                System.out.print("Enter the student number : ");
                try {
                    requestedStudentNumber = Integer.parseInt(scan.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong entry");
                }
            }
            String[] studentData;
            Set<Map.Entry<Integer, String>> studentsSet = students.entrySet();
            for (Map.Entry<Integer, String> each : studentsSet) {
                if (requestedStudentNumber == each.getKey()) {
                    studentData = each.getValue().split(", ");
                    System.out.println();
                    System.out.println("Data of the student with student number " + requestedStudentNumber);
                    System.out.println("Name and Surname : "+studentData[0]+"\nID No : "+studentData[1]+"\nAge : "
                            +studentData[2]+"\nClass : "+studentData[3]);
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println();
                System.out.println("Student with student number " + requestedStudentNumber +
                        " could not be found in the database.");
            }

        } else {
            int requestedRegistryNumber = 0;
            while (true) {
                System.out.print("Enter the registry number : ");
                try {
                    requestedRegistryNumber = Integer.parseInt(scan.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong entry");
                }
            }
            String[] teacherData = new String[4];
            Set<Map.Entry<Integer, String>> teachersSet = teachers.entrySet();
            for (Map.Entry<Integer, String> each2 : teachersSet) {
                if (requestedRegistryNumber == each2.getKey()) {
                    teacherData = each2.getValue().split(", ");
                    System.out.println();
                    System.out.println("Data of the teacher with registry number " + requestedRegistryNumber);
                    System.out.println("Name and Surname : "+teacherData[0]+"\nID No : "+teacherData[1]+"\nAge : "
                            +teacherData[2]+"\nBranch : "+teacherData[3]);
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println();
                System.out.println("Teacher with registry number " + requestedRegistryNumber +
                        " could not be found in the database.");
            }
        }
        mainMenu();
    }

    private static void list() {
        System.out.println();
        System.out.println(memberType + " List Menu");
        if (memberType.equals("Student")) {
            for (Map.Entry<Integer, String> each : students.entrySet()) {
                System.out.println(each.getKey() + " : " + each.getValue());
            }
        } else {
            for (Map.Entry<Integer, String> each : teachers.entrySet()) {
                System.out.println(each.getKey() + " : " + each.getValue());
            }
        }
        mainMenu();
    }

    private static void remove() {
        System.out.println();
        System.out.println(memberType + " Remove Menu");
        Set<Map.Entry<Integer, String>> studentsSet = students.entrySet();
        Set<Map.Entry<Integer, String>> teachersSet = teachers.entrySet();

        if (memberType.equals("Student")) {
            int requestedStudentNumber;
            while (true) {
                System.out.print("Please enter the Student Number of the student that you want to remove : ");
                try {
                    requestedStudentNumber = Integer.parseInt(scan.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong entry");
                }
            }
            for (Map.Entry<Integer, String> each : studentsSet) {
                if (requestedStudentNumber == each.getKey()) {
                    students.remove(requestedStudentNumber);
                    System.out.println();
                    System.out.println("Requested " + memberType + " has been removed successfully.");
                    mainMenu();
                }
            }
            System.out.println();
            System.out.println("Student with student number " + requestedStudentNumber +
                    " could not be found in the database.");
        } else {
            int requestedRegistryNumber;
            while (true) {
                System.out.print("Please enter the Registry Number of the teacher that you want to remove : ");
                try {
                    requestedRegistryNumber = Integer.parseInt(scan.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong entry");
                }
            }
            for (Map.Entry<Integer, String> each : teachersSet) {
                if (requestedRegistryNumber == each.getKey()) {
                    teachers.remove(requestedRegistryNumber);
                    System.out.println();
                    System.out.println("Requested " + memberType + " has been removed successfully.");
                    mainMenu();
                }
            }
            System.out.println();
            System.out.println("Teacher with registry number " + requestedRegistryNumber +
                    " could not be found in the database.");
        }
        mainMenu();
    }
}







