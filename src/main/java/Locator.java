import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locator extends drivers
{
@FindBy(id="email")
private WebElement username;
@FindBy(id="pass")
private WebElement password;
@FindBy(id="u_0_b")
private WebElement login;

public WebElement getUsername() {
	return username;
}



public WebElement getPassword() {
	return password;
}

public WebElement getLogin() 
{
	return login;
}
public void setUsername(String username) {
	this.username.sendKeys(username); 
}

public void setPassword(String password) {
	this.password.sendKeys(password);
}


public void setLogin(WebElement login) {
	this.login = login;
}

public  Locator()
{
PageFactory.initElements(drivers,this);
}
}

