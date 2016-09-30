/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.tiles;

import java.awt.image.BufferedImage;
import pokemon.gfx.Assets;

/**
 *
 * @author MAXIMILIAM GARCIA
 */
public class SandTile extends Tile{
    
    public SandTile(int id) {
        super(Assets.sand, id);
    }
    
    @Override
    public boolean isSpawneable(){
        return true;
    }
}
