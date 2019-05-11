import java.util.Random;

public class Havoc extends Character implements Movable{

	Havoc(int characterID, int hp,int mp,int ap,String name,String type)
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
		System.out.println("私は"+name+"自慢はバランスの良さ！！\n遠隔攻撃が得意技！\n");

	}
	@Override
	public void attack(Character enemy)
	{
		Random rnd=new Random();
		int chance=rnd.nextInt(5);
		if(chance==0)
		{
			finisher(enemy);
		}
		else
		{
			shotGun(enemy);
		}

	}

	public void shotGun(Character enemy)
	{
		System.out.println(name+"のショットガン！！");
		enemy.damage(ap);
		enemy.isDead();
	}

	public void finisher(Character enemy)
	{
		System.out.println(name+"のダブルガンズ！！");
		enemy.damage(ap+100);
		enemy.isDead();
	}

	public void magic(Character enemy)
	{
		 fire(enemy);
	}

	public void fire(Character enemy)
	{
		System.out.println(name+"のファイアー！！");
		enemy.damage(mp);
		enemy.isDead();
	}
	
	@Override
	public void move(Character enemy)
	{
		 attack(enemy);
	}
}
