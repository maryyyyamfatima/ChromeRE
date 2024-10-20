package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yd4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11834yd4 {
    public final HashMap a = new HashMap();

    public final void a() {
        for (AbstractC9776sd4 abstractC9776sd4 : this.a.values()) {
            HashMap hashMap = abstractC9776sd4.a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    for (Object obj : abstractC9776sd4.a.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC9776sd4.g;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    for (Closeable closeable : abstractC9776sd4.g) {
                        if (closeable instanceof Closeable) {
                            try {
                                closeable.close();
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    }
                }
            }
            abstractC9776sd4.a();
        }
        this.a.clear();
    }
}
