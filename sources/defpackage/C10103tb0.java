package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import java.nio.charset.StandardCharsets;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10103tb0 extends AbstractC7856n11 implements InterfaceC8732pb0 {
    public static final C3588ad k = new C3588ad("CredentialManager.API", new C9760sb0(), new C3259Zc());

    public C10103tb0(Context context) {
        super(context, k, InterfaceC2999Xc.a, C7512m11.c);
    }

    public final AF3 f(final CredentialManagerAccount credentialManagerAccount) {
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.d = 26703;
        c5531gF3.c = new Feature[]{JI0.a};
        c5531gF3.a = new InterfaceC5565gM2() { // from class: rb0
            public final /* synthetic */ int a = 1;

            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                InterfaceC7358lb1 interfaceC7358lb1 = (InterfaceC7358lb1) ((C10446ub0) obj).m();
                BinderC3043Xk3 binderC3043Xk3 = new BinderC3043Xk3((C6905kF3) obj2);
                String concat = AbstractC0735Fr.a(this.a).concat("autofillAccount");
                byte[] bytes = CredentialManagerAccount.this.a.getBytes(StandardCharsets.UTF_8);
                C6670jb1 c6670jb1 = (C6670jb1) interfaceC7358lb1;
                Parcel a = c6670jb1.a();
                AbstractC11786yV.c(a, binderC3043Xk3);
                a.writeString(concat);
                a.writeByteArray(bytes);
                c6670jb1.h(3, a);
            }
        };
        return b(0, c5531gF3.a());
    }
}
