package defpackage;

import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cr1 */
/* loaded from: classes2.dex */
public final class C4361cr1 implements InterfaceC7371ld2 {
    public final /* synthetic */ C6559jF1 a;
    public final /* synthetic */ C5048er1 b;

    public C4361cr1(C5048er1 c5048er1, C6559jF1 c6559jF1) {
        this.b = c5048er1;
        this.a = c6559jF1;
    }

    @Override // defpackage.InterfaceC7371ld2
    public final void a(Object obj) {
        LU2 lu2 = (LU2) obj;
        Object obj2 = ThreadUtils.a;
        ((MU2) lu2.a).g.toString();
        this.b.getClass();
        EI2.h(0, 8, "Android.PlayServicesFetchTrustTokenResult");
        String str = ((MU2) lu2.a).a;
        C6559jF1 c6559jF1 = this.a;
        if (str == null) {
            c6559jF1.a(C5048er1.c(2, ""));
        } else {
            c6559jF1.a(C5048er1.c(0, str));
        }
    }
}
