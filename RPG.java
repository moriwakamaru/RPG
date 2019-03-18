import java.util.Scanner;

public class RPG {

	public static void main(String[] args) {
		System.out.println("ゲームを始めます。主人公を選択してください。");
		Character[] mainCharacters=new Character[Character.characterNumber];
		mainCharacters[0] =new Lucy(1,1000,700,300,"Lucy","魔女");
		mainCharacters[1] =new Rightning(2,1500,500,600,"Rightning","剣士");
		mainCharacters[2]=new Havoc(3,1300,600,450,"Havoc","スナイパー");
		Character enemy=new Character(4,500,300,100,"まっくろくろすけ","enemy");
		Scanner sc=new Scanner(System.in);
		int characterSelect=0;
		boolean isDecided=false;
		while(!isDecided)
		{
			for(int i=0;i<Character.characterNumber;i++)
			{
				System.out.println((i+1)+"人目は");
				mainCharacters[i].selfProduce();
			}
			
			System.out.println("\n1:Lucy 2:Rightning 3:havoc");
			System.out.println("キャラクターNoを選択してください");
			characterSelect=sc.nextInt();
			if(characterSelect<1||characterSelect>Character.characterNumber)continue;
			
			for(int i=0;i<Character.characterNumber;i++)
			{
				if(characterSelect==mainCharacters[i].characterID) 
				{
					System.out.println(mainCharacters[i].name+"を選択しました。");
					isDecided=true;
				}
			}
		}
		System.out.println("それでは冒険を始めましょう！！");
		System.out.println("\n敵が現れました！！\n攻撃してみましょう！！");
			
		while(true)
		{
			System.out.println("\n1:こうげき 2:まほう");
			System.out.println("選択してください");
			int select=sc.nextInt();
			boolean isDead=false;
			if(select==1)
			{
				isDead=mainCharacters[characterSelect-1].attack(enemy);
			}
			if(select==2)
			{
				isDead=mainCharacters[characterSelect-1].magic(enemy);
			}
			if(select<1||select>2) continue;
			
			if(isDead==true)break;
			
		}
		System.exit(0);
		sc.close();
		
	}
	
}
