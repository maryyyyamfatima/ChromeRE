package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A53 extends AbstractC8508ov {
    public final /* synthetic */ LocationSettingsRequest q;
    public final /* synthetic */ String r = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A53(AbstractC10600v11 abstractC10600v11, LocationSettingsRequest locationSettingsRequest) {
        super(MG1.a, abstractC10600v11);
        this.q = locationSettingsRequest;
    }

    @Override // defpackage.AbstractC8508ov
    public final void m(InterfaceC3129Yc interfaceC3129Yc) {
        C10684vG1 c10684vG1 = (C10684vG1) interfaceC3129Yc;
        c10684vG1.getClass();
        BinderC10341uG1 binderC10341uG1 = new BinderC10341uG1(this);
        C11139wc1 c11139wc1 = (C11139wc1) ((InterfaceC11825yc1) c10684vG1.m());
        Parcel a = c11139wc1.a();
        AbstractC11786yV.b(a, this.q);
        AbstractC11786yV.c(a, binderC10341uG1);
        a.writeString(this.r);
        c11139wc1.h(63, a);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final QP2 e(Status status) {
        return new LocationSettingsResult(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, defpackage.InterfaceC8851pv
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        a((QP2) obj);
    }
}
