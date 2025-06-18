public class Student {
    String name = "Koushik";
    String roll ="4G3";
    String branch ="ECE";
    int year =3;
    char section ='d';
    Student( String name, String roll, String branch, int year, char section){
        this.name=name;
        this.branch=branch;
        this.year=year;
        this.section=section;
        this.roll=roll;}
    void details(){
        System.err.println(name);
        System.err.println(roll);
        System.err.println(branch);
        System.err.println(year);
        System.err.println(section);
       
    }
}