package java_complete_reference.controle_statements;

class ForEach {
    public static void main (String ... arg){
        int[] num = {1,2,3,4,5,12,34,4,45,45,45};
        int sum = 0 , index;

        //Traditional style of iterating of values of an array
        for (int i = 0; i < num.length; i++){
            sum += num[i];
            System.out.print(i +" : "+num[i]+"\t\t");
        }

        System.out.println("\n"+sum+" is some of all elements");

        sum = index =  0;//this will assign 0 to both vars
        // for each style of iterating values of an array
        for (int i : num){
            System.out.print(index+" : "+i+"\t\t");
            index++;

            sum += i;
        }
        System.out.println("\nSum of all elements is "+sum);

        // stop loop with out examined all elements of Array
        sum = 0;
        for (int i : num){
            System.out.print(index+" : "+i+"\t\t");
            index++;
            if (i == num.length/2) break;

            sum += i;
        }
        System.out.print("\nsum is "+sum);
    }
}
