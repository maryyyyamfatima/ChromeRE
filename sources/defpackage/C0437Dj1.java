package defpackage;

import J.N;
import java.util.Iterator;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dj1 */
/* loaded from: classes.dex */
public final class C0437Dj1 implements InterfaceC0442Dk1 {
    public final InterfaceC10590uz3 a;

    @Override // defpackage.InterfaceC0442Dk1
    public final /* synthetic */ void a() {
    }

    public C0437Dj1(AbstractC11276wz3 abstractC11276wz3) {
        this.a = abstractC11276wz3;
    }

    @Override // defpackage.InterfaceC0442Dk1
    public final void b() {
        boolean z;
        Profile b;
        if (AbstractC11530xk1.b()) {
            return;
        }
        Iterator it = C11187wk1.a().a.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((InterfaceC10844vk1) it.next()).isActiveModel()) {
                z = true;
                break;
            }
        }
        if (z || (b = ((AbstractC11276wz3) this.a).j(true).b()) == null) {
            return;
        }
        N.MScIZBOB(b.b, b);
    }
}
