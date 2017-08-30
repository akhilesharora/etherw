package com.air.controller;

import com.air.Orange;
import com.air.service.Web3Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@Produces(MediaType.APPLICATION_JSON)
@Slf4j
public class Web3Controller {

    @Autowired
    Web3Service web3Service;

    @RequestMapping(value = "/{name}", method = GET, produces = "application/json")
    public String getBlah(@PathVariable("name") String name) {
        return String.format("Hello %s", name);
    }

    @RequestMapping(value = "/hi", method = GET, produces = "application/json")
    public String getBlahs() {
        return web3Service.getHello();
    }

    @RequestMapping(value = "/web", method = GET, produces = "application/json")
    public String getWeb() throws ExecutionException, InterruptedException {
        Web3j web3 = Web3j.build(new HttpService());  // defaults to http://localhost:8545/
        Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().sendAsync().get();
        String clientVersion = web3ClientVersion.getWeb3ClientVersion();
        return "ok";
    }
    @RequestMapping(value = "/getData", method = GET)
    public Response getData() throws ExecutionException {
        String storeABI = "";
        String address = "";
        Web3j web3 = Web3j.build(new HttpService());  // defaults to http://localhost:8545/
        web3.ethAccounts();
        return Response.ok("hey").build();
    }

    @RequestMapping(value = "/addData", method = POST)
    public void addData() throws ExecutionException {
        String storeABI = "";
        String address = "";
        Web3j web3 = Web3j.build(new HttpService());  // defaults to http://localhost:8545/
        web3.ethAccounts();
    }

    @RequestMapping(value = "/searchData", method = GET)
    public void searchData() throws ExecutionException, IOException, CipherException {
        String storeABI = "";
        String address = "";
        Web3j web3 = Web3j.build(new HttpService());  // defaults to http://localhost:8545/
        System.out.println((web3.ethAccounts().getJsonrpc()));

        Credentials credentials = WalletUtils.loadCredentials("test", "/Users/user/Library/Ethereum/testnet/keystore/UTC--2017-08-24T19-44-11.503000000Z--4497772ad155be857e740bedf0da55052b62c941.json");

    }

    @RequestMapping(value = "/deploy", method = GET)
    public void deployContract() throws ExecutionException, IOException, CipherException, InterruptedException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
        String storeABI = "";
        String address = "";
        Web3j web3 = Web3j.build(new HttpService());  // defaults to http://localhost:8545/
        Credentials credentials = WalletUtils.loadCredentials("password", "/Users/user/Library/Ethereum/testnet/keystore/UTC--2017-08-30T12-26-39.759000000Z--1c2dd14b03a7df59d64bb0adbc8fdb0446a40e24.json ");

        Future<Orange> contract = Orange.deploy(web3, credentials, BigInteger.ONE , BigInteger.valueOf(100000) , BigInteger.valueOf(1000));
        System.out.println("contractAdress" + contract.get().getContractAddress());
        System.out.println("Adding Data" + contract.get().addData(new Bytes32("arora".getBytes()), new Bytes32("akhilesh".getBytes())));


    }



}
