public class Cylinder extends Circle{
    private double height;
    Cylinder(){
        height=1.0;
    }
    Cylinder(double height,double radius,String color){
        super(radius,color);
        this.height=height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    @Override
    public String toString(){
        return "A Cylinder height = "+height+super.toString();
    }
}
