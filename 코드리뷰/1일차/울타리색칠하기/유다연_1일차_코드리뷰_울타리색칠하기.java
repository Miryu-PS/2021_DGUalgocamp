import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        
        int min, max;
        int sum = 0;
        if(b<c || d<a){
            sum += b-a;
            sum += d-c;
        }
        else{
            if(a<c){
            min = a;
        }
        else{
            min = c;
        }
        
        if(b<d){
            max = d;
        }
        else{
            max = b;
        }
            sum = max-min;
        }
        
        System.out.print(sum);
        
        scanner.close();
    }
}