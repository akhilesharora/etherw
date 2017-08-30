package com.air;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>, or {@link org.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 *
 * <p>Generated with web3j version 2.3.0.
 */
public final class Orange extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b5b6105788061001f6000396000f300606060405263ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166310009562811461005e57806338ef53681461008b5780633bc5de30146100b957806365375a0414610167575b600080fd5b341561006957600080fd5b610077600435602435610218565b604051901515815260200160405180910390f35b341561009657600080fd5b6100a160043561026d565b60405191825260208201526040908101905180910390f35b34156100c457600080fd5b6100cc61029b565b604051808060200180602001838103835285818151815260200191508051906020019060200280838360005b838110156101115780820151818401525b6020016100f8565b50505050905001838103825284818151815260200191508051906020019060200280838360005b838110156101515780820151818401525b602001610138565b5050505090500194505050505060405180910390f35b341561017257600080fd5b6100cc6004356103ab565b604051808060200180602001838103835285818151815260200191508051906020019060200280838360005b838110156101115780820151818401525b6020016100f8565b50505050905001838103825284818151815260200191508051906020019060200280838360005b838110156101515780820151818401525b602001610138565b5050505090500194505050505060405180910390f35b60006102226104ca565b83815260208101839052600080546001810161023e83826104e1565b916000526020600020906002020160005b508290815181556020820151600191820155935050505b5092915050565b600080548290811061027b57fe5b906000526020600020906002020160005b50805460019091015490915082565b6102a3610513565b6102ab610513565b60006102b5610513565b6102bd610513565b60006102c76104ca565b6000549450846040518059106102da5750595b908082528060200260200182016040525b509350846040518059106102fc5750595b908082528060200260200182016040525b509250600091505b60005482101561039b57600080548390811061032d57fe5b906000526020600020906002020160005b50604080519081016040528154815260019091015460208201529050805184838151811061036857fe5b602090810290910181019190915281015183838151811061038557fe5b602090810290910101525b600190910190610315565b8383965096505b50505050509091565b6103b3610513565b6103bb610513565b60006103c5610513565b6103cd610513565b60006103d76104ca565b6000549450846040518059106103ea5750595b908082528060200260200182016040525b5093508460405180591061040c5750595b908082528060200260200182016040525b509250600091505b6000548210156104b957600080548390811061043d57fe5b906000526020600020906002020160005b5060408051908101604052815481526001909101546020820152905080518814156104ad57805184838151811061048157fe5b602090810290910181019190915281015183838151811061049e57fe5b602090810290910101526104b9565b5b600190910190610425565b8383965096505b5050505050915091565b604080519081016040526000808252602082015290565b81548183558181151161050d5760020281600202836000526020600020918201910161050d9190610525565b5b505050565b60206040519081016040526000815290565b61054991905b80821115610545576000808255600182015560020161052b565b5090565b905600a165627a7a723058205907affc55fb0002b133cbacc2a5428b54f074fdb13ae69889b438158c37dffc0029";

    private Orange(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private Orange(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public Future<TransactionReceipt> addData(Bytes32 _hash, Bytes32 _meta) {
        Function function = new Function("addData", Arrays.<Type>asList(_hash, _meta), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<List<Type>> dir(Uint256 param0) {
        Function function = new Function("dir", 
                Arrays.<Type>asList(param0), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}, new TypeReference<Bytes32>() {}));
        return executeCallMultipleValueReturnAsync(function);
    }

    public Future<List<Type>> getData() {
        Function function = new Function("getData", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Bytes32>>() {}, new TypeReference<DynamicArray<Bytes32>>() {}));
        return executeCallMultipleValueReturnAsync(function);
    }

    public Future<List<Type>> searchData(Bytes32 _hashInput) {
        Function function = new Function("searchData", 
                Arrays.<Type>asList(_hashInput), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Bytes32>>() {}, new TypeReference<DynamicArray<Bytes32>>() {}));
        return executeCallMultipleValueReturnAsync(function);
    }

    public static Future<Orange> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(Orange.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<Orange> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(Orange.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Orange load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Orange(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Orange load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Orange(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
