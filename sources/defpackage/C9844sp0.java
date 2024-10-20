package defpackage;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9844sp0 implements Closeable {
    public final File a;
    public final File g;
    public final File h;
    public final File i;
    public final long k;
    public BufferedWriter n;
    public int p;
    public long m = 0;
    public final LinkedHashMap o = new LinkedHashMap(0, 0.75f, true);
    public long q = 0;
    public final ThreadPoolExecutor r = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC8473op0());
    public final CallableC8129np0 s = new CallableC8129np0(this);
    public final int j = 1;
    public final int l = 1;

    public C9844sp0(File file, long j) {
        this.a = file;
        this.g = new File(file, "journal");
        this.h = new File(file, "journal.tmp");
        this.i = new File(file, "journal.bkp");
        this.k = j;
    }

    public static C9844sp0 k(File file, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                C(file2, file3, false);
            }
        }
        C9844sp0 c9844sp0 = new C9844sp0(file, j);
        if (c9844sp0.g.exists()) {
            try {
                c9844sp0.s();
                c9844sp0.r();
                return c9844sp0;
            } catch (IOException e) {
                System.out.println(KR0.a("DiskLruCache ", String.valueOf(file), " is corrupt: ", e.getMessage(), ", removing"));
                c9844sp0.close();
                AbstractC10982w74.a(c9844sp0.a);
            }
        }
        file.mkdirs();
        C9844sp0 c9844sp02 = new C9844sp0(file, j);
        c9844sp02.y();
        return c9844sp02;
    }

    public final void s() {
        File file = this.g;
        C7088kn3 c7088kn3 = new C7088kn3(new FileInputStream(file), AbstractC10982w74.a);
        try {
            String b = c7088kn3.b();
            String b2 = c7088kn3.b();
            String b3 = c7088kn3.b();
            String b4 = c7088kn3.b();
            String b5 = c7088kn3.b();
            if (!"libcore.io.DiskLruCache".equals(b) || !"1".equals(b2) || !Integer.toString(this.j).equals(b3) || !Integer.toString(this.l).equals(b4) || !"".equals(b5)) {
                throw new IOException("unexpected journal header: [" + b + ", " + b2 + ", " + b4 + ", " + b5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    u(c7088kn3.b());
                    i++;
                } catch (EOFException unused) {
                    this.p = i - this.o.size();
                    if (c7088kn3.j == -1) {
                        y();
                    } else {
                        this.n = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC10982w74.a));
                    }
                    try {
                        c7088kn3.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                c7088kn3.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void u(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.o;
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        C9159qp0 c9159qp0 = (C9159qp0) linkedHashMap.get(substring);
        if (c9159qp0 == null) {
            c9159qp0 = new C9159qp0(this, substring);
            linkedHashMap.put(substring, c9159qp0);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c9159qp0.f = new C8816pp0(this, c9159qp0);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        c9159qp0.e = true;
        c9159qp0.f = null;
        if (split.length != c9159qp0.g.l) {
            throw new IOException(AbstractC4809e90.a("unexpected journal line: ", Arrays.toString(split)));
        }
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                c9159qp0.b[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException(AbstractC4809e90.a("unexpected journal line: ", Arrays.toString(split)));
            }
        }
    }

    public final void r() {
        e(this.h);
        Iterator it = this.o.values().iterator();
        while (it.hasNext()) {
            C9159qp0 c9159qp0 = (C9159qp0) it.next();
            C8816pp0 c8816pp0 = c9159qp0.f;
            int i = this.l;
            int i2 = 0;
            if (c8816pp0 == null) {
                while (i2 < i) {
                    this.m += c9159qp0.b[i2];
                    i2++;
                }
            } else {
                c9159qp0.f = null;
                while (i2 < i) {
                    e(c9159qp0.c[i2]);
                    e(c9159qp0.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final synchronized void y() {
        BufferedWriter bufferedWriter = this.n;
        if (bufferedWriter != null) {
            c(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.h), AbstractC10982w74.a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.j));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.l));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (C9159qp0 c9159qp0 : this.o.values()) {
                if (c9159qp0.f != null) {
                    bufferedWriter2.write("DIRTY " + c9159qp0.a + "\n");
                } else {
                    bufferedWriter2.write("CLEAN " + c9159qp0.a + c9159qp0.a() + "\n");
                }
            }
            c(bufferedWriter2);
            if (this.g.exists()) {
                C(this.g, this.i, true);
            }
            C(this.h, this.g, false);
            this.i.delete();
            this.n = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.g, true), AbstractC10982w74.a));
        } catch (Throwable th) {
            c(bufferedWriter2);
            throw th;
        }
    }

    public static void e(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void C(File file, File file2, boolean z) {
        if (z) {
            e(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void b(C9844sp0 c9844sp0, C8816pp0 c8816pp0, boolean z) {
        synchronized (c9844sp0) {
            C9159qp0 c9159qp0 = c8816pp0.a;
            if (c9159qp0.f != c8816pp0) {
                throw new IllegalStateException();
            }
            if (z && !c9159qp0.e) {
                for (int i = 0; i < c9844sp0.l; i++) {
                    if (!c8816pp0.b[i]) {
                        c8816pp0.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c9159qp0.d[i].exists()) {
                        c8816pp0.a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < c9844sp0.l; i2++) {
                File file = c9159qp0.d[i2];
                if (z) {
                    if (file.exists()) {
                        File file2 = c9159qp0.c[i2];
                        file.renameTo(file2);
                        long j = c9159qp0.b[i2];
                        long length = file2.length();
                        c9159qp0.b[i2] = length;
                        c9844sp0.m = (c9844sp0.m - j) + length;
                    }
                } else {
                    e(file);
                }
            }
            c9844sp0.p++;
            c9159qp0.f = null;
            if (c9159qp0.e | z) {
                c9159qp0.e = true;
                c9844sp0.n.append((CharSequence) "CLEAN");
                c9844sp0.n.append(' ');
                c9844sp0.n.append((CharSequence) c9159qp0.a);
                c9844sp0.n.append((CharSequence) c9159qp0.a());
                c9844sp0.n.append('\n');
                if (z) {
                    c9844sp0.q++;
                    c9159qp0.getClass();
                }
            } else {
                c9844sp0.o.remove(c9159qp0.a);
                c9844sp0.n.append((CharSequence) "REMOVE");
                c9844sp0.n.append(' ');
                c9844sp0.n.append((CharSequence) c9159qp0.a);
                c9844sp0.n.append('\n');
            }
            h(c9844sp0.n);
            if (c9844sp0.m > c9844sp0.k || c9844sp0.j()) {
                c9844sp0.r.submit(c9844sp0.s);
            }
        }
    }

    public final boolean j() {
        int i = this.p;
        return i >= 2000 && i >= this.o.size();
    }

    public final C8816pp0 f(String str) {
        synchronized (this) {
            if (this.n != null) {
                C9159qp0 c9159qp0 = (C9159qp0) this.o.get(str);
                if (c9159qp0 == null) {
                    c9159qp0 = new C9159qp0(this, str);
                    this.o.put(str, c9159qp0);
                } else if (c9159qp0.f != null) {
                    return null;
                }
                C8816pp0 c8816pp0 = new C8816pp0(this, c9159qp0);
                c9159qp0.f = c8816pp0;
                this.n.append((CharSequence) "DIRTY");
                this.n.append(' ');
                this.n.append((CharSequence) str);
                this.n.append('\n');
                h(this.n);
                return c8816pp0;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized C9501rp0 i(String str) {
        if (this.n != null) {
            C9159qp0 c9159qp0 = (C9159qp0) this.o.get(str);
            if (c9159qp0 == null) {
                return null;
            }
            if (!c9159qp0.e) {
                return null;
            }
            for (File file : c9159qp0.c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.p++;
            this.n.append((CharSequence) "READ");
            this.n.append(' ');
            this.n.append((CharSequence) str);
            this.n.append('\n');
            if (j()) {
                this.r.submit(this.s);
            }
            return new C9501rp0(c9159qp0.c);
        }
        throw new IllegalStateException("cache is closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.n == null) {
            return;
        }
        Iterator it = new ArrayList(this.o.values()).iterator();
        while (it.hasNext()) {
            C8816pp0 c8816pp0 = ((C9159qp0) it.next()).f;
            if (c8816pp0 != null) {
                c8816pp0.a();
            }
        }
        F();
        c(this.n);
        this.n = null;
    }

    public final void F() {
        while (this.m > this.k) {
            String str = (String) ((Map.Entry) this.o.entrySet().iterator().next()).getKey();
            synchronized (this) {
                if (this.n != null) {
                    C9159qp0 c9159qp0 = (C9159qp0) this.o.get(str);
                    if (c9159qp0 != null && c9159qp0.f == null) {
                        for (int i = 0; i < this.l; i++) {
                            File file = c9159qp0.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + String.valueOf(file));
                            }
                            long j = this.m;
                            long[] jArr = c9159qp0.b;
                            this.m = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.p++;
                        this.n.append((CharSequence) "REMOVE");
                        this.n.append(' ');
                        this.n.append((CharSequence) str);
                        this.n.append('\n');
                        this.o.remove(str);
                        if (j()) {
                            this.r.submit(this.s);
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }

    public static void c(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void h(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
