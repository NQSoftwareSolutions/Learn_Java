package java_complete_reference.controle_statements;

public class LoopVariations {
    public static void main (String ... arg){
        // This program used to practice some variations in for loop

        // Test Boolean value not initialized value or iterating value
        boolean done = false;
        int i;

        for (i = 1 ; !done ; i++){
            // we are stopping this loop by if statement
            System.out.print(i+"\t\t");
            if (i == 10) done = true;// done will false when checked by loop
        }
        System.out.println();

        // Initialization and Iteration statement are absent
        done = false;
        i = 1;
        for ( ; !done; ){
            System.out.print(i+"\t\t");
            if (i == 10) done = true;
            i++;
        }

        System.out.println();
        // creating a infinite loop
        i = 1;
        for ( ; ;){
            // we are creating condition for stopping this loop
            System.out.print(i+"\t\t");
            if (i == 10) break;
            i++;
        }
    }
}
