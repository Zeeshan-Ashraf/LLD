package interface_basics;

public interface Vehicle {
    //int speed = 0; can not declare var here coz var are static final in interface, declare in impl class read: https://docs.google.com/document/d/1rJMiu9ei6X92wMIkY7-I10KPZhroqnD_3Qxqkzh9hf0/edit?tab=t.0#heading=h.9y9x4m9mo3zi

    public void move();
    public void stop();
}
