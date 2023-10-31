package CC1;

import org.apache.commons.collections.functors.InvokerTransformer;

public class InvokerTransformer_Test {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        InvokerTransformer invokerTransformer = new InvokerTransformer("exec",new Class[]{String.class},new Object[]{"calc"});
        invokerTransformer.transform(runtime);
    }
}
