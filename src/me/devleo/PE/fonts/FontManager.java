package me.devleo.PE.fonts;

import java.awt.*;
import java.io.IOException;

public class FontManager {

    public Font carregarFont(String pCaminhoFonte, int tipoFonte, int pTamanhoFonte) {
        Font minhaFonte = null;

        try {
            minhaFonte = Font.createFont(
                    Font.TRUETYPE_FONT,
                    getClass().getResourceAsStream(pCaminhoFonte)
            ).deriveFont(tipoFonte, pTamanhoFonte);
        } catch (IOException | FontFormatException ignored) {
        }
        return minhaFonte;
    }
}
