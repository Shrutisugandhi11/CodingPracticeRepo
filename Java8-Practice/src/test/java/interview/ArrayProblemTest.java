package interview;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayProblemTest {
    ArrayProblem arrayProblem;
    @BeforeEach
    public void setUp(){
        this.arrayProblem=new ArrayProblem();
    }
    @Test
    public void Test1(){
        Assertions.assertEquals(9,ArrayProblem.mergeArrays().length);
    }
}
