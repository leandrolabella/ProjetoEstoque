package me.devleo.PE.relogio;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AtualizadorHorario {

    public static void start(final JLabel textFieldHorario) {
        Thread atualizaHora = new Thread(() -> {
            try {
                while (true) {
                    Date date = new Date();

                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    textFieldHorario.setText("" + sdf.format(date));
                    Thread.sleep(1000);
                    textFieldHorario.revalidate();
                }
            } catch (InterruptedException ignored) {
            }
        });
        atualizaHora.start();
    }
}
