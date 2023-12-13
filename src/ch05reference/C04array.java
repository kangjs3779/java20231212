package ch05reference;

public class C04array {
    public static void main(String[] args) {
        int[] c = {3,4,5};
        int[] d = c;

        System.out.println(c[1]); //4
        System.out.println(d[1]); //4

        c[2] = 55;

        System.out.println(c[2]); //55
        System.out.println(d[2]); //55
        //d[2]의 값이 55인 이유는 배열의 값을 저장하는 것이 아니라 배열의 값을 저장한 참조값을 저장하기 때문이다
        //원래의 값이 변했으니 d값도 변한 것이다


    }
}
