package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gH */
/* loaded from: classes.dex */
public final class C5537gH extends AbstractC7856n11 {
    public static final C3588ad k = new C3588ad("CastApi.API", new C4506dH(), new C3259Zc());

    public C5537gH(Context context) {
        super(context, k, InterfaceC2999Xc.a, C7512m11.c);
    }

    public final AF3 f(final String[] strArr) {
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.a = new InterfaceC5565gM2() { // from class: bH
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                C5537gH.this.getClass();
                BinderC4849eH binderC4849eH = new BinderC4849eH((C6905kF3) obj2);
                C1042Ia1 c1042Ia1 = (C1042Ia1) ((InterfaceC1302Ka1) ((C5881hH) obj).m());
                Parcel a = c1042Ia1.a();
                AbstractC11786yV.c(a, binderC4849eH);
                a.writeStringArray(strArr);
                c1042Ia1.M0(5, a);
            }
        };
        c5531gF3.c = new Feature[]{FI0.b};
        c5531gF3.b = false;
        c5531gF3.d = 8425;
        return b(0, c5531gF3.a());
    }
}
