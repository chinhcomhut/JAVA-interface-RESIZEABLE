import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(3.6);
//resizeables[1]=new Circle(1);
//resizeables[2]=new Circle(3.5,"indigo",false);
        resizeables[1]=new Rectangle(4,5);
        resizeables[2]=new Square(5);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percent (%): ");
        double percent = sc.nextDouble();
        System.out.println(">>>>>>Pre Recize");
//        double percent = (Math.random()*100);
//        System.out.println("Percent increased: "+percent);
//Circle[] circles = new Circle[3];
//circles[0]=new Circle(3.6);
//circles[1]= new Circle();
//circles[2]= new Circle(3.5,"indigo",false);
//        System.out.println("Pre resize:");
//for(Circle circle:circles){
//    System.out.println(circle);
//}


for(Resizeable resizeable:resizeables){
    System.out.println(resizeable);
}
        System.out.println(">>>>>> After-Resize");
for (Resizeable resizeable:resizeables){
    resizeable.resize(percent);
    System.out.println(resizeable);
}
//Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle.getArea());

    }
}
