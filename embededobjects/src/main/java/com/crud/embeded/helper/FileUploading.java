package com.crud.embeded.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploading {

//	public final String UPLOAD_FILE = "D:\\springboot\\embededobjects\\src\\main\\resources\\static\\images";
	
	public boolean uploadFile(MultipartFile file) {
		
		
		boolean f = false;
		
		try {
			
//			InputStream is = file.getInputStream();
//			byte[] b = new byte[is.available()];
//			is.read(b);
//			
//			FileOutputStream fos = new FileOutputStream(UPLOAD_FILE + File.separator + file.getOriginalFilename());
//			fos.write(b);
//			fos.close();
//			fos.flush();
			
			Files.copy(file.getInputStream(), Paths.get(UPLOAD_FILE + File.separator +  
					file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
			
			f= true;
			
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		return f;
		
	}
	
	
	
	final String UPLOAD_FILE = new ClassPathResource("static/image/").getFile().getAbsolutePath();
	
	public FileUploading()throws IOException 
	{
		
	}

	public boolean uploadDynamicFile(MultipartFile file) {
		
		boolean f = false;
		
		
		
		
		try {
			
			
			Files.copy(file.getInputStream(), Paths.get(UPLOAD_FILE + File.separator +  
					file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
			
			f= true;
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return f;
	}
	
	
	
}
