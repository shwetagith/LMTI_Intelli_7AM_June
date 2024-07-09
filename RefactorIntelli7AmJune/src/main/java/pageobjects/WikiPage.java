package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List<String> dropValues = new ArrayList<String>();
        for(int i =0 ; i < size ; i++ ){

            dropValues.add( driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).get(i).getText());
        }
        System.out.println(dropValues);
        return dropValues;
    }

    public Map<String, String> getShareHoldingHolderValue(){

        int size=  driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();

        Map<String, String> m = new HashMap<String,String>();

        for(int i=0; i <size ; i++){

           String shareHolderValue= driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(i).getText();
           String shareHoldingValue= driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).get(i).getText();
            m.put(shareHolderValue,shareHoldingValue);
        }
        System.out.println(m);

        return m;
    }

    public void getColumn2Values(){

     int size=   driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::tr/child::td")).size();
       for (int i=2 ; i < size; i++){
          String va= driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::tr/child::td")).get(i).getText();
           if(va.equals("Switzerland")){
               driver.findElements(By.xpath("//table[@class='infobox vcard']/descendant::tr/child::td")).get(i).click();
                break;
           }
       }
    }


}
