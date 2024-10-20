package defpackage;

import dalvik.system.PathClassLoader;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11252wv0 extends PathClassLoader {
    public C11252wv0(ClassLoader classLoader, String str) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
