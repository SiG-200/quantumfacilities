package cf.blazecode.mod.util.world;

import cf.blazecode.mod.util.BlockHandler;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

/**
 * This app is maintened by BlazeCode - Blazing The Code
 * Web: http://blazecode.cf
 *
 * @since 31/01/2016/01/2016
 * <p/>
 * Created By: SiG-200
 */
public class WorldHandler implements IWorldGenerator
{
    @Override
    public void generate(Random random, int ChunkX, int ChunkZ, World world, IChunkProvider chunkGenerator
                        , IChunkProvider chunkProvider)
    {
        switch(world.provider.dimensionId)
        {
            case 0: generateOverworld(random, world, ChunkX * 16, ChunkZ * 16); break;
            case 1: generateEnd(random, world, ChunkX * 16, ChunkZ * 16); break;
            case -1: generateNether(random, world, ChunkX * 16, ChunkZ * 16); break;
            default: generateOverworld(random, world, ChunkX * 16, ChunkZ * 16);
        }
    }
    private void generateNether(Random random, World world, int x, int z){}
    private void generateEnd(Random random, World world, int x, int z){}
    private void generateOverworld(Random random, World world, int x, int z)
    {
        //Orespawn Here
        addOreSpawn(BlockHandler.siliconOre, world, random, x, z, 6, 9, 18, 0, 40);
    }

    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int minVeinSize,
                            int maxVeinSize, int chancesToSpawn, int minY, int maxY) {

        WorldGenMinable minable = new WorldGenMinable(block, minVeinSize + random.nextInt(maxVeinSize - minVeinSize), Blocks.stone);

        for(int i = 0;i <= chancesToSpawn; i++) {

            int posX = blockXPos + random.nextInt(15);
            int posZ = blockZPos + random.nextInt(15);
            int posY = minY + random.nextInt(maxY - minY);

            minable.generate(world, random, posX, posY, posZ);
        }

    }

    public void addNetherOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int minVeinSize,
                                  int maxVeinSize, int chancesToSpawn, int minY, int maxY) {

        WorldGenMinable minable = new WorldGenMinable(block, minVeinSize + random.nextInt(maxVeinSize - minVeinSize), Blocks.netherrack);

        for (int i = 0; i < chancesToSpawn; i++) {
            int posX = blockXPos + random.nextInt(16);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = blockZPos + random.nextInt(16);
            minable.generate(world, random, posX, posY, posZ);
        }
    }
}