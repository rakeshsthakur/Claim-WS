package com.mitchell.claim.business.process;

public interface IGenericBusinessProcess<Input, Output> {

	public Output execute(Input input) throws Exception;

}
