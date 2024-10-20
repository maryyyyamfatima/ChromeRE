package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Qs4 implements Executor {
    public final WB2 a;

    public Qs4(WB2 wb2) {
        this.a = wb2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((NJ0) this.a).a(runnable, 0L);
    }
}
