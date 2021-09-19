package loafer4vm;

import loafstyle.Havana;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class LoaferBuilder {
    private static int CORE = 1;

    LoaferBuilder(String core) {
        CORE=Integer.parseInt(core);
    }

    public static void build(){
        ExecutorService executorService = Executors.newFixedThreadPool(CORE);
        for(int i=0;i<CORE ;i++){
            executorService.execute(new Havana());
        }
        executorService.shutdown(); //useless
    }
}
