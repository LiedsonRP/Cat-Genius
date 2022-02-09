package genius;

import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Genius extends javax.swing.JFrame {

    FilaMetodos fila1 = new FilaMetodos();
    FilaMetodos fila2 = new FilaMetodos();
    No aux1;
    Timer timer;
    Timer nextTimer;
    boolean next = true;

    TocarSom som = new TocarSom();

    public Genius() {
        initComponents();
        timer = new Timer(1000, null);
        nextTimer = new Timer(100, null);                       
        iniciar();
    }

    public void iniciar() {
        imagemInicial();
        mostrarFila1();
    }

    public ImageIcon insereImagem(String caminho_arquivo) { //Função que adiciona imagens no componentes
        ImageIcon btn = new ImageIcon(getClass().getResource((caminho_arquivo)));
        btn.setImage(btn.getImage().getScaledInstance(110, 110, 1));
        return btn;
    }

    public void imagemInicial() { //Adiciona as imagens padrões dos botões desativados               
        jButton1.setIcon(this.insereImagem("/imagens/gatomexendoorelhas.png"));
        jButton2.setIcon(this.insereImagem("/imagens/gatidancando.png"));
        jButton3.setIcon(this.insereImagem("/imagens/gatomexe.png"));
        jButton4.setIcon(this.insereImagem("/imagens/gatomoonwalk.png"));
    }

    public String botaoAleatorio() {
        String botoes[] = {"btn1", "btn2", "btn3", "btn4"};
        String botao = botoes[(int) (Math.random() * botoes.length)];

        fila1.adicionar(botao);
        aux1 = fila1.getPrimeiro();

        return botao;
    }

    public void mostrarFila1() {                      
        botaoAleatorio();                     
        System.out.println(aux1.getValor());
        do {                        
            
            if (aux1.getValor().equals("btn1")) {
                //Colocar  negócio das imagens e do audio aqui                
                jButton1.setIcon(insereImagem("/imagens/gatomexendoorelhas.gif"));                
                System.out.println("botão1");
                //inicia o timer
                timer.start();
                //Ação executada quando bater o timer
                timer.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jButton1.setIcon(insereImagem("/imagens/gatomexendoorelhas.png"));                        
                        System.out.println("stop1");
                        timer.stop();                        
                        
                    }
                });
            }

            if (aux1.getValor().equals("btn2")) {
                jButton2.setIcon(this.insereImagem("/imagens/gatidancando.gif"));                
                System.out.println("botao 2");
                        
                //inicia o timer
                timer.start();
                //Ação executada quando bater o timer
                timer.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jButton2.setIcon(insereImagem("/imagens/gatidancando.png"));                
                        System.out.println("stop2");
                        timer.stop();                        
                    }
                });
            }

            if (aux1.getValor().equals("btn3")) {
                jButton3.setIcon(this.insereImagem("/imagens/gatomexe.gif"));                
                System.out.println("botao 3");
                                        
                //inicia o timer
                timer.start();
                //Ação executada quando bater o timer
                timer.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jButton3.setIcon(insereImagem("/imagens/gatidancando.png"));
                        System.out.println("stop3");
                        timer.stop();                        
                    }
                });
            }

            if (aux1.getValor().equals("btn4")) {
                jButton4.setIcon(this.insereImagem("/imagens/gatomoonwalk.gif"));                
                System.out.println("botao 4");
                
                //inicia o timer
                timer.start();
                //Ação executada quando bater o timer
                timer.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jButton4.setIcon(insereImagem("/imagens/gatidancando.png"));
                        System.out.println("stop1");
                        timer.stop();                        
                    }
                });
            }               
            
            System.out.println("m");
            aux1 = aux1.getProximo();
                       
        } while (aux1 != null);
                        
    }

    public void recebeFila2(String nomeBotao) {
        System.out.println("m");
        fila2.adicionar(nomeBotao);
        if (fila1.getTamanho() == fila2.getTamanho()) {
            comparaFilas();
        }
    }

    public void comparaFilas() {
        int i = 0;
        String filaA = fila1.exibirFila();
        String filaB = fila2.exibirFila();

        //System.out.println(filaA + "|" + filaB);
        if (filaA.equals(filaB)) {
            //Depois de endireitar as imagens tira essa janela
            JOptionPane.showMessageDialog(null, "Você prossiga");
            while (i != fila1.getTamanho()) {
                fila2.remover();
                i++;
            }

            iniciar();

        } else {
            JOptionPane.showMessageDialog(null, "Você perdeu");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setMinimumSize(new java.awt.Dimension(542, 478));
        jPanel2.setPreferredSize(new java.awt.Dimension(542, 542));

        jButton2.setText("jButton2");
        jButton2.setPreferredSize(new java.awt.Dimension(110, 110));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.setPreferredSize(new java.awt.Dimension(110, 110));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.setPreferredSize(new java.awt.Dimension(110, 110));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.setMaximumSize(new java.awt.Dimension(110, 110));
        jButton1.setMinimumSize(new java.awt.Dimension(110, 110));
        jButton1.setPreferredSize(new java.awt.Dimension(110, 110));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(108, 108, 108))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("Clicou o botão1");
        recebeFila2("btn1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println("Clicou o botão2");
        recebeFila2("btn2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.out.println("Clicou o botão3");
        recebeFila2("btn3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.out.println("Clicou o botão4");
        recebeFila2("btn4");
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Genius.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Genius.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Genius.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Genius.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Genius().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
