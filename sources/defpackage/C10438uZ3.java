package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uZ3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10438uZ3 extends EZ3 {
    public static Class a = null;
    public static Constructor b = null;
    public static Method c = null;
    public static Method d = null;
    public static boolean e = false;

    public static void h() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (e) {
            return;
        }
        e = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    @Override // defpackage.EZ3
    public Typeface a(Context context, C3531aS0 c3531aS0, Resources resources, int i) {
        h();
        try {
            Object newInstance = b.newInstance(new Object[0]);
            for (C3875bS0 c3875bS0 : c3531aS0.a) {
                File d2 = FZ3.d(context);
                if (d2 == null) {
                    return null;
                }
                try {
                    if (!FZ3.b(d2, resources, c3875bS0.f)) {
                        return null;
                    }
                    if (!g(newInstance, d2.getPath(), c3875bS0.c, c3875bS0.b)) {
                        return null;
                    }
                    d2.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d2.delete();
                }
            }
            h();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static boolean g(Object obj, String str, boolean z, int i) {
        h();
        try {
            return ((Boolean) c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.EZ3
    public Typeface b(Context context, C5249fS0[] c5249fS0Arr, int i) {
        File file;
        FileInputStream fileInputStream;
        String readlink;
        if (c5249fS0Arr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f(i, c5249fS0Arr).a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } catch (ErrnoException unused) {
                }
                try {
                    if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                        file = new File(readlink);
                        if (file != null && file.canRead()) {
                            Typeface createFromFile = Typeface.createFromFile(file);
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                        Typeface c2 = c(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return c2;
                    }
                    Typeface c22 = c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c22;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused2) {
                    }
                    throw th;
                }
                file = null;
                if (file != null) {
                    Typeface createFromFile2 = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile2;
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
                try {
                    openFileDescriptor.close();
                } catch (Throwable unused3) {
                }
            }
        } catch (IOException unused4) {
            return null;
        }
    }
}
