import java.util.Scanner;

public class RPG {

	public static void main(String[] args) {
		System.out.println("ゲームを始めます。主人公を選択してください。");
		Character lucy=new Character(1,1000,700,"Lucy","魔女");
		Character rightning =new Character(2,1500,500,"Rightning","剣士");
		Character havoc=new Character(3,1300,600,"Havoc","スナイパー");
			
		while(true)
		{
			System.out.println("一人目は");
			lucy.selfProduce();
			System.out.println("\n二人目は");
			rightning.selfProduce();
			System.out.println("\n三人目は");
			havoc.selfProduce();
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("\n1:Lucy 2:Rightning 3:havoc");
			System.out.println("キャラクターNoを選択してください");
			int select=sc.nextInt();
			if(select==lucy.characterNo)System.out.println(lucy.name+"を選択しました。");
			if(select==rightning.characterNo)System.out.println(rightning.name+"を選択しました。");
			if(select==havoc.characterNo)System.out.println(havoc.name+"を選択しました。");
			if(select<1||select>Character._characterNumber)continue;
			System.out.println("それでは冒険を始めましょう！！");
			System.exit(0);
		
		}
	}
}
