package defpackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class MT2 {
    public static final C6492j31 a = C6492j31.k("com/google/android/libraries/search/loader/SafeLibraryLoader");
    public static final Pattern b = Pattern.compile("\\d+(\\.\\d+)+(\\.[a-z0-9]+)*");

    public static boolean a(File file) {
        if (!file.exists()) {
            return false;
        }
        try {
            file.setWritable(true, true);
            return file.delete();
        } catch (SecurityException e) {
            ((InterfaceC5462g31) ((InterfaceC5462g31) ((InterfaceC5462g31) a.e().l(C9.a, "NativeLibraryLoader")).f(e)).g("com/google/android/libraries/search/loader/SafeLibraryLoader", 159, "deleteFile", "SafeLibraryLoader.java")).h("Failed to remove old lib, ");
            return false;
        }
    }

    public static void b(String str, String str2, String str3) {
        BufferedInputStream bufferedInputStream;
        ZipFile zipFile;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            zipFile = new ZipFile(str);
            try {
                ZipEntry entry = zipFile.getEntry(str2);
                if (entry == null) {
                    throw new IOException("Did not find " + str2 + " in " + str);
                }
                InputStream inputStream = zipFile.getInputStream(entry);
                if (inputStream == null) {
                    throw new IOException("Null InputStream for " + str2 + " in " + str);
                }
                bufferedInputStream = new BufferedInputStream(inputStream);
                try {
                    fileOutputStream = new FileOutputStream(str3);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            new File(str3).setWritable(false, false);
                            bufferedInputStream.close();
                            zipFile.close();
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                        new File(str3).setWritable(false, false);
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (zipFile != null) {
                        zipFile.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedInputStream = null;
            zipFile = null;
        }
    }
}
