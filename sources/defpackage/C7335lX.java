package defpackage;

import com.google.common.util.concurrent.p;
import com.google.common.util.concurrent.r;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7335lX extends p {
    public r n;

    public C7335lX(AbstractC0562Ei1 abstractC0562Ei1, boolean z, Executor executor, C3544aU3 c3544aU3) {
        super(abstractC0562Ei1, z);
        this.n = new C6647jX(this, c3544aU3, executor);
        F();
    }

    public C7335lX(AbstractC0562Ei1 abstractC0562Ei1, boolean z, Executor executor, Callable callable) {
        super(abstractC0562Ei1, z);
        this.n = new C6991kX(this, callable, executor);
        F();
    }

    @Override // com.google.common.util.concurrent.n
    public final void p() {
        r rVar = this.n;
        if (rVar != null) {
            rVar.c();
        }
    }
}
