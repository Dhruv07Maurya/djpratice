public class practice{
    public static void main(String args[]){
        int count=0,n=100;
        for (int i = 1; i<n; i++){
            if (i%2 != 0){
                count++;
            }
        }   
        System.out.println(count);
    }
}