
import Classes.EspacoCafe;
import Classes.Pessoa;
import Classes.SalaEvento; 
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastrarPessoa extends javax.swing.JFrame {

    static ArrayList<EspacoCafe> listaEspacoCafe = new ArrayList<EspacoCafe>();
     static ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
     static ArrayList<SalaEvento> listaSalasEvento = new ArrayList<SalaEvento>();
    
    public CadastrarPessoa(ArrayList<Pessoa> listaPessoas, ArrayList<SalaEvento> listaSalasEvento, ArrayList<EspacoCafe> listaEspacoCafe) {
        initComponents();
        this.listaPessoas = listaPessoas;
        this.listaSalasEvento = listaSalasEvento;
        this.listaEspacoCafe = listaEspacoCafe;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Sobrenome");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("Confirmar");
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

        jLabel3.setText("Dados da Pessoa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    SalaEvento salaPreenchida = new SalaEvento();
    EspacoCafe cafePreenchido = new EspacoCafe();
    
    private SalaEvento SalaMenosPessoas(SalaEvento sala){
        for (SalaEvento salas : listaSalasEvento) {
            if (salas.getVagasOcupadas()< sala.getVagasOcupadas() && salas != salaPreenchida) {
                sala = salas;
            }
        }
        sala.setVagasOcupadas();
        return sala;
    }
    
    private EspacoCafe CafeMenosPessoas(EspacoCafe cafe){
        for (EspacoCafe cafes : listaEspacoCafe) {
            if (cafes.getVagasOcupadas() < cafe.getVagasOcupadas() && cafes != cafePreenchido) {
                cafe = cafes;
            }
        }
        cafe.setVagasOcupadas();
        return cafe;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nome = jTextField1.getText();
        String sobrenome = jTextField2.getText();
         
        SalaEvento salaComMenosPessoas = new SalaEvento("nenhuma", "99999999");
        SalaEvento salaComMenosPessoasSegunda = new SalaEvento("nenhuma", "99999999");

        salaComMenosPessoas = SalaMenosPessoas(salaComMenosPessoas);
        salaPreenchida = salaComMenosPessoas;
        salaComMenosPessoasSegunda = SalaMenosPessoas(salaComMenosPessoasSegunda);
        
        EspacoCafe menorCafe = new EspacoCafe("xd", "999999");
        EspacoCafe menorCafeDois = new EspacoCafe("xdDois", "999999");
        
        menorCafe = CafeMenosPessoas(menorCafe);
        cafePreenchido = menorCafe;
        menorCafeDois = CafeMenosPessoas(menorCafeDois);
        
        Pessoa novaPessoa = new Pessoa();
        novaPessoa.setNome(nome);
        novaPessoa.setSobrenome(sobrenome);
        novaPessoa.setSalaEventoUm(salaComMenosPessoas);
        novaPessoa.setSalaEventoDois(salaComMenosPessoasSegunda);
        novaPessoa.setSalaCafeUm(menorCafe);
        novaPessoa.setSalaCafeDois(menorCafeDois);
        
        salaComMenosPessoas.addListaPessoas(novaPessoa);
        salaComMenosPessoasSegunda.addListaPessoas(novaPessoa);
        menorCafe.addListaPessoas(novaPessoa);
        menorCafeDois.addListaPessoas(novaPessoa);
        
        listaPessoas.add(novaPessoa);

        JOptionPane.showMessageDialog(null, nome + " cadastrado(a) com sucesso!");
        
        Menu menu = new Menu(listaPessoas, listaSalasEvento, listaEspacoCafe);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:]
         Menu menu = new Menu(listaPessoas, listaSalasEvento, listaEspacoCafe);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
