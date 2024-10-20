package defpackage;

import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nq1 */
/* loaded from: classes.dex */
public final class C1771Nq1 implements InterfaceC5565gM2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;

    public C1771Nq1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.InterfaceC5565gM2
    public final void accept(Object obj, Object obj2) {
        BinderC1641Mq1 binderC1641Mq1 = new BinderC1641Mq1((C6905kF3) obj2);
        C3261Zc1 c3261Zc1 = (C3261Zc1) ((InterfaceC3934bd1) ((C11247wu1) obj).m());
        Parcel a = c3261Zc1.a();
        AbstractC11786yV.c(a, binderC1641Mq1);
        a.writeString(this.a);
        a.writeInt(this.b);
        c3261Zc1.h(12, a);
    }
}
