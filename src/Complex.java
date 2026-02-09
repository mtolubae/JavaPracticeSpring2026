public class Complex {
    private double real;
    private double img;

    public Complex(double real, double imag){
        this.real = real;
        img = imag;
    }

    public Complex (Complex a){
        this.real = a.real;
        this.img = a.img;
    }

    public Complex(){}

    public double getReal(){return real;}

    public double getImaginary(){return img;}

    public Complex add(Complex other){
        return new Complex(real+other.real,img+other.img);
    }

    public Complex sub(Complex other){
        double r = real - other.real;
        double i = img - other.img;
        Complex c = new Complex(r,i);
        return c;
    }

    public String toString(){
        return real+"+" + img+"i";
    }
}

class TestComplex {
    public static void main(String[] args) {
        Complex a = new Complex(1.33, 4.64);
        Complex b = new Complex(3.18, 2.74);
        Complex c = a.add(b);
        Complex[] arrayC = {a, b, c};
        System.out.println("c=a+b= " + c.getReal()
                + " " + c.getImaginary());
        Complex d = c.sub(a);
        System.out.println("d=c-a= " + d.getReal()+ " " + d.getImaginary());
        System.out.println(d);
        Complex e = new Complex(c);
        e = c;
        System.out.println(searchForComplex(arrayC,e));
        replaceComplex(arrayC, c, e);
        displayArrayContent(arrayC);

        TripleComplex tc = new TripleComplex(1,2,3);
        System.out.println(tc.toString());

    }

    public static boolean searchForComplex(Complex[] a, Complex target){
        for(Complex c:a){
            if(c.equals(target)) return true;
        }
        return false;
    }

    public static void replaceComplex(Complex[] a, Complex old, Complex newV){
//        for(Complex c:a){
//            if(c.equals(old)) c = newV;
//        } doesn't save the newV

        for(int i=0; i<a.length;i++){
            if(a[i].equals(old)) a[i] = newV;
        }
    }

    public static void displayArrayContent(Complex[] a){
        for(Complex c:a){
            System.out.println(c.toString());}
    }
}

class TripleComplex extends Complex {
    private double fantastic;

    public TripleComplex(double real, double img, double fant) {
        super(real, img);
        fantastic = fant;
    }

    public String toString(){
        return super.toString() + "+"+fantastic +"j";
    }
}