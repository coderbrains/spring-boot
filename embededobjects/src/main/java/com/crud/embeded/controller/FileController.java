package com.crud.embeded.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.crud.embeded.helper.FileUploading;

@RestController
public class FileController {

	@Autowired
	private FileUploading fileUploading;
	
	@PostMapping("/upload-file")
	public ResponseEntity<Object> uploadFile(@RequestParam("file") MultipartFile file){
//		System.out.println(file);
//		System.out.println(file.getOriginalFilename());
//		System.out.println(file.getSize());
//		System.out.println(file.getContentType());
//		return ResponseEntity.ok("working...api");
		
		if(file.getContentType().equals("image/jpeg")) {

			
			boolean b = fileUploading.uploadFile(file);
			if(b) {
				return ResponseEntity.status(HttpStatus.OK).body("file uploaded successfully..");
						
			}else {
				return ResponseEntity.status(HttpStatus.OK).body("file cannot be uploaded.");
				
			}
				
		}else {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("File not uploaded. Only jpeg is accepted..");
		}
	}
	
	@PostMapping("/uploadynamic")
	public ResponseEntity<Object> uploadDynamic(MultipartFile file){
		
		if(file.getContentType().equals("image/jpeg")) {

			
			boolean b = fileUploading.uploadDynamicFile(file);
			
			if(b) {
				return ResponseEntity.status(HttpStatus.OK).body("file uploaded successfully..");
				
			}else {
				return ResponseEntity.status(HttpStatus.OK).body("file cannot uploaded....");
				
			}
		}else {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("File not uploaded. Only jpeg is accepted..");
		}		
		
	}
	
}
