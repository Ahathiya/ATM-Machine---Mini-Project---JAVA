import java.io.IOException;
public class ATM 
{

	public static void main(String[] args) throws IOException 
	{
		OptionMenu optionMenu = new OptionMenu();
		introduction();
		optionMenu.mainMenu();
	}

	public static void introduction() 
	{
		System.out.println("\n\n-------------------------------------------\n      Welcome to the ATM Project !!!! \n-------------------------------------------");
	}
}
