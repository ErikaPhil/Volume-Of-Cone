//Description: create a program that calculate the voume of a cylinder using a static block and static variable
import java.util.Scanner;
class Volume{
    static{System.out.print("The volume of a cone is ");} //static block
    double radius;
    static double PI = 3.14159; //static variable
    double height;   
    void radius(double r){
        radius = r;
    }
    void height(double h){
        height = h;    
    }
    void Formula(){System.out.print(PI * (radius*radius)*(height/3) + "\n");}        
}
public class VolumeOfCone {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        System.out.print("Radius: "); 
        double radius1 = sc.nextDouble();
        System.out.print("Height: "); 
        double height1 = sc.nextDouble();
        Volume cone = new Volume();
        cone.radius(radius1);
        cone.height(height1);
        cone.Formula();
    }
}
