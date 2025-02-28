class Student{
    private String name;
    private char gender;
    public static PrintG(char s){
        if(s == f) System.out.println("Gender: Female");
        else if(s == m) System.out.println("Gender: Male");
        else System.out.println("Gender: Unknown");
    }

    public Student(){
        this.name = "Unknown";
        this.gender = "u";
    }
    public Student(String name){
        this.name = name;
        this.gender = "u";
    }
    public Student(String name, char gender){
        this.name = name;
        this.gender = gender;
    }
    public display(){
        System.out.println("Name: " + name);
        PrintG(gender);
    }

}