public class Teacher {
    String name;
    String no;
    String branch;

    Teacher(String name, String branch, String no){
        this.name = name;
        this.branch = branch;
        this.no = no;
    }


    void print(){
        System.out.println("Adı:" + name);
        System.out.println("Bölüm:" + branch);
        System.out.println("Numara:" + no);

    }

}
