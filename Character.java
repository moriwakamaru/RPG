
public class Character {

	static int _characterNumber=3;
	int _characterNo;
	int _hp;
	int _mp;
	String _name;
	String _type;
	
	Character(int characterNo, int hp,int mp,String name,String type)
	{
		_characterNo=characterNo;
		_hp=hp;
		_mp=mp;
		_name=name;
		_type=type;
	}
	
	public void selfProduce()
	{
		System.out.println("名前 : "+_name);
		System.out.println("体力 : "+_hp);
		System.out.println("魔力 : "+_mp);
		System.out.println("属性 : "+_type);
		if(_characterNo==1) lucy();
		if(_characterNo==2) rightning();
		if(_characterNo==3) havoc();
	}
	
	void lucy()
	{
		System.out.println("私は"+_name+"魔法を使うのが得意！！\nサポートや回復は任せて！");
	}
	
	void rightning()
	{
		System.out.println("私は"+_name+"体力には自信がある！！\n前線で活躍するわ！！");
	}
	void havoc()
	{
		System.out.println("私は"+_name+"自慢はバランスの良さ！！\n遠隔攻撃が得意技！");
	}
	
}
	
