package AmgharPages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArticlesPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(ArticlesPage.class);

    @FindBy(xpath = "//*[@id=\"form1\"]/section/div/h1")
    private WebElement getArticleText;

    @FindBy(css = "#GetMoreArticles")
    private WebElement MoreArticlesBtn;


    public ArticlesPage(WebDriver driver){
        PageFactory.initElements(driver, this);}


    public String getArticleText(){
        return getElementText(getArticleText);
    }

    public void clickMoreArticlesBtn(){
        click(MoreArticlesBtn);
    }

}
