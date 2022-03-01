package Q2;
import java.lang.Math;

public class Circle extends Shape{
    public Circle(int dim1,int dim2){
        super(dim1, dim2);
    }

    public double area(){
        double area=PI*Math.pow(dim1,2);
        return area;
    }
}
