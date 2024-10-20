package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlinx.coroutines.scheduling.b;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class AW2 extends AbstractC8959qE0 {
    public final b h;

    public AW2(int i, int i2, long j) {
        this.h = new b("DefaultDispatcher", i, i2, j);
    }

    @Override // defpackage.L90
    public final void y(E90 e90, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.m;
        this.h.c(runnable, VF3.f, false);
    }
}
