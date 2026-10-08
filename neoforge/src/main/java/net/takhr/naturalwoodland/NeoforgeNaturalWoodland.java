package net.takhr.naturalwoodland;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(Constants.MOD_ID)
public class NeoforgeNaturalWoodland {

    public NeoforgeNaturalWoodland(IEventBus eventBus) {

        // Этот метод вызывается загрузчиком модов NeoForge, когда он готов
        // к загрузке вашего мода. В этом проекте вы можете использовать
        // как код NeoForge, так и общий код (Common).

        // Используйте NeoForge для инициализации общего (Common) мода.
        NaturalWoodland.init();

    }
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
            // The registry we want to use.
            // Minecraft's registries can be found in BuiltInRegistries, NeoForge's registries can be found in NeoForgeRegistries.
            // Mods may also add their own registries, refer to the individual mod's documentation or source code for where to find them.
            BuiltInRegistries.BLOCK,
            // Our mod id.
            NaturalWoodland.MOD_ID
    );
}
