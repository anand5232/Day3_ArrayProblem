
public class Main {
    public static void main(String[] args) {



    }

    public static void printArrayElement() {

        int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Element of Array");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);

        }
    }


    public static void frequencyOfElement() {

        int[] array = new int[] {1,2,8,3,5,5,1,2};
        int[] freq = new int[array.length];
        int visited = -1;
        for(int i=0;i<array.length;i++){
            int count = 1;
            for (int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                    freq[j]=visited;
                }
            }
            if(freq[i]!=visited)
                freq[i]=count;
        }

        System.out.println("Element | Frequency");
        for (int i=0;i< freq.length;i++){
            if(freq[i]!=visited)
                System.out.println(" "+array[i]+" | " +freq[i]);
        }


    }




}