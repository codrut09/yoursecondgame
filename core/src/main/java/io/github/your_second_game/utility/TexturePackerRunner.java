package io.github.your_second_game.utility;

import com.badlogic.gdx.tools.texturepacker.TexturePacker;

public class TexturePackerRunner {
    public static void main(String[] args) {
        // Calea către folderul cu imagini (sprite-urile tale)
        String inputDir = "assets/sprites";
        // Calea unde va fi salvat atlasul generat
        String outputDir = "assets/atlases";
        // Numele fișierului .atlas generat
        String atlasName = "my_animation";

        // Apelarea metodei pentru a genera atlasul
        TexturePacker.process(inputDir, outputDir, atlasName);
    }
}
