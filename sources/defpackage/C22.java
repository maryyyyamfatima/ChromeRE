package defpackage;

import android.util.Log;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class C22 implements InterfaceC10960w40 {
    public final C9591s43 a;
    public final C2428Sr3 b;
    public final C5364fm3 c;
    public final /* synthetic */ D22 d;

    @Override // defpackage.InterfaceC10960w40
    public final void a(C4259ca1 c4259ca1) {
        C9934t43 c9934t43;
        if (this.b.a(c4259ca1)) {
            try {
                byte[] bArr = c4259ca1.b;
                XF0 d = XF0.d();
                C9934t43 c9934t432 = C9934t43.o;
                int length = bArr.length;
                C9934t43 c9934t433 = C9934t43.o;
                c9934t43 = new C9934t43();
                try {
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b = c7931nE2.b(c9934t43.getClass());
                        b.f(c9934t43, bArr, 0, length + 0, new C2254Rj(d));
                        b.b(c9934t43);
                    } catch (C1127Ir1 e) {
                        if (e.g) {
                            throw new C1127Ir1(e);
                        }
                        throw e;
                    } catch (IndexOutOfBoundsException unused) {
                        throw C1127Ir1.h();
                    }
                } catch (IOException e2) {
                    if (e2.getCause() instanceof C1127Ir1) {
                        throw ((C1127Ir1) e2.getCause());
                    }
                    throw new C1127Ir1(e2);
                } catch (C6827k14 e3) {
                    throw e3.a();
                }
            } catch (C1127Ir1 e4) {
                Log.e("SurveyTriggerHttpRequest", "Parsing SurveyTriggerResponse failed!", e4);
            }
            if (c9934t43.a != 0) {
                throw new RuntimeException();
            }
            QX0.i(c9934t43);
            D22.c(this.d, this.a, c9934t43, this.c);
        }
        c9934t43 = null;
        D22.c(this.d, this.a, c9934t43, this.c);
    }

    public C22(D22 d22, C9591s43 c9591s43, C2428Sr3 c2428Sr3, C5364fm3 c5364fm3) {
        this.d = d22;
        this.a = c9591s43;
        this.b = c2428Sr3;
        this.c = c5364fm3;
    }
}
