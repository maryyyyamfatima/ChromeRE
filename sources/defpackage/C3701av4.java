package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: av4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3701av4 {
    public final long a;
    public final Context b;
    public File c;

    public C3701av4(Context context) {
        this.b = context;
        this.a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static void d(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                d(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", file.getAbsolutePath()));
        }
    }

    public static File g(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    public static void h(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IllegalArgumentException("File input must be directory when it exists.");
            }
        } else {
            file.mkdirs();
            if (file.isDirectory()) {
                return;
            }
            String valueOf = String.valueOf(file.getAbsolutePath());
            throw new IOException(valueOf.length() != 0 ? "Unable to create directory: ".concat(valueOf) : new String("Unable to create directory: "));
        }
    }

    public final void a() {
        File f = f();
        String[] list = f.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.a))) {
                    File file = new File(f, str);
                    new StringBuilder(String.valueOf(file).length() + 118);
                    d(file);
                }
            }
        }
    }

    public final File b(String str) {
        File file = new File(e(), "verified-splits");
        h(file);
        return g(file, String.valueOf(str).concat(".apk"));
    }

    public final HashSet c() {
        File file = new File(e(), "verified-splits");
        h(file);
        HashSet hashSet = new HashSet();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile() && file2.getName().endsWith(".apk")) {
                    hashSet.add(new xw4(file2, file2.getName().substring(0, r6.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public final File e() {
        File file = new File(f(), Long.toString(this.a));
        h(file);
        return file;
    }

    public final File f() {
        if (this.c == null) {
            Context context = this.b;
            if (context == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.c = context.getFilesDir();
        }
        File file = new File(this.c, "splitcompat");
        h(file);
        return file;
    }
}
