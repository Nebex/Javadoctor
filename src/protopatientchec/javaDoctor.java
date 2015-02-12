/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package protopatientchec;
import java.io.File;
 
  import java.security.MessageDigest;
import java.io.*; 
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.DigestInputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;

import java.util.Scanner;
import java.util.zip.CRC32;
import org.apache.commons.codec.digest.DigestUtils;
/*
*
 *
 * @author Ben struhl
 */
public class javaDoctor extends javax.swing.JFrame {

    /**
     * Creates new form javaDoctor
     */
    public javaDoctor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Result4 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox();
        Result6 = new javax.swing.JLabel();
        Result9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Result2 = new javax.swing.JLabel();
        spaceCheck = new javax.swing.JButton();
        Result1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Result3 = new javax.swing.JLabel();
        fileCheck = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        deleteFile = new javax.swing.JButton();
        Result5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Result7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        Result10 = new javax.swing.JLabel();
        Result8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        Result4.setBackground(new java.awt.Color(0, 0, 0));
        Result4.setText(" Result");
        Result4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Result6.setBackground(new java.awt.Color(0, 0, 0));
        Result6.setText(" Result");
        Result6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        Result9.setBackground(new java.awt.Color(0, 0, 0));
        Result9.setText(" Result");
        Result9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Test Processer Speed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                process(evt);
            }
        });

        jLabel2.setText("Your proccesor speed");

        Result2.setBackground(new java.awt.Color(0, 0, 0));
        Result2.setText(" Result");
        Result2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        spaceCheck.setText("Get Usable Space");
        spaceCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaceCheckActionPerformed(evt);
            }
        });

        Result1.setBackground(new java.awt.Color(0, 0, 0));
        Result1.setText(" Result");
        Result1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel4.setText("*in Gigabytes ");

        Result3.setBackground(new java.awt.Color(0, 0, 0));
        Result3.setText(" Result");
        Result3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        fileCheck.setText("check files existence\n");
        fileCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileCheckActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        deleteFile.setText("Delete File");
        deleteFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFileActionPerformed(evt);
            }
        });

        Result5.setBackground(new java.awt.Color(0, 0, 0));
        Result5.setText(" Result");
        Result5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel5.setFont(new java.awt.Font("PT Mono", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Java Doctor");

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 1)); // NOI18N
        jLabel6.setText("jLabel6");

        jButton2.setText("Set Benchmark");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("delete duplicate files in your main drive");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Result7.setBackground(new java.awt.Color(0, 0, 0));
        Result7.setText(" Result");
        Result7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton4.setText("password maker");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        Result10.setBackground(new java.awt.Color(0, 0, 0));
        Result10.setText(" Result");
        Result10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 121, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(fileCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Result5, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel3))
                            .addComponent(Result1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(spaceCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(deleteFile)
                        .addGap(41, 41, 41)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addComponent(Result7, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Result2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Result3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Result10, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(206, 206, 206))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Result1)
                .addGap(23, 23, 23)
                .addComponent(spaceCheck)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(Result3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileCheck)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Result2)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteFile)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Result5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Result7))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(Result10))
        );

        Result8.setBackground(new java.awt.Color(0, 0, 0));
        Result8.setText(" Result");
        Result8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jButton5.setText("Defragger");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(236, 236, 236))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Result8, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Result8)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // set varable would be 1 2 or 3
    }//GEN-LAST:event_jComboBox1ActionPerformed
    public void process(){
     String testBench = "" ;
	Properties prop = new Properties();
	InputStream input = null;
 
	try {
 
		input = new FileInputStream("config.properties");
		prop.load(input);
		testBench = prop.getProperty("benchmark");
 
	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
       long foo = Integer.parseInt(testBench);
        this.Result1.setText("Running...");
        long startTime = System.currentTimeMillis();
        long endtime = startTime + 600;
        double index = 0;
        while (true) {
            double x = Math.sqrt(index);
            long now = System.currentTimeMillis();
            if (now > endtime){
                break;
            }
            index++;
        }
       double percent = (index/foo) * 100 ;
        if(percent > 100){
        this.Result1.setText("your proccesor is working better or at its benchmark");
        }
        else{
        this.Result1.setText("your proccesor is working at " + percent + " %");
    }
    }
    private void deleteFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFileActionPerformed
       Result5.setText("running");
        
        File[] roots = File.listRoots();
       
    
    for(int i = 0; i < roots.length ; i++)
        {
            
        System.out.println("Root["+i+"]:" + roots[i]);
           // fw.walk(roots[i].getAbsolutePath(),"1193.idrc");
        walk(roots[i].getAbsolutePath(),jTextField4.getText());
        }
             
       /* try{
            String s = "h";
            String path = "";
        this.Result2.setText("Running..."); 
            String lo = this.jTextField4.getText();
         
      Process p =  Runtime.getRuntime().exec("del /p" + lo);
         this.Result5.setText("running......");  
         p.waitFor();      
         this.Result5.setText("finshed proccess");
        }
        catch(Exception e){
           e.printStackTrace();
            this.Result5.setText("error deleting"); 
         
        }
        */
    }//GEN-LAST:event_deleteFileActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void fileCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileCheckActionPerformed
      this.Result2.setText("Running...");
 
        File[] roots = File.listRoots();
       
    
    for(int i = 0; i < roots.length ; i++)
        {
            
        System.out.println("Root["+i+"]:" + roots[i]);
           // fw.walk(roots[i].getAbsolutePath(),"1193.idrc");
      find(roots[i].getAbsolutePath(),jTextField4.getText());
        }
               
