package net.takhr.examplemod;

import net.fabricmc.api.ModInitializer;

public class FabricExampleMod implements ModInitializer {
    
    @Override
    public void onInitialize() {

        // Этот метод вызывается загрузчиком модов Fabric, когда он готов
        // к загрузке вашего мода. В этом проекте вы можете использовать
        // как код Fabric, так и общий код (Common).

        // Используйте Fabric для инициализации общего мода (Common mod).
        CommonExampleMod.init();
    }
}
