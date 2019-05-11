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
		System.out.println("私は"+name+"魔法を使うのが得意！！\nサポートや回復は任せて！\n");

	}

	@Override
	public void attack(Character enemy)
	{
		 panch(enemy);
	}

	public void magic(Character enemy)
	{
		Random rnd=new Random();
		int chance=rnd.nextInt(5);
		if(chance==0)
		{
			finisher(enemy);
		}
		else
		{
			magicalPower(enemy);
		}

	}

	public void magicalPower(Character enemy)
	{
		System.out.println(name+"のマジカルパワー！！");
		enemy.damage(mp);
		enemy.isDead();
	}

	public void panch(Character enemy)
	{
		System.out.println(name+"のパンチこうげき！！");
		enemy.damage(ap);
		enemy.isDead();
	}

	public void finisher(Character enemy)
	{
		System.out.println(name+"の必殺技マジカルバースト！！");
		enemy.damage(mp+100);
		enemy.isDead();
	}


}
