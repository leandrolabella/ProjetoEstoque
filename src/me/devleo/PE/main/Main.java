package me.devleo.PE.main;

import me.devleo.PE.fonts.FontManager;
import me.devleo.PE.sql.ConnectionUtils;
import me.devleo.PE.view.MenuView;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        FontManager fontManager = new FontManager();
        Font futuraPT16 = fontManager.carregarFont("/resources/fontes/FuturaPT.otf", Font.PLAIN, 16);
        Font futuraPT14 = fontManager.carregarFont("/resources/fontes/FuturaPT.otf", Font.PLAIN, 14);
        Font futuraPT14Bold = fontManager.carregarFont("/resources/fontes/FuturaPT.otf", Font.BOLD, 14);
        Font futuraPT13 = fontManager.carregarFont("/resources/fontes/FuturaPT.otf", Font.PLAIN, 13);

        UIManager.put("dateChooserCombo", futuraPT13);
        UIManager.put("Button.font", futuraPT16);
        UIManager.put("RadioButton.font", futuraPT13);
        UIManager.put("CheckBox.font", futuraPT13);
        UIManager.put("ComboBox.font", futuraPT13);
        UIManager.put("Label.font", futuraPT14);
        UIManager.put("Panel.font", futuraPT16);
        UIManager.put("Table.font", futuraPT13);
        UIManager.put("TableHeader.font", futuraPT14Bold);
        UIManager.put("TextField.font", futuraPT13);
        UIManager.put("FormattedTextField.font", futuraPT13);
        UIManager.put("TextArea.font", futuraPT13);
        try {
            ConnectionUtils.criarTabelas();
        } catch (Exception ignored) {
        }
        new MenuView().setVisible(true);
    }
}
