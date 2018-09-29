package modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ModeloLogin {
	private File file;
	private String dir;
	private ArrayList<String> data = new ArrayList<String>();
	private String [] temp = new String[3];
	private FileWriter newFile;
	
	public ModeloLogin(String temp) {
		this.dir = temp;
		try {
			readUsers();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public ArrayList<String> getData() {
		return data;
	}

	private void readUsers() throws FileNotFoundException {
		String line = new String();
	    file = new File(dir);
	    Scanner src = new Scanner(file);
	    line = src.nextLine();
	    while (src.hasNextLine()) {
	        temp = line.split("::");
	        data.add(temp[0]);
	        data.add(temp[1]);
	        data.add(temp[2]);
	        line = src.nextLine();
	        }
	    src.close();
	}
	
	public boolean isInDB(String temp) {
		Boolean isValid = false;

		for(int x = 0; x < data.size(); x+=3) {
			if (temp.equals(data.get(x))){
				isValid = true;
			}
    	}
		return isValid;
	}
	
	public String getUserPass(String temp) {
		String pass = null;
		int i = 0;

		while(pass == null) {
			if(temp.equals(data.get(i)))
				pass=data.get(i+1);
			i+=3;
    	}
		return pass; 
	}
	
	public String getUserPerm(String temp) {
		String perm = null;
		int i = 0;
		
		while(perm == null) {
			if(temp.equals(data.get(i)))
				perm=data.get(i+2);
			i+=3;
    	}
		return perm; 
	}
	
	public boolean updatePass(String user, String pass) {
		String temp = null;
		Boolean isCorrect = true;
		try {
			newFile = new FileWriter(dir);
		} catch (IOException e1) {
			isCorrect = false;
			e1.printStackTrace();
		}
		
		for (int x = 0; x < data.size(); x+=3) {
			if(data.get(x).equals(user))
				data.set(x+1, pass);
			
			temp = data.get(x) + "::" + data.get(x+1) + "::" + data.get(x+2) + System.getProperty("line.separator");	
			try {
				newFile.write(temp);
			} catch (IOException e1) {
				e1.printStackTrace();
				isCorrect = false;
			}	
		}
		
		try {
			newFile.write("::ENDOFFILE::");
		} catch (IOException e1) {
			e1.printStackTrace();
			isCorrect = false;
		}
		try {
			newFile.close();
		} catch (IOException e1) {
			e1.printStackTrace();
			isCorrect = false;
		}
		
		return isCorrect;
	}
	
	public boolean updateDB(String user, String pass) {
		String temp = null;
		Boolean isCorrect = true;
		try {
			newFile = new FileWriter(dir);
		} catch (IOException e1) {
			isCorrect = false;
			e1.printStackTrace();
		}
		
		data.add(user);
		data.add(pass);
		data.add("2");
		
		for (int x = 0; x < data.size(); x+=3) {
			temp = data.get(x) + "::" + data.get(x+1) + "::" + data.get(x+2) + System.getProperty("line.separator");
			try {
				newFile.write(temp);
			} catch (IOException e1) {
				e1.printStackTrace();
				isCorrect = false;
			}	
		}
		
		try {
			newFile.write("::ENDOFFILE::");
		} catch (IOException e1) {
			e1.printStackTrace();
			isCorrect = false;
		}
		try {
			newFile.close();
		} catch (IOException e1) {
			e1.printStackTrace();
			isCorrect = false;
		}
		
		return isCorrect;
	}
}
