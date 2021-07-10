package com.service;

import org.springframework.context.annotation.Configuration;

import com.model.UserClaim;
@Configuration
public class TaxServiceImpl implements TaxService{

	@Override
	public double calculateTax(UserClaim userClaim) {
		// TODO Auto-generated method stub
		
		double cost=0;
		String expenseType=userClaim.getExpenseType();
		double expenseAmount=userClaim.getExpenseAmt();
		if(expenseType.equals("MedicalExpense"))
		{
			if(expenseAmount<=1000)
			{
				 cost=expenseAmount*0.15;
			}
			else if(expenseAmount>=1001&&expenseAmount<=10000)
			{
				 cost=expenseAmount*0.20;
			}
			else
			{
				 cost=expenseAmount*0.25;
			}
		}
		else if(expenseType.equals("TravelExpense"))
		{
			if(expenseAmount<=1000)
			{
				 cost=expenseAmount*0.10;
			}
			else if(expenseAmount>=1001&&expenseAmount<=10000)
			{
				 cost=expenseAmount*0.15;
			}
			else
			{
				 cost=expenseAmount*0.20;
			}
		}
		else if(expenseType.equals("FoodExpense"))
		{
			if(expenseAmount<=1000)
			{
				 cost=expenseAmount*0.05;
			}
			else if(expenseAmount>=1001&&expenseAmount<=10000)
			{
				 cost=expenseAmount*0.10;
			}
			else
			{
				 cost=expenseAmount*0.15;
			}
		}
		return cost;
	}

}
