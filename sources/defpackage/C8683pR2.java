package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pR2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8683pR2 implements DV1 {
    public boolean a;
    public final /* synthetic */ C9026qR2 g;

    public C8683pR2(C9026qR2 c9026qR2) {
        this.g = c9026qR2;
    }

    @Override // defpackage.DV1
    public final boolean A(C8697pU1 c8697pU1) {
        this.a = true;
        return this.g.A(c8697pU1);
    }

    @Override // defpackage.DV1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }

    public final void finalize() {
        C9026qR2 c9026qR2;
        Executor executor;
        if (!this.a && (executor = (c9026qR2 = this.g).j) != null) {
            executor.execute(new RunnableC7996nR2(c9026qR2));
        }
        super.finalize();
    }
}
