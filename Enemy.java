
public class Enemy extends Character implements Movable {

	Enemy(int characterID, int hp,int mp,int ap,String name,String type)
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
		System.out.println("名前 : "+name);
		if(hp<=0)System.out.println("体力 : "+0);
		else System.out.println("体力 : "+hp);
		System.out.println("魔力 : "+mp);
		System.out.println("属性 : "+type);
	}

	public boolean isDead()
	{
		if(hp<=0)
		{
			System.out.println(name+"は、たおれている\n");
			return true;
		}
		else
		{
			System.out.println(name+"の残りHPは"+hp+"!!\n");
			return false;
		}
	}

	public void damage(int ap)
	{
		hp-=ap;
		System.out.println(name+"は"+ap+"ポイントのダメージを受けた！！");
	}

	public void magic(Character enemy)
	{
		System.out.println(name+"のまほう！！");
		enemy.damage(mp);
		enemy.isDead();

	}
	@Override
	public void attack(Character enemy)
	{
		System.out.println(name+"のこうげき！！");
		enemy.damage(ap);
		enemy.isDead();

	}

	@Override
	public void move(Character enemy)
	{
		 attack(enemy);
	}
}



