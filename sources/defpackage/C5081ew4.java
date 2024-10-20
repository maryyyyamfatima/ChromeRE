package defpackage;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ew4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5081ew4 {
    public static final Pattern b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    public final C3701av4 a;

    public C5081ew4(C3701av4 c3701av4) {
        this.a = c3701av4;
    }

    public static void b(xw4 xw4Var, Rv4 rv4) {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(xw4Var.a);
            try {
                String str = xw4Var.b;
                HashMap hashMap = new HashMap();
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    Matcher matcher = b.matcher(nextElement.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", str, group2, group);
                        Set set = (Set) hashMap.get(group);
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(group, set);
                        }
                        set.add(new C4737dw4(nextElement, group2));
                    }
                }
                HashMap hashMap2 = new HashMap();
                for (String str2 : Build.SUPPORTED_ABIS) {
                    if (hashMap.containsKey(str2)) {
                        String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str2);
                        for (C4737dw4 c4737dw4 : (Set) hashMap.get(str2)) {
                            boolean containsKey = hashMap2.containsKey(c4737dw4.a);
                            String str3 = c4737dw4.a;
                            if (containsKey) {
                                String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", str3, str2);
                            } else {
                                hashMap2.put(str3, c4737dw4);
                                String.format("NativeLibraryExtractor: using library %s for ABI %s", str3, str2);
                            }
                        }
                    } else {
                        String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str2);
                    }
                }
                rv4.a(zipFile, new HashSet(hashMap2.values()));
                zipFile.close();
            } catch (IOException e) {
                e = e;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e2) {
                        Zu4.a(e, e2);
                    }
                }
                throw e;
            }
        } catch (IOException e3) {
            e = e3;
            zipFile = null;
        }
    }

    public final HashSet a() {
        C3701av4 c3701av4 = this.a;
        HashSet c = c3701av4.c();
        ArrayList arrayList = new ArrayList();
        File file = new File(c3701av4.e(), "native-libraries");
        C3701av4.h(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str));
                    File file3 = new File(c3701av4.e(), "native-libraries");
                    C3701av4.h(file3);
                    File g = C3701av4.g(file3, str);
                    C3701av4.h(g);
                    C3701av4.d(g);
                    break;
                }
                if (((xw4) it2.next()).b.equals(str)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = c.iterator();
        while (it3.hasNext()) {
            xw4 xw4Var = (xw4) it3.next();
            HashSet hashSet2 = new HashSet();
            b(xw4Var, new C11599xv4(this, hashSet2, xw4Var));
            HashSet hashSet3 = new HashSet();
            File file4 = new File(c3701av4.e(), "native-libraries");
            C3701av4.h(file4);
            String str2 = xw4Var.b;
            File g2 = C3701av4.g(file4, str2);
            C3701av4.h(g2);
            File[] listFiles2 = g2.listFiles();
            if (listFiles2 != null) {
                for (File file5 : listFiles2) {
                    if (file5.isFile()) {
                        hashSet3.add(file5);
                    }
                }
            }
            Iterator it4 = hashSet3.iterator();
            while (it4.hasNext()) {
                File file6 = (File) it4.next();
                if (!hashSet2.contains(file6)) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file6.getAbsolutePath(), str2, xw4Var.a.getAbsolutePath()));
                    File parentFile = file6.getParentFile().getParentFile();
                    File file7 = new File(c3701av4.e(), "native-libraries");
                    C3701av4.h(file7);
                    if (!parentFile.equals(file7)) {
                        throw new IllegalStateException("File to remove is not a native library");
                    }
                    C3701av4.d(file6);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final void c(xw4 xw4Var, HashSet hashSet, Sv4 sv4) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C4737dw4 c4737dw4 = (C4737dw4) it.next();
            String str = xw4Var.b;
            String str2 = c4737dw4.a;
            C3701av4 c3701av4 = this.a;
            c3701av4.getClass();
            File file = new File(c3701av4.e(), "native-libraries");
            C3701av4.h(file);
            File g = C3701av4.g(file, str);
            C3701av4.h(g);
            File g2 = C3701av4.g(g, str2);
            sv4.a(c4737dw4, g2, g2.exists() && g2.length() == c4737dw4.b.getSize());
        }
    }
}
