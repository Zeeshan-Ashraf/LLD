package solid_principle;

/**
 * https://docs.google.com/document/d/1Fnul82HZhGmB0C-xm9gwiK4LIy76-Hg98xjK0a1Jq1w/edit?tab=t.0#heading=h.kksjsvabvk9p
 * */
public class Main {
    public static void main(String[] args) {
        System.out.println("Solid Principle");
        System.out.println("""
                S: Single responsibility principle.
                O: Open–closed principle.
                L: Liskov substitution principle.
                I: Interface segregation principle.
                D: Dependency inversion principle.
                """);


        System.out.println("\n\n\nSingle responsibility principle.");
        SingleResponsibility sr = new SingleResponsibility();
        sr.single_responsibility();


        System.out.println("\n\n\nOpen–closed principle - Any entity (method, class, Interface) should be closed for modification but open for extension.");
        System.out.println("""
                Open–closed principle achieved using following:
                1. Abstraction
                2. Polymorphism
                3. Strategy Pattern
                4. Composition over Inheritance
                
                """);

        System.out.println("1. Abstraction: two functionality implemented using two different implemented class of Interface / Abstract class e.g:");
        OpenClosePrinciple openClosePrinciple = new OpenClosePrinciple();
        openClosePrinciple.divide(10, 5);

        OpenClosePrinciple2 openClosePrinciple2 = new OpenClosePrinciple2();
        openClosePrinciple2.divide(10, 5);

        System.out.println("2. Polymorphism: two functionality implemented using same methods but diff params e.g:");
        openClosePrinciple.polymorphism(1);
        openClosePrinciple.polymorphism(2);

    }
}
