package defpackage;

import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dr1 */
/* loaded from: classes2.dex */
public final class C4704dr1 implements InterfaceC2872Wc2 {
    public final /* synthetic */ C6559jF1 a;
    public final /* synthetic */ C5048er1 b;

    public C4704dr1(C5048er1 c5048er1, C6559jF1 c6559jF1) {
        this.b = c5048er1;
        this.a = c6559jF1;
    }

    @Override // defpackage.InterfaceC2872Wc2
    public final void c(Exception exc) {
        int i;
        Object obj = ThreadUtils.a;
        exc.toString();
        boolean z = exc instanceof C10114td;
        C5048er1 c5048er1 = this.b;
        if (!z) {
            c5048er1.getClass();
            EI2.h(1, 8, "Android.PlayServicesFetchTrustTokenResult");
        } else {
            int i2 = ((C10114td) exc).a.g;
            c5048er1.getClass();
            if (i2 == 8) {
                i = 5;
            } else if (i2 != 10) {
                switch (i2) {
                    case 15:
                        i = 4;
                        break;
                    case 16:
                        i = 6;
                        break;
                    case 17:
                        i = 3;
                        break;
                    default:
                        i = 2;
                        break;
                }
            } else {
                i = 7;
            }
            EI2.h(i, 8, "Android.PlayServicesFetchTrustTokenResult");
        }
        this.a.a(C5048er1.c(2, "Failed"));
    }
}
