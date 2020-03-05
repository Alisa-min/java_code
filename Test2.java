class Person{
    public String name;//属性  成员变量  实例成员变量
    public int age;
    public static int count=10;//静态成员变量    方法区
    public final int SIZE=20;//修饰常量  在那个内存区域不一定   方法区

    //行为    方法   成员方法  实例成员方法
    public void eat(){
        System.out.println("吃饭!");
    }

    public void sleep(){
        System.out.println("睡觉!");
    }

    public void show(){
        System.out.println("name!"+name);
    }
}

public class Test2 {
    public static void main(String[] args){
        Person person=new Person();
        person.eat();

    }
}
