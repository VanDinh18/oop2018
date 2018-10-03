package week3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
        @Test
        void testMax() {
            Week3 w = new Week3();
            int a = w.max(4,3);
            int b = w.max(5,2);
            int c = w.max(4,7);
            int d = w.max(2,6);
            int e = w.max(1,0);
            assertEquals(4,a);
            assertEquals(5,b);
            assertEquals(7,c);
            assertEquals(6,d);
            assertEquals(1,e);

        }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
        @Test
        void testMinOfArray() {
            Week3 w = new Week3();
            int[] a = {2,3,6,4,1};
            int[] b = {0,4,3,7,9,5,6,2,8};
            int[] c = {5,3,6,2};
            int[] d = {1};
            int[] e = {2,0};

            int m = w.minOfArray(a);
            int n = w.minOfArray(b);
            int o = w.minOfArray(c);
            int p = w.minOfArray(d);
            int q = w.minOfArray(e);

            assertEquals(1,m);
            assertEquals(0,n);
            assertEquals(2,o);
            assertEquals(1,p);
            assertEquals(0,q);
        }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
        @Test
        void testCalculateBMI() {
            Week3 w = new Week3();
            String m = w.calculateBMI(65,1.74);
            String n = w.calculateBMI(60,1.72);
            String o = w.calculateBMI(40,1.8);
            String p = w.calculateBMI(80,1.65);
            String q = w.calculateBMI(70,1.7);
            assertEquals("Bình thường",m);
            assertEquals("Bình thường",n);
            assertEquals("Thiếu cân",o);
            assertEquals("Béo phì",p);
            assertEquals("Thừa cân",q);
        }


}