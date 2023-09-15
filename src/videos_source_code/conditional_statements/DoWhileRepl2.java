package videos_source_code.conditional_statements;

public class DoWhileRepl2 {
    public static void main(String[] args) {
        int Counter = 0;
        do {
            if (Counter % 5 == 4){
                System.out.println("Counter = "+ Counter);
            }
            Counter ++;
        } while (Counter <= 100);
    }
}

