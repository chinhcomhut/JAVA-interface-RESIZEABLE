import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(">>>>>>Pre Recize<<<<<<");
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle(3.6);
//resizeables[1]=new Circle(1);
//resizeables[2]=new Circle(3.5,"indigo",false);
        resizeables[1] = new Rectangle(4, 5);
        resizeables[2] = new Square(5);
        for (Resizeable resizeable : resizeables) {
            System.out.println(resizeable);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percent (%): ");
        double percent = sc.nextDouble();
        if(percent <=0||percent>100){
            throw new IndexOutOfBoundsException("Không hợp lệ đăng nhập lại từ 1-100");
        }else {
            System.out.println(">>>>>> After-Resize <<<<<<<<");
        }

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




        for (Resizeable resizeable : resizeables) {
            resizeable.resize(percent);
            System.out.println(resizeable);
        }
//Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle.getArea());

    }
}
