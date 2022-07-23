package bgm.yzl.models;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileCopy {

	private static int fileToCopyIndex = 0;
	private static int folderToCopyIntoIndex = 1;

	private static void doCopy(String[] args) {

		try (FileChannel channel = new FileInputStream(args[0]).getChannel();
				FileChannel channel2 = new FileOutputStream(args[1]).getChannel();) {

			ByteBuffer allocatedBuffer = ByteBuffer.allocate(1024);

			while (channel.read(allocatedBuffer) != -1) {
				allocatedBuffer.flip();
				channel2.write(allocatedBuffer);
				allocatedBuffer.clear();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		doCopy(args);
	}

}
