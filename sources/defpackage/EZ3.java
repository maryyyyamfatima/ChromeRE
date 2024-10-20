package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class EZ3 {
    public abstract Typeface a(Context context, C3531aS0 c3531aS0, Resources resources, int i);

    public abstract Typeface b(Context context, C5249fS0[] c5249fS0Arr, int i);

    public EZ3() {
        new ConcurrentHashMap();
    }

    public static Object e(Object[] objArr, int i, DZ3 dz3) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(dz3.a(obj2) - i2) * 2) + (dz3.b(obj2) == z ? 0 : 1);
            if (obj == null || i3 > abs) {
                obj = obj2;
                i3 = abs;
            }
        }
        return obj;
    }

    public C5249fS0 f(int i, C5249fS0[] c5249fS0Arr) {
        return (C5249fS0) e(c5249fS0Arr, i, new CZ3());
    }

    public Typeface c(Context context, InputStream inputStream) {
        File d = FZ3.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (FZ3.c(d, inputStream)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File d = FZ3.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (FZ3.b(d, resources, i)) {
                return Typeface.createFromFile(d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }
}
