package week5;
public class NerfGun {
	private int i;
	private static int ID;
	public NerfGun() {
		this.ID++;
	}
	public NerfGun(int i) {
		this.ID++;
		this.i = i;
	}
	public void fire() {
		if(i<=0){
			System.out.println("There is no ammuition");
		}else{
			System.out.println("BANG !!!");
			this.i--;
		}
	}
	public void reload(int i) {
		if(this.i+i>15){
			System.out.println("Error!! the ammunition is overload");
		}else{
			this.i += i;
		}
		
	}
	public void displayNumOfAmmunition() {
		System.out.println(i+" bullet left");
	}
	public void displayGunID() {
		System.out.println("the ID of this gun is " + ID);
	}
}