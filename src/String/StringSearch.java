package String;

public class StringSearch {
    public static void main(String[] args) {
        String[] str = {"abd", "dfd", "dfds", "dfd"};

//        for (int i = 0; i < str.length; i++) {
//            if (str[i] == "abd"){
//                System.out.println("present");
//                return;
//            }
//        }

        char[] array = {'a', 'b', 'c', 'd', 'e'};
//        char ch = 'a';
//        System.out.println(ch);
//        int num = (int) ch;
//        System.out.println(num);
        System.out.println(search(array, 'e'));
    }

    public static boolean search(char[] arr, char t) {
        if (arr.length == 0) {
            return false;
        }

        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            int m = (int) arr[mid];
            if (arr[mid] == t) {
                return true;
            }
            if ((int) t > m) {
                s = mid+1;
            } else {
                e = mid-1;
            }
        }
        return false;
    }
}
