package Q2;
import java.lang.Math;

public abstract class Shape{
    protected int dim1;
    protected int dim2;
    public double PI=Math.PI;

    public Shape(int dim1,int dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }

    public abstract double area();
}