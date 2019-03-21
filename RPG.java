import java.util.Random;
import java.util.Scanner;

public class RPG {

	public static void main(String[] args) {
		System.out.println("ゲームを始めます。主人公を選択してください。");
		
		Character[] mainCharacters=new Character[Character.characterNumber];
		mainCharacters[0] =new Lucy(1,1000,700,300,"Lucy","魔女");
		mainCharacters[1] =new Rightning(2,1500,500,600,"Rightning","剣士");
		mainCharacters[2]=new Havoc(3,1300,600,450,"Havoc","スナイパー");
		
		Character[] enemy =new Character[2];
		enemy[0]=new Character(4,1000,300,100,"まっくろくろすけ","enemy");
		enemy[1]=new Character(5,1200,200,200,"シャドー","enemy");
		
		Scanner sc=new Scanner(System.in);
		int characterSelect=0;
		boolean isDecided=false;
		while(!isDecided)//メインキャラクター選択
		{
			for(int i=0;i<Character.characterNumber;i++)
			{
				System.out.println((i+1)+"人目は");
				mainCharacters[i].selfProduce();
			}
			
			System.out.println("\n1:Lucy 2:Rightning 3:havoc\nキャラクターNoを選択してください");
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
		System.out.println("それでは冒険を始めましょう！！\n敵が現れました！！\nたたかいを始めます！！");
		Fight fight=new Fight();
		Random rnd=new Random();
		System.out.println("パーティメンバーの紹介です");
		for(int i=0;i<Character.characterNumber;i++)
		{
			mainCharacters[i].selfProduce();
		}
		System.out.println("敵メンバーの紹介です");
		for(int i=0;i<Character.enemyNumber;i++)
		{
			enemy[i].selfProduce();
			System.out.println();
		}
		System.out.println("たたかい開始");
		while(true)//戦い
		{
			System.out.println("攻撃ターンの開始");
			for(int i=0;i<Character.characterNumber;i++)
			{
				if(enemy[0].hp<=0&&enemy[1].hp<=0)break;
				if(i==characterSelect-1)
				{
					System.out.println("\n1:こうげき 2:まほう\n選択してください");
					int select=sc.nextInt();
					if(select==1)fight.selectEnemyAttack(enemy,mainCharacters,rnd,i);
					if(select==2)fight.selectEnemyMagic(enemy,mainCharacters,rnd,i);
					if(select<1||select>2) continue;
				}
				else //サブキャラクター
				{
					int subCharacterSelect=rnd.nextInt(Character.enemyNumber);
					if(subCharacterSelect==0)fight.selectEnemyAttack(enemy,mainCharacters,rnd,i);
					if(subCharacterSelect==1)fight.selectEnemyMagic(enemy,mainCharacters,rnd,i);
				}
			}
			
			System.out.println("～戦況～");
			if(enemy[0].isDead()==true&enemy[1].isDead()==true) 
			{
				System.out.println("全滅した。");
				break;//全滅判定
			}
			System.out.println("防御ターンの開始");
			for(int i=0;i<Character.enemyNumber;i++)
			{
				int enemyCharacter=rnd.nextInt(2);
				if(enemy[i].hp<=0)continue;
				if(enemyCharacter==0)fight.selectCharacterAttack(enemy,mainCharacters,rnd,i);
				if(enemyCharacter==1)fight.selectCharacterMagic(enemy,mainCharacters,rnd,i);
			}
			
			System.out.println("～戦況～\n");
			if(mainCharacters[0].isDead()==true&mainCharacters[1].isDead()==true&mainCharacters[2].isDead()==true) 
			{
				System.out.println("全滅した。");
				break;//全滅判定
			}
		}
		System.out.println("バトルは終了した。");
		System.exit(0);
		sc.close();
		
	}
	
}
