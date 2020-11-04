package Carpetcostcalculator;

public class Floor {
    public double width;
    public double length;


    public Floor(double width, double length){
        this.width =width;     //initializing
        this.length =length;
        if (width <0){
            this.width =0;

        }
        if(length<0) {
            this.length = 0;
        }
    }
    public double getArea(){
        return this.width *this.length; //can be written in()

    }

}
