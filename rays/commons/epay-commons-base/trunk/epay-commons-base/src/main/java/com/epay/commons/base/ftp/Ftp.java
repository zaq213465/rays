package com.epay.commons.base.ftp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.log4j.Logger;

/**
 * ftp工具类.
 */
public class Ftp {
	private static String encoding = System.getProperty("file.encoding");
	private FTPClient ftpClient = new FTPClient();
	private Logger logger = Logger.getLogger(Ftp.class);

	public Ftp() {
		ftpClient.setConnectTimeout(20000); //设置连接超时为10秒钟
		ftpClient.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
	}
	
	/**
	 * 得到当前ftp目录下的文件列表
	 * 
	 * @param tempDir
	 * @return
	 * @throws IOException
	 */
	public FTPFile[] listFiles(String tempDir){
		FTPFile[] ff = null;
		try {
			ff = ftpClient.listFiles(tempDir);
		} catch (IOException e) {
			return null;
		}
		return ff;
	}
	
	/**
	 * 得到当前ftp目录
	 * 
	 * @param tempDir
	 * @return
	 * @throws IOException
	 */
	public String[] listNames(String tempDir){
		String[] ff = null;
		try {
			ff = ftpClient.listNames(tempDir);
		} catch (IOException e) {
			return null;
		}
		return ff;
	}
	
	/**
	 * 得到当前ftp目录下的文件列表
	 * 
	 * @param tempDir
	 * @return
	 * @throws IOException
	 */
	public void createDir(String tempDir){
		try{ 
			ftpClient.makeDirectory(tempDir); 
	        System.out.println("在目标服务器上成功建立了文件夹: " + tempDir); 
	    }catch(Exception ex){ 
	        ex.printStackTrace();
	    }
	}
	/**
	 * FTP 连接 登陆
	 * */
	public boolean connect(String hostname, int port, String username,
			String password) throws IOException {
		ftpClient.connect(hostname, port);
		logger.info("FTP 远程连接成功");
		if (FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
			if (ftpClient.login(username, password)) {
				logger.info("FTP 远程登陆成功");
				return true;
			}
		}
		ftpClient.enterLocalActiveMode();
		logger.info("FTP 远程连接成功");
		return false;
	}

	public boolean download(String remote, OutputStream out) {
		logger.info("FTP 远程连接，文件开始下载... ...");
		ftpClient.enterLocalPassiveMode();
		boolean result = false;
		try {
			result = ftpClient.retrieveFile(remote, out);
			out.close();
			disconnect();
		} catch (IOException e) {
			result = false;
		}
		
		return result;
	}

	public void disconnect() throws IOException {
		if (ftpClient.isConnected()) {
			ftpClient.disconnect();
		}
	}
	public void upload(String localFile, String remoteFile) {
		logger.info("FTP 远程连接，文件开始上传... ...");
		OutputStream os = null;
		FileInputStream is = null;
		try{
			os = this.ftpClient.appendFileStream(remoteFile);
			File file_in = new File(localFile);
			is = new FileInputStream(file_in);
			byte[] bytes = new byte[1024];
			int c;
			while((c = is.read(bytes)) != -1){
				os.write(bytes,0,c);
			}
			logger.info("FTP 远程连接，文件上传成功... ...");
		}catch (IOException e){
			logger.info("FTP 远程连接，文件上传失败... ...");
			e.printStackTrace();
		}finally{
			if(is != null){
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(os != null){
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void downFile(String remotePath,String localPath) {
		try {
			// 转移到FTP服务器目录至指定的目录下
			ftpClient.changeWorkingDirectory(new String(remotePath.getBytes(encoding), "iso-8859-1"));
			// 获取文件列表
			FTPFile[] fs = ftpClient.listFiles();
			
			for (FTPFile ff : fs) {
				if(ff.isFile()){
					File localFile = new File(localPath + "/" + ff.getName());
					OutputStream is = new FileOutputStream(localFile);
					ftpClient.retrieveFile(ff.getName(), is);
					is.close();
				}
			}
			ftpClient.logout();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ftpClient.isConnected()) {
				try {
					ftpClient.disconnect();
				} catch (IOException ioe) {
				}
			}
		}
	}
	

//	public static void main(String[] args) {
//		Ftp ftp = new Ftp();
//		
//		try {
//			ftp.connect("172.16.2.2", 21, "anonymous", null);
//			String localFile = "D:\\HTF_861100014_T1_ZQ_2016-12-29.zip";
//			String remoteFile = "/public/HTF_861100014_T1_ZQ_2016-12-29.zip";
//			ftp.upload(localFile, remoteFile);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
