package gv.mvp_dagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by hi on 5/22/2017.
 */

public class MainModelList implements Model {

    List<MainModel> loaclList=new ArrayList<>();



    private static MainModelList instance=null;

    protected MainModelList(){
        String title="Android 7.0: Nougat";
        String descer="Unicode 9.0 emoji\n" +
                "Better multitasking\n" +
                "Multi-window mode (PIP, Freeform window)\n" +
                "Seamless system updates (with dual system partition)\n" +
                "Better performance and code size thanks to new JIT Compiler"
                ;
        String id= UUID.randomUUID().toString();
        MainModel modelList=new MainModel(title,descer,id);
        loaclList.add(modelList);

        title="Android 6.0: Marshmallow";
        descer="USB Type-C support\n" +
                "Fingerprint Authentication support\n" +
                "Better battery life with \"deep sleep\"\n" +
                "Permissions dashboard\n" +
                "Android Pay\n" +
                "MIDI support\n" +
                "Google Now improvements";
        id= UUID.randomUUID().toString();
        MainModel modelList2=new MainModel(title,descer,id);
        loaclList.add(modelList2);

        title="Android 5.0 – 5.1.1: Lollipop";
        descer="Multiple SIM cards support\n" +
                "Quick settings shortcuts to join Wi-Fi networks or control Bluetooth devices\n" +
                "Lock protection if lost or stolen\n" +
                "High Definition voice call\n" +
                "Stability and performance enhancements";
        id= UUID.randomUUID().toString();
        MainModel modelList3=new MainModel(title,descer,id);
        loaclList.add(modelList3);


        title="Android 4.4 – 4.4.4: Kit Kat";
        descer="Screen recording\n" +
                "New Translucent system UI\n" +
                "Enhanced notification access\n" +
                "System-wide settings for closed captioning\n" +
                "Performance improvements";
        id= UUID.randomUUID().toString();
        MainModel modelList4=new MainModel(title,descer,id);
        loaclList.add(modelList4);
    }


    public static MainModelList getInstance() {
        if(instance==null){
            instance=new MainModelList();
        }
        return instance;
    }




    @Override
    public List<MainModel> getModelList() {
        return loaclList;
    }
}
