package defpackage;

import J.N;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iT3 */
/* loaded from: classes2.dex */
public final class C6289iT3 {
    public final C8351oT3 a;
    public final PropertyModel b;

    public C6289iT3() {
        final C8351oT3 c8351oT3 = new C8351oT3();
        this.a = c8351oT3;
        Callback callback = new Callback() { // from class: hT3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int intValue = ((Integer) obj).intValue();
                C8351oT3 c8351oT32 = C8351oT3.this;
                PropertyModel propertyModel = c8351oT32.b;
                LD2 ld2 = AbstractC10065tT3.a;
                if (propertyModel.j(ld2)) {
                    c8351oT32.b.k(ld2, false);
                    EI2.h(intValue, 10, "PasswordManager.TouchToFill.DismissalReason");
                    EI2.h(1, 4, "PasswordManager.TouchToFill.UserAction");
                    long j = c8351oT32.a.a;
                    if (j != 0) {
                        N.MO$_q9pf(j);
                    }
                }
            }
        };
        LD2 ld2 = AbstractC10065tT3.a;
        JD2 jd2 = AbstractC10065tT3.b;
        JD2 jd22 = AbstractC10065tT3.c;
        HashMap e = PropertyModel.e(new FD2[]{ld2, jd2, jd22, AbstractC10065tT3.d});
        AD2 ad2 = new AD2();
        ad2.a = false;
        e.put(ld2, ad2);
        C5175fD1 c5175fD1 = new C5175fD1();
        GD2 gd2 = new GD2();
        gd2.a = c5175fD1;
        e.put(jd2, gd2);
        GD2 gd22 = new GD2();
        gd22.a = callback;
        this.b = AbstractC1996Pj1.a(e, jd22, gd22, e);
    }
}
