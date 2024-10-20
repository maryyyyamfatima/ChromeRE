package defpackage;

import com.google.common.util.concurrent.u;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6897kE0 implements InterfaceC2909Wk {
    public final /* synthetic */ ExecutorC7585mE0 a;
    public final /* synthetic */ InterfaceC2909Wk b;

    public C6897kE0(ExecutorC7585mE0 executorC7585mE0, InterfaceC2909Wk interfaceC2909Wk) {
        this.a = executorC7585mE0;
        this.b = interfaceC2909Wk;
    }

    @Override // defpackage.InterfaceC2909Wk
    public final RD1 call() {
        int i = ExecutorC7585mE0.j;
        if (!this.a.compareAndSet(EnumC7241lE0.NOT_RUN, EnumC7241lE0.STARTED)) {
            u uVar = u.j;
            return uVar != null ? uVar : new u();
        }
        return this.b.call();
    }

    public final String toString() {
        return this.b.toString();
    }
}
