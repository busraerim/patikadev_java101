public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Büşra","TRH","0537");
        Teacher t2 = new Teacher("İsmail","MAT","0539");
        Teacher t3 = new Teacher("Havva","FZK","0530");

        Course tarih = new Course("Tarih", "101","TRH",t1);
        tarih.addTeacher(t1);
        Course matematik = new Course("Matematik","101","MAT", t2);
        matematik.addTeacher(t2);
        Course fizik = new Course("Fizik", "123","FZK",t3);
        fizik.addTeacher(t3);

        Student s1 = new Student("Büşra Erim","004", "1", tarih, fizik, matematik);
        s1.addBulkExamNote(100,200,50);
        s1.isPass();


    }
}