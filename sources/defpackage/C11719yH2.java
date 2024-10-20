package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yH2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11719yH2 {
    public boolean a = false;

    static {
        new AtomicInteger();
    }

    public final Object a(C1837Od2 c1837Od2) {
        if (!this.a) {
            Closeable a = EH2.a(c1837Od2);
            try {
                if (a instanceof InterfaceC7625mM0) {
                    File file = ((InterfaceC7625mM0) a).toFile();
                    if (a != null) {
                        a.close();
                    }
                    return file;
                }
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            } catch (Throwable th) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
        if (!c1837Od2.b.isEmpty()) {
            throw new U14("Short circuit would skip transforms.");
        }
        return c1837Od2.a.f(c1837Od2.d);
    }
}
