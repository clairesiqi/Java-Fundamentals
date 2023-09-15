package videos_source_code.conditional_statements;

public class DoWhileRepl {
    public static void main(String[] args) {
        int Counter = 0;
        while (Counter <= 100){
            if (Counter % 3 == 2){
                System.out.println("Counter = "+ Counter);
            }
            Counter++;
        }
    }
}


