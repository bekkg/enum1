public class Main {
    public static void main(String[] args) {

        School school1 = new School(1,"bek1",Lessen.FRANCH);
        School school2 = new School(2,"bek2",Lessen.ENGLISH);
        School [] school = {school1,school2};
        for (int i = 0; i < school.length; i++) {
            System.out.println(school[i]);
        }

        System.out.println();
        Student student1 = new Student(3,"sky1","moon1",Course.OFFLINE);
        Student student2 = new Student(4,"sky2", "moon2",Course.OFFLINE);
        Student [] student = {student2,student1};
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
        }


    }
}