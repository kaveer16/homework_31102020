package ProgramNineteen;

public class Cylinder extends Circle{
    public Cylinder(double radius) {
        super(radius);
    }
    double height;
    public Cylinder(double radius,double height){
        super(radius); this.height=height;
        if (height<0){
            this.height=0;
        }

    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return radius*radius*Math.PI*height;


    }
}
