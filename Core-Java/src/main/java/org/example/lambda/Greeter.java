package org.example.lambda;

public interface Greeter extends Sample{
    void wish(String name);

}
interface Sample{
  default  void greet(String name){}
    static  void wisher(){}
}
class Point implements Sample{
    @Override
    public void greet(String name) {
        Sample.super.greet(name);
    }
    int wisher(){
        return  1;
    }
}