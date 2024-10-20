package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OU2 extends AbstractBinderC11621y0 {
    public final /* synthetic */ C6905kF3 a;

    public OU2(C6905kF3 c6905kF3) {
        this.a = c6905kF3;
    }

    @Override // defpackage.AbstractBinderC11621y0, defpackage.InterfaceC4633df1
    public final void o(int i, Status status, String str) {
        LU2 lu2 = new LU2();
        lu2.a = new MU2(status, str);
        RF3.a(status, lu2, this.a);
    }
}
