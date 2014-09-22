
public class TV {
	int channel = 1;
	int volumelevel = 1;
	boolean on = false;
	public TV(){
	}
	public void turnon(){

		on = true;
	}
	public void turnoff(){
		on = false;
	}
	public void setchannel(int newchannel){
		if(on && newchannel >=1 && newchannel <=120)
			channel = newchannel;
	}
	public void setvolume(int newvolumelevel){
		if (on && newvolumelevel >=1 && newvolumelevel <= 7)
			volumelevel = newvolumelevel;
	}
	public void channelup(){
		if (on && channel < 120)
			channel++;
	}
	public void channeldown(){
		if (on && channel > 1)
			channel--;
	}
	public void volumeup(){
		if (on&& volumelevel < 7)
			volumelevel++;
	}
	public void volumedown(){
		if (on&& volumelevel > 1)
			volumelevel--;
	}
}