package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g21, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5456g21 implements InterfaceC6102hv {
    public final InterfaceC3129Yc a;
    public final C0540Ee b;
    public InterfaceC7008ka1 c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ C5800h21 f;

    public C5456g21(C5800h21 c5800h21, InterfaceC3129Yc interfaceC3129Yc, C0540Ee c0540Ee) {
        this.f = c5800h21;
        this.a = interfaceC3129Yc;
        this.b = c0540Ee;
    }

    @Override // defpackage.InterfaceC6102hv
    public final void a(ConnectionResult connectionResult) {
        this.f.s.post(new RunnableC5112f21(this, connectionResult));
    }

    public final void b(ConnectionResult connectionResult) {
        C4425d21 c4425d21 = (C4425d21) this.f.o.get(this.b);
        if (c4425d21 != null) {
            HandlerC10413uU3 handlerC10413uU3 = c4425d21.r.s;
            InterfaceC3129Yc interfaceC3129Yc = c4425d21.g;
            interfaceC3129Yc.a("onSignInFailed for " + interfaceC3129Yc.getClass().getName() + " with " + String.valueOf(connectionResult));
            c4425d21.m(connectionResult, null);
        }
    }
}
