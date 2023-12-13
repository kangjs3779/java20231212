package ch05reference;

public class C05array {
    public static void main(String[] args) {
        int[] a = {3,4,5};
        int[] b = a;

        System.out.println(b[2]); //5

        a[2] = 7;

        System.out.println(b[2]); //7

        int[] c = {10, 20, 30};
        int[] d = {10, 20, 30};

        // c와 d가 같다고 할 수 있는가?
        // 같은 값을 저장하는 것 같지만 다른 참조값을 저장한 것이다
        System.out.println(d[2]); //30

        c[2] = 90;

        System.out.println(c[2]); //90
        System.out.println(d[2]); //30

    }
}
