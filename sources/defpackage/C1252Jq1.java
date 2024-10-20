package defpackage;

import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jq1 */
/* loaded from: classes.dex */
public final class C1252Jq1 implements InterfaceC5565gM2 {
    public final /* synthetic */ String a;

    public C1252Jq1(String str) {
        this.a = str;
    }

    @Override // defpackage.InterfaceC5565gM2
    public final void accept(Object obj, Object obj2) {
        BinderC1122Iq1 binderC1122Iq1 = new BinderC1122Iq1((C6905kF3) obj2);
        C3261Zc1 c3261Zc1 = (C3261Zc1) ((InterfaceC3934bd1) ((C11247wu1) obj).m());
        Parcel a = c3261Zc1.a();
        AbstractC11786yV.c(a, binderC1122Iq1);
        a.writeString(this.a);
        c3261Zc1.h(10, a);
    }
}
