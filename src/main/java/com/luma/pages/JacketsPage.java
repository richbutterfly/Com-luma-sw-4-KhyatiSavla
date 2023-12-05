package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class JacketsPage extends Utility {

    By sortByFilter = By.xpath("(//select[@id='sorter'])[1]");

    public void sortByFilter(String filter){
        selectByVisibleTextFromDropDown(sortByFilter,filter);
    }
}
