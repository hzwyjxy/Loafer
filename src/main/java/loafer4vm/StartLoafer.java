package loafer4vm;

public class StartLoafer {
    public static void main(String[] args) {
        String mode = System.getProperty("mode");
        String core=System.getProperty("core");
        String memory=System.getProperty("memory"); //useless,because we change the Xmx first
        String storage=System.getProperty("storage");
        String network=System.getProperty("network");
        String gpu=null; //gpu should be used to play games!!!!!

        LoaferBuilder loaferBuilder =new LoaferBuilder("8");
        loaferBuilder.build();

    }
}
