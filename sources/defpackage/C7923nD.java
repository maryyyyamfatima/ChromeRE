package defpackage;

import java.util.Iterator;
import org.chromium.base.BundleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7923nD extends ClassLoader {
    public static Class a(String str) {
        Iterator it = BundleUtils.d.values().iterator();
        while (it.hasNext()) {
            try {
                return ((ClassLoader) it.next()).loadClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    public C7923nD() {
        super(V60.a.getClassLoader());
    }

    @Override // java.lang.ClassLoader
    public final Class findClass(String str) {
        Class a = a(str);
        if (a != null) {
            return a;
        }
        if (BundleUtils.f != null && !str.startsWith("android.")) {
            Iterator it = BundleUtils.f.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!BundleUtils.d.containsKey(str2)) {
                    BundleUtils.f(str2);
                }
            }
            BundleUtils.f = null;
            Class a2 = a(str);
            if (a2 != null) {
                return a2;
            }
        }
        throw new ClassNotFoundException(str);
    }
}
