class Tamilnadu extends SouthIndia
{
static String capital = "chennai";
public void speakLanguage()
{
System.out.println("speak tamil");
}
public void eat()
{
System.out.println("eats Rice");
}
public void dress()
{
System.out.println("wear saree and dhoti");
}
void cultivate()
{
System.out.println("Rice and Sugarcane cultivation");
}
void livingStyle()
{
System.out.println("Above Average Development");
}
public static void main (String [] args)
{
System.out.println(India.capital);
System.out.println(Tamilnadu.capital);
SouthIndia si = new Tamilnadu();
si.speakLanguage();
si.eat();
si.dress();
si.cultivate();
si.livingStyle();
}
}

