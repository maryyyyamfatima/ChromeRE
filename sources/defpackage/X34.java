package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class X34 extends AbstractC8508ov {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final QP2 e(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, defpackage.InterfaceC8851pv
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        a((QP2) obj);
    }

    @Override // defpackage.AbstractC8508ov
    public final void m(InterfaceC3129Yc interfaceC3129Yc) {
        InterfaceC8402od1 interfaceC8402od1 = (InterfaceC8402od1) ((UA1) interfaceC3129Yc).m();
        W34 w34 = (W34) this;
        Y34 y34 = new Y34(w34);
        C7714md1 c7714md1 = (C7714md1) interfaceC8402od1;
        Parcel a = c7714md1.a();
        AbstractC11786yV.c(a, y34);
        a.writeString(null);
        a.writeTypedArray(w34.q, 0);
        c7714md1.h(1, a);
    }

    public X34(AbstractC10600v11 abstractC10600v11) {
        super(AbstractC0680Fg.a, abstractC10600v11);
    }
}
