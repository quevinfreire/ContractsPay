package model.services;

public interface ContractPaymentService {
	
	double paymentFee(double amount);
	
	double interest(double amount, int months);

}
