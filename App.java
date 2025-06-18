import CacheImplement.CacheType;
import Interfaces.CacheFactory;
import Interfaces.ICache;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            ICache cache = CacheFactory.createCacheInstance(CacheType.FIFO);
            cache.put("Aidana", 26);
            System.out.println("age of Aidana " + cache.get("Aidana"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
