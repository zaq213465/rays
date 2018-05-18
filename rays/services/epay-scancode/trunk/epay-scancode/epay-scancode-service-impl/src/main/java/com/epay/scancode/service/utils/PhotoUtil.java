package com.epay.scancode.service.utils;

import java.io.ByteArrayInputStream;
import java.io.File;

import net.coobird.thumbnailator.Thumbnails;

public class PhotoUtil {

	public static boolean writeFile(byte[] buffer, String folderPath, String fileName) {
		boolean writeSucc = false;

		File fileDir = new File(folderPath);
		if (!fileDir.exists()) {
			fileDir.mkdirs();
		}

		File file = new File(folderPath + fileName);
		//System.out.println(folderPath + fileName);
		//FileOutputStream out = null;
		try {
			//out = new FileOutputStream(file);
			//out.write(buffer);
			Thumbnails.of(new ByteArrayInputStream(buffer)).size(400, 300).toFile(file);//压缩文件
			writeSucc = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			try {
//				//out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}

		return writeSucc;
	}
}
