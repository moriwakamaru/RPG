
public class Character {

	static int _characterNumber=3;
	int characterID;
	int hp;
	int mp;
	int ap;
	String name;
	String type;
	
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
		if(this.characterID==1) lucy();
		if(this.characterID==2) rightning();
		if(this.characterID==3) havoc();
	}
	public boolean judgeDeath()
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
		return enemy.judgeDeath();
	}
	
	public boolean attack(Character enemy)
	{
		System.out.println(name+"のこうげき！！");
		enemy.damage(ap);
		return enemy.judgeDeath();
	}
	
	void lucy()
	{
		System.out.println("私は"+name+"魔法を使うのが得意！！\nサポートや回復は任せて！");
	}
	
	void rightning()
	{
		System.out.println("私は"+name+"体力には自信がある！！\n前線で活躍するわ！！");
	}
	void havoc()
	{
		System.out.println("私は"+name+"自慢はバランスの良さ！！\n遠隔攻撃が得意技！");
	}
	
}
	
