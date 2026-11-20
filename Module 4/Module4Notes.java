public class Module4Notes {

public static void main(String[] args) throws Exception {
    
    int[] firstArray = {1,2,3,4,5};
    int[] secondArray = new int[5];
    secondArray[0] = 11;
    secondArray[1] = 12;
    secondArray[2] = 13;
    secondArray[3] = 14;
    secondArray[4] = 15;

    for(int i = 0;i < firstArray.length; i++) {
        System.out.println(firstArray[i]);
        }
    
    int sum = 0;
    for(int i = 0; i < secondArray.length; i++){
            sum += secondArray[i]; }
        System.out.println(sum);

    for(int i = 0; i < secondArray.length; i++) {
        if(secondArray[i] == 11) { 
            System.out.println(i);
            break;
        }
    }


    int[] thirdArray = new int[firstArray.length * 2];
    for(int i = 0; i < firstArray.length; i++) { 
            thirdArray[i] = firstArray[i];
    }

    for(int i = firstArray.length; i < thirdArray.length; i++) { 
        thirdArray[i] = (int)(Math.random() * 10);
    }
    //enhanced for loops
    int[] scores = {80,92,91,68,88};
    for(int score : scores) {
        System.out.println(score); }
    
    }

    String[] words = {"hi", "the", "no"}; {
    for(String x: words){
        System.out.println(words);
        //do NOT write words[x]; 
    }
    }




}



