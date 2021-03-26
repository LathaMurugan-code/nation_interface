abstract class India
{
static String capital = "New_Delhi";
String primeMinister;
public India(String primeMinister)
{
	this.primeMinister = primeMinister;
System.out.println("our Prime Minister is" + this.primeMinister);
}

public abstract void speakLanguage();
public abstract void eat();
public abstract void dress();

}