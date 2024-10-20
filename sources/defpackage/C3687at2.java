package defpackage;

import android.os.Parcel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: at2 */
/* loaded from: classes.dex */
public final /* synthetic */ class C3687at2 implements InterfaceC5565gM2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c = null;

    public /* synthetic */ C3687at2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.InterfaceC5565gM2
    public final void accept(Object obj, Object obj2) {
        BinderC4031bt2 binderC4031bt2 = new BinderC4031bt2((C6905kF3) obj2);
        C1452Le1 c1452Le1 = (C1452Le1) ((InterfaceC1711Ne1) ((C5061et2) obj).m());
        Parcel a = c1452Le1.a();
        AbstractC11786yV.c(a, binderC4031bt2);
        a.writeString(this.a);
        a.writeString(this.b);
        a.writeString(this.c);
        c1452Le1.h(11, a);
    }
}
