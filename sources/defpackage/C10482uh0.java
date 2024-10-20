package defpackage;

import java.io.Closeable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uh0 */
/* loaded from: classes.dex */
public final class C10482uh0 implements Closeable {
    public final /* synthetic */ C11854yh0 a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.a.post(new Runnable() { // from class: th0
            @Override // java.lang.Runnable
            public final void run() {
                C10482uh0.this.a.e.i.k(GD1.l, true);
            }
        });
    }

    public C10482uh0(C11854yh0 c11854yh0) {
        this.a = c11854yh0;
        c11854yh0.e.i.k(GD1.l, false);
    }
}
