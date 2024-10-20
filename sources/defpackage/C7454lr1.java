package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lr1 */
/* loaded from: classes.dex */
public final class C7454lr1 extends AbstractC7856n11 {
    public static final C3588ad k = new C3588ad("ClientTelemetry.API", new C7110kr1(), new C3259Zc());

    public C7454lr1(Context context) {
        super(context, k, C8972qG3.b, C7512m11.c);
    }

    public final AF3 f(final TelemetryData telemetryData) {
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.c = new Feature[]{II0.a};
        c5531gF3.b = false;
        c5531gF3.a = new InterfaceC5565gM2() { // from class: jr1
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                C3922bb1 c3922bb1 = (C3922bb1) ((InterfaceC4609db1) ((C8629pG3) obj).m());
                Parcel a = c3922bb1.a();
                AbstractC11786yV.b(a, TelemetryData.this);
                c3922bb1.M0(1, a);
                ((C6905kF3) obj2).b(null);
            }
        };
        return b(2, c5531gF3.a());
    }
}
