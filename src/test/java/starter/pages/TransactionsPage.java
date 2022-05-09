package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TransactionsPage extends PageObject {
    private By iconProduk() {
        return By.xpath("//*[@class=\"v-data-table-header\"]/tr/th[1]");
    }
    private By iconHarga() {
        return By.xpath("//*[@class=\"v-data-table-header\"]/tr/th[2]");
    }
    private By iconBanyaknya() {
        return By.xpath("//*[@class=\"v-data-table-header\"]/tr/th[3]");
    }
    private By iconSubHarga() {
        return By.xpath("//*[@class=\"v-data-table-header\"]/tr/th[4]");
    }
    private By iconSelanjutnya() {
        return By.xpath("//*[@class=\"v-data-footer\"]/div[4]");
    }
    private By iconKembali() {
        return By.xpath("//*[@class=\"v-data-footer\"]/div[3]");
    }
    @Step
    public void clickButtonProduk() {
        $(iconProduk()).click();
        $(iconProduk()).click();
    }
    @Step
    public void clickButtonHarga() {
        $(iconHarga()).click();
        $(iconHarga()).click();
    }
    @Step
    public void clickButtonBanyaknya() {
        $(iconBanyaknya()).click();
        $(iconBanyaknya()).click();
    }
    @Step
    public void clickButtonSubHarga() {
        $(iconSubHarga()).click();
        $(iconSubHarga()).click();
    }
    @Step
    public void clickButtonNext() {
        $(iconSelanjutnya()).click();
    }
    @Step
    public void clickButtonBack() {
        $(iconKembali()).click();
    }
}
