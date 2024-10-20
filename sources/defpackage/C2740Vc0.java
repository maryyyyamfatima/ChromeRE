package defpackage;

import androidx.appcompat.app.a;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vc0 */
/* loaded from: classes.dex */
public final class C2740Vc0 extends BA0 {
    public final /* synthetic */ C3130Yc0 a;

    public C2740Vc0(C3130Yc0 c3130Yc0) {
        this.a = c3130Yc0;
    }

    @Override // defpackage.BA0
    public final void f0(final TabImpl tabImpl) {
        tabImpl.w(this);
        ((CompositorViewHolder) this.a.k.get()).l.j(new Runnable() { // from class: Uc0
            @Override // java.lang.Runnable
            public final void run() {
                C2740Vc0 c2740Vc0 = C2740Vc0.this;
                c2740Vc0.getClass();
                Tab tab = tabImpl;
                if (tab.isInitialized()) {
                    a aVar = c2740Vc0.a.g;
                    boolean z = true;
                    if (aVar != null && !aVar.isDestroyed() && !aVar.isFinishing()) {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                    tab.a().setBackgroundResource(0);
                }
            }
        });
    }
}
