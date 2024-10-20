package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fa3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC5292fa3 extends AbstractBinderC6794jw implements InterfaceC9914t11, InterfaceC10257u11 {
    public static final Y93 m = AbstractC3574aa3.a;
    public final Context a;
    public final Handler g;
    public final AbstractC2609Uc h = m;
    public final Set i;
    public final JU j;
    public InterfaceC3918ba3 k;
    public C5456g21 l;

    public BinderC5292fa3(Context context, HandlerC10413uU3 handlerC10413uU3, JU ju) {
        this.a = context;
        this.g = handlerC10413uU3;
        this.j = ju;
        this.i = ju.b;
    }

    @Override // defpackage.C30
    public final void h(Bundle bundle) {
        ((C4261ca3) this.k).z(this);
    }

    @Override // defpackage.C30
    public final void e(int i) {
        this.k.disconnect();
    }

    @Override // defpackage.InterfaceC1962Pc2
    public final void M0(ConnectionResult connectionResult) {
        this.l.b(connectionResult);
    }

    @Override // defpackage.InterfaceC11157wf1
    public final void H(SignInResponse signInResponse) {
        this.g.post(new RunnableC4948ea3(this, signInResponse));
    }
}
