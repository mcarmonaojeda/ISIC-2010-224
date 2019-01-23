/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatagrafico;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author csxr
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    private Grafico grafico = new Grafico();
    public String Kdena;
    private Character[] cadenita;
    private Character[] cadenaAuto;
    private Estado[] transicion;
    private static ArrayList<Estado> estados;
    public ArrayList<Estado> estfinales;
    private Transicion[] transiciones;
    private String Cadena;
    private Estado est;
    public Ventana() {
        initComponents();
        this.setTitle("Automata");
        this.setLocationRelativeTo(this);
        setResizable(false);
        grafico.setBounds(0, 0, 418, 165);
        grafico.setBackground(Color.BLACK);
        dibujo.add(grafico);
        this.getContentPane().add(dibujo);
        this.setLayout(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtAlfabeto = new javax.swing.JTextField();
        btnAlfabeto = new javax.swing.JButton();
        dibujo = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtCadena = new javax.swing.JTextField();
        btnCadena = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ALFABETO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        btnAlfabeto.setText("INGRESAR");
        btnAlfabeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlfabetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAlfabeto, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(txtAlfabeto))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAlfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlfabeto)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        dibujo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout dibujoLayout = new javax.swing.GroupLayout(dibujo);
        dibujo.setLayout(dibujoLayout);
        dibujoLayout.setHorizontalGroup(
            dibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dibujoLayout.setVerticalGroup(
            dibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CADENA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16))); // NOI18N

        btnCadena.setText("ENVIAR");
        btnCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCadena)
                    .addComponent(btnCadena, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadena)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dibujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(dibujo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlfabetoActionPerformed
        Cadena = txtAlfabeto.getText();
        cadenita = new Character[Cadena.length()];

            try {
            for (int i = 0; i < Cadena.length(); i++) {
               cadenita[i]=Cadena.charAt(i);
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error en la longitud de la cadena", "Error encontrado", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAlfabetoActionPerformed

    private void btnCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadenaActionPerformed
        // TODO add your handling code here:
        Kdena = txtCadena.getText();
        estfinales = new ArrayList<>();
        boolean val=false;
        cadenaAuto = new Character[Kdena.length()];
        
            for (int i = 0; i < Kdena.length(); i++) {
               cadenaAuto[i]=Kdena.charAt(i);
            }  
        
        for (Estado obj : estados) {
            if (obj.isInicial()) {
                est = obj;
                System.out.println("El estado inicial es: " + obj.getIdentificador());
               // break;
            } else if (obj.isFinal()) {
                estfinales.add(obj);
                System.out.println("Estado final: " + obj.getIdentificador());
            }
        }
        
        val = autovalidador();
        System.out.println("Valor de val: " + val);
        
        if (val) {
            System.out.println("Cadena valida");
            JOptionPane.showMessageDialog(rootPane, "La cadena ingresada es reconocida por el automata", "Correcto", JOptionPane.INFORMATION_MESSAGE);
        }else{
            System.out.println("cadena invalida");
            JOptionPane.showMessageDialog(rootPane, "La cadena ingresada no es reconocida por el automata", "Correcto", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnCadenaActionPerformed

    public void recuperarCadena(ArrayList<Estado> aux) {
        estados = new ArrayList<>();
        try {
            for (Estado obj : aux) {
                estados.add(obj);
            }            
        } catch (Exception e) {
            System.out.println("Estados esta vacio");
        }

    }
    
    
    
    public boolean autovalidador(){
        boolean valida=false;
        Estado aux2 = null;
        Estado aux=est;
        int cot=0,cota=Kdena.length();
        System.out.println("Aqui empieza la validacion del automata.");
        System.out.println("Inicial: " + aux.getIdentificador());
        
            do{
                System.out.println("Caracter a evaluar: " + cadenaAuto[cot]);
                aux=retorno(aux, cadenaAuto[cot]);
                try {
                    if (aux!=null) {
                      System.out.println("Estado a evaluar: " + aux.getIdentificador());   
                    }                    
                } catch (Exception e) {
                    System.out.println("No hay transicion...");
                }

                if (aux!=null && aux.isFinal()) {
                    valida=true;
                }else if(aux == null){
                    valida=false;
                    break;
                }else{
                    System.out.println("Estado normal: " + aux.getIdentificador());
                    valida=false;
                }
                cot++;
            }while(cot<cota);
        
        if(aux!=null && esFinal(aux)) {
            valida=true;
        }
        
        return valida;
    }
    
    /*
    *Esta funciṕn recibe el estado y un caracter, retorna la transición 
    *a la que lleva este estado.
    */
    public Estado retorno(Estado aux, char a){
        Estado retornado=null;
        //ArrayList<Transicion> transitiones = new ArrayList<>();
        int i=0;
        char car;
        
        //mostrar2(aux.getTrapito(),aux);
        if (probar(a)) {
            try {
                for (Transicion t: aux.getTransiciones()) {
                    if (t.getTransicion()==a) {
                        retornado=t.getStateF();
                        break;
                    }
                }            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Esta vacia esta wea", "Error encontrado en mostrar", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            retornado=null;
        }

        return retornado;
    }//Fin retorno
    
    public boolean probar(char x){
        boolean bandera=false;
        int i=0;
        try {
            for (int j = 0; j < Cadena.length(); j++) {
                if (cadenita[j].equals(x) || cadenita[j]==x) {
                    bandera=true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el alfabeto");
        }
        
        return bandera;
    }//Fin probar

        //Esta función recibe un estado y returna true en caso de ser final
    public boolean esFinal(Estado f){
        boolean b=false;
        
        try {
            for(Estado ef: estfinales){
                if(ef.getIdentificador().equals(f.getIdentificador()) && f.isFinal()){
                    b=true;
                    break;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error en el estado final", "Error encontrado en esFInal", JOptionPane.ERROR_MESSAGE);
        }
        return b;
    }//Fin esFinal
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlfabeto;
    private javax.swing.JButton btnCadena;
    private javax.swing.JPanel dibujo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtAlfabeto;
    private javax.swing.JTextField txtCadena;
    // End of variables declaration//GEN-END:variables
}