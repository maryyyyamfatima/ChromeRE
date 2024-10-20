package defpackage;

import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TR extends C10285u6 {
    public final InterfaceC0079Ap3 E;
    public final InterfaceC0079Ap3 F;

    public TR(Activity activity, C8385oa2 c8385oa2, C8385oa2 c8385oa22, C10709vL1 c10709vL1, C2021Po1 c2021Po1) {
        super(activity, new C4884eO(new WeakReference(activity), c10709vL1), c2021Po1);
        this.E = c8385oa2;
        this.F = c8385oa22;
    }

    @Override // org.chromium.ui.base.WindowAndroid
    public final View t() {
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.E;
        if (interfaceC0079Ap3.get() == null) {
            return null;
        }
        return ((CompositorViewHolder) interfaceC0079Ap3.get()).l.g.b();
    }

    @Override // org.chromium.ui.base.WindowAndroid
    public final ZX1 s() {
        return (ZX1) this.F.get();
    }

    @Override // defpackage.C10285u6, org.chromium.ui.base.WindowAndroid
    public final C11939yv1 r() {
        return (H5) this.g;
    }
}
