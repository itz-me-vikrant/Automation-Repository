package qsp;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowswer {

	public static void main(String[] args)  {
		// To launch Edge browser we need to create EdgeDriver()
		new EdgeDriver() ;
		System.out.println("Edge Browser is open.");
	}

}
