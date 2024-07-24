
package InheritancePrivate;
public class Test {
    public static void main(String[] args) {
       Teacher t1 = new Teacher();
       t1.setName("Walid");
       t1.setAge(23);
       t1.setQualification("BSc in CSE");
        t1.displayInformation();
        Teacher t2 = new Teacher();
       t2.setName("HIMATRY");
       t2.setAge(23);
       t2.setQualification("BSc in CSE");
        t2.displayInformation();
    }
    
}
