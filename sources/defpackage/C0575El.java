package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: El, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575El {
    public final File a;
    public final File b;
    public final File c;

    public C0575El(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".new");
        this.c = new File(file.getPath() + ".bak");
    }

    public final FileOutputStream f() {
        File file = this.b;
        File file2 = this.c;
        if (file2.exists()) {
            e(file2, this.a);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                throw new IOException("Failed to create new file " + file, e);
            }
        }
    }

    public final FileInputStream c() {
        File file = this.c;
        boolean exists = file.exists();
        File file2 = this.a;
        if (exists) {
            e(file, file2);
        }
        File file3 = this.b;
        if (file3.exists() && file2.exists() && !file3.delete()) {
            Log.e("AtomicFile", "Failed to delete outdated new file " + file3);
        }
        return new FileInputStream(file2);
    }

    public final byte[] d() {
        FileInputStream c = c();
        try {
            byte[] bArr = new byte[c.available()];
            int i = 0;
            while (true) {
                int read = c.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = c.available();
                if (available > bArr.length - i) {
                    byte[] bArr2 = new byte[available + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            c.close();
        }
    }

    public final void a(FileOutputStream fileOutputStream) {
        boolean z;
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        if (!z) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        File file = this.b;
        if (file.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + file);
    }

    public final void b(FileOutputStream fileOutputStream) {
        boolean z;
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        if (!z) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        e(this.b, this.a);
    }

    public static void e(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }
}
