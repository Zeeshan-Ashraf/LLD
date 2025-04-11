package solid_principle.liskov;

/**
 * https://docs.google.com/document/d/1Fnul82HZhGmB0C-xm9gwiK4LIy76-Hg98xjK0a1Jq1w/edit?tab=t.0#heading=h.few9uzcldlmk
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Liskov Negative");
        Green green = new Green();
        green.getColor(); //Green

        green = new Blue();
        green.getColor(); //Blue but a/q to Liskov should be able to replaceable with derived class without issue


        System.out.println("\n\n\nLiskov Positive");
        Color color = new Blue1();
        color.getColor(); //Blue
        color = new Green1();
        color.getColor();  //Green
    }
}
