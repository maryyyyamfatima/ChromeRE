package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ph3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8771ph3 {
    public static final AtomicReference d = new AtomicReference(null);
    public final C3701av4 a;
    public final HashSet b = new HashSet();
    public final Ys4 c;

    public C8771ph3(Context context) {
        try {
            C3701av4 c3701av4 = new C3701av4(context);
            this.a = c3701av4;
            this.c = new Ys4(c3701av4);
        } catch (PackageManager.NameNotFoundException e) {
            throw new C11593xu4(e);
        }
    }

    public static boolean a(Context context, boolean z) {
        boolean z2;
        AtomicReference atomicReference = d;
        C8771ph3 c8771ph3 = new C8771ph3(context);
        while (true) {
            if (atomicReference.compareAndSet(null, c8771ph3)) {
                z2 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z2 = false;
                break;
            }
        }
        C8771ph3 c8771ph32 = (C8771ph3) atomicReference.get();
        if (z2) {
            EnumC7143kw4 enumC7143kw4 = EnumC7143kw4.a;
            EnumC7143kw4.g.set(new Rt4(context, uw4.a(), new Yt4(context, c8771ph32.a), c8771ph32.a));
            C6799jw4 c6799jw4 = new C6799jw4(c8771ph32);
            AtomicReference atomicReference2 = rw4.a;
            while (!atomicReference2.compareAndSet(null, c6799jw4) && atomicReference2.get() == null) {
            }
            uw4.a().execute(new pw4(context));
        }
        try {
            c8771ph32.b(context, z);
            return true;
        } catch (Exception e) {
            Log.e("SplitCompat", "Error installing additional splits", e);
            return false;
        }
    }

    public final synchronized void b(Context context, boolean z) {
        C9193qu4 c9193qu4;
        if (z) {
            this.a.a();
        } else {
            uw4.a().execute(new qw4(this));
        }
        String packageName = context.getPackageName();
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
            List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
            HashSet c = this.a.c();
            HashSet hashSet = new HashSet();
            Iterator it = c.iterator();
            while (it.hasNext()) {
                String str = ((xw4) it.next()).b;
                if (arrayList.contains(str)) {
                    if (z) {
                        C3701av4.d(this.a.b(str));
                    } else {
                        hashSet.add(str);
                    }
                    it.remove();
                }
            }
            if (!hashSet.isEmpty()) {
                uw4.a().execute(new sw4(this, hashSet));
            }
            HashSet hashSet2 = new HashSet();
            Iterator it2 = c.iterator();
            while (it2.hasNext()) {
                String str2 = ((xw4) it2.next()).b;
                if (!tw4.d(str2)) {
                    hashSet2.add(str2);
                }
            }
            for (String str3 : arrayList) {
                if (!tw4.d(str3)) {
                    hashSet2.add(str3);
                }
            }
            HashSet hashSet3 = new HashSet(c.size());
            Iterator it3 = c.iterator();
            while (it3.hasNext()) {
                xw4 xw4Var = (xw4) it3.next();
                String str4 = xw4Var.b;
                C9187qt4 c9187qt4 = tw4.c;
                if (!str4.startsWith("config.")) {
                    String str5 = xw4Var.b;
                    if (hashSet2.contains(str5.startsWith("config.") ? "" : str5.split("\\.config\\.", 2)[0])) {
                    }
                }
                hashSet3.add(xw4Var);
            }
            C5081ew4 c5081ew4 = new C5081ew4(this.a);
            ZipFile zipFile = null;
            switch (Build.VERSION.SDK_INT) {
                case 23:
                    c9193qu4 = new C9193qu4((Object) null);
                    break;
                case 24:
                    c9193qu4 = new C9193qu4((AbstractC7475lu4) null);
                    break;
                case 25:
                    c9193qu4 = new C9193qu4((AbstractC8507ou4) null);
                    break;
                case 26:
                    c9193qu4 = new C9193qu4((AbstractC7819mu4) null);
                    break;
                case 27:
                    if (Build.VERSION.PREVIEW_SDK_INT == 0) {
                        c9193qu4 = new C9193qu4((AbstractC8163nu4) null);
                        break;
                    }
                    c9193qu4 = new C9193qu4((AbstractC7131ku4) null);
                    break;
                default:
                    c9193qu4 = new C9193qu4((AbstractC7131ku4) null);
                    break;
            }
            ClassLoader classLoader = context.getClassLoader();
            if (z) {
                c9193qu4.a(classLoader, c5081ew4.a());
            } else {
                Iterator it4 = hashSet3.iterator();
                while (it4.hasNext()) {
                    xw4 xw4Var2 = (xw4) it4.next();
                    AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    HashSet hashSet4 = new HashSet();
                    C5081ew4.b(xw4Var2, new C9541rv4(c5081ew4, xw4Var2, hashSet4, atomicBoolean));
                    if (!atomicBoolean.get()) {
                        hashSet4 = null;
                    }
                    if (hashSet4 == null) {
                        it4.remove();
                    } else {
                        c9193qu4.a(classLoader, hashSet4);
                    }
                }
            }
            HashSet hashSet5 = new HashSet();
            Iterator it5 = hashSet3.iterator();
            while (it5.hasNext()) {
                xw4 xw4Var3 = (xw4) it5.next();
                try {
                    ZipFile zipFile2 = new ZipFile(xw4Var3.a);
                    try {
                        ZipEntry entry = zipFile2.getEntry("classes.dex");
                        zipFile2.close();
                        if (entry != null) {
                            C3701av4 c3701av4 = this.a;
                            String str6 = xw4Var3.b;
                            c3701av4.getClass();
                            File file = new File(c3701av4.e(), "dex");
                            C3701av4.h(file);
                            File g = C3701av4.g(file, str6);
                            C3701av4.h(g);
                            if (!c9193qu4.b(classLoader, g, xw4Var3.a, z)) {
                                String valueOf = String.valueOf(xw4Var3.a);
                                StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                                sb.append("split was not installed ");
                                sb.append(valueOf);
                                Log.w("SplitCompat", sb.toString());
                            }
                        }
                        hashSet5.add(xw4Var3.a);
                    } catch (IOException e) {
                        e = e;
                        zipFile = zipFile2;
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
                }
            }
            this.c.a(context, hashSet5);
            HashSet hashSet6 = new HashSet();
            Iterator it6 = hashSet3.iterator();
            while (it6.hasNext()) {
                xw4 xw4Var4 = (xw4) it6.next();
                if (hashSet5.contains(xw4Var4.a)) {
                    new StringBuilder(xw4Var4.b.length() + 30);
                    hashSet6.add(xw4Var4.b);
                } else {
                    new StringBuilder(xw4Var4.b.length() + 35);
                }
            }
            synchronized (this.b) {
                this.b.addAll(hashSet6);
            }
        } catch (PackageManager.NameNotFoundException e4) {
            throw new IOException(String.format("Cannot load data for application '%s'", packageName), e4);
        }
    }
}
