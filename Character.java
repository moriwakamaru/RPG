
public class Character {

	static int characterNumber=3;
	protected int characterID;
	protected int hp;
	protected int mp;
	protected int ap;
	protected String name;
	protected String type;
	
	Character()
	{
		
	}
	
	Character(int characterID, int hp,int mp,int ap,String name,String type)
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
		System.out.println("体力 : "+hp);
		System.out.println("魔力 : "+mp);
		System.out.println("属性 : "+type);
	}
	
	public boolean isDead()
	{
		if(hp<=0)
		{
			System.out.println(name+"は、たおれた");
			return true;
		}
		else 
		{
			System.out.println(name+"の残りHPは"+hp+"!!");
			return false;
		}
	}
	
	public void damage(int ap)
	{
		hp-=ap;
		System.out.println(name+"は"+ap+"ポイントのダメージを受けた！！");
	}
	
	public boolean magic(Character enemy)
	{
		System.out.println(name+"のまほう！！");
		enemy.damage(mp);
		return enemy.isDead();
	}
	
	public boolean attack(Character enemy)
	{
		System.out.println(name+"のこうげき！！");
		enemy.damage(ap);
		return enemy.isDead();
	}
	
}
	
