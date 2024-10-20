package defpackage;

import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4714dt implements InterfaceC2559Ts {
    public final C5058et a;

    public C4714dt(C5058et c5058et) {
        this.a = c5058et;
    }

    @Override // defpackage.InterfaceC2559Ts
    public final void a(boolean z) {
        ThreadUtils.f(new RunnableC4371ct(this, z));
    }
}
