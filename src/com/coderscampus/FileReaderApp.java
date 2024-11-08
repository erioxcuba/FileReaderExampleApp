package com.coderscampus;

import com.coderscampus.service.FileService;

public class FileReaderApp
	{

		public static void main(String[] args)
			{
				FileService fileService = FileService.getInstance();

				System.out.println(fileService);
			}

	}
