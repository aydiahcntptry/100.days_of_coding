
package pkg100.days.of.coding;

public class Day4_operatorPenugasan {

    public static void main(String[] args) {
        
        int angkaZ;
        int angkaA;
        
        angkaZ =20;
        angkaA =10;
        
        
        angkaA += angkaZ;
        // angkaA = 30
        System.out.println("penambahan : " + angkaA);
        
        
        angkaA -= angkaZ;
        // angkaA 30 - angkaZ 20 = angkaA 10
        System.out.println("pengurangan : " + angkaA);
        
        angkaA *= angkaZ;
        // angkaA 10 * angkaZ 20 = angkaA 200
        System.out.println("perkalian : " + angkaA);
        
        angkaA /= angkaZ;
        // angkaA 200 / angkaZ 20 = angkaA 10
        System.out.println("pembagian : " + angkaA);
        
        angkaA %= angkaZ;
        // angkaA 10 % angkaZ 20 = angkaA 10 
        System.out.println("sisabagi : " + angkaA);
    }
    
}
