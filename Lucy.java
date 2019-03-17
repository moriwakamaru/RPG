import java.util.Random;

public class Lucy extends Character{

	Lucy(int characterID, int hp,int mp,int ap,String name,String type)
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
		System.out.println("私は"+name+"魔法を使うのが得意！！\nサポートや回復は任せて！");
		
	}
	
	public boolean magic(Character enemy)
	{
		Random rnd=new Random();
		int chance=rnd.nextInt(5); 
		if(chance==0) 
		{
			System.out.println(name+"の必殺技マジカルバースト！！");
			enemy.damage(mp+100);
		}
		else
		{
			System.out.println(name+"のまほう！！");
			enemy.damage(mp);
		}
		return enemy.isDead();
	}
}
