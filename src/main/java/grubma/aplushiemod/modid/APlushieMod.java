package grubma.aplushiemod.modid;

import grubma.aplushiemod.modid.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//This is a comment...
public class APlushieMod implements ModInitializer {
	public static final String MOD_ID = "aplushiemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}