public class AccountBalance { 

 public static int processTransactions(int startingBalance, String[] transactions) {

  for (String trans : transactions) {
   String param[] = trans.split(" ");
   String TransType = param[0];

   if (TransType.equalsIgnoreCase("C")) {
    startingBalance = startingBalance + Integer.valueOf(param[1]);
   }

   else if (TransType.equalsIgnoreCase("D")) {
    startingBalance = startingBalance - Integer.valueOf(param[1]);
   }
  }

  return startingBalance;

 }

}
