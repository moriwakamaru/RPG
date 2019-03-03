
public class Character {

	static int _characterNumber=3;
	int characterNo;
	int hp;
	int mp;
	String name;
	String type;
	
	Character(int characterNo, int hp,int mp,String name,String type)
	{
		this.characterNo=characterNo;
		this.hp=hp;
		this.mp=mp;
		this.name=name;
		this.type=type;
	}
	
	public void selfProduce()
	{
		System.out.println("名前 : "+this.name);
		System.out.println("体力 : "+this.hp);
		System.out.println("魔力 : "+this.mp);
		System.out.println("属性 : "+this.type);
		if(this.characterNo==1) lucy();
		if(this.characterNo==2) rightning();
		if(this.characterNo==3) havoc();
	}
	
	void lucy()
	{
		System.out.println("私は"+this.name+"魔法を使うのが得意！！\nサポートや回復は任せて！");
	}
	
	void rightning()
	{
		System.out.println("私は"+this.name+"体力には自信がある！！\n前線で活躍するわ！！");
	}
	void havoc()
	{
		System.out.println("私は"+this.name+"自慢はバランスの良さ！！\n遠隔攻撃が得意技！");
	}
	
}
	
