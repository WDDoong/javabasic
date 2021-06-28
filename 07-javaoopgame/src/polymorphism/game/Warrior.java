package polymorphism.game;
	/**
	 * 1. 개요
	 * 	- 전사직업 유저
	 * @author wd91
	 */
	public class Warrior {
		/** 전사 체력 */
		private int hp;
		/** 전사 마나 */
		private int mp;
		/** 전사 공격력 */
		private int atk;
		/** 전사 방어 */
		private int def;
		/** 전사  레벨 */
		private int lv;
		/** 전사 획득 경험치 */
		private int exp;
		
		
		/**
		 * 1. 개요
		 * 	- 전사직업 생성 
		 * 	1) 전사는 기본적인 고정 능력치를 보유 .
		 */
		public Warrior(){
			this.hp = 100;
			this.mp = 10;
			this.atk = 5;
			this.def = 5;
			this.lv = 1;
			this.exp = 0;
		}
		public void hunt(Monster monster) {
			// 공격 전에 먼저 오크의 체력을 체크해서 죽은 오크라면
			// 따로 공격을 할 수 없도록 메서드를 바로 탈출시킵니다.
			if(monster.getHp() <= 0) {
				System.out.println("이미 죽은 "+monster.getName()+"를 공격할 수 없습니다.");
				return;
			}
			// 오크와 전투를 할 때는 자신의 공격력을 넘깁니다.
			monster.doBattle(this.atk);
			
			// 오크쪽 처리가 되고 나서 유저가 공격을 받았을 때
			// 유저가 죽는 상황이라면 역시 전투 메서드 종료
			if(monster.getAtk() > (this.hp + this.def)) {
				System.out.println("유저가 사망했습니다.");
				return;
			}
			// 만약 전투 도중 오크가 죽었다면 경험치 20을 획득
			if(monster.getHp() <= 0) {
				System.out.println("경험치를 20 획득했습니다.");
				this.exp += 20;
				System.out.println(monster.getName() + "와의 교전 완료!");
				return;
			}
			
			// 모든 전투상황이 끝난뒤에 본인의 체력을 깎습니다.
			this.hp = (this.hp + this.def) - monster.getAtk();
				System.out.println(monster.getName() + "와의 교전 완료!");
		}
		//전사 특수 스킬
		public void doubleAttack(Monster monster) {
			System.out.println("전사 스킬 사용");
			setMp(getMp()-2);
			setExp(getExp()+15);
		}
		
		
		public int getHp() {
			return hp;
		}
		public void setHp(int hp) {
			this.hp = hp;
		}
		public int getMp() {
			return mp;
		}
		public void setMp(int mp) {
			this.mp = mp;
		}
		public int getAtk() {
			return atk;
		}
		public void setAtk(int atk) {
			this.atk = atk;
		}
		public int getDef() {
			return def;
		}
		public void setDef(int def) {
			this.def = def;
		}
		public int getLv() {
			return lv;
		}
		public void setLv(int lv) {
			this.lv = lv;
		}
		public int getExp() {
			return exp;
		}
		public void setExp(int exp) {
			this.exp = exp;
		}
		
		
		public void showStatus() {
			System.out.println("<<전사의 상태입니다.>>");
			System.out.println("체력 : " + this.hp);
			System.out.println("마나 : " + this.mp);
			System.out.println("공격력 : " + this.atk);
			System.out.println("방어력 : " + this.def);
			System.out.println("레벨 : " + this.lv);
			System.out.println("경험치 : " + this.exp);
		}
		
	}

