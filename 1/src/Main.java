import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void displayAccount(Account theAccount) {
		// 显示一空行
		System.out.println();
		// 显示账号
		System.out.println("Account: "+theAccount.getAccountNumber());	
		// 显示存款次数
		System.out.println("Number of Deposits: "+theAccount.getDeposits());
		// 显示取款次数
		System.out.println("Number of Withdrawals: "+theAccount.getWithdrawals());
		// 显示余额(保留小数点后两位)
		System.out.println("Balance: $"+theAccount.getBalance());
	}

	public static void main(String[] args) throws IOException {
		String accountNo; // 该变量用于存放账号
		double amount; // 该变量用于存放交易的金额
		
		// 创建Scanner对象用于获取用户的输入
		Scanner keyboard = new Scanner(System.in);
		Account checking = new Account();
		// 定义引用变量checking，并将新创建的Account对象地址赋值给checking变量
		checking.accountNo="123";
		checking.balance=500;
		// 将该对象（checking所指向的）的账号设置为"123"，余额设置为500
		Account savings = new Account();
		// 定义引用变量savings,并将新创建的Account对象地址赋值给savings变量
		
		// 将该对象（savings所指向的）的账号设置为"456",余额设置为1000
		
		// 提示并获取用户的输入
		accountNo = keyboard.next();
		amount = keyboard.nextDouble();
		
		// 当用户输入的账号不是"#"
		while (!accountNo.equals("#")) {
		/*
			 * 根据输入信息判断对哪个Account对象进行操作（checking还是savings）,
			 * 进行的是什么操作（取款还是存款——负数为取款，非负数为存款）。
			 * 并根据判断执行相应的操作。这里需要多条语句
			 */
			
			
			// 提示并获取用户的输入
			accountNo = keyboard.next();
			amount = keyboard.nextDouble();
		}

		// 显示checking所指向的对象的信息（此处必须调用displayAccount方法）
		
		
		// 显示savings所指向的对象的信息（此处必须调用displayAccount方法）
		
	}
}
