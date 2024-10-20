package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface$Builder;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xZ3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11467xZ3 extends C10438uZ3 {
    public final Class f;
    public final Constructor g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;

    public C11467xZ3() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = m(cls);
            method3 = n(cls);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = o(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f = cls;
        this.g = constructor;
        this.h = method2;
        this.i = method3;
        this.j = method4;
        this.k = method;
        this.l = method5;
    }

    public final boolean l() {
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final boolean i(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // defpackage.C10438uZ3, defpackage.EZ3
    public final Typeface a(Context context, C3531aS0 c3531aS0, Resources resources, int i) {
        Object obj;
        FontVariationAxis[] fromFontVariationSettings;
        if (l()) {
            try {
                obj = this.g.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            for (C3875bS0 c3875bS0 : c3531aS0.a) {
                String str = c3875bS0.a;
                int i2 = c3875bS0.e;
                int i3 = c3875bS0.b;
                boolean z = c3875bS0.c;
                fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c3875bS0.d);
                if (!i(context, obj, str, i2, i3, z ? 1 : 0, fromFontVariationSettings)) {
                    try {
                        this.k.invoke(obj, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                    return null;
                }
            }
            if (k(obj)) {
                return j(obj);
            }
            return null;
        }
        return super.a(context, c3531aS0, resources, i);
    }

    @Override // defpackage.C10438uZ3, defpackage.EZ3
    public final Typeface b(Context context, C5249fS0[] c5249fS0Arr, int i) {
        Object obj;
        Typeface j;
        boolean z;
        if (c5249fS0Arr.length < 1) {
            return null;
        }
        if (l()) {
            HashMap hashMap = new HashMap();
            for (C5249fS0 c5249fS0 : c5249fS0Arr) {
                if (c5249fS0.e == 0) {
                    Uri uri = c5249fS0.a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, FZ3.e(context, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            try {
                obj = this.g.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            int length = c5249fS0Arr.length;
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                Method method = this.k;
                if (i2 >= length) {
                    if (!z2) {
                        try {
                            method.invoke(obj, new Object[0]);
                            return null;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            return null;
                        }
                    }
                    if (k(obj) && (j = j(obj)) != null) {
                        return Typeface.create(j, i);
                    }
                    return null;
                }
                C5249fS0 c5249fS02 = c5249fS0Arr[i2];
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c5249fS02.a);
                if (byteBuffer != null) {
                    try {
                        z = ((Boolean) this.i.invoke(obj, byteBuffer, Integer.valueOf(c5249fS02.b), null, Integer.valueOf(c5249fS02.c), Integer.valueOf(c5249fS02.d ? 1 : 0))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        z = false;
                    }
                    if (!z) {
                        try {
                            method.invoke(obj, new Object[0]);
                            return null;
                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                            return null;
                        }
                    }
                    z2 = true;
                }
                i2++;
                z2 = z2;
            }
        } else {
            C5249fS0 f = f(i, c5249fS0Arr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f.a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface$Builder(openFileDescriptor.getFileDescriptor()).setWeight(f.c).setItalic(f.d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                    try {
                        openFileDescriptor.close();
                    } catch (Throwable unused5) {
                    }
                }
            } catch (IOException unused6) {
                return null;
            }
        }
    }

    @Override // defpackage.EZ3
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        if (l()) {
            try {
                obj = this.g.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            if (!i(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
            if (k(obj)) {
                return j(obj);
            }
            return null;
        }
        return super.d(context, resources, i, str, i2);
    }

    public static Method m(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method n(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method o(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
