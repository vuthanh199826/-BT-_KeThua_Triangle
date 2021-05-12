package pack01;

public class Triangle extends Shape {
    private float size1,size2,size3;

    public Triangle() {
        size1 = 1.0f;
        size2 = 1.0f;
        size3 = 1.0f;
    }

    public Triangle(float size1, float size2, float size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public float getSize1() {
        return size1;
    }

    public void setSize1(float size1) {
        this.size1 = size1;
    }

    public float getSize2() {
        return size2;
    }

    public void setSize2(float size2) {
        this.size2 = size2;
    }

    public float getSize3() {
        return size3;
    }

    public void setSize3(float size3) {
        this.size3 = size3;
    }

    public float getPeri(){
        float peri = size1+size2+size3;
        return peri;
    }

    public double getArea(){
        double p = getPeri()/2;
        double area = Math.sqrt(p*(p-size1)*(p-size2)*(p-size3));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "size1=" + size1 +
                ", size2=" + size2 +
                ", size3=" + size3 +
                " peri = " + getPeri() +
                " area = " + getArea() +
                '}';
    }
}

class Test{
    public static void main(String[] args) {
        Triangle obj = new Triangle(5,6,7);
        System.out.println(obj);
    }
}
