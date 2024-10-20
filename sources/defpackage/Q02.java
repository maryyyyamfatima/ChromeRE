package defpackage;

import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Q02 implements Runnable {
    public final /* synthetic */ InterfaceC2559Ts a;
    public final /* synthetic */ S02 g;

    public Q02(S02 s02, InterfaceC2559Ts interfaceC2559Ts) {
        this.g = s02;
        this.a = interfaceC2559Ts;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = ThreadUtils.a;
        if (this.g.b) {
            return;
        }
        this.a.a(true);
    }
}
