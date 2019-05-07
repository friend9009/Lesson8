import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PrinterJob;
import java.awt.print.Printable;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.io.File;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;


               
public class PrintDocument implements Printable {
    private PrinterJob job;
    private Image imagecarRight;

    PrintDocument() { 	
	System.out.println("Print any Document");
	job = PrinterJob.getPrinterJob();
	job.setPrintable(this);
        System.out.println("End action Document");
       
	File filecarRight = new File("images/carRight.jpg"); 
		try {
	    imagecarRight = ImageIO.read(filecarRight); 
	} catch(IOException e) {
	    System.out.println(e);
	}

    }



             
        
    public int print (Graphics g, PageFormat pf, int page) {
    	if (page >0) {
    		return NO_SUCH_PAGE;

        }

    Graphics2D g2d = (Graphics2D)g;
    g2d.translate (pf.getImageableX(), pf.getImageableY() );
    g2d.drawString("Улугбек Мурзаев Эргашваевич", 100, 100);
    g2d.drawImage (imagecarRight, 100, 200, 150, 150, null);
    return PAGE_EXISTS;
    }                




    public void doAction () {
    	System.out.println("Start to Print Document.");
	boolean ok = job.printDialog();
    	if (ok) {
    	    try {
    	        job.print();
   	    
	    	
    	    } catch (PrinterException ex) {	
            }

        }
    }
    public static void main (String args[]) {
	PrintDocument ob =  new PrintDocument();    	
	ob.doAction();

    }

}