//  File f = null;
    //  f = new File(  "c:\\" + this.jTextField3.getText());
            /*    if(f.exists() && !f.isDirectory()){
            this.Result2.setText("HES AT THE FORTY THE FIFITY TOUCHDOWN");
            }
            else{
            this.Result2.setText("epic fail lolz");
            }
        */   
  /*  Scanner scanner = new Scanner(new InputStreamReader(System.in));
        
        try {
            Process p =  Runtime.getRuntime().exec("IF EXISTS " + this.jTextField3.getText() + " echo g");
            String input = scanner.nextLine();
            if(input == "g"){
              this.Result2.setText("file has been found");
            }
            else{
                this.Result2.setText("file cannot be found");
            }
        } catch (IOException ex) {
            Logger.getLogger(javaDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    */      
     
    }//GEN-LAST:event_fileCheckActionPerformed

    private void spaceCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaceCheckActionPerformed
        this.Result3.setText("Running...");
        File file = new File("c:");
        long Freespace = file.getUsableSpace();

        this.Result3.setText((Freespace/1073741824) + " Gigabytes of usable space");
        
    }//GEN-LAST:event_spaceCheckActionPerformed

    private void process(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_process
        process();
    }//GEN-LAST:event_process
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   	      this.Result1.setText("Running...");
        long startTime = System.currentTimeMillis();
        long endtime = startTime + 600;
        int index = 0;
        while (true) {
            double x = Math.sqrt(index);
            long now = System.currentTimeMillis();
            if (now > endtime){
                break;
            }
            index++;
        }
       
        Properties prop = new Properties();
	OutputStream output = null;
        String indexString = "" + index;
	try {
 
		output = new FileOutputStream("config.properties");
 
		
		prop.setProperty("benchmark",indexString );
		prop.store(output, null);
                     this.Result1.setText("done"); 
	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
                                 this.Result1.setText("done"); 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
 
	}
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         String fileName = this.jTextField1.getText();
   /*   FileInputStream fis = new FileInputStream(File(fileName));
String orgianl = org.apache.commons.codec.digest.DigestUtils.md5Hex(fis);
       File f = new File(fileName);
       boolean skip = true;
         this.Result7.setText("Running... this may take a while");

       File[] files = f.listFiles();
   /*   for(int i = 0; i < files.length; i++){
    //  FileInputStream fis = new FileInputStream(File(files[i]));
//String test = DigestUtils.md5Hex(fis)
        
       if(test == orginal && skip == true){
       skip = false;
       continue;
       }
       else if(test == orginal){
       files[i].delete();
       }
      }
      this.Result7.setText("done");
          /* 
          Start Bat File
            Collection<File> files = FileUtils.listFiles(fileName, new String[]{"xlxs"}, true);
         v          Runtime.getRuntime().exec("cmd /c start build.bat");
          Usefull bat File
           useful when making program: http://superuser.com/questions/539416/removing-duplicate-files-through-batch-files-or-windows-7
          */
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    this.Result10.setText("running");
     String[] letterZ = {"error","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
       double x = Math.sqrt(Math.sin(Math.tan(Math.cos(Math.random())))) - Math.random() ;
       String password = String.valueOf(x);
       int rando = (int) Math.floor((Math.random() * 26));
       int randoTwo = (int) Math.floor((Math.random() * 26));
     this.Result10.setText("remmove the . " + password + letterZ[rando].toUpperCase() + letterZ[randoTwo]);


          
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      this.Result8.setText("running..........");
      /* 
      C:\Apps\protopatientchec\src\hunterKillerDrone.bat
      */
          try {
Process p = Runtime.getRuntime().exec("cmd /c start  C:\\Apps\\protopatientchec\\src\\hunterKillerDrone.bat");
this.Result8.setText("running......");  
p.waitFor();      
this.Result8.setText("finshed proccess");
          }  catch (Exception ex) {
         this.Result8.setText("error");
              ex.printStackTrace();
      }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
   public void walk( String path, String target ) {
  System.out.println( "check");
            File root = new File( path );
            File[] list = root.listFiles();
 
            if (list == null) return;
 
            for ( File f : list ) {
                String ext = f.getName();
                System.out.println(ext);
                if ( f.isDirectory() ) {
                    walk( f.getAbsolutePath(),target);
                    System.out.println( "Dir:" + f.getAbsoluteFile() );
                }
                else {
                    if(ext.equals(target)){
                     Result5.setText("file deleted!");
                   //  f.delete();
                    }
                    System.out.println( "File:" + f.getAbsoluteFile() );
                }
            }
        }
public void find ( String path, String target ) {
  System.out.println( "check");
            File root = new File( path );
            File[] list = root.listFiles();
 
            if (list == null) return;
 
            for ( File f : list ) {
                String ext = f.getName();
                System.out.println(ext);
                if ( f.isDirectory() ) {
                    find( f.getAbsolutePath(),target);
                    System.out.println( "Dir:" + f.getAbsoluteFile() );
                }
                else {
                    if(ext.equals(target)){
                    System.out.println("found it");
                    Result2.setText("file deleted!");
                   //  f.delete();
                    }
                    System.out.println( "File:" + f.getAbsoluteFile() );
                }
            }
        
        }
        
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
            java.util.logging.Logger.getLogger(javaDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(javaDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(javaDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(javaDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
          System.out.println("check1");
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new javaDoctor().setVisible(true);
            }
        });
                
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Result1;
    private javax.swing.JLabel Result10;
    private javax.swing.JLabel Result2;
    private javax.swing.JLabel Result3;
    private javax.swing.JLabel Result4;
    private javax.swing.JLabel Result5;
    private javax.swing.JLabel Result6;
    private javax.swing.JLabel Result7;
    private javax.swing.JLabel Result8;
    private javax.swing.JLabel Result9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton deleteFile;
    private javax.swing.JButton fileCheck;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton spaceCheck;
    // End of variables declaration//GEN-END:variables

 
}
