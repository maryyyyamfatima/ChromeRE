package defpackage;

import J.N;
import java.util.LinkedList;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.autofill.PersonalDataManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Iq2 */
/* loaded from: classes.dex */
public final class C1123Iq2 implements Callback {
    public final /* synthetic */ C1634Mp a;
    public final /* synthetic */ C1642Mq2 g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C1123Iq2(C1642Mq2 c1642Mq2, C1634Mp c1634Mp) {
        this.g = c1642Mq2;
        this.a = c1634Mp;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C1634Mp c1634Mp = (C1634Mp) obj;
        C1642Mq2 c1642Mq2 = this.g;
        if (c1642Mq2.z == null) {
            return;
        }
        if (c1634Mp != null) {
            c1642Mq2.u.w = null;
            c1634Mp.m();
            c1642Mq2.v.d(c1634Mp);
            if (c1634Mp.a) {
                if (this.a == null) {
                    C8545p13 c8545p13 = c1642Mq2.D;
                    c8545p13.a.add(0, c1634Mp);
                    c8545p13.c = 0;
                }
                C40 c40 = c1642Mq2.E;
                if (c40 != null) {
                    c40.f(c1634Mp);
                    c1642Mq2.z.o(3, c1642Mq2.E);
                }
                PersonalDataManager d = PersonalDataManager.d();
                PersonalDataManager.AutofillProfile autofillProfile = c1634Mp.q;
                d.getClass();
                Object obj2 = ThreadUtils.a;
                N.M7ysHTTC(d.a, d, autofillProfile, 5, c1642Mq2);
            } else {
                c1642Mq2.D.c = -1;
                c1642Mq2.s();
            }
        } else {
            c1642Mq2.s();
        }
        LinkedList linkedList = c1642Mq2.i;
        if (linkedList.isEmpty()) {
            return;
        }
        c1642Mq2.h.post((Runnable) linkedList.remove());
    }
}
