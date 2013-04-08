package upload;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUploadHelper {
	public void uploadFile(HttpServletRequest req){
		DiskFileItemFactory  fileItemFactory = new DiskFileItemFactory ();
		File tmpDir = new File("/home/nimesh/uploadtest");
		/*
		 *Set the size threshold, above which content will be stored on disk.
		 */
		fileItemFactory.setSizeThreshold(1*1024*1024); //1 MB
		/*
		 * Set the temporary directory to store the uploaded files of size above threshold.
		 */
		fileItemFactory.setRepository(tmpDir);
 
		ServletFileUpload uploadHandler = new ServletFileUpload(fileItemFactory);
		try {
			/*
			 * Parse the request
			 */
			List<ServletFileUpload> items = uploadHandler.parseRequest(req);
			Iterator<ServletFileUpload> itr = items.iterator();
			int i = 0;
			while(itr.hasNext()) {
				ServletFileUpload ss = itr.next();
				FileItem item = (FileItem) ss;
				/*
				 * Handle Form Fields.
				 */
				
				System.out.println(" " + i + "--" + item.getName() );
				
				if(item.isFormField()) {
					System.out.println("File Name = "+item.getFieldName()+", Value = "+item.getString());
				} else {
					
					File file = new File("/home/nimesh/",item.getName());
					item.write(file);
				}
				
			}
		} catch(Exception ex) {
			System.out.println("Error encountered while uploading file" + ex);
		}
 
	}
 
}
