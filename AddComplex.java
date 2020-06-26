import java.util.Scanner;

public class AddComplex{
    double real, img;
        
    AddComplex(double r, double i){
        this.real = r;
        this.img = i;
    }
    
    
    static AddComplex sum(AddComplex a1, AddComplex a2){
        AddComplex temp = new AddComplex(0,0);
        
        temp.real = a1.real + a2.real;
        temp.img = a1.img + a2.img;
    
        return temp;
    }
    
    public static void main(String [] ak){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nEnter Real and Imaginary Part of 1st number: ");
        double real1 = scan.nextDouble();
        double img1 = scan.nextDouble();
        
        System.out.print("\nEnter Real and Imaginary Part of 2nd number: ");
        double real2 = scan.nextDouble();
        double img2 = scan.nextDouble();
        
        AddComplex a1 = new AddComplex(real1,img1);
        AddComplex a2 = new AddComplex(real2,img2);
        
        AddComplex temp = sum(a1,a2);
        
        System.out.println("\nSum is: "+temp.real+" + "+temp.img+"i");
    }
}