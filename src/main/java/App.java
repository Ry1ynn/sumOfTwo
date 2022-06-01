public class App {
    public static void main(String[] args) {
        int[] num = {3,6,0,5,10};
        System.out.println(sumNum(num));
    }
    public static boolean sumNum(int... a) {
        int[] check = new int[a.length];
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a.length; j++) {
                if (a[i] == a[j]) {
                    continue;
                }
                for (int k=0; k<a.length; k++) {
                    if (a[i] == a[k] || a[j] == a[k]) {
                        continue;
                    }
                    if (a[i] == a[j] + a[k]) {
                        check[0] = a[i];
                    }
                }
            }
        }
        if (check[0] != 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
