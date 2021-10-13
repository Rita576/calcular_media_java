
package janela;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Janela1 extends JFrame{
 
    private JLabel nota1;
    private JLabel nota2;
    private JTextField meuTextField;
    private JButton calcular;
    
    public Janela1(){
        super ("Média do Semestre");
        setLayout(new FlowLayout());
        
        
        nota1 = new JLabel("\n Digite a Nota 1: ");               
        meuTextField = new JTextField(15);       
        add(nota1);
        add(meuTextField);
        
        nota2 = new JLabel("\n Digite a Nota 2: ");               
        meuTextField = new JTextField(15);       
        add(nota2);
        add(meuTextField);
        
         calcular = new JButton("Calcular Média");
          add(calcular);
          
         calcular.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                    float n1, n2, media ;
                    n1 = Float.parseFloat(meuTextField.getText());
                    n2 = Float.parseFloat(meuTextField.getText());
                    media = (n1 + n2)/2;
                    
                    if(media >= 7){
                       JOptionPane.showMessageDialog(null, media  + " Aprovado");
                    }else  if(media >=4 && media < 7){
                           JOptionPane.showMessageDialog(null, media  + " Recuperação");
                    }else {
                           JOptionPane.showMessageDialog(null, media  + " Reprovado");                                                                           
                    }
                                     
                    }
                  }
             );
       
         }
    
      }       
    
    

