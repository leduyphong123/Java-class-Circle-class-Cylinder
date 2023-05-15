public class Main{
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(3);
        cylinder.setColor("Blue");
        cylinder.setRadius(5.0);
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.toString());
    }
}