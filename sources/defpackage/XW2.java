package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XW2 implements InterfaceC9989tE2 {
    public final InterfaceC9989tE2 a;
    public final InterfaceC9989tE2 b;
    public final InterfaceC9989tE2 c;

    public XW2(InterfaceC9989tE2 interfaceC9989tE2) {
        C11697yD0 c11697yD0 = AbstractC11354xD0.a;
        AD0 ad0 = AbstractC12040zD0.a;
        this.a = interfaceC9989tE2;
        this.b = c11697yD0;
        this.c = ad0;
    }

    @Override // defpackage.InterfaceC9989tE2
    public final Object get() {
        return new WW2(((Integer) this.c.get()).intValue(), (Context) this.a.get(), (String) this.b.get());
    }
}
