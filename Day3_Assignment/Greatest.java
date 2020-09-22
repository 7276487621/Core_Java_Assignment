public class Greatest {
 
        public static void main(String[] args) {
                int numbers[] = new int[]{20,30,85,58,19,45,97,44,5,43};
                int smallest = numbers[0];
                int biggest = numbers[0];
               
                for(int i=1; i< numbers.length; i++)
                {
                        if(numbers[i] > biggest)
                                biggest = numbers[i];
                        else if (numbers[i] < smallest)
                                smallest = numbers[i];
                       
                }
               
                System.out.println("Largest Number is : " + biggest);
                System.out.println("Smallest Number is : " + smallest);
        }
}