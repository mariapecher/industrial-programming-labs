package lecture1;

public class Exercise4 {
    void main()
    {
        int[] a = {100, 225, 35, 4, 50, 6};
        int[] b = {100, 4, 2, 6, 1};

        int[] result = new int[a.length];

        int count = 0;

        for (int i = 0; i < a.length; i++){
            boolean found = false;
            for (int j = 0; j < b.length; j++){
                if (a[i] == b[j]){
                    found = true;
                    break;
                }
            }
            if (!found){
                result[count] = a[i];
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
