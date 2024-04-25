package steamsdemo;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamDemo {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        Map<Account, Account> accountAccountMap = accountService.getAccountSummary();

        Account account = new Account();
        account.accountNumber = "7893118151";
        Account fullAccount = accountAccountMap.get(account);
        System.out.println(fullAccount.accountNumber);

        Predicate<AccountDetails> creditTypePredicate =
                (accountDetails) -> accountDetails.tnxType.equals("C");

        List<AccountDetails> creditAccountDetails = fullAccount.accountDetailsList.stream().
                filter(abc -> creditTypePredicate.test(abc))
                .collect(Collectors.toList());
        System.out.println("stream Credit account details  " + creditAccountDetails);

        List<AccountDetails> normalcreditaccountDetails = new ArrayList<>();
        for (int i = 0; i < fullAccount.accountDetailsList.size(); i++) {
            if (fullAccount.accountDetailsList.get(i).tnxType.equals("C")) {
                normalcreditaccountDetails.add(fullAccount.accountDetailsList.get(i));
            }

        }
        System.out.println(" working on stream by using groupingby");
       Map<String, Double> groupByTypeSum = fullAccount.accountDetailsList.stream().
                collect(
                        groupingBy(AccountDetails::getTnxType,
             summingDouble(AccountDetails::getAmount)));
        System.out.println(groupByTypeSum);

         Map<String,Double>groupByNormalMap=new HashMap<String,Double>();
         double creditSum=0;
         double debitSum=0;
         for (int i=0;i<fullAccount.accountDetailsList.size();i++){
             if (fullAccount.accountDetailsList.get(i).tnxType.equals("C")){
                 AccountDetails details = fullAccount.accountDetailsList.get(i);
                 creditSum=creditSum+details.getAmount();


             }else if (fullAccount.accountDetailsList.get(i).tnxType.equals("D")){
                 AccountDetails details = fullAccount.accountDetailsList.get(i);
                 debitSum = debitSum+details.getAmount();
                 groupByNormalMap.put("Debit",debitSum);

             }
         }
        System.out.println(groupByNormalMap);

    }
}