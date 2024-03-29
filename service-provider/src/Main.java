import edu.jiangxuan.up.spi.LoggerService;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        LoggerService loggerService = LoggerService.getService();
        loggerService.info("你好");
        loggerService.debug("测试Java SPI 机制");
    }
}