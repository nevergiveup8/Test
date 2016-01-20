package My;


import java.io.*;












 class Computer implements Serializable {

	
	private String montrComp;  
	private String sysUnit; 
	private String mousComp;
	private String keybrdComp; 
	private boolean conditionOfComputer = false;
	private OperationSystem operSystem;
	
	
	public Computer(){	
		}
	
	Computer(String monitor, String systemUnit, String mous, String keyboard ) {
		this.montrComp = monitor;
		this.sysUnit = systemUnit;
		this.mousComp = mous;
		this.keybrdComp = keyboard;
		}
	
	public String getMontrComp (){
		return montrComp;
		}
	public void setMontrComp(String newMontrComp) {
		montrComp = newMontrComp;
		}
	public String getSysUnit () {
		return sysUnit;
		}
	public void setSysUnit (String newSysUnit) {
		sysUnit = newSysUnit;
		}
	public String getMousComp () {
		return mousComp;
		}
	public void setMousComp (String newMousComp) {
		mousComp = newMousComp;
		}
	public String getKeybrdComp () {
		return keybrdComp;
		}
	public void setKeybrdComp (String newKeybrdComp) {
		keybrdComp = newKeybrdComp;
		}
	
	protected void switchOn(){
		conditionOfComputer = true;
		System.out.println("I'm turned on");
		}
	protected void switchOff () {
		conditionOfComputer = false;
		System.out.println("I'm turned off");
		}
	
	public void setOperSystem (OperationSystem operSystem) throws ComputerAccessException{
		if (conditionOfComputer==false) {
	 		throw new ComputerAccessException("It can be used for a more detailed description of the exception ");
	 	} else {
		this.operSystem = operSystem;
		}
	}
	public OperationSystem getOperSystem () throws ComputerAccessException{
		if (conditionOfComputer==false) {
	 		throw new ComputerAccessException("It can be used for a more detailed description of the exception ");
	 	} else {
		return operSystem;
		}
	}
	public String toString(){
		return  montrComp + " " + sysUnit + " " + mousComp + " " + keybrdComp;
		}	
	}
 
	 class OperationSystem  {
		 boolean conditionOperationSystem  = false;
		 private Calculator calculator;
		private FileManager fileManager;
			
		protected void runOperationSystem (){ 
			conditionOperationSystem = true;
			System.out.println("The operating system was launched");
		 	}
		
		public Calculator getCalculator() {
			return calculator;
		}
		public void setCalculator(Calculator calculator) {
			
			this.calculator = calculator;
		 	
		}
		public FileManager getFileManager() {
			return fileManager;
		}
		public void setFileManager(FileManager fileManager) {
			this.fileManager = fileManager;
		}
	 }
	 class ComputerAccessException extends IOException {
	    
			ComputerAccessException() {
			
			}
	    	ComputerAccessException(String s){
	    	super(s);
	    	}
	    }
	
public class TestComputer {
public static void main (String [] args)  {
	
	Computer mycomp = new Computer("lgFlatron", "asus", "asusMouse", "keyboard");
	OperationSystem operSystem = new OperationSystem();
	Calculator calculator = new Calculator();
	FileManager fileMan = new FileManager();
	//mycomp.switchOff();
	try {
	operSystem.setCalculator(calculator);
	operSystem.setFileManager(fileMan);
	mycomp.setOperSystem(operSystem);	
	int sum = mycomp.getOperSystem().getCalculator().getSums(3, 4, "+");
	mycomp.getOperSystem().getCalculator().printResult(sum);
		} 
	catch (ComputerAccessException e ){
			System.out.println(e );
	}
	try {
		BufferedReader readIO = new BufferedReader(new FileReader("res//second.txt"));
		String reader;
		while ((reader= readIO.readLine())!=null) {
			System.out.print(reader);
	}

		} 
	catch(IOException e) {
			e.printStackTrace();
	}
	}
}