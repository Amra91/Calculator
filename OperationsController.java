package calculatorApp.view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class OperationsController {

	
	
	private double number1;
	private String operator;
	
	@FXML
	private TextField display;
	
	@FXML
	private void clickC (){
		display.clear();
	}
	
	@FXML
	private void clickOne (){
		String digit = display.getText();
		if (digit.equals("0")){
			display.setText("1");
		}
		else if (operator =="="){
			display.clear();
			display.setText("1");
		}
		else{
			display.setText(digit+"1");
		}
	}
	
	@FXML
	private void clickTwo (){
		String digit = display.getText();
		if (digit.equals("0")){
			
			display.setText("2");
		}
		else if (operator =="="){
			display.clear();
			display.setText("2");
		}
		else{
			display.setText(digit+"2");
		}
	}
	
	@FXML
	private void clickThree (){
		String digit = display.getText();
		if (digit.equals("0")){
			display.setText("3");
		}
		else if (operator =="="){
			display.clear();
			display.setText("3");
		}
		else{
			display.setText(digit+"3");
		}
	}

	@FXML
	private void clickFour (){
		String digit = display.getText();
		if (digit.equals("0")){
			display.setText("4");
		}
		else if (operator =="="){
			display.clear();
			display.setText("4");
		}
		else{
			display.setText(digit+"4");
		}
	}
	
	@FXML
	private void clickFive (){
		String digit = display.getText();
		if (digit.equals("0")){
			display.setText("5");
		}
		else if (operator =="="){
			display.clear();
			display.setText("5");
		}
		else{
			display.setText(digit+"5");
		}
	}
	
	@FXML
	private void clickSix (){
		String digit = display.getText();
		if (digit.equals("0")){
			display.setText("6");
		}
		else if (operator =="="){
			display.clear();
			display.setText("6");
		}
		else{
			display.setText(digit+"6");
		}
	}

	@FXML
	private void clickSeven (){
		String digit = display.getText();
		if (digit.equals("0")){
			display.setText("7");
		}
		else if (operator =="="){
			display.clear();
			display.setText("7");
		}
		else{
			display.setText(digit+"7");
		}
	}
	
	@FXML
	private void clickEight (){
		String digit = display.getText();
		if (digit.equals("0")){
			display.setText("8");
		}
		else if (operator =="="){
			display.clear();
			display.setText("8");
		}
		else{
			display.setText(digit+"8");
		}
	}

	@FXML
	private void clickNine (){
		String digit = display.getText();
		
		if (digit.equals("0")){
			display.setText("9");
		}
		else if (operator =="="){
			display.clear();
			display.setText("9");
		}
		else{
		display.setText(digit+"9");
		}
	}

	@FXML
	private void clickZero (){
		String digit = display.getText();
		if (operator =="="){
			display.setText("0");
		}
		
		else {
			display.setText(digit+"0");
		}
	}
	
	@FXML
	private void clickPoint (){
		String digit = display.getText();
		if (digit.isEmpty() ){
			display.setText("0.");
		}
		else if (operator =="="){
			display.clear();
			display.setText("0.");
		}
		else{
			display.setText(digit+".");
		}
	}
	
	
	@FXML
	private void equally (){
		String digit = display.getText();
		double currentNum =Double.parseDouble(digit);
		switch (operator){
			case "+":  display.setText((number1 +currentNum) +"");
				break;
			case "-":  display.setText((number1 -currentNum) +"");
				break;
			case "*":  display.setText((number1 *currentNum) +"");
				break;
			case "/":  display.setText((number1 /currentNum) +"");
			break;
		}
		number1 =0;	//ponistavanje zbog novog koristenja rezultat, postaje number 1
		operator ="="; 	//moze se sa rezultatom raditi bilo koja operacija,
						//ukoliko zelimo nastaviti ponovo racunati sa novim brojevima, rezultat se brise
						
	}
	
	@FXML
	private void subtract(){
		String digit = display.getText();
		//uslov ukoliko je unesen bilo koji broj prije nego sto se kliknulo na -,
		//i ukoliko je ovo prva kliknuta operacija
		if (!digit.isEmpty() && (number1 == 0)){
			number1 = Double.parseDouble(digit);
			display.clear();
			operator ="-";
			
		}
		//uslov ukoliko imamo vec jednu izvrsenu operaciju
		else if (number1 !=0) {
			double currentNum =Double.parseDouble(digit);
			number1-=currentNum;
			display.clear();
			operator="-";
		}
		
	}
	
	@FXML
	private void add (){
		
		String digit = display.getText();
		if (!digit.isEmpty() && (number1 == 0)){
			number1 = Double.parseDouble(digit);
			display.clear();
			operator="+";
		}
		else if (number1 !=0) {
			double currentNum =Double.parseDouble(digit);
			number1+=currentNum;
			display.clear();
			operator="+";
		}
		
	}
	
	@FXML
	private void multiply (){
		
		String digit = display.getText();
		if (!digit.isEmpty() && (number1 == 0)){
			number1 = Double.parseDouble(digit);
			display.clear();
			operator="*";
		}
		else if (number1 !=0) {
			double currentNum =Double.parseDouble(digit);
			number1*=currentNum;
			display.clear();
			operator="*";
		}
		
	}
	
	@FXML
	private void divide (){
		
		String digit = display.getText();
		if (!digit.isEmpty() && (number1 == 0)){
			number1 = Double.parseDouble(digit);
			display.clear();
			operator="/";
		}
		else if (number1 !=0) {
			double currentNum =Double.parseDouble(digit);
			number1/=currentNum;
			display.clear();
			operator="/";
		}
		
	}
	
	
}
