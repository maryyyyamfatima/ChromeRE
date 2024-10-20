package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fm2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713Fm2 extends AbstractC2569Tu {
    public final AF3 f(final String str) {
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.c = new Feature[]{GI0.a};
        c5531gF3.d = 1003;
        c5531gF3.a = new InterfaceC5565gM2() { // from class: Dm2
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                InterfaceC2861Wa1 interfaceC2861Wa1 = (InterfaceC2861Wa1) ((C6612jQ) obj).m();
                BinderC0583Em2 binderC0583Em2 = new BinderC0583Em2((C6905kF3) obj2);
                C2601Ua1 c2601Ua1 = (C2601Ua1) interfaceC2861Wa1;
                Parcel a = c2601Ua1.a();
                AbstractC11786yV.c(a, binderC0583Em2);
                a.writeString(str);
                c2601Ua1.h(5, a);
            }
        };
        return b(0, c5531gF3.a());
    }

    public final AF3 g(final String str, final boolean z) {
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.c = new Feature[]{GI0.a};
        c5531gF3.d = 1004;
        c5531gF3.a = new InterfaceC5565gM2() { // from class: Cm2
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                InterfaceC2861Wa1 interfaceC2861Wa1 = (InterfaceC2861Wa1) ((C6612jQ) obj).m();
                BinderC11460xY1 binderC11460xY1 = new BinderC11460xY1((C6905kF3) obj2);
                String valueOf = String.valueOf(z);
                C2601Ua1 c2601Ua1 = (C2601Ua1) interfaceC2861Wa1;
                Parcel a = c2601Ua1.a();
                AbstractC11786yV.c(a, binderC11460xY1);
                a.writeString(str);
                a.writeString(valueOf);
                c2601Ua1.h(6, a);
            }
        };
        return b(0, c5531gF3.a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0713Fm2(Context context, C7300lQ c7300lQ) {
        super(context, c7300lQ);
    }
}
