package com.NextBase.pages;

import com.NextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class NextBase_pages {


    public NextBase_pages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement username_box;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password_box;

    @FindBy(name = "USER_REMEMBER")
    public WebElement remember_check_box;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement login_button;

    @FindBy(xpath = "//div[@class='log-popup-footer']/a")
    public WebElement forgot_password;

    @FindBy(xpath = "//button[@class='login-btn']")
    public WebElement reset_password_button;

    @FindBy(xpath = "//div[@class='notetext']")
    public WebElement approve_text;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement errorMsg;

    @FindBy(xpath = "//div[@class='feed-add-post-text']")
    public WebElement msg_box;

    //span[@id='feed-add-post-form-link-more']


    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    public WebElement send_button;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancel_button;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement textBox_text;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement textBox_linkURL;


    @FindBy(id = "undefined")
    public WebElement textBox_Button_save;
    //div[@id='post-buttons-bottom']/span[@id='bx-b-uploadfile-blogPostForm']
    //div[@id='post-buttons-bottom']/span[@id='bx-b-mention-blogPostForm']
    //div[@id='post-buttons-bottom']/span[@id='bx-b-tag-input-blogPostForm']

    //div[@id='post-buttons-bottom']/span/span[@title='Link']
    //div[@id='post-buttons-bottom']/span/span[@title='Insert video']
    //div[@id='post-buttons-bottom']/span/span[@title='Quote text']

    //div[@id='post-buttons-bottom']/span[.='Record Video']

}
