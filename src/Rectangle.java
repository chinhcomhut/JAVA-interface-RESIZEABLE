//package shape;
//import shape.Shape;
public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double lenght = 1.0;
    public Rectangle(){
    }
    public Rectangle(double width, double lenght){
        this.lenght = lenght;
        this.width = width;
    }
    public Rectangle(double width, double lenght, String color, boolean filled){
       super(color,filled);
        this.lenght = lenght;
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLenght(){
        return lenght;
    }
    public void setLength(double lenght){
        this.lenght = lenght;
    }
    public double getArea(){
        return width*lenght;
    }
    public double getPremeter(){
        return (width+lenght)*2;
    }
    public String toString(){
        return "A Rectangle with width: "+getWidth()+" and "+getLenght()+" area "+getArea()+" Premeter is: " +getPremeter()+super.toString();
    }

    @Override
    public void resize(double percent) {
     this.width += getWidth()*percent/100;
     this.lenght += getLenght()*percent/100;
//getArea();

//this.width+=this.width*percent;
//this.lenght+= this.lenght*percent;
    }
}
