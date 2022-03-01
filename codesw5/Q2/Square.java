package Q2;
public class Square extends Shape {
    public Square(int dim1,int dim2){
        super(dim1, dim2);
    }

    public double area(){
        double area=dim1*dim1;
        return area;
    }
}
