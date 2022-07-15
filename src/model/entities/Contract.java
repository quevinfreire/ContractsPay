package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private Integer contractNumber; 
	private Date dateContract;
	private Double totalValue;
	
	private List <Installment> installments = new ArrayList<>(); 
	
	public Contract(Integer contractNumber, Date dateContract, Double totalValue) {
		this.contractNumber = contractNumber;
		this.dateContract = dateContract;
		this.totalValue = totalValue;
	}

	public Integer getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(Integer contractNumber) {
		this.contractNumber = contractNumber;
	}

	public Date getDateContract() {
		return dateContract;
	}

	public void setDateContract(Date dateContract) {
		this.dateContract = dateContract;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public void addInstallments(Installment installment) {
		installments.add(installment);
	}
	
	public void removeInstallments(Installment installment) {
		installments.remove(installment);
	}

}
