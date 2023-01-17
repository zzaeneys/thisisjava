package ch06.verify.num18;

import ch06.sec15.Singleton;

public class ShopService {
    private static ShopService singleton = new ShopService();

    private ShopService() {}

    public static ShopService getInstance() {
        return singleton;
    }
}
