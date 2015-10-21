package code;


import java.util.ArrayList;
//Restore IP Addresses My Submissions Question Solution 
//Total Accepted: 40984 Total Submissions: 191711 Difficulty: Medium
//Given a string containing only digits, restore it by returning all possible valid IP address combinations.
//
//For example:
//Given "25525511135",
//
//return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
import java.util.List;
//Given a string containing only digits, restore it by returning all possible valid IP address combinations.
//
//For example:
//Given "25525511135",
//
//return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
public class RestoreIPAddresses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<String> restoreIpAddresses(String s) {
		List<String> result = new ArrayList<>();
		dfs("", s, 0, result);
		return result;
	}

	private void dfs(String ipString, String s, int count, List<String> result) {
		// TODO Auto-generated method stub
		if (count == 4 && s.equals("")) {
			result.add(ipString.substring(0, ipString.length() - 1));
			return;
		} else if (count < 4)
		{
			if (s.length() >= 1) {
				dfs(ipString + s.substring(0, 1) + ".", s.substring(1), count + 1, result);
			}
			if (s.length() >= 2 && !s.substring(0, 1).equals("0")) {
				dfs(ipString + s.substring(0, 2) + ".", s.substring(2), count + 1, result);
			}
			if (s.length() >= 3&&Integer.parseInt(s.substring(0, 3))>=100&&Integer.parseInt(s.substring(0, 3))<=255) {
				dfs(ipString + s.substring(0, 3) + ".", s.substring(3), count + 1, result);
			}

		}

	}
}
