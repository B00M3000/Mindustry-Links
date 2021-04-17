package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
      BaseDialog dialog = new BaseDialog("frog");
      dialog.cont.add("behold").row();
      dialog.cont.button("I see", dialog::hide).size(100f, 50f);
      dialog.show();
    }
}
