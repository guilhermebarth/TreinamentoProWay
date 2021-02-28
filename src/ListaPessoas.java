
import Classes.EspacoCafe;
import Classes.Pessoa;
import Classes.SalaEvento;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class ListaPessoas extends javax.swing.JFrame {

    static ArrayList<EspacoCafe> listaEspacoCafe = new ArrayList<EspacoCafe>();
    static ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
    static ArrayList<SalaEvento> listaSalasEvento = new ArrayList<SalaEvento>();

    public ListaPessoas(ArrayList<Pessoa> listaPessoas, ArrayList<SalaEvento> listaSalasEvento, ArrayList<EspacoCafe> listaEspacoCafe) {
        initComponents();
        this.listaPessoas = listaPessoas;
        this.listaSalasEvento = listaSalasEvento;
        this.listaEspacoCafe = listaEspacoCafe;

        DefaultComboBoxModel model = new DefaultComboBoxModel();

        for (int i = 0; i < listaPessoas.size(); i++) {
            Pessoa pessoa = listaPessoas.get(i);
            model.insertElementAt(i + "-" + pessoa.getNome() + " " + pessoa.getSobrenome(), i);
        }

        ListaPessoas.removeAllItems();
        ListaPessoas.setModel(model);

        ListaPessoas.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListaPessoas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListaPessoas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Visualizar Dados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecione uma pessoa para visualizar detalhes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(ListaPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ListaPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int pessoaID = ListaPessoas.getSelectedIndex();
        Pessoa p = this.listaPessoas.get(pessoaID);

        ConsultaPessoa cp = new ConsultaPessoa(listaPessoas, listaSalasEvento, listaEspacoCafe, p);
        cp.setVisible(true);
        cp.setLocationRelativeTo(null);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Menu menuFrame = new Menu(listaPessoas, listaSalasEvento, listaEspacoCafe);
        menuFrame.setVisible(true);
        menuFrame.setLocationRelativeTo(null);
        this.setVisible(false);


    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ListaPessoas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
