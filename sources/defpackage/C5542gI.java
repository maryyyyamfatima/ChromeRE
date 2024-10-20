package defpackage;

import android.content.Context;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gI */
/* loaded from: classes.dex */
public final class C5542gI {
    public final C2176Qt1 a;
    public final URL b;
    public final InterfaceC4919eV c;
    public final InterfaceC4919eV d;
    public final int e;

    public C5542gI(Context context, InterfaceC4919eV interfaceC4919eV, InterfaceC4919eV interfaceC4919eV2) {
        C2436St1 c2436St1 = new C2436St1();
        C9831sn c9831sn = C9831sn.a;
        c2436St1.a(AbstractC7832mx.class, c9831sn);
        c2436St1.a(C2274Rn.class, c9831sn);
        C10860vn c10860vn = C10860vn.a;
        c2436St1.a(HH1.class, c10860vn);
        c2436St1.a(C9152qo.class, c10860vn);
        C10174tn c10174tn = C10174tn.a;
        c2436St1.a(AbstractC7320lU.class, c10174tn);
        c2436St1.a(C2534Tn.class, c10174tn);
        C9488rn c9488rn = C9488rn.a;
        c2436St1.a(Y8.class, c9488rn);
        c2436St1.a(C1235Jn.class, c9488rn);
        C10517un c10517un = C10517un.a;
        c2436St1.a(AbstractC7945nH1.class, c10517un);
        c2436St1.a(C8809po.class, c10517un);
        C11203wn c11203wn = C11203wn.a;
        c2436St1.a(X22.class, c11203wn);
        c2436St1.a(C10866vo.class, c11203wn);
        c2436St1.d = true;
        this.a = new C2176Qt1(c2436St1);
        String str = C4834eE.c;
        try {
            this.b = new URL(str);
            this.c = interfaceC4919eV2;
            this.d = interfaceC4919eV;
            this.e = 40000;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(AbstractC4809e90.a("Invalid url: ", str), e);
        }
    }
}
