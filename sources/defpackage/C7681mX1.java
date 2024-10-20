package defpackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mX1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7681mX1 {
    public final C0781Ga0 a;
    public final File b;
    public final List c;

    public C7681mX1(C0781Ga0 c0781Ga0, File file, List list) {
        this.a = c0781Ga0;
        this.b = file;
        this.c = list;
    }

    public static void c(File file, List list, String str) {
        BufferedWriter bufferedWriter;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, false));
            try {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                bufferedWriter.write("Content-Disposition: form-data; name=\"logcat\"; filename=\"logcat\"");
                bufferedWriter.newLine();
                bufferedWriter.write("Content-Type: text/plain");
                bufferedWriter.newLine();
                bufferedWriter.newLine();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    bufferedWriter.write((String) it.next());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            } catch (Throwable th) {
                th = th;
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    public static void a(File file, File file2) {
        Throwable th;
        ?? r5;
        BufferedInputStream bufferedInputStream = null;
        try {
            byte[] bArr = new byte[256];
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                ?? bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2, true));
                while (true) {
                    try {
                        int read = bufferedInputStream2.read(bArr);
                        if (read != -1) {
                            bufferedOutputStream.write(bArr, 0, read);
                        } else {
                            bufferedInputStream2.close();
                            bufferedOutputStream.close();
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = bufferedOutputStream;
                        r5 = bufferedInputStream;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        if (r5 != 0) {
                            r5.close();
                            throw th;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            r5 = 0;
        }
    }

    public final File b() {
        BufferedReader bufferedReader;
        List list = this.c;
        boolean isEmpty = list.isEmpty();
        File file = this.b;
        if (isEmpty) {
            return file;
        }
        String str = file.getName() + ".try0";
        boolean z = true;
        File file2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
            }
        } catch (IOException e) {
            AbstractC4851eH1.f("LogcatPrepender", "Error while trying to annotate minidump file %s with logcat data", file.getAbsoluteFile(), e);
            if (0 != 0) {
                C0781Ga0.c(null);
            }
            z = false;
        }
        try {
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            if (readLine == null) {
                return file;
            }
            file2 = this.a.b(str);
            c(file2, list, readLine);
            a(file, file2);
            if (!z) {
                return file;
            }
            if (!file.delete()) {
                AbstractC4851eH1.f("LogcatPrepender", "Failed to delete minidump file: " + file.getName(), new Object[0]);
            }
            return file2;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
    }
}
