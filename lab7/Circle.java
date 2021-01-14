package week5;
import java.lang.Math;
public class Circle {
    private double r =1;
    private double area;
    private double circle;
    private double a = 0;
  
    public void setR1(int r){
        this.r =r;
    }
    public double  getArea() {
        a= 3.1415*r*r;
        this.area = a;
        return area; 
    }
    public double getCircle() {
        a =2*3.1415*r;
        this.circle = a;
        return circle;
    }

    public void setR2(int r){
        this.r =r;
    }
    public double  getArea2() {
        a= 3.1415*r*r;
        this.area = a;
        return area; 
    }
    public double getCircle2() {
        a =2*3.1415*r;
        this.circle = a;
        return circle;
    }    

    public void setR3(int r){
        this.r =r;
    }
    public double  getArea3() {
        a= 3.1415*r*r;
        this.area = a;
        return area; 
    }
    public double getCircle3() {
        a =2*3.1415*r;
        this.circle = a;
        return circle;
    }  
    
    public void setR4(int r){
        if(r<0){
            this.r =0;
        }
    }
    public double  getArea4() {
        a= 3.1415*r*r;
        this.area = a;
        return area; 
    }
    public double getCircle4() {
        a =2*3.1415*r;
        this.circle = a;
        return circle;
    } 
    public void Fs1_2(int b ,int c){
        if(Math.sqrt(Math.pow(b, 2)+Math.pow(c, 2))<2+3){
           System.out.println("Is circle 1 intersec circle 2 :true");
        }
        else {
           System.out.println("Is circle 1 intersec circle 2 :false");
        }
       }
   
       public void Fs1_3(int d ,int e){
           if(Math.sqrt(Math.pow(d, 2)+Math.pow(e, 2))<1+2){
               System.out.println("Is circle 1 intersec circle 3 :false");
            }
            else {
               System.out.println("Is circle 1 intersec circle 3 :true");
           }
       }
    
}