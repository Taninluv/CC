import java.lang.reflect.Method;

public class Calc_test {
//    Transformer;
public static void main(String[] args) throws Exception{
    Runtime runtime = Runtime.getRuntime();
    Class c = Runtime.class;
    Method method = c.getDeclaredMethod("exec", String.class);
    method.setAccessible(true);
    method.invoke(runtime, "calc");
}
}
