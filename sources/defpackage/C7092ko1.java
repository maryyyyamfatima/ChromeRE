package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.instantapps.LaunchSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ko1 */
/* loaded from: classes.dex */
public final class C7092ko1 extends AbstractC8508ov {
    public final /* synthetic */ String q;

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, defpackage.InterfaceC8851pv
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        a((QP2) obj);
    }

    @Override // defpackage.AbstractC8508ov
    public final void m(InterfaceC3129Yc interfaceC3129Yc) {
        C8811po1 c8811po1 = (C8811po1) interfaceC3129Yc;
        Context context = c8811po1.h;
        InterfaceC2871Wc1 interfaceC2871Wc1 = (InterfaceC2871Wc1) c8811po1.m();
        BinderC6748jo1 binderC6748jo1 = new BinderC6748jo1(this);
        LaunchSettings launchSettings = new LaunchSettings();
        C2611Uc1 c2611Uc1 = (C2611Uc1) interfaceC2871Wc1;
        Parcel a = c2611Uc1.a();
        AbstractC11786yV.c(a, binderC6748jo1);
        a.writeString(this.q);
        AbstractC11786yV.b(a, launchSettings);
        c2611Uc1.h(19, a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7092ko1(C6144i21 c6144i21, String str) {
        super(AbstractC6062ho1.a, c6144i21);
        this.q = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final QP2 e(Status status) {
        return new C7436lo1(status, null);
    }
}
