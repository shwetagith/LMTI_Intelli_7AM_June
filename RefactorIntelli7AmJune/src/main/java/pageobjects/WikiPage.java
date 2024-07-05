package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WikiPage {

    WebDriver driver;

    public WikiPage(WebDriver driver) {

        this.driver = driver;
    }

    public List<String> getShareHolderValue(){

      int size=  driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();

        List<String> l = new ArrayList<String>();
        for(int i =0 ; i < size ; i++ ){
           String val= driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(i).getText();
            l.add(val);
        }
        System.out.println(l);
        return l;
    }

    public List<String> getShareHoldingValue(){

        int size=  driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).size();
        List<String> dropValues = new ArrayList<>();
        for(int i =0 ; i < size ; i++ ){

            dropValues.add( driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).get(i).getText());
        }
        System.out.println(dropValues);
        return dropValues;
    }


}
