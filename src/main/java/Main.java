
import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.NiftyInputConsumer;
import de.lessvoid.nifty.nulldevice.NullSoundDevice;
import de.lessvoid.nifty.slick2d.input.SlickInputSystem;
import de.lessvoid.nifty.slick2d.render.SlickRenderDevice;
import de.lessvoid.nifty.spi.time.TimeProvider;
import de.lessvoid.nifty.tools.resourceloader.NiftyResourceLoader;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Main {
    public static void main(String[] args){
        //
        System.out.println("Hello fucking world");

        Logger log = LoggerFactory.getLogger(Main.class);

        log.info("Wtf");

        //SlickInputSystem is = new SlickInputSystem();




        //Nifty nifty = new Nifty(new SlickRenderDevice(new GameContainer(new Game())), new NullSoundDevice(), new SlickInputSystem(), new TimeProvider());
        //Nifty nifty = new Nifty(new LwjglRenderDevice(new GameContainer(new Game())), new NullSoundDevice(), new SlickInputSystem(), new TimeProvider());

       // String vr = nifty.getVersion();

        //log.info("Vr = " + vr);

    }
}
