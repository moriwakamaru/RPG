import java.util.Random;

public class Fight {
	
	public void selectEnemyAttack(Movable[] enemy,Movable[] mainCharacters,Random rnd,int i)
	{
		while(true) 
		{
			int target=rnd.nextInt(Character.enemyNumber);
			if(((Character)enemy[target]).hp<=0)continue;
			( mainCharacters[i]).move((Character) enemy[target]);
			break;
		}
	}

	public void selectEnemyMagic(Movable[] enemy,Movable[] mainCharacters,Random rnd,int i)
	{
		while(true) 
		{
			int target=rnd.nextInt(Character.enemyNumber);
			if(((Character)enemy[target]).hp<=0)continue;
			((Character) mainCharacters[i]).magic((Character) enemy[target]);
			break;
		}
	}
	
	public void selectCharacterAttack(Movable[] enemy,Movable[] mainCharacters,Random rnd,int i)
	{
		while(true) 
		{
			int target=rnd.nextInt(Character.characterNumber);
			if(((Character)mainCharacters[target]).hp<=0)continue;
			( enemy[i]).move((Character) mainCharacters[target]);
			break;
		}
	}

	public void selectCharacterMagic(Movable[] enemy,Movable[] mainCharacters,Random rnd,int i)
	{
		while(true) 
		{
			int target=rnd.nextInt(Character.characterNumber);
			if(((Character)mainCharacters[target]).hp<=0)continue;
			((Character) enemy[i]).magic((Character) mainCharacters[target]);
			break;
		}
	}
}
