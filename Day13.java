
public class Main {
    
    public static void main(String[] args) {
        // belajar Increment dan Decrement
        
        
        System.out.println("___Increment___");
        // Post increment dibagi jadi dua yaitu 
        
        // 1. Post Increment = a++
        System.out.println("Post Increment = a++");
        //Post a = b; b = b + 5; 
        int a;
        int b = 5;
        a = b++;
        
        System.out.println(a);
        System.out.println(b);
        
        // 2. Pre Increment = ++a
        System.out.println("Pre Increment = ++a");
        //Pre d = d + d; c = 5;
        int c;
        int d = 5;
        c = ++d;
        
        System.out.println(c);
        System.out.println(d);
        
        System.out.println("___Decrement___");
        // Post increment dibagi jadi dua yaitu 
        
        // 1. Post Increment = a--
        //Post e = f; f = f - 5;
        System.out.println("Post Increment = a--");
        int e;
        int f = 5;
        e = f--;
        
        System.out.println(e);
        System.out.println(f);
        
        // 2. Pre Increment = --a
        //Pre h = h - h; g = 5;
        System.out.println("Pre Increment = --a");
        int g;
        int h = 5;
        g = --h;
        
        System.out.println(g);
        System.out.println(h);
        
        // sekian
        
        
    }
    
}