package My;

public class Calculator {
	private int digit1;
	private int digit2;
	int[] mas;
	
	
	
	
	int getDigit1() {
		return digit1;
	}
	void  setDigit1 (int digit1) {
		this.digit1 = digit1;
	}
	int getDigit2() {
		return digit2;
	}
	void setDigit2(int digit2) {
		this.digit2 = digit2;
	}
	
	long getSum(){
		return digit1 + digit2;
		  
	}
	/*Integer addition() {
		return digit1+digit2;
	} 
	Integer subtraction() {
		return digit1-digit2;
	}
	int multiplication(){
		return digit1*digit2;	
	}
	Integer division() {
		if (digit2==0) return 0;
			else
		return digit1/digit2;
	} */
	int maxDigitOfArray (int[] mas) {
		 int max = 0;
			
			
			
			for (int i=0; i<mas.length;i++) {
			if (mas[i]>mas[max])
				max =  i;
			}
			return mas[max];
	
	}
	private String getOperation(String operation) {
		switch (operation) {
		case "+" :
			operation = "addition";
			break;
		case "-" :
			operation = "subtraction";
			break;
			default:
				operation = "unknown operation";
		}	
		return operation;
	}
	 int getSums(int input1, int input2, String operation) throws ComputerAccessException   {
		 	
		int result=0;
		switch (operation){
		case "+": 
			result = input1 + input2;
			break;
		case "-": 
			result = input1 - input2;
			break;
			default:
				//result = 0;
				
		}
		
		return result;
		
		}
				
	
	
	/*public String saveComputingResult (int input1, int input2, String operation) {
		String[][] array = new String [Eclip2][1];
		//array[0] = new String[1];
		//array[1] = new String[1];
		array [0][0] = getOperation(operation);
		array[1][0] = Integer.toString(getSums(input1,input2,operation));
		return array[0][0] + " " + array[1][0];
	}*/
	/*void storageArray() {
		
			array[0][0] = "addition";
			array[0][1] = "subtraction";
			array[0][Eclip2] = "multiplication";
			array[0][3] = "dimension";
			array[1][0] = addition().toString();
			array[1][1] = subtraction().toString();
			array[1][Eclip2] = Integer.toString(multiplication());
			array[1][3] = division().toString();
			for (int k=0;k<Eclip2;k++) {
				for (int j=0;j<4;j++) {
					System.out.print(array[k][j]+" ");
				}
				System.out.println();
			}
		
		
	}*/
	
	
	void printResult(int param) {
		System.out.println(param);
	}
	/*void printResult(long sum) {
		System.out.println(getSum());
	} */
	void printResult(double koren){
		System.out.println(sqrt(koren));
	}
	void printResult(float rad){
		System.out.println(sin(rad));
	}
	double sqrt(double sqr) {
                return Math.sqrt(sqr);
        } 
    double sin(double input2){
                return Math.sin(input2);
        } 
    
    
    
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setDigit1(7);
		calc.setDigit2(4);
		
		int random = 35;
		calc.printResult(random);
		
		long sum = calc.getSum();
		calc.printResult(sum);
		
		double sqrt = calc.getSum();
        calc.printResult(sqrt);
        
        double radian = 1.2;
        calc.printResult(radian);
		
        int[] mas = {3, 10, 6, 7, 9};
    	calc.maxDigitOfArray(mas);
    	//System.out.println(calc.saveComputingResult(7, 4, "+"));
    	
	}
}
