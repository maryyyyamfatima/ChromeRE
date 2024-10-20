package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Field;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11938yv0 implements InterfaceC0756Fv0 {
    @Override // defpackage.InterfaceC0756Fv0
    public final int a(Context context, String str) {
        int i = 0;
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!W82.a(declaredField.get(null), str)) {
                Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            } else {
                i = declaredField2.getInt(null);
            }
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: " + e.getMessage());
        }
        return i;
    }

    @Override // defpackage.InterfaceC0756Fv0
    public final int b(Context context, String str, boolean z) {
        Field e;
        synchronized (C1146Iv0.class) {
            Boolean bool = C1146Iv0.b;
            if (bool == null) {
                try {
                    e = C1146Iv0.e(context);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                    Log.w("DynamiteModule", "Failed to load module via V2: " + String.valueOf(e2));
                    bool = Boolean.FALSE;
                }
                synchronized (e.getDeclaringClass()) {
                    ClassLoader classLoader = (ClassLoader) e.get(null);
                    if (classLoader == ClassLoader.getSystemClassLoader()) {
                        bool = Boolean.FALSE;
                    } else if (classLoader != null) {
                        try {
                            C1146Iv0.a(classLoader);
                        } catch (C0626Ev0 unused) {
                        }
                        bool = Boolean.TRUE;
                    } else {
                        if (!C1146Iv0.b(context)) {
                            return 0;
                        }
                        if (!C1146Iv0.f) {
                            Boolean bool2 = Boolean.TRUE;
                            if (!bool2.equals(null)) {
                                try {
                                    int g = C1146Iv0.g(context, str, z, true);
                                    String str2 = C1146Iv0.e;
                                    if (str2 != null && !str2.isEmpty()) {
                                        ClassLoader c = C1146Iv0.c();
                                        C1146Iv0.a(c);
                                        e.set(null, c);
                                        C1146Iv0.b = bool2;
                                        return g;
                                    }
                                    return g;
                                } catch (C0626Ev0 unused2) {
                                    e.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                }
                            }
                        }
                        e.set(null, ClassLoader.getSystemClassLoader());
                        bool = Boolean.FALSE;
                    }
                    C1146Iv0.b = bool;
                }
            }
            if (bool.booleanValue()) {
                try {
                    return C1146Iv0.g(context, str, z, false);
                } catch (C0626Ev0 e3) {
                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e3.getMessage());
                    return 0;
                }
            }
            return C1146Iv0.f(context, str, z);
        }
    }
}
