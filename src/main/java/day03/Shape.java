package day03;
 import java.lang.Math.*;
import java.awt.geom.Arc2D;

/**
 * 形状
 */
public class Shape {
    protected String type;
    protected String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(){

    }
    //    methods
}

class Square extends Shape
{
    /*
    边长
     */
    private Double length;

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Square(Double length,String type,String color){
        this.length=length;
        this.color=color;
        this.type=type;
    }

    public Square(){

    }
    /*
    得到面积
     */
    public Double getArea(){
        return length*length;
    }

    /*
    得到周长
     */
    public Double getPerimeter(){
        return 4*length;
    }
}

class Rectangle extends Shape
{
    private Double width;
    private Double high;

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Rectangle(Double width,Double high,String type,String color){
        this.high=high;
        this.width=width;
        this.color=color;
        this.type=type;
    }

    public Rectangle(){

    }
    /*
        得到面积
         */
    public Double getArea(){
        return this.high*this.width;
    }

    /*
    得到周长
     */
    public Double getPerimeter(){
        return 2*(this.width+this.high);
    }
}

class Triangle extends Shape {
    /*
    边长
     */
    private Double length1;
    private Double length2;
    private Double length3;

    public Double getLength1() {
        return length1;
    }

    public void setLength1(Double length1) {
        this.length1 = length1;
    }

    public Double getLength2() {
        return length2;
    }

    public void setLength2(Double length2) {
        this.length2 = length2;
    }

    public Double getLength3() {
        return length3;
    }

    public void setLength3(Double length3) {
        this.length3 = length3;
    }

    public Triangle(Double length1, Double length2, Double length3, String type, String color) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
        this.color = color;
        this.type = type;
    }

    public Triangle() {

    }

    /*
        得到面积
         */
    public Double getArea() {
        Double s = (this.length1 + this.length2 + this.length3) / 2;
        Double S = (Double) Math.sqrt(s * (s - this.length1) * (s - this.length2) * (s - this.length3));
        if (this.length1 + this.length2 > this.length3 && this.length1 + this.length3 > this.length2 && this.length2 + this.length3 > this.length1) {
            return S;
        } else {
            return -1.0;
        }
    }

    /*
   得到周长
    */
    public Double getPerimeter(){
        if (this.length1 + this.length2 > this.length3 && this.length1 + this.length3 > this.length2 && this.length2 + this.length3 > this.length1) {
            return 2 * (this.length3 + this.length2 + this.length1);
        } else {
            return -1.0;
        }
    }
}

    class Circle extends Shape {
        /*
        半径
         */
        private Double radius;

        public Double getRadius() {
            return radius;
        }

        public void setRadius(Double radius) {
            this.radius = radius;
        }

        public Circle(Double radius, String type, String color) {
            this.radius = radius;
            this.color = color;
            this.type = type;
        }

        public Circle() {

        }

        /*
            得到面积
             */
        public Double getArea() {
            return radius * radius * Math.PI;
        }

        /*
        得到周长
         */
        public Double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }


