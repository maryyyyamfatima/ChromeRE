package defpackage;

import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lq1 */
/* loaded from: classes.dex */
public final class C1512Lq1 implements InterfaceC5565gM2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ int c;

    public C1512Lq1(String str, byte[] bArr, int i) {
        this.a = str;
        this.b = bArr;
        this.c = i;
    }

    @Override // defpackage.InterfaceC5565gM2
    public final void accept(Object obj, Object obj2) {
        BinderC1382Kq1 binderC1382Kq1 = new BinderC1382Kq1((C6905kF3) obj2);
        C3261Zc1 c3261Zc1 = (C3261Zc1) ((InterfaceC3934bd1) ((C11247wu1) obj).m());
        Parcel a = c3261Zc1.a();
        AbstractC11786yV.c(a, binderC1382Kq1);
        a.writeString(this.a);
        a.writeByteArray(this.b);
        a.writeInt(this.c);
        c3261Zc1.h(11, a);
    }
}
