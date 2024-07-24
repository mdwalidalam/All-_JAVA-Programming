
package MethodOverloading;

public class Overloadtest {
    public static void main(String[] args) {
        Overload ob = new Overload();
        ob.add();
        ob.add(55,10);
        ob.add(6.5, 5.5);
        ob.add(5, 10, 20);
    }
    
}
