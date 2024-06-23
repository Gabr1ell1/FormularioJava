package formulario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class formulario2 extends JFrame
{
    JLabel img, Nome, Matri,Cursos,Serie,Period,Restr;
    JButton sair, voltar;
    
    public formulario2(String nome,String matri,String cursos, String serie, String period, String restr)
    {
        
        super("Formulário");
        Container tela = getContentPane();
        
         //icone da janela
      ImageIcon icone = new ImageIcon("formulario-de-contato.png");
      setIconImage(icone.getImage());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
      ImageIcon icon = new ImageIcon("alunos.png");
      img = new JLabel(icon);
      img.setBounds(20,20,200,200);
      tela.add(img);
      
        //  exibindo os dados
       Nome = new JLabel(""); 
       Nome.setText("Nome: " +nome);
       Nome.setFont(new Font("Arial",Font.ITALIC,16));
        Nome.setBounds(200, 20, 360, 25);
       
       Matri = new JLabel("");
       Matri.setText("Matrícula: " +matri);
       Matri.setFont(new Font("Arial",Font.ITALIC,16));
        Matri.setBounds(200, 40, 360, 25);
        
        
       
      Cursos = new JLabel(""); 
      Cursos.setText("Curso: " +cursos);
       Cursos.setFont(new Font("Arial",Font.ITALIC,16));
        Cursos.setBounds(200, 80, 360, 25);
        
       Serie = new JLabel(""); 
       Serie.setText("Série: " +serie);
       Serie.setFont(new Font("Arial",Font.ITALIC,16));
        Serie.setBounds(200, 100, 360, 25);
        
       Period = new JLabel(""); 
       Period.setText("Período: " +period );
       Period.setFont(new Font("Arial",Font.ITALIC,16));
         Period.setBounds(200, 120, 360, 25);
         
       Restr = new JLabel("");
       Restr.setText("Restrições Médicas: " +restr);
       Restr.setFont(new Font("Arial",Font.ITALIC,16));
        Restr.setBounds(200, 150, 500, 50);
       
      
        tela.add(Nome);
        tela.add(Matri);
       
        tela.add(Cursos);
        tela.add(Serie);
        tela.add(Period);
        tela.add(Restr); 
       
       
       
       
        voltar = new JButton("Voltar");
        voltar.setBounds(100,400,100,25);
        voltar.addActionListener(
    new ActionListener(){  
            public void actionPerformed(ActionEvent e) { 
               new Formulario();
               dispose();//FECHANDO A JANELA ATUAL
            }
         }
    );
        
        sair = new JButton("Sair");
        sair.setBounds(400,400,100,25);
        sair.addActionListener(
    new ActionListener(){  
            public void actionPerformed(ActionEvent e) { 
               System.exit(0);//SAINDO
            }
         }
    );
        
        //BOTÕES
        tela.add(voltar);
        tela.add(sair);
        //DEFINIÇÕES DA JANELA
        setSize(700,500);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }
}

