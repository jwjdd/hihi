class Person {
    // 필드 (속성)
    public final String name;
    private int studentId;
    private final int age;
    private String email;
    private String phoneNumber;
    public String gitId;

    // 생성자
    public Person(String name, int studentId, int age, String email, String phoneNumber, String gitId) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gitId = gitId;
    }


    // 이메일 설정
    public void setEmail(String email) {
        this.email = email;
    }

    // 전화번호 설정
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // git ID 설정
    public void setgitId(String gitId) {
        this.gitId = gitId;
    }

    // 인적 사항 출력
    public void printPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Git ID: " + gitId);
    }
}

public class Main {
    public static void main(String[] args) {
        // Person 객체 생성
        Person student = new Person("Jowonjun", 202403511, 20, "jowonjun@example.com", "010-1234-5678", "jwjbb");

        // 인적 사항 출력
        student.printPersonInfo();

        // 이메일 및 전화번호 변경
        student.setPhoneNumber("010-8765-4321");

        // 변경된 인적 사항 출력
        System.out.println("\nUpdated Information:");
        student.printPersonInfo();
    }
}