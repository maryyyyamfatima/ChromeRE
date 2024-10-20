package defpackage;

import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pq1 */
/* loaded from: classes.dex */
public final class C2031Pq1 implements InterfaceC5565gM2 {
    public final /* synthetic */ String a;

    public C2031Pq1(String str) {
        this.a = str;
    }

    @Override // defpackage.InterfaceC5565gM2
    public final void accept(Object obj, Object obj2) {
        BinderC1901Oq1 binderC1901Oq1 = new BinderC1901Oq1((C6905kF3) obj2);
        C3261Zc1 c3261Zc1 = (C3261Zc1) ((InterfaceC3934bd1) ((C11247wu1) obj).m());
        Parcel a = c3261Zc1.a();
        AbstractC11786yV.c(a, binderC1901Oq1);
        a.writeString(this.a);
        c3261Zc1.h(5, a);
    }
}
