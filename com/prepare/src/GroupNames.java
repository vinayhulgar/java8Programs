import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


/*
  Grouping Bank Names with Account Ids using Collectors.groupingBy
*/
public class GroupNames {

	public static void main(String[] args) {
		/*Map<String,String> tempMap = new HashMap<>();
		tempMap.put("123", "01");
		tempMap.put("456", "01");
		tempMap.put("789", "01");
		tempMap.put("012", "01");
		tempMap.put("345", "01");
		tempMap.put("678", "01");
		Map<String,Set<String>> bankMap = groupAccounts(tempMap);
		for(Map.Entry<String, Set<String>> entry : bankMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}*/
		
		Map<String, Set<String>> tempmap = new HashMap<>(); 
		tempmap = groupAccounts1();
		
		for (Map.Entry<String, Set<String>> entry : tempmap.entrySet()) {
			System.out.println("tempmap Key: "+entry.getKey());
			System.out.println("tempmap Key: "+entry.getValue());
		}
		
	}
  private static Map<String, Set<String>> groupAccounts1() {
		
		Map<String, List<String>> acctWiseRec = new HashMap<>();
		acctWiseRec.put("001", Arrays.asList("222222","22222222"));
		acctWiseRec.put("002", Arrays.asList("222222","22222222"));
		acctWiseRec.put("003", Arrays.asList("222222","22222222"));
		acctWiseRec.put("004", Arrays.asList("222222","22222222"));
		acctWiseRec.put("005", Arrays.asList("222222","22222222"));
		
		
		Set<String> keys = acctWiseRec.keySet();
		Set<String> BankSets = new HashSet<>();
		Map<String, String> tempmap = new HashMap<>();
		final Map<String, Set<String>> bankMap = new HashMap<>(); 
		Set<String> Accountids = new HashSet<>();
		String bankName ="";
		for (String accountId : keys) {
			if(accountId == "001") {
				bankName = "HDFC";
			}else if(accountId == "002") {
				bankName = "HDFC";
			}else if(accountId == "003") {
				bankName = "HSBC";
			}else if(accountId == "004") {
				bankName = "HDFC";
			}else if(accountId == "005") {
				bankName = "HSBC";
			}
			
			
			BankSets.add(bankName);
			if(!tempmap.containsKey(accountId)) {
				tempmap.put(accountId, bankName);
			}
		}
		//{001=HDFC, 002=HDFC, 003=HSBC, 004=HDFC, 005=HSBC}
		   Map<String, List<String>> result =  tempmap.entrySet().stream().collect(Collectors.groupingBy(
		            Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
		    System.out.println(result);
		
		return bankMap;
	}
  }
