package defpackage;

import android.view.View;
import androidx.recyclerview.widget.d;
import org.chromium.chrome.browser.tasks.tab_management.n;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kC3 */
/* loaded from: classes.dex */
public final class C6890kC3 implements InterfaceC9975tB3 {
    public final /* synthetic */ n a;

    @Override // defpackage.InterfaceC9975tB3
    public final void a() {
    }

    @Override // defpackage.InterfaceC9975tB3
    public final void b() {
    }

    @Override // defpackage.InterfaceC9975tB3
    public final void d() {
    }

    @Override // defpackage.InterfaceC9975tB3
    public final void c() {
        n nVar = this.a;
        InterfaceC10590uz3 interfaceC10590uz3 = nVar.n;
        if (((AbstractC11276wz3) interfaceC10590uz3).i) {
            d G = nVar.j.g.G(((AbstractC11276wz3) interfaceC10590uz3).c.d().index());
            if (G == null) {
                return;
            }
            View view = G.a;
            view.requestFocus();
            view.sendAccessibilityEvent(8);
        }
    }

    public C6890kC3(n nVar) {
        this.a = nVar;
    }
}
