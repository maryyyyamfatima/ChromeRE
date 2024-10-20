package defpackage;

import J.N;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ga0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0781Ga0 {
    public static final Pattern b = Pattern.compile("^[^.]+-([^-,]+?)\\.");
    public static final Pattern c = Pattern.compile("\\.dmp([0-9]*)\\z");
    public static final Pattern d = Pattern.compile("\\.(dmp|forced)([0-9]*)(\\.try([0-9]+))\\z");
    public static final Pattern e;
    public static final Pattern f;
    public static final C0521Ea0 g;
    public final File a;

    static {
        Pattern.compile("\\.(dmp)([0-9]*)(\\.try([0-9]+))\\z");
        e = Pattern.compile("\\.up([0-9]*)(\\.try([0-9]+))\\z");
        Pattern.compile("\\.forced([0-9]*)(\\.try([0-9]+))\\z");
        Pattern.compile("\\.skipped([0-9]*)(\\.try([0-9]+))\\z");
        f = Pattern.compile("\\.tmp\\z");
        g = new C0521Ea0();
    }

    public static void c(File file) {
        if (file.delete()) {
            return;
        }
        AbstractC4851eH1.f("CrashFileManager", "Unable to delete " + file.getAbsolutePath(), new Object[0]);
    }

    public static String j(File file) {
        String concat;
        String path = file.getPath();
        int h = h(path);
        if (h >= 0) {
            int i = h + 1;
            concat = path.replace(AbstractC9076qb1.a(".try", h), ".try" + i);
        } else {
            concat = path.concat(".try1");
        }
        if (file.renameTo(new File(concat))) {
            return concat;
        }
        return null;
    }

    public static void k(File file) {
        file.renameTo(new File(file.getPath() + ".try0"));
    }

    public static int h(String str) {
        int lastIndexOf = str.lastIndexOf(".try");
        if (lastIndexOf < 0) {
            return -1;
        }
        String substring = str.substring(lastIndexOf + 4);
        try {
            int nextInt = new Scanner(substring).useDelimiter("[^0-9]+").nextInt();
            if (substring.indexOf(Integer.toString(nextInt)) == 0) {
                return nextInt;
            }
            return -1;
        } catch (NoSuchElementException unused) {
            return -1;
        }
    }

    public static void i(File file, String str) {
        if (file.renameTo(new File(file.getPath().replace(".dmp", str).replace(".forced", str)))) {
            return;
        }
        AbstractC4851eH1.f("CrashFileManager", TM0.a("Failed to rename ", file), new Object[0]);
        if (file.delete()) {
            return;
        }
        AbstractC4851eH1.f("CrashFileManager", TM0.a("Failed to delete ", file), new Object[0]);
    }

    public C0781Ga0(File file) {
        if (file == null) {
            throw new NullPointerException("Specified context cannot be null.");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(file.getAbsolutePath() + " is not a directory.");
        }
        this.a = file;
    }

    public final File[] e() {
        File[] g2 = g(d);
        ArrayList arrayList = new ArrayList();
        for (File file : g2) {
            int h = h(file.getName());
            if (h < 0) {
                h = 0;
            }
            if (h < 3) {
                arrayList.add(file);
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    public final File[] g(Pattern pattern) {
        File d2 = d();
        File[] listFiles = d2.listFiles(pattern != null ? new C0651Fa0(pattern) : null);
        if (listFiles == null) {
            AbstractC4851eH1.f("CrashFileManager", d2.getAbsolutePath() + " does not exist or is not a directory", new Object[0]);
            return new File[0];
        }
        Arrays.sort(listFiles, g);
        return listFiles;
    }

    public final void a() {
        for (File file : g(e)) {
            c(file);
        }
        for (File file2 : g(f)) {
            c(file2);
        }
        int i = 0;
        for (File file3 : g(null)) {
            if (!file3.getName().equals("uploads.log")) {
                if (TimeUnit.DAYS.convert(new Date().getTime() - file3.lastModified(), TimeUnit.MILLISECONDS) > 30) {
                    c(file3);
                } else if (i < 10) {
                    i++;
                } else {
                    c(file3);
                }
            }
        }
    }

    public final File d() {
        return new File(this.a, "Crash Reports");
    }

    public final void f() {
        File file = new File(this.a, "Crashpad");
        if (file.exists()) {
            File d2 = d();
            if (d2.mkdir() || d2.isDirectory()) {
                N.MjZjkDM7(file.getAbsolutePath(), d().getAbsolutePath());
            }
        }
    }

    public final File b(String str) {
        File file = new File(d(), str);
        if (!file.exists()) {
            return file;
        }
        if (file.delete()) {
            return new File(d(), str);
        }
        AbstractC4851eH1.f("CrashFileManager", "Unable to delete previous logfile" + file.getAbsolutePath(), new Object[0]);
        return file;
    }
}
