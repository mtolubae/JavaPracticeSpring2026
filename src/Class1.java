public class Class1 {
    public static void main(String[] args){
//        int a[];
 //       int b[] = new int[10];
//        int c[] = {1,2,3,4,5};
        //System.out.println(a);
//        for (int i=0; i<c.length;i++)
//        {System.out.println(b[i]);
//        System.out.println(c[i]);}
//int arg=0;
//        int x = args.length;
//        int arr[] = new int[x];
//        for(int i=0;i<x;i++){
//            arr[i] = Integer.parseInt(args[i]);
//        }
//        for (int i:arr){
//            System.out.println(i);
//        }

//        Book bb = new Book();
//        //bb.pages=100; bb.author="JKR"; bb.title="HP";
//        Book bb2 = new Book("LOTR","Tolkien",1000);
//        Book bb3 = new Book("1");
//        bb3.setTitle("HP");
        //System.out.println(bb3.getTitle());
        //System.out.println(bb.author + " " + bb.title + " " + bb.pages);
        //System.out.println(bb2.author + " " + bb2.title + " " + bb2.pages);

//        Person p = new Person();
//        Person p2 = new Person("Trinity", 30, "actress", "married");
//        System.out.println("Person 2: " + p2);

//        Book b1 = new Book();
//        b1.setTitle("HP"); b1.setAuthor("JKR");b1.setPages(1000);
//        Book.bumaga = "papyrus"; System.out.println(b1);
//        Book b2 = new Book("HP", "JKR",1000);
//        System.out.println(b2);
//        if(b1.equals(b2)){
//            System.out.println("The books are the same");
//        }
//        else{
//            System.out.println("The books are different");
//        }
        polymorphismFunc();
    }

    public static void polymorphismFunc(){
        Book[] books = new Book[3];
        books[0] = new Book();
        books[1] = new EBook("Ebook1","EAuthor",100,3.05,"pdf");
        books[2] = new SciFiBook("Sbook", "",1,"astrophysics");

        for(int i=0; i< books.length; i++){
            System.out.println(books[i]);
        }
    }
}

class Book{
    private String title;
    private String author;
    private int pages;
    public static String bumaga;

    public Book(){}
    public Book(String title, String author, int pages){
        this.author = author;
        this.title = title;
        this.pages = pages;
    }
    public Book(String a){
        this.title = a;
    }

    public Book(int p){
        this.pages = p;
    }

    public String getTitle(){return this.title;}
    public void setTitle(String newTitle){this.title = newTitle;}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString(){
        return this.title + " " + this.author + " " + bumaga;
    }

    public boolean equals(Book b){
        if(b != null){
            if(this.author == b.author && this.title == b.title) return true;
        }
        return false;
    }
}


class EBook extends Book{
    private double fileSize;
    private String format;

    public EBook(String title, String author, int pages, double fileSize, String format){
        super(title,author,pages);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public String toString() {
        String superStr = super.toString();
        return superStr + "EBook{" +
                "fileSize=" + fileSize +
                ", format='" + format + '\'' +
                '}';
    }
}

class SciFiBook extends Book{
    private String field;

    public SciFiBook(String title, String author, int pages, String field){
        super(title,author,pages);
        this.field = field;
    }

    @Override
    public String toString() {
        return super.toString() + "SciFiBook{" +
                "field='" + field + '\'' +
                '}';
    }
}

class Person{
    private String fname;
    private String lname;
    private int age;
    private String gender;
    private String status;
    private String occupation;

    public Person(){}
    public Person(String fname, int age, String occupation, String status){
        this.fname = fname;
        this.age = age;
        this.occupation = occupation;
        this.status = status;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}


