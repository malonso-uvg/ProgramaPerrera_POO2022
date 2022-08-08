/**
 * 
 */
package edu.uvg.ej1.controller;

import edu.uvg.ej1.model.Dog;
import edu.uvg.ej1.model.Friend;
import java.util.Random;

/**
 * @author MAAG
 *
 */
public class SearchMethod {

	private int randomLimit;
	private int effectivenessValue;
	private double operationCost;
	private String operationFailureDetails;
	
	public SearchMethod(int _randomLimit, int _effectivenessValue, double _operationCost) {
		randomLimit = _randomLimit;
		effectivenessValue = _effectivenessValue;
		operationCost = _operationCost;
	}

	/***
	 * This method evaluate if a operation search can be performed, evaluation
	 * based the money remaining, the operation cost, etc, if operation cannot be 
	 * executed then operationFailureDetails attribute will save the details, like: insufficient money, dog already found, etc.
	 * @param owner Friend objet, owner of the lost dog.
	 * @return True, if the search operation an be performed, false otherwise
	 */
	public boolean operationCanBeExecuted(Friend owner) {
		if(owner.isDogIsLost() == false){
			operationFailureDetails = "El perro ha sido encontrado";
			return false;
		}
		else{
			if(operationCost > owner.getActualMoney()){
				operationFailureDetails = "El Dinero no es suficiente";
				return false;
			}
			else {
				return true;
			}
		}
	}
	
	public String getFailureDetails() {
		return operationFailureDetails;
	}
	
	/***
	 * Execute the search operation, the friend must pay, and the Friend object will
	 * store the result, if it has been found or not, also implements the logic described like 
	 * generate the random number, evaluate according the limits, etc.
	 * @param owner The Owner of the dog, a Friend object
	 * @param lostDog Details of the lost dog
	 * @return true if the dog has been found, false otherwise
	 */
	public boolean isSuccessfulOperation(Friend owner, Dog lostDog) {

		int numRandom = GenerateRandom();
		boolean flag= false;
		double actualMoney= owner.getActualMoney();
		boolean isLostDog = owner.isDogIsLost();
		actualMoney=actualMoney-operationCost;
		owner.setActualMoney(actualMoney);
		if(numRandom<effectivenessValue){
			
			isLostDog = false;
			
			owner.setDogIsLost(isLostDog);
			flag =true;
		}


		return flag;
	}
	
	private int GenerateRandom() {
		Random ran = new Random();
		int random = ran.nextInt(20)+1;
		return random;
	}
}
