package defpackage;

import org.chromium.components.signin.identitymanager.IdentityManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lY */
/* loaded from: classes.dex */
public final class C7340lY {
    public final C3063Xo3 a;
    public final IdentityManager b;
    public final C6652jY c;
    public final Q83 d;
    public final InterfaceC6813jz2 e;
    public final C5966hY f;
    public C2511Ti1 g;
    public I5 h;
    public C6996kY i;

    public C7340lY(C3063Xo3 c3063Xo3, IdentityManager identityManager, C8875pz2 c8875pz2) {
        this.a = c3063Xo3;
        this.b = identityManager;
        C6652jY c6652jY = new C6652jY(this);
        this.c = c6652jY;
        identityManager.a(c6652jY);
        this.d = O83.a;
        this.e = c8875pz2;
        this.f = new C5966hY();
    }

    public final void a() {
        this.b.d(this.c);
        I5 i5 = this.h;
        if (i5 != null) {
            i5.c(this.i);
        }
        C2511Ti1 c2511Ti1 = this.g;
        if (c2511Ti1 != null) {
            ((AbstractC11276wz3) c2511Ti1.a).j(false).i(c2511Ti1.b);
            this.g = null;
        }
    }
}
