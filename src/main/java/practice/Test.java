package practice;

import io.micrometer.core.instrument.binder.kafka.KafkaClientMetrics;

public class Test {

    public static void main(String[] args) {


        String str = "Hello";
        String str1 = str + "World";

        System.out.println("Hash Code 0 "+str.hashCode());

        System.out.println("Hash Code 1 "+str1.hashCode());

        String str2 = "Helloworld";
        System.out.println("Hash Code 2 "+str2.hashCode());

        String str3 = str2.intern();
        System.out.println("Hash Code 3 "+str3.hashCode());

        if(str1.equals(str3))
            System.out.println("Equal");
        else
            System.out.println("Not equal");





    }
}