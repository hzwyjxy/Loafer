package loafer4vm;

public class StartLoafer {
    public static void main(String[] args) {
        System.out.println("Start loaf now.");
        System.out.println("Loading...");
        String mode = System.getProperty("mode");
        String core=System.getProperty("core");
        String memory=System.getProperty("memory"); //useful
        String storage=System.getProperty("storage");
        String network=System.getProperty("network");
        String gpu=null; //gpu should be used to play games!!!!!

        System.out.println("core: "+core);
        LoaferBuilder loaferBuilder =new LoaferBuilder(core);
        loaferBuilder.build();

    }
}
