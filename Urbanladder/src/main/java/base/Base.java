package base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
public void setup()
{
	WebDriverManager.chromedriver().setup();
}
}
