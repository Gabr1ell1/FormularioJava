package formulario;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame{
  JLabel img, titulo, rotulo1, rotulo2, rotulo3, rotulo4, autor;
  JTextField name, mat;//declarando as caixas de textos
  ButtonGroup grupo1, grupo2;
  JRadioButton etim, mtec, tec, primeiro, segundo, terceiro;//declarando os radios button
  String turno [] = {"Matutino", "Vespertino","Noturno"};
  JComboBox lista;
  JTextArea texto;//CAIXA DE TEXTO 'RESTRIÇÕES MÉDICAS'
  JScrollPane painelrolagem;
  JPanel painel;
  JButton limpar, enviar, sair;//declarando os botões
    
    
  public Formulario(){
      super("Passagem de dados");
      Container tela = getContentPane();
      setLayout(null);
      //ICONE DA JANELA
      ImageIcon icone = new ImageIcon("formulario-de-contato.png");
      setIconImage(icone.getImage());
      
      //ADICIONANDO O ICONE
      ImageIcon icon = new ImageIcon("perfil.png");
      img = new JLabel(icon);
      img.setBounds(10,15,250,30);
      tela.add(img);
      
      
      titulo = new JLabel("Dados Cadastrais do Aluno");
    //-COLUNA-LINHA-COMPRIMENTO-ALTURA
      titulo.setBounds(150,20,250,20);
    //ALTERANDO A FONTE
      titulo.setFont(new Font("Arial",Font.BOLD,16));
      titulo.setForeground(Color.BLUE);
      tela.add(titulo);
              
      
      rotulo1 = new JLabel("Nome: ");
      name = new JTextField(50);
      rotulo1.setBounds(20,60,50,20);
      name.setBounds(70,60,200,20);
      //ALTERANDO FONTE
      rotulo1.setFont(new Font("Arial",Font.BOLD,13));
   
      tela.add(rotulo1);
      tela.add(name);
     
      rotulo2 = new JLabel("Matrícula: ");
      mat = new JTextField(6);
      rotulo2.setBounds(20,100,70,20);
      mat.setBounds(90,100,50,20);
      //ALTERANDO FONTE
      rotulo2.setFont(new Font("Arial",Font.BOLD,13));
      
      tela.add(rotulo2);
      tela.add(mat);
      
      rotulo3 = new JLabel("Informe os dados do seu Curso: ");
      rotulo3.setBounds(20,150,250,20);
      //ALTERANDO FONTE
      rotulo3.setFont(new Font("Arial",Font.BOLD,13));
      
      tela.add(rotulo3);
      
      
      
      etim = new JRadioButton("Etim");
      //ALTERANDO FONTE
      etim.setFont(new Font("Arial",Font.ITALIC,13));
      mtec = new JRadioButton("Mtec");
      //ALTERANDO FONTE
      mtec.setFont(new Font("Arial",Font.ITALIC,13));
      tec = new JRadioButton("Técnico");
      //ALTERANDO FONTE
      tec.setFont(new Font("Arial",Font.ITALIC,13));
      
      primeiro = new JRadioButton("1° Série");
      //ALTERANDO FONTE
      primeiro.setFont(new Font("Arial",Font.ITALIC,13));
      segundo = new JRadioButton("2° Série");
      //ALTERANDO FONTE
      segundo.setFont(new Font("Arial",Font.ITALIC,13));
      terceiro = new JRadioButton("3° Série");
      //ALTERANDO FONTE
      terceiro.setFont(new Font("Arial",Font.ITALIC,13));
      
      
    grupo1 = new ButtonGroup();
    grupo1.add(etim);
    grupo1.add(mtec);
    grupo1.add(tec); 
    //ADICIONANDO OS MÓDULOS
    grupo2 = new ButtonGroup();
    grupo2.add(primeiro);
    grupo2.add(segundo);
    grupo2.add(terceiro);
    //ADICIONANDO OS ANOS
    tela.add(etim);tela.add(mtec);tela.add(tec);
    tela.add(primeiro);tela.add(segundo);tela.add(terceiro);
      
    //CURSOS
    etim.setBounds(20,200,80,20);
    mtec.setBounds(20,220,80,20);
    tec.setBounds (20,240,80,20);
    
    //ANOS 
    primeiro.setBounds  (100,200,100,20);    
    segundo.setBounds   (100,220,100,20);    
    terceiro.setBounds  (100,240,100,20);    
      
    //LISTA DE TURNO
    lista = new JComboBox(turno);
    lista.setMaximumRowCount(3);
    lista.setBounds(200,200,100,20);
    lista.setForeground(Color.GRAY);
    tela.add(lista);
    
      //RESTRIÇÕES MÉDICAS
      rotulo4 = new JLabel("Restrições Médicas: ");
      rotulo4.setBounds(20,300,150,20);
      tela.add(rotulo4);
      
      //CAIXA DE TEXTO
      texto = new JTextArea(10,20);
      painelrolagem = new JScrollPane(texto);//CRIA UM PAINEL DE ROLAGEM QUE CONTÉM A TEXT AREA
      painelrolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
      painel = new JPanel();//CRIA UM PAINEL
      painel.add(painelrolagem);
      painel.setBounds(150,300,250,250);
      tela.add(painel);

  
     
      
      //BOTÃO
      limpar = new JButton("Limpar");
      limpar.setMnemonic(KeyEvent.VK_L);//ATALHO PARA LIMPAR
      limpar.setBounds(20,600,90,20);
      
      enviar = new JButton("Apresentar Dados") ;
      enviar.setBounds(130,600,150,20);
      
      sair = new JButton("Sair");
      sair.setMnemonic(KeyEvent.VK_S);//ATALHO PARA SAIR
      sair.setBounds(300,600,90,20);
      
      
      tela.add(limpar);
      tela.add(enviar);
      tela.add(sair);
      
      
  
      limpar.addActionListener(
    new ActionListener(){  
            public void actionPerformed(ActionEvent e) { 
                //LIMPANDO TUDO 
                name.setText(null);
                mat.setText(null);
                grupo1.clearSelection();
                grupo2.clearSelection();
                texto.setText(null);
                name.requestFocus();
            }
         }
    );
      
      //ENVIANDO DADOS
      enviar.addActionListener(
    new ActionListener(){  
            public void actionPerformed(ActionEvent e) { 
               //CRIANDO VARIAVEIS QUE REPRESENTEM AS ENTRADAS DE DADOS(caixa texto, list...)
               String cursos="", serie="";//OBTÉM O CURSO E A SÉRIE
               String nome =   name.getText(); //OBTÉM O NOME
               String matri =  mat.getText();//OBTÉM A MATRICULA
               String restre = texto.getText();//OBTÉM A RESTRIÇÕES MÉDICAS
               String period = lista.getSelectedItem().toString();//OBTÉM O TURNO
               
                   
                 
                  //SÉRIE
                if(primeiro.isSelected()){//Verifica se o botão de opção 'PRIMEIRO' está selecionado
                     serie= primeiro.getText();//pega o texto do botão de opção
                }else if(segundo.isSelected()){//Verifica se o botão de opção 'SEGUNDO' está selecionado
                                serie = segundo.getText();//pega o texto do botão de opção
                }
                else{//assume que o botão de opção 'TERCEIRO' está selecionado
                     serie= terceiro.getText();//pega o texto do botão de opção
                }
                         //CURSO
                 if(etim.isSelected()){//Verifica se o botão de opção 'Etim' está selecionado
                                cursos = etim.getText();//pega texto texto do radio
                 } else if(mtec.isSelected()){//Verifica se o botão de opção 'Mtec' está selecionado
                                    cursos = mtec.getText();//pega texto texto do radio
                 }
                 else{//assume que o botão de opção 'Técnico' está selecionado
                    cursos = tec.getText();//pega texto texto do radio
                }    
                  // Cria uma instância do formulário 'formulario2' com os dados coletados
                        formulario2 mostra = new formulario2(nome,matri,cursos,serie,period,restre);
                        mostra.setVisible(true);//EXIBINDO O NOVO FORMULÁRIO2
                        dispose();//FECHANDO A JANELA ATUAL
                }
            }
        );
      
      //SAINDO
    sair.addActionListener(
    new ActionListener(){  
            public void actionPerformed(ActionEvent e) { 
               System.exit(0);
            }
         }
    );
      //DEFINIÇÕES DA JANELA
      setResizable(false);
      setSize(500,700);
      setLocationRelativeTo(null);
      setVisible(true);
      
     
  }
    public static void main(String[] args) {
        new Formulario();
        
    }
    
}
