package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class W21 extends AbstractC8508ov {
    public abstract void o(InterfaceC10796vc1 interfaceC10796vc1);

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, defpackage.InterfaceC8851pv
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        a((QP2) obj);
    }

    @Override // defpackage.AbstractC8508ov
    public final void m(InterfaceC3129Yc interfaceC3129Yc) {
        Z21 z21 = (Z21) interfaceC3129Yc;
        Context context = z21.h;
        o((InterfaceC10796vc1) z21.m());
    }

    public W21(C6144i21 c6144i21) {
        super(AbstractC10636v71.a, c6144i21);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final QP2 e(Status status) {
        return status == null ? Status.m : status;
    }
}
