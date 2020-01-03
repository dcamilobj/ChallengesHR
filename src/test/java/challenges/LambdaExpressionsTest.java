package challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class LambdaExpressionsTest {

    MyMath ob = new MyMath();
    PerformOperation op;


    @Test
    public void isOdd(){
        op = ob.isOdd();
        assertEquals(true,op.check(9));
    }

    @Test
    public void isEven(){
        op = ob.isOdd();
        assertEquals(false,op.check(8));
    }

    @Test
    public void isPrime(){
        op = ob.isPrime();
        assertEquals(true,op.check(5));
    }

    @Test
    public void isNotPrime(){
        op = ob.isPrime();
        assertEquals(false,op.check(1));
    }




    @Test
    public void isPalindrome(){
        op = ob.isPalindrome();
        assertEquals(true,op.check(989));
    }


    @Test
    public void isNotPalindrome(){
        op = ob.isPalindrome();
        assertEquals(false,op.check(907));
    }

}