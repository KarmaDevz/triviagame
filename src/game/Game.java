/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package game;

import java.awt.Color;
import java.awt.Image;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author David
 */
public class Game extends javax.swing.JFrame {

    private Question[] questions;
    private Set<Integer> shownQuestions;
    private int indicePreguntaAleatoria;

    /**
     * Creates new form Game
     */
    public Game() {
        initComponents();
        setTitle("Trivia Game THINKING FAST");
        shownQuestions = new HashSet<>();
        btnValidate.setEnabled(false);
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/R.png"));
        setIconImage(icon.getImage());
        String rutaImagen = "/assets/ico1.png"; // Ruta relativa dentro del proyecto
        ImageIcon icono = new ImageIcon(getClass().getResource(rutaImagen));
        ImageIcon iconoEscalado = escalarImagen(icono);
        ico1.setIcon(iconoEscalado);
        ico2.setIcon(iconoEscalado);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnswersGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        rbOption1 = new javax.swing.JRadioButton();
        rbOption2 = new javax.swing.JRadioButton();
        rbOption3 = new javax.swing.JRadioButton();
        rbOption4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        lblQuestionsDone = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCorrectAnswers = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblIncorrectAnswers = new javax.swing.JLabel();
        lblQuestion = new javax.swing.JLabel();
        btnValidate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        ico2 = new javax.swing.JLabel();
        ico1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btnStart.setBackground(new java.awt.Color(255, 255, 255));
        btnStart.setForeground(new java.awt.Color(0, 0, 0));
        btnStart.setText("Comenzar");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tiempo");

        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("60");

        AnswersGroup.add(rbOption1);
        rbOption1.setForeground(new java.awt.Color(255, 255, 255));
        rbOption1.setText("Respuesta 1");

        AnswersGroup.add(rbOption2);
        rbOption2.setForeground(new java.awt.Color(255, 255, 255));
        rbOption2.setText("Respuesta 2");
        rbOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOption2ActionPerformed(evt);
            }
        });

        AnswersGroup.add(rbOption3);
        rbOption3.setForeground(new java.awt.Color(255, 255, 255));
        rbOption3.setText("Respuesta 3");

        AnswersGroup.add(rbOption4);
        rbOption4.setForeground(new java.awt.Color(255, 255, 255));
        rbOption4.setText("Respuesta 4");
        rbOption4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOption4ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Preguntas hechas:");

        lblQuestionsDone.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestionsDone.setText("0");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Preguntas correctas:");

        lblCorrectAnswers.setForeground(new java.awt.Color(255, 255, 255));
        lblCorrectAnswers.setText("0");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Preguntas incorrectas:");

        lblIncorrectAnswers.setForeground(new java.awt.Color(255, 255, 255));
        lblIncorrectAnswers.setText("0");

        lblQuestion.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblQuestion.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuestion.setText("Pregunta");

        btnValidate.setText("Validar");
        btnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbOption1)
                            .addComponent(rbOption4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblQuestionsDone))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCorrectAnswers))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIncorrectAnswers))
                            .addComponent(rbOption3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbOption2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addComponent(lblQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addGap(0, 0, 0))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(lblTime)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnStart)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbOption1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOption2)
                    .addComponent(btnValidate))
                .addGap(2, 2, 2)
                .addComponent(rbOption3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbOption4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblQuestionsDone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblCorrectAnswers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblIncorrectAnswers))
                .addGap(56, 56, 56))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel9.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Thinking Fast");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ico1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ico2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ico1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ico2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbOption4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOption4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOption4ActionPerformed
    private void inicializarPreguntas() {
        // Inicializa el array de preguntas con tus preguntas
        questions = new Question[]{
            new Question("¿Cuál es la capital de Francia?", new String[]{"Roma", "Madrid", "París", "Londres"}, 2),
            new Question("¿Cuál es el río más largo del mundo?", new String[]{"Nilo", "Amazonas", "Yangtsé", "Misisipi"}, 1),
            new Question("¿Cuanto es 6/2(2+3)", new String[]{"6/10", "1", "9", "15"}, 2),
            new Question("¿Cuál es el país más poblado del mundo?", new String[]{"China", "India", "EEUU", "Rusia"}, 1),
            new Question("¿Cuantos huesos tiene un ser humano desarrollado?", new String[]{"132", "3", "192", "206"}, 3),
            new Question("¿Cuál es el idioma más hablado del mundo?", new String[]{"Mandarin", "Ingles", "Frances", "Sueco"}, 0),
            new Question("¿Cual NO es un elemento de la tabla periodica?", new String[]{"Helio", "Oro", "Fluor", "Agua"}, 3),
            //Preguntas David
            new Question("¿Cuál es la capital de Colombia?", new String[]{"Medellín", "Santander", "Bogotá", "Cali"}, 2),
            new Question("¿Cual es el plato tipico?", new String[]{"Mazamorra", "Bandeja paisa", "Tamal", "Changua"}, 3),
            new Question("¿Cuanto es 10x30+75+7", new String[]{"375", "383", "3820", "382"}, 3),
            new Question("¿Cuales son los números pares ?", new String[]{"20,60,80,4", "30,245,2,66", "10,15,40,20,4", "2,4,6,7,8,10"}, 1),
            new Question("¿Cuál puede ser el animal carnívoro ?", new String[]{"un caballo", "un cocodrilo", "un loro", "un hipopótamo"}, 1),
            new Question("¿Cuantas regiones tiene Colombia ?", new String[]{"6", "5", "7", "4"}, 0),
            new Question("¿Cuál es el mejor amigo del hombre ?", new String[]{"gallo", "perro", "leon", "serpiente"}, 2),};
    }

    private boolean allQuestionsShown() {
        return shownQuestions.size() == questions.length;
    }

    private ImageIcon escalarImagen(ImageIcon icono) {
        Image imagen = icono.getImage();

// Escalar la imagen para que se ajuste al tamaño del JLabel
        Image imagenEscalada = imagen.getScaledInstance(ico1.getWidth(), ico1.getHeight(), Image.SCALE_SMOOTH);

// Crear un nuevo ImageIcon con la imagen escalada
        ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
        return iconoEscalado;
    }

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        shownQuestions.clear();
        btnStart.setEnabled(false);
        btnValidate.setEnabled(true);
        inicializarPreguntas();
        // Iniciar el temporizador
        iniciarTemporizador();

        // Mostrar una pregunta aleatoria
        mostrarPreguntaAleatoria(questions);
    }//GEN-LAST:event_btnStartActionPerformed
    private void iniciarTemporizador() {
    int tiempoInicial = Integer.parseInt(lblTime.getText());

    SwingWorker<Void, Integer> worker = new SwingWorker<>() {
        @Override
        protected Void doInBackground() throws Exception {
            int tiempoRestante = tiempoInicial;
            while (tiempoRestante > 0) {
                if (allQuestionsShown()) {
                    break;
                }
                tiempoRestante--;
                publish(tiempoRestante);
                Thread.sleep(1000);
            }
            return null;
        }

        @Override
        protected void process(List<Integer> chunks) {
            lblTime.setText(String.valueOf(chunks.get(chunks.size() - 1)));
        }

        @Override
        protected void done() {
            if (allQuestionsShown()) {
                JOptionPane.showMessageDialog(Game.this, "¡Todas las preguntas han sido mostradas!");
            } else {
                JOptionPane.showMessageDialog(Game.this, "¡Tiempo terminado!");
            }
            btnStart.setEnabled(true);
            btnValidate.setEnabled(false);
        }
    };

    worker.execute();
}


    private void mostrarPreguntaAleatoria(Question[] questions) {
        // Obtener una pregunta aleatoria del banco de preguntas
        if (shownQuestions.size() == questions.length) {

            JOptionPane.showMessageDialog(this, "Felicidades. No hay más preguntas disponibles. \n" + "\nRespuestas correctas: " + lblCorrectAnswers.getText() + "\nRespuestas Incorrectas: " + lblIncorrectAnswers.getText() + "\nTiempo Restante: " + lblTime.getText() + " segundos");

            btnStart.setEnabled(true);

            return;
        }
        Random random = new Random();
        do {
            indicePreguntaAleatoria = random.nextInt(questions.length);
        } while (shownQuestions.contains(indicePreguntaAleatoria));

        shownQuestions.add(indicePreguntaAleatoria);

        Question preguntaAleatoria = questions[indicePreguntaAleatoria];

        // Mostrar la pregunta y sus opciones en la interfaz gráfica
        String preguntaText = preguntaAleatoria.getQuestionText();
        String[] opciones = preguntaAleatoria.getOptions();

        lblQuestion.setText(preguntaText);
        rbOption1.setText(opciones[0]);
        rbOption2.setText(opciones[1]);
        rbOption3.setText(opciones[2]);
        rbOption4.setText(opciones[3]);
    }
    private void btnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateActionPerformed
        if (obtenerRespuesta() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione primero una respuesta");
        } else {
            String pregunta = lblQuestion.getText();
            int respuesta = obtenerRespuesta();
            int p = buscarPregunta(pregunta);
            if (pregunta != null) {

                String e = lblQuestionsDone.getText();
                int f = Integer.parseInt(e);
                f++;
                lblQuestionsDone.setText(f + "");
                if (respuesta == p) {
                    // La respuesta es correcta
                    String c = lblCorrectAnswers.getText();
                    int d = Integer.parseInt(c);
                    d++;
                    lblCorrectAnswers.setText(d + "");
                } else {
                    // La respuesta es incorrecta
                    String c = lblIncorrectAnswers.getText();
                    int d = Integer.parseInt(c);
                    d++;
                    lblIncorrectAnswers.setText(d + "");
                }
            }
            mostrarPreguntaAleatoria(questions);
        }
    }//GEN-LAST:event_btnValidateActionPerformed
    private int buscarPregunta(String preguntaText) {
        for (Question pregunta : questions) {
            if (pregunta.getQuestionText().equals(preguntaText)) {
                return pregunta.getCorrectAnswerIndex();
            }
        }
        return -1; // Si no se encuentra ninguna pregunta con el texto dado
    }

    private int obtenerRespuesta() {
        if (rbOption1.isSelected()) {

            return 0;
        } else if (rbOption2.isSelected()) {
            return 1;
        } else if (rbOption3.isSelected()) {
            return 2;
        } else if (rbOption4.isSelected()) {
            return 3;
        } else {
            return -1;
        }
    }
    private void rbOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOption2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOption2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup AnswersGroup;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnValidate;
    private javax.swing.JLabel ico1;
    private javax.swing.JLabel ico2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCorrectAnswers;
    private javax.swing.JLabel lblIncorrectAnswers;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblQuestionsDone;
    private javax.swing.JLabel lblTime;
    private javax.swing.JRadioButton rbOption1;
    private javax.swing.JRadioButton rbOption2;
    private javax.swing.JRadioButton rbOption3;
    private javax.swing.JRadioButton rbOption4;
    // End of variables declaration//GEN-END:variables
}
