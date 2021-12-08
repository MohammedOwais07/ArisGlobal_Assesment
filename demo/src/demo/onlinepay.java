package demo;

public class onlinepay {

	static String branch= "kollegal";
	void balance(){
		System.out.println("Balance");
	}
	void accDetails(int accountNum, String name,String branch) {
		System.out.println("Account details of "+ name);
	}

public static void main (String[] args) {
	onlinepay p1= new onlinepay();
	p1.balance();
    p1.accDetails(1234567892, "Mohammed",branch);
}
}
