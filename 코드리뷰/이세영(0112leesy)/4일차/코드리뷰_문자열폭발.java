/*
 *string의 contains 메소드는 문자열을 전체탐색하여 해당 문자열이 존재하는지 확인합니다. 만약 길이 N짜리 문자열에서 길이 M짜리 문자열을 찾는다면 O(NM)의 시간이 소요되는 메소드입니다.
 *따라서 지금 코드는 최악의 경우 O(N^2 * M) 의 시간복잡도를 가지게 되겠네요.
 *문자를 하나씩 스택에 넣어가면서 스택의 가장 최근 M개의 문자가 터트려야 하는 문자열과 동일하다면 스택에서 M개의 문자를 pop하는 과정을 진행한다면, 문자 하나를 넣을 때마다 O(M)의 검사만 해주면 되므로, 전체 시간복잡도 O(NM)에 문제를 해결할 수 있습니다.
                
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
            save.push(str.pop()); // 1. str에서 문자를 하나씩 pop하여 save에 push
            if(save.peek() == target.charAt(0) && save.to_String().contains(target_reversed)) { 
				// 2. save에 target문자열이 있는지 확인(역순으로 확인해야함) -> 확인 횟수 줄이기 (새로 들어온 첫글자가 같을때만 비교)
                for(int j=0; j<target.length(); j++) save.pop(); // 3. 있으면 target 문자 길이만큼 save에서 pop
            }    
        }
        sb = new StringBuilder(save.to_String());
        if(sb.toString().isEmpty()) System.out.println("FRULA");
        else System.out.println(sb.reverse());
    }

}
