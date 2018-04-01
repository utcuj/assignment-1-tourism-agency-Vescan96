package main;

import java.io.*;
import authentication_authorization.*;
import databaseConnection.DatabaseConnection;
import gui.*;

public class Main {

	public static void main(String[] args) throws IOException {
		DatabaseConnection connection = new DatabaseConnection();
		
		LoginFrame loginFrame = new LoginFrame();
		
		new UImanagement(connection, loginFrame);

	}

}
