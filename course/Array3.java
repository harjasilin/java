package course;

class Student {
    int rollno;
    String name;
    int mark;

}

public class Array3 {
    public static void main(String[] args) {
        int nums[] = new int[6];
        nums[0] = 10;
        nums[2] = 2;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        for (int n : nums) {
            System.out.println(n + "dsbcidbsiu");
        }

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "sdbj";
        s1.mark = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "sdbj";
        s2.mark = 88;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "sdbj";
        s3.mark = 80;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + students[i].mark);
        }

        for (Student stud : students) {
            System.out.println(stud.mark);
        }

    }
}
