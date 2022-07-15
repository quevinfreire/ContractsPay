package model.services;

public class PaypalService implements ContractPaymentService {
	
	public double paymentFee(double amount) {
		return amount *  0.02; 
		//quantia + taxa; 
	}
	
	public double interest(double amount, int months) {
		return amount * (0.01 * months);
		// quantia calculada + parcela;  
	}

}
