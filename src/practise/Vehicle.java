package practise;

public class Vehicle {
    double speed;
    int power;
    void speedUp(int s){
        speed = speed + s;
        if(speed > 200) speed = 200;//(2)改进speedUp()方法
    }
    void speedDown(int d){
        speed = speed - d;
        if(speed < 0) speed = 0;//(3)改进speeedDown()方法
    }
    void setPower(int p){
        power = p;
    }
    int getPower(){
        return power;
    }
    double getSpeed(){
        return speed;
    }
    void brake(){
        speed = 0;
    }//(4)增加刹车方法void brake()
}


