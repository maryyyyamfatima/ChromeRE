package defpackage;

import java.util.concurrent.RejectedExecutionException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wK3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11049wK3 implements InterfaceC6554jE1 {
    public final C2071Py1 a;

    @Override // defpackage.InterfaceC6554jE1
    public final void a() {
    }

    static {
        boolean z = B10.a;
    }

    public C11049wK3(AbstractC1941Oy1 abstractC1941Oy1) {
        abstractC1941Oy1.getClass();
        this.a = new C2071Py1();
    }

    @Override // defpackage.InterfaceC6554jE1
    public final void b(Runnable runnable, String str) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            throw new RuntimeException("Cannot execute layout calculation task; ".concat(String.valueOf(e)));
        }
    }

    @Override // defpackage.InterfaceC6554jE1
    public final void c(Runnable runnable) {
        this.a.remove(runnable);
    }
}
