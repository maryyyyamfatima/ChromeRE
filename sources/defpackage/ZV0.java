package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZV0 extends AbstractC7856n11 {
    public ZV0(Context context) {
        super(context, MG1.a, InterfaceC2999Xc.a, C7512m11.c);
    }

    public final AF3 g(final LocationRequest locationRequest, DG1 dg1, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
        }
        C3462aE1 c3462aE1 = new C3462aE1(looper, dg1, DG1.class.getSimpleName());
        final YV0 yv0 = new YV0(this, c3462aE1, new KH());
        InterfaceC5565gM2 interfaceC5565gM2 = new InterfaceC5565gM2() { // from class: XV0
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException
                */
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(java.lang.Object r32, java.lang.Object r33) {
                /*
                    Method dump skipped, instructions count: 262
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.XV0.accept(java.lang.Object, java.lang.Object):void");
            }
        };
        CL2 cl2 = new CL2();
        cl2.a = interfaceC5565gM2;
        cl2.b = yv0;
        cl2.d = c3462aE1;
        cl2.f = 2436;
        return d(cl2.a());
    }

    public final void f(DG1 dg1) {
        e(new YD1(dg1, DG1.class.getSimpleName()), 2418).h(new VV0(), new InterfaceC9269r80() { // from class: WV0
            @Override // defpackage.InterfaceC9269r80
            public final Object a(AF3 af3) {
                return null;
            }
        });
    }
}
