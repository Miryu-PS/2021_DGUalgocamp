/*
 *string�� contains �޼ҵ�� ���ڿ��� ��üŽ���Ͽ� �ش� ���ڿ��� �����ϴ��� Ȯ���մϴ�. ���� ���� N¥�� ���ڿ����� ���� M¥�� ���ڿ��� ã�´ٸ� O(NM)�� �ð��� �ҿ�Ǵ� �޼ҵ��Դϴ�.
 *���� ���� �ڵ�� �־��� ��� O(N^2 * M) �� �ð����⵵�� ������ �ǰڳ׿�.
 *���ڸ� �ϳ��� ���ÿ� �־�鼭 ������ ���� �ֱ� M���� ���ڰ� ��Ʈ���� �ϴ� ���ڿ��� �����ϴٸ� ���ÿ��� M���� ���ڸ� pop�ϴ� ������ �����Ѵٸ�, ���� �ϳ��� ���� ������ O(M)�� �˻縸 ���ָ� �ǹǷ�, ��ü �ð����⵵ O(NM)�� ������ �ذ��� �� �ֽ��ϴ�.
                
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class stack_arr{
    char[] arr;
    int top;
    
    stack_arr(String str){
        arr = str.toCharArray();
        top = str.length();
    }
    
    stack_arr(int size){
        arr = new char[size];
        top = 0;
    }
    
    void push(char c) {
        arr[top++] = c;
    }
    
    int size() {
        return top;
    }
    
    char peek() {
        return arr[top-1];
    }
    
    char pop() {
        return arr[--top];
    }
    
    boolean empty() {
        return top==0?true:false;
    }
    
    String to_String() {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<size(); i++) sb.append(arr[i]);
        return sb.toString();
    }

}

public class main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String total = br.readLine();
        String target = br.readLine();
        
        StringBuilder sb = new StringBuilder(target);
        String target_reversed = sb.reverse().toString();
        stack_arr str = new stack_arr(total);
        stack_arr save = new stack_arr(total.length());
        for(int i=0; i<total.length(); i++) {
            save.push(str.pop()); // 1. str���� ���ڸ� �ϳ��� pop�Ͽ� save�� push
            if(save.peek() == target.charAt(0) && save.to_String().contains(target_reversed)) { 
				// 2. save�� target���ڿ��� �ִ��� Ȯ��(�������� Ȯ���ؾ���) -> Ȯ�� Ƚ�� ���̱� (���� ���� ù���ڰ� �������� ��)
                for(int j=0; j<target.length(); j++) save.pop(); // 3. ������ target ���� ���̸�ŭ save���� pop
            }    
        }
        sb = new StringBuilder(save.to_String());
        if(sb.toString().isEmpty()) System.out.println("FRULA");
        else System.out.println(sb.reverse());
    }

}
