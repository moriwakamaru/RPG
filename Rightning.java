import java.util.Random;

public class Rightning extends Character {
	
	Rightning(int characterID, int hp,int mp,int ap,String name,String type)
	{
		this.characterID=characterID;
		this.hp=hp;
		this.mp=mp;
		this.ap=ap;
		this.name=name;
		this.type=type;
	}
	
	public void selfProduce()
	{
		super.selfProduce();
		System.out.println("私は"+name+"体力には自信がある！！\n前線で活躍するわ！！");
		
	}
	
	public boolean attack(Character enemy)
	{
		Random rnd=new Random();
		int chance=rnd.nextInt(5); 
		if(chance==0) 
		{
			System.out.println(name+"の必殺技ライトソード！！");
			enemy.damage(ap+100);
		}
		else
		{
			System.out.println(name+"のこうげき！！");
			enemy.damage(ap);
		}
		return enemy.isDead();
	}

}
