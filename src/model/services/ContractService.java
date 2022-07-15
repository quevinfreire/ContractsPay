package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private ContractPaymentService contractPay;

	public ContractService( ContractPaymentService contractPay) {
		this.contractPay = contractPay;
	}
	
	public void processContract(Contract contract, Integer months) {
		double amountI = contract.getTotalValue() / months;
		for (int i = 1; i <= months ; i++) {
			Date date = (Date) contract.getDateContract();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.MONTH, i);
			Date dueDate = (Date) calendar.getTime();
			double taxFee = amountI + contractPay.paymentFee(amountI);
			double totalTax = taxFee + contractPay.interest(taxFee, i);	
			contract.addInstallments(new Installment(dueDate, totalTax));
		} 
	}
}
