package org.chromium.base;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import dalvik.system.BaseDexClassLoader;
import defpackage.AbstractC2484Td;
import defpackage.C1439Lb3;
import defpackage.C4317ck;
import defpackage.C7432ln3;
import defpackage.C7923nD;
import defpackage.V60;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BundleUtils {
    public static Boolean a;
    public static final Object b = new Object();
    public static final C1439Lb3 c = new C1439Lb3();
    public static final Map d = Collections.synchronizedMap(new C4317ck());
    public static C7923nD e;
    public static ArrayList f;

    public static Object e(Context context, String str) {
        Context context2 = V60.a;
        if (context2 != null) {
            boolean z = false;
            try {
                Class.forName(str, false, context2.getClassLoader());
                z = true;
            } catch (ClassNotFoundException unused) {
            }
            if (z) {
                context = context2;
            }
        }
        try {
            return context.getClassLoader().loadClass(str).newInstance();
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static boolean isBundleForNative() {
        return c();
    }

    public static boolean c() {
        return a.booleanValue();
    }

    public static boolean d(Context context, String str) {
        String[] a2;
        return Build.VERSION.SDK_INT >= 26 && (a2 = AbstractC2484Td.a(context.getApplicationInfo())) != null && Arrays.asList(a2).contains(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Context a(android.content.Context r5, java.lang.String r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L7
            return r5
        L7:
            r0 = r5
        L8:
            boolean r1 = r0 instanceof android.content.ContextWrapper     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            boolean r1 = r0 instanceof android.app.Application     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            if (r1 == 0) goto L14
            r0 = r2
            goto L1c
        L14:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            android.content.Context r0 = r0.getBaseContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            goto L8
        L1b:
            r0 = r3
        L1c:
            if (r0 == 0) goto L31
            ln3 r0 = defpackage.C7432ln3.c()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            android.content.Context r5 = defpackage.AbstractC0665Fd.a(r5, r6)     // Catch: java.lang.Throwable -> L2a
            r0.close()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            goto L40
        L2a:
            r5 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L2e
        L2e:
            throw r5     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
        L2f:
            r5 = move-exception
            goto L89
        L31:
            java.lang.Object r0 = org.chromium.base.BundleUtils.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            monitor-enter(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            ln3 r1 = defpackage.C7432ln3.c()     // Catch: java.lang.Throwable -> L86
            android.content.Context r5 = defpackage.AbstractC0665Fd.a(r5, r6)     // Catch: java.lang.Throwable -> L81
            r1.close()     // Catch: java.lang.Throwable -> L86
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
        L40:
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            r0.getParent()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            Lb3 r0 = org.chromium.base.BundleUtils.c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            monitor-enter(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            java.lang.Object r1 = r0.get(r6)     // Catch: java.lang.Throwable -> L7e
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L60
            java.lang.ClassLoader r4 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L7e
            boolean r4 = r1.equals(r4)     // Catch: java.lang.Throwable -> L7e
            if (r4 != 0) goto L67
            g(r1, r5)     // Catch: java.lang.Throwable -> L7e
            goto L68
        L60:
            java.lang.ClassLoader r1 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L7e
            r0.put(r6, r1)     // Catch: java.lang.Throwable -> L7e
        L67:
            r2 = r3
        L68:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            r0.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            java.lang.String r1 = "Android.IsolatedSplits.ClassLoaderReplaced."
            r0.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            r0.append(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            java.lang.String r6 = r0.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            defpackage.EI2.b(r6, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            return r5
        L7e:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7e
            throw r5     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
        L81:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L85
        L85:
            throw r5     // Catch: java.lang.Throwable -> L86
        L86:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            throw r5     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
        L89:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.BundleUtils.a(android.content.Context, java.lang.String):android.content.Context");
    }

    public static void g(ClassLoader classLoader, Context context) {
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        try {
            Field declaredField = context.getClass().getDeclaredField("mClassLoader");
            declaredField.setAccessible(true);
            declaredField.set(context, classLoader);
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Error setting ClassLoader.", e2);
        }
    }

    public static String getNativeLibraryPath(String str, String str2) {
        C7432ln3 c2 = C7432ln3.c();
        try {
            String findLibrary = ((BaseDexClassLoader) BundleUtils.class.getClassLoader()).findLibrary(str);
            if (findLibrary != null) {
                return findLibrary;
            }
            ClassLoader classLoader = V60.a.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                findLibrary = ((BaseDexClassLoader) classLoader).findLibrary(str);
            }
            if (findLibrary == null) {
                String b2 = b(str, str2);
                c2.close();
                return b2;
            }
            c2.close();
            return findLibrary;
        } finally {
            try {
                c2.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static ClassLoader f(String str) {
        Map map = d;
        ClassLoader classLoader = (ClassLoader) map.get(str);
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader classLoader2 = a(V60.a, str).getClassLoader();
        map.put(str, classLoader2);
        return classLoader2;
    }

    public static String b(String str, String str2) {
        ApplicationInfo applicationInfo;
        String[] a2;
        int binarySearch;
        if (Build.VERSION.SDK_INT < 26 || (a2 = AbstractC2484Td.a((applicationInfo = V60.a.getApplicationInfo()))) == null || (binarySearch = Arrays.binarySearch(a2, str2)) < 0) {
            return null;
        }
        try {
            return applicationInfo.splitSourceDirs[binarySearch] + "!/lib/" + ((String) applicationInfo.getClass().getField("primaryCpuAbi").get(applicationInfo)) + "/" + System.mapLibraryName(str);
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException(e2);
        }
    }
}
