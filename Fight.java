import java.util.Random;

public class Fight {
	
	public void selectEnemyAttack(Character[] enemy,Character[] mainCharacters,Random rnd,int i)
	{
		while(true) 
		{
			int target=rnd.nextInt(Character.enemyNumber);
			if(enemy[target].hp<=0)continue;
			mainCharacters[i].attack(enemy[target]);
			break;
		}
	}

	public void selectEnemyMagic(Character[] enemy,Character[] mainCharacters,Random rnd,int i)
	{
		while(true) 
		{
			int target=rnd.nextInt(Character.enemyNumber);
			if(enemy[target].hp<=0)continue;
			mainCharacters[i].magic(enemy[target]);
			break;
		}
	}
	
	public void selectCharacterAttack(Character[] enemy,Character[] mainCharacters,Random rnd,int i)
	{
		while(true) 
		{
			int target=rnd.nextInt(Character.characterNumber);
			if(mainCharacters[target].hp<=0)continue;
			enemy[i].attack(mainCharacters[target]);
			break;
		}
	}

	public void selectCharacterMagic(Character[] enemy,Character[] mainCharacters,Random rnd,int i)
	{
		while(true) 
		{
			int target=rnd.nextInt(Character.characterNumber);
			if(mainCharacters[target].hp<=0)continue;
			enemy[i].magic(mainCharacters[target]);
			break;
		}
	}
}
