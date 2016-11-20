package ArrayDataStructure;

/**
 * Created by NavyaKaree on 11/18/16.
 */
public class ArrayDemo {
    public static void main(String[] args){
        int[] num = {3,5,6,77,8,9};
        int i;
        System.out.println("Before insertion");
        for(i=0;i<num.length-1;i++){
            System.out.println(num[i]);
        }
        num = insert(3,99, num);
        System.out.println();
        System.out.println("After insertion");
        for(i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

        num = delete(3, num);
        System.out.println();
        System.out.println("After deletion");
        for(i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
        int j= search(44,num);
        System.out.println();
        System.out.println("The element found at"+ i);
        num = update(3,44,num);
        System.out.println();
        System.out.println("After updating value");
        for(i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }

    private static int[] update(int key, int value, int[] num) {
        num[key]=value;
        return num;
    }

    private static int search(int value, int[] num) {
       int i=0;
        while(i<num.length-1){
            if(num[i]==value){
                break;
            }
            i++;
        }
        return i;
    }

    private static int[] delete(int key, int[] num) {
        int[] newnum= new int[num.length-1];
        for(int i=0;i<key;i++){
            newnum[i]=num[i];
        }
        int j=key;
        while(j<num.length-1){
            newnum[j]=num[j+1];
            j++;
        }

        return newnum;
    }

    private static int[] insert(int key, int value, int[] num) {
        int[] newnum= new int[num.length+1];
        for(int i=0;i<num.length;i++){
            newnum[i]=num[i];
        }
        int j=num.length-1;
        while(j>=key){
            newnum[j+1]=newnum[j];
            j--;
        }
        newnum[key]=value;
        return newnum;
    }
}
