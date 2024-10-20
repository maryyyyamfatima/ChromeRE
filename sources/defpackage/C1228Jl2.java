package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.chromesync.firstparty.ListOptions;
import com.google.android.gms.common.Feature;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jl2 */
/* loaded from: classes.dex */
public final class C1228Jl2 extends AbstractC2569Tu {
    public final AF3 f(final ListOptions listOptions) {
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.c = new Feature[]{GI0.a};
        c5531gF3.d = 1000;
        c5531gF3.a = new InterfaceC5565gM2() { // from class: Gl2
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                InterfaceC2861Wa1 interfaceC2861Wa1 = (InterfaceC2861Wa1) ((C6612jQ) obj).m();
                BinderC11117wY1 binderC11117wY1 = new BinderC11117wY1((C6905kF3) obj2);
                C2601Ua1 c2601Ua1 = (C2601Ua1) interfaceC2861Wa1;
                Parcel a = c2601Ua1.a();
                AbstractC11786yV.c(a, binderC11117wY1);
                AbstractC11786yV.b(a, ListOptions.this);
                c2601Ua1.h(2, a);
            }
        };
        return b(0, c5531gF3.a());
    }

    public final AF3 g(final C2017Pn2 c2017Pn2) {
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.c = new Feature[]{GI0.a};
        c5531gF3.d = 1001;
        c5531gF3.a = new InterfaceC5565gM2() { // from class: Il2
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                Bundle bundle = new Bundle();
                bundle.putByteArray("entity", C2017Pn2.this.toByteArray());
                InterfaceC2861Wa1 interfaceC2861Wa1 = (InterfaceC2861Wa1) ((C6612jQ) obj).m();
                BinderC11460xY1 binderC11460xY1 = new BinderC11460xY1((C6905kF3) obj2);
                C2601Ua1 c2601Ua1 = (C2601Ua1) interfaceC2861Wa1;
                Parcel a = c2601Ua1.a();
                AbstractC11786yV.c(a, binderC11460xY1);
                AbstractC11786yV.b(a, bundle);
                c2601Ua1.h(3, a);
            }
        };
        return b(1, c5531gF3.a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228Jl2(Context context, C7300lQ c7300lQ) {
        super(context, c7300lQ);
    }
}
