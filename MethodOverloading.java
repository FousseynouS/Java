public class MethodOverloading {
    static int add(int a, int b) {
        return a + b; 
    }
    static int add(int a, int b, int c) {
        return a + b *c;
    }    
    public static void main(String[] args) {
        System.out.println(MethodOverloading.add(2,16));
        System.out.println(MethodOverloading.add(78,1,9));
        
    }
}
