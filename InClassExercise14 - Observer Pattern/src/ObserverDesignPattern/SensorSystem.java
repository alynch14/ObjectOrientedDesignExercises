package ObserverDesignPattern;

import java.util.ArrayList;

public class SensorSystem {
    ArrayList<AlarmListener> listeners = new ArrayList<>();
    public void register(AlarmListener alarmListener){
        listeners.add(alarmListener);
    }

    public void soundTheAlarm(){
        for(AlarmListener i : listeners){
            i.alarm();
        }
    }
}
