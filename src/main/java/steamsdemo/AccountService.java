package steamsdemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AccountService {
    public Map <Account,Account>getAccountSummary(){
        Address homeAddress = new Address();
        homeAddress.doorNo="1/18";
        homeAddress.pincode="521181";
        homeAddress.street="Shivalayam";
        homeAddress.village="peddapuram";

        Address bankAddress2 = new Address();
        bankAddress2.doorNo="1/18";
        bankAddress2.pincode="521181";
        bankAddress2.street="main center";
        bankAddress2.village="peddapuram";

        AccountDetails accountDetails = new AccountDetails();
        accountDetails.Amount=10000;
        accountDetails.transferDate=new Date();
        accountDetails.description="neoteric method salary";
        accountDetails.valueDate=new Date();
        accountDetails.tnxType="C";

        AccountDetails accountDetails1 = new AccountDetails();
        accountDetails1.Amount=1000;
        accountDetails1.transferDate=new Date();
        accountDetails1.description="neoteric method salary";
        accountDetails1.valueDate=new Date();
        accountDetails1.tnxType="debt";

        Account account =  new Account();
        account.accountDetailsList=new ArrayList<>();
        account.accountDetailsList.add(accountDetails);
        account.accountDetailsList.add(accountDetails1);
        account.accountNumber="7893118151";
        account.ifscCode="Unib00089";
        account.balance=10000;
        account.address=bankAddress2;
        Map<Account,Account>accountMap=new HashMap<>();
        accountMap.put(account,account);

        return accountMap;
    }
}
