package Q2;
public class Ellipse extends Shape{
    public Ellipse(int dim1,int dim2){
        super(dim1, dim2);
    }

    public double area(){
        double area=dim1*dim2*PI;
        return area;
    }
}
