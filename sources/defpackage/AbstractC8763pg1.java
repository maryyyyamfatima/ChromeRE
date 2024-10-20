package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8763pg1 extends B30 {
    public final /* synthetic */ C9106qg1 i;

    @Override // defpackage.B30
    public final void d(Runnable runnable, long j) {
        this.i.g.schedule(runnable, 10000L, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8763pg1(C9106qg1 c9106qg1, T11 t11) {
        super(t11);
        this.i = c9106qg1;
    }
}
