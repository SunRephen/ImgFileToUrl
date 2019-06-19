package com.rephen.imagetourl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author sunrf
 */
@Controller
@RequestMapping("/img")
public class ImgToUrlController {

	@RequestMapping("index")
	public String index() {
		return "index";
	}

	@RequestMapping("uploadPage")
	public String uploadPage() {
		return "upload";
	}


	@RequestMapping(value = "upload", method = RequestMethod.POST)
	@ResponseBody
	public String upload(@RequestParam("files") MultipartFile[] multipartFiles) {
		if (null == multipartFiles || multipartFiles.length == 0) {
			return "当前无图片上传";
		}
//		for (MultipartFile multipartFile : multipartFiles) {
//			CommonsMultipartFile commonsMultipartFile = (CommonsMultipartFile) multipartFile;
//			(DiskFileItem)commonsMultipartFile.getFileItem();
//
////			File file = new File(multipartFile.get)
////			multipartFile.transferTo();
////			File file = diskFileItem.getStoreLocation();
//
//		}
		return multipartFiles.length + "";
	}

}
