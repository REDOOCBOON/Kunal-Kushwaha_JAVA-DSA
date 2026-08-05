package searching;

public class trendence_chutiya_question {
    public static void main(String[] args) {
        int[] arr = {4,8,7,10,1,2};
        System.out.println(spell(6,3,arr));


    }
    public static void spell(int N, int K, int[] arr){
        int sum=0;
        int prevMax = 0;
        int tempMax = 0;
        int tempIndex =0;
        while(K>0){
            for(int i=0;i<N;i++){
                if(tempMax < arr[i] && arr[i] != prevMax){
                    tempMax = arr[i];
                    tempIndex = i;
                }
                prevMax = tempMax;
                arr[tempIndex] = 2*tempMax;

            }
            for(int j=0;j<N;j++){
                sum= sum + arr[i];
            }
        }
        return sum;
}
