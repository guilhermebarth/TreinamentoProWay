
import Classes.EspacoCafe;
import Classes.Pessoa;
import Classes.SalaEvento;
import Interfaces.Locacao;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class MostrarSalaECafe extends javax.swing.JFrame {

    static ArrayList<EspacoCafe> listaEspacoCafe = new ArrayList<EspacoCafe>();
    static ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
    static ArrayList<SalaEvento> listaSalasEvento = new ArrayList<SalaEvento>();
    private Locacao locacao;

    public MostrarSalaECafe(ArrayList<Pessoa> listaPessoas, ArrayList<SalaEvento> listaSalasEvento, ArrayList<EspacoCafe> listaEspacoCafe, Locacao locacao) {
        initComponents();
        this.listaPessoas = listaPessoas;
        this.listaSalasEvento = listaSalasEvento;
        this.listaEspacoCafe = listaEspacoCafe;
        this.locacao = locacao;

        if (locacao instanceof SalaEvento && this.listaSalasEvento.size() > 0) {
            SetaValoresComboBox(this.listaSalasEvento);
            jLabel3.setText("Selecione a sala de evento que deseja verificar as informações.");
        } else if (this.listaEspacoCafe.size() > 0) {
            SetaValoresComboBox(this.listaEspacoCafe);
            jLabel3.setText("Selecione o espaço de café que deseja verificar as informações.");
        } else {
            String local = "espaço café";
            if (locacao instanceof SalaEvento) {
                local = "sala de evento";
            }
            jLabel3.setText("Não há nenhum(a) " + local + " cadastrado.");
            jComboBox1.removeAllItems();
        }
    }

    public void SetaValoresComboBox(ArrayList<? extends Locacao> valores) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        for (int i = 0; i < valores.size(); i++) {
            Locacao local = valores.get(i);
            model.insertElementAt(i + " - " + local.getNome() + " - Capacidade: " + local.getLocacao(), i);
        }

        jComboBox1.removeAllItems();
        jComboBox1.setModel(model);

        jComboBox1.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Selecione");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Detalhes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InformacoesDoComodo comodoFrame;
        if (locacao instanceof SalaEvento) {
            if (this.listaSalasEvento.get(jComboBox1.getSelectedIndex()).getListaPessoas().size() == 0) {
                JOptionPane.showMessageDialog(null, "Não há nenhuma pessoa nessa sala.");
                return;
            }
            comodoFrame = new InformacoesDoComodo(listaPessoas, listaSalasEvento, listaEspacoCafe, this.listaSalasEvento.get(jComboBox1.getSelectedIndex()), null);
        } else {
            if (this.listaEspacoCafe.get(jComboBox1.getSelectedIndex()).getListaPessoas().size() == 0) {
                JOptionPane.showMessageDialog(null, "Não há nenhuma pessoa nesse espaço de café.");
                return;
            }
            comodoFrame = new InformacoesDoComodo(listaPessoas, listaSalasEvento, listaEspacoCafe, null, this.listaEspacoCafe.get(jComboBox1.getSelectedIndex()));
        }

        comodoFrame.setVisible(true);
        comodoFrame.setLocationRelativeTo(null);
        comodoFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Menu menuFrame = new Menu(listaPessoas, listaSalasEvento, listaEspacoCafe);
        menuFrame.setVisible(true);
        menuFrame.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
