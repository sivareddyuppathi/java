package com.nacre.oops;

import java.util.Date;

class policy {
	int policyId; 
	String policyName; 
	Date startingPolicyDate; 
	Date MaturityDate; 
	Double monthlyPayment; 
	Agent agent;
	
	/*		public policy(int policyId, String policyName, Date startingPolicyDate, Date maturityDate, Double monthlyPayment,
		Agent agent) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.startingPolicyDate = startingPolicyDate;
		MaturityDate = maturityDate;
		this.monthlyPayment = monthlyPayment;
		this.agent = agent;
		
	}*/
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public Date getStartingPolicyDate() {
		return startingPolicyDate;
	}
	public void setStartingPolicyDate(Date startingPolicyDate) {
		this.startingPolicyDate = startingPolicyDate;
	}
	public Date getMaturityDate() {
		return MaturityDate;
	}
	public void setMaturityDate(Date maturityDate) {
		MaturityDate = maturityDate;
	}
	public Double getMonthlyPayment() {
		return monthlyPayment;
	}
	public void setMonthlyPayment(Double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		
		this.agent=agent;
		
		/*Agent a = new Agent();
		agent=new Agent("Sivashenker",420,a.getInsurance());*/
	}
	
}

class Agent {
	String agentName; 
	int agentId; 
	Insurance insurance;
	/*public Agent()
	{
		
	}
	public Agent(String agentName, int agentId, Insurance insurance) {
		super();
		this.agentName = agentName;
		this.agentId = agentId;
		this.insurance = insurance;
	}*/
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public Insurance getInsurance() {
		return insurance;
	}
	public void setInsurance(Insurance insurance) {
		this.insurance=insurance;
	}
	
}
class Insurance{
	String insuranceCompanyName; 
	String regdNo; 
	Double netWorth; 
	String headAQuarterAddress; 
	String CEO;
	/*
	public Insurance(String insuranceCompanyName, String regdNo, Double netWorth, String headAQuarterAddress,
			String cEO) {
		super();
		this.insuranceCompanyName = insuranceCompanyName;
		this.regdNo = regdNo;
		this.netWorth = netWorth;
		this.headAQuarterAddress = headAQuarterAddress;
		CEO = cEO;
	}*/
	public String getInsuranceCompanyName() {
		return insuranceCompanyName;
	}
	public void setInsuranceCompanyName(String insuranceCompanyName) {
		this.insuranceCompanyName = insuranceCompanyName;
	}
	public String getRegdNo() {
		return regdNo;
	}
	public void setRegdNo(String regdNo) {
		this.regdNo = regdNo;
	}
	public Double getNetWorth() {
		return netWorth;
	}
	public void setNetWorth(Double netWorth) {
		this.netWorth = netWorth;
	}
	public String getHeadAQuarterAddress() {
		return headAQuarterAddress;
	}
	public void setHeadAQuarterAddress(String headAQuarterAddress) {
		this.headAQuarterAddress = headAQuarterAddress;
	}
	public String getCEO() {
		return CEO;
	}
	public void setCEO(String cEO) {
		CEO = cEO;
	} 
	
	
}
class Customer{
	int customerId; 
	String customerName; 
	String mobileNumber; 
	String address; 
	policy policy;
	/*public Customer(int customerId, String customerName, String mobileNumber, String address,
			com.nacre.oops.policy policy) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.policy = policy;
	}*/
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public policy getPolicy() {
		return policy;
	}
	public void setPolicy(policy policy) {
		this.policy = policy;
	}
	
}
public class CompositionTest {

	public static void main(String[] args) {
			
		Customer customer=new Customer();		
		customer.setCustomerId(101);
		customer.setCustomerName("Siva");
		customer.setMobileNumber("9876543212");
		customer.setAddress("hyd");
		System.out.println(customer.getCustomerId());
	
		policy policy1=new policy();
		customer.setPolicy(policy1);
		policy1.setPolicyId(123);
		policy1.setPolicyName("abinandan");
		policy1.getStartingPolicyDate();
		policy1.getMaturityDate();
		policy1.setMonthlyPayment(500.0);
		
		Agent agent=new Agent();
		policy1.setAgent(agent);
		agent.setAgentName("sivashenker");
		agent.setAgentId(1221);
		
		Insurance insurance=new Insurance();
		agent.setInsurance(insurance);
		insurance.setInsuranceCompanyName("lic");
		insurance.setHeadAQuarterAddress("new Delhi");
		insurance.setCEO("sivareddy");
		insurance.setNetWorth(1000.0);
		
	}

}
