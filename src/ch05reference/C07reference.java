package ch05reference;

public class C07reference {
    public static void main(String[] args) {
        String a = "java";
        String b = "spring";
        String c = a;

        // a와 b는 다른 객체, a와 c는 같은 객체

        int code1 = System.identityHashCode(a);
        int code2 = System.identityHashCode(b);
        int code3 = System.identityHashCode(c);

        System.out.println(code1);
        System.out.println(code2);
        System.out.println(code3);
        // 참조값으로 확인 가능함


    }
}
