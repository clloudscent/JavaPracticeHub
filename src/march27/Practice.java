package march27;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        /*NaverCrawler nc = new NaverCrawler();
        nc.scrap();

        DaumCrawler dc = new DaumCrawler();
        dc.scrap();

        BlueRibonCrawler brc = new BlueRibonCrawler();
        brc.scrap();

        Crawler crawler = new NaverCrawler();
        crawler.scrap();
        crawler = new DaumCrawler();


        List<Crawler> crawlerList = new ArrayList<>();
        crawlerList.add(new NaverCrawler());
        crawlerList.add(new DaumCrawler());*/




    }

    interface Crawler{
        void scrap();
    }
}
