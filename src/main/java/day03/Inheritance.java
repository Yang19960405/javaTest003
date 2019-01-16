package day03;

public class Inheritance {

}

/**
 * Vehicle: 交通工具
 *
 * class = fields + methods
 */
class Vehicle{
    private String name;
    private Integer speed;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Vehicle()
    {

    }



    public Vehicle(String name, Integer speed, String price)
    {
        this.name=name;
        this.price=price;
        this.speed=speed;
    }

    public String  VehicleAll()
    {
        if (this.price!=null&this.speed!=-1&this.name!=null)
        return "我的交通工具是："+this.name+",他的速度是"+this.speed+"km/h,它的价格"+this.price+"";
        return "我还没有交通工具";
    }
}
