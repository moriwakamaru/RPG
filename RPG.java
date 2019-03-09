import java.util.Scanner;

public class RPG {

	public static void main(String[] args) {
		System.out.println("ゲームを始めます。主人公を選択してください。");
		Character lucy=new Character(1,1000,700,300,"Lucy","魔女");
		Character rightning =new Character(2,1500,500,600,"Rightning","剣士");
		Character havoc=new Character(3,1300,600,450,"Havoc","スナイパー");
		Character enemy=new Character(4,500,300,100,"まっくろくろすけ","enemy");
			
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
			Character mainCharacter=null;
			if(select==lucy.characterID) 
			{
				mainCharacter=lucy;
				select(mainCharacter);
			}
			if(select==rightning.characterID)
			{
				mainCharacter=rightning;
				select(mainCharacter);
			}
			if(select==havoc.characterID)
			{
				mainCharacter=havoc;
				select(mainCharacter);
			}
			if(select<1||select>Character._characterNumber)continue;
			System.out.println("それでは冒険を始めましょう！！");
			
			System.out.println("\n敵が現れました！！\n攻撃してみましょう！！");
			while(true)
			{
				System.out.println("\n1:こうげき 2:まほう");
				System.out.println("選択してください");
				select=sc.nextInt();
				boolean judgeDeath=false;
				if(select==1)
				{
					judgeDeath=mainCharacter.attack(enemy);
				}
				if(select==2)
				{
					judgeDeath=mainCharacter.magic(enemy);
				}
				if(select<1||select>2) continue;
			
				if(judgeDeath==true)break;
			
			}
			System.exit(0);
		
		}
	}
	public static void select(Character character)
	{
		System.out.println(character.name+"を選択しました。");
	}
}
