
import Classes.EspacoCafe;
import Classes.Pessoa;
import Classes.SalaEvento;
import java.util.ArrayList;

public class ConsultaPessoa extends javax.swing.JFrame {

    public ConsultaPessoa(ArrayList<Pessoa> listaPessoas, ArrayList<SalaEvento> listaSalasEvento, ArrayList<EspacoCafe> listaEspacoCafe, Pessoa pessoa) {
        initComponents();
        this.listaPessoas = listaPessoas;
        this.listaSalasEvento = listaSalasEvento;
        this.listaEspacoCafe = listaEspacoCafe;
        this.pessoa = pessoa;

        Nome.setText(pessoa.getNome());
        Sobrenome.setText(pessoa.getSobrenome());

        SalaEvento sala1 = BuscaSala();
        SalaEvento sala2 = BuscaSala(sala1);

        SalaEvento1.setText(sala1.getNome());
        SalaEvento2.setText(sala2.getNome());

        EspacoCafe espacoCafe1 = BuscaCafe();
        EspacoCafe espacoCafe2 = BuscaCafe(espacoCafe1);

        EspacoCafe1.setText(espacoCafe1.getNome());
        EspacoCafe2.setText(espacoCafe2.getNome());
    }

    private EspacoCafe BuscaCafe() {
        return BuscaCafe(new EspacoCafe());
    }

    private EspacoCafe BuscaCafe(EspacoCafe espacoCafe) {
        EspacoCafe cafe = new EspacoCafe();

        for (EspacoCafe areaCafe : listaEspacoCafe) {
            if (areaCafe != espacoCafe) {
                for (Pessoa p : areaCafe.getListaPessoas()) {
                    if (p == pessoa) {
                        cafe = areaCafe;
                    }
                }
            }
        }

        return cafe;
    }

    private SalaEvento BuscaSala() {
        return BuscaSala(new SalaEvento());
    }

    private SalaEvento BuscaSala(SalaEvento diferenteDaSala) {
        SalaEvento sala = new SalaEvento();

        for (SalaEvento salita : listaSalasEvento) {
            if (salita != diferenteDaSala) {
                for (Pessoa p : salita.getListaPessoas()) {
                    if (p == pessoa) {
                        sala = salita;
                    }
                }
            }
        }

        return sala;
    }

    private Pessoa pessoa;

    static ArrayList<EspacoCafe> listaEspacoCafe = new ArrayList<EspacoCafe>();
    static ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
    static ArrayList<SalaEvento> listaSalasEvento = new ArrayList<SalaEvento>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Sobrenome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SalaEvento1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SalaEvento2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EspacoCafe1 = new javax.swing.JTextField();
        EspacoCafe2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeActionPerformed(evt);
            }
        });

        jLabel2.setText("SobreNome");

        jLabel3.setText("Sala Evento 1");

        jLabel4.setText("Sala Evento 2");

        jLabel5.setText("Espaço Café 1");

        jLabel6.setText("Espaço Café 2");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(EspacoCafe1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addComponent(SalaEvento1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Nome, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Sobrenome)
                                .addComponent(SalaEvento2)
                                .addComponent(EspacoCafe2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalaEvento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalaEvento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EspacoCafe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EspacoCafe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu menu = new Menu(listaPessoas, listaSalasEvento, listaEspacoCafe);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EspacoCafe1;
    private javax.swing.JTextField EspacoCafe2;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField SalaEvento1;
    private javax.swing.JTextField SalaEvento2;
    private javax.swing.JTextField Sobrenome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
