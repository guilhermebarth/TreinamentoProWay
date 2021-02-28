
import Classes.EspacoCafe;
import Classes.Pessoa;
import Classes.SalaEvento;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class InformacoesDoComodo extends javax.swing.JFrame {

    static ArrayList<EspacoCafe> listaEspacoCafe = new ArrayList<EspacoCafe>();
    static ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
    static ArrayList<SalaEvento> listaSalasEvento = new ArrayList<SalaEvento>();
    
    public InformacoesDoComodo(ArrayList<Pessoa> listaPessoas, ArrayList<SalaEvento> listaSalasEvento, ArrayList<EspacoCafe> listaEspacoCafe, SalaEvento sala, EspacoCafe cafe) {
        initComponents();
        this.listaPessoas = listaPessoas;
        this.listaSalasEvento = listaSalasEvento;
        this.listaEspacoCafe = listaEspacoCafe;

        if (sala != null) {
                       
            DefaultListModel listModel = new DefaultListModel();
            for (Pessoa pessoa : sala.getListaPessoas()) {
                list1.add(pessoa.getNome() + " " + pessoa.getSobrenome());
            }
        }
        if (cafe != null) { 
            

            DefaultListModel listModel = new DefaultListModel();
            for (Pessoa pessoa : sala.getListaPessoas()) {
                list1.add(pessoa.getNome() + " " + pessoa.getSobrenome());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lista de pessoas no cômodo");

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu menuFrame = new Menu(listaPessoas, listaSalasEvento, listaEspacoCafe);
        menuFrame.setVisible(true);
        menuFrame.setLocationRelativeTo(null);        
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables
}
