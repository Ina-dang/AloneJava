package a220814;

import java.util.Stack;

public class CoinEx {
	public static void main(String[] args) {
		Stack<Coin> coins = new Stack<Coin>();
		
		coins.push(new Coin(500));
		coins.push(new Coin(100));
		coins.push(new Coin(50));
		coins.push(new Coin(100));
		
		while (!coins.isEmpty()) {
			Coin coin = coins.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}
