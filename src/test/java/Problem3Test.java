import org.junit.Test;

public class Problem3Test {
    @Test
    public void testApa(){
        Problem3.checker("-");
        Problem3.checker("0");
        Problem3.checker("62");
        Problem3.checker("(null)");
        Problem3.checker("+6281");
        Problem3.checker("6281");
        Problem3.checker("0811");
        Problem3.checker("+1 (804) 244-3470");
        Problem3.checker("*0832");
        Problem3.checker("+1408-888");
        Problem3.checker("+1 917");
        Problem3.checker("?+628?");
        Problem3.checker("626.333");
        Problem3.checker("+852-927");
        Problem3.checker("+62-0813");
        Problem3.checker("08111 / 08787");
        Problem3.checker("(021) 573");
    }
}
