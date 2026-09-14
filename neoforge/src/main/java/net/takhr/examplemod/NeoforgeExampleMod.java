package net.takhr.examplemod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class NeoforgeExampleMod {

    public NeoforgeExampleMod(IEventBus eventBus) {

        // Этот метод вызывается загрузчиком модов NeoForge, когда он готов
        // к загрузке вашего мода. В этом проекте вы можете использовать
        // как код NeoForge, так и общий код (Common).

        // Используйте NeoForge для инициализации общего (Common) мода.
        CommonExampleMod.init();

    }
}