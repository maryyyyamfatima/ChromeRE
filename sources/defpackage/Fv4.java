package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Fv4 implements Sv4 {
    public final /* synthetic */ Set a;
    public final /* synthetic */ xw4 b;
    public final /* synthetic */ ZipFile c;

    public Fv4(HashSet hashSet, xw4 xw4Var, ZipFile zipFile) {
        this.a = hashSet;
        this.b = xw4Var;
        this.c = zipFile;
    }

    @Override // defpackage.Sv4
    public final void a(C4737dw4 c4737dw4, File file, boolean z) {
        this.a.add(file);
        if (z) {
            return;
        }
        xw4 xw4Var = this.b;
        ZipEntry zipEntry = c4737dw4.b;
        Log.i("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", xw4Var.b, c4737dw4.a, xw4Var.a.getAbsolutePath(), zipEntry.getName(), file.getAbsolutePath()));
        Pattern pattern = C5081ew4.b;
        byte[] bArr = new byte[4096];
        InputStream inputStream = this.c.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    Zu4.a(th, th2);
                }
            }
            throw th;
        }
    }
}
