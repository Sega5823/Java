class TVset{

    private int channel = 5;
    private boolean isOn;
    private Remote remote = new Remote();

    public Remote getRemote(){
        return remote;
    }

    class Remote{

        public void setChannel(int channel){
            TVset.this.channel = channel;
        }
        public void turnOn(){
            isOn = true;
        }
        public void turnOff(){
            isOn = false;
        }
    }

    public String toString(){
        if (!isOn){
            return "The TVset is OFF";
        }
        return "Channel " + channel + " is on the TVset now.";
    }
}

public class Main {

    public static void main(String[] args) {
        TVset tv = new TVset();
        TVset.Remote remote = tv.getRemote();
        remote.turnOn();
        tv.getRemote().turnOn();

    }
}