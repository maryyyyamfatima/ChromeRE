package defpackage;

import java.util.ArrayList;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.vr.VrModuleProvider;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.webxr.ArCoreJavaUtils;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iM */
/* loaded from: classes.dex */
public final class C6250iM extends AbstractC11826yc2 {
    public final /* synthetic */ ChromeActivity c;

    @Override // defpackage.AbstractC11826yc2
    public final void a() {
        boolean z;
        C9897sy1 c9897sy1;
        boolean z2;
        boolean z3;
        ChromeActivity chromeActivity = this.c;
        if (chromeActivity.n0) {
            FI2.a("SystemBack");
        }
        Object obj = C3823bH3.r.g;
        boolean z4 = false;
        if (obj != null && ((Integer) obj).intValue() > 0) {
            C3823bH3.d();
            C9861ss.c(0);
        }
        if (VrModuleProvider.b().onBackPressed()) {
            C9861ss.c(1);
            return;
        }
        if (AbstractC0825Gj.a() != null) {
            ArCoreJavaUtils arCoreJavaUtils = ArCoreJavaUtils.c;
            if (arCoreJavaUtils != null) {
                arCoreJavaUtils.endSession();
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                C9861ss.c(2);
                return;
            }
        }
        C8385oa2 c8385oa2 = chromeActivity.r0;
        c8385oa2.getClass();
        if (AbstractC12248zp3.a(c8385oa2) && (c9897sy1 = ((CompositorViewHolder) c8385oa2.g).k) != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = c9897sy1.M;
                if (i >= arrayList.size()) {
                    AbstractC2976Wx1 abstractC2976Wx1 = c9897sy1.r;
                    if (abstractC2976Wx1 == null || !abstractC2976Wx1.t()) {
                        z2 = false;
                    }
                } else {
                    if (((InterfaceC3897bW2) arrayList.get(i)).p0() && ((InterfaceC3897bW2) arrayList.get(i)).onBackPressed()) {
                        C9861ss.c(3);
                        break;
                    }
                    i++;
                }
            }
            z2 = true;
            if (z2) {
                return;
            }
        }
        WebContents p1 = chromeActivity.p1();
        SelectionPopupControllerImpl k = p1 != null ? SelectionPopupControllerImpl.k(p1) : null;
        if (k == null || !k.t()) {
            CL1 cl1 = ((C11052wL1) chromeActivity.Y.g).a;
            if (cl1.f1()) {
                cl1.d1();
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                XU0 xu0 = (XU0) chromeActivity.q1();
                if (xu0.g()) {
                    xu0.f();
                    z4 = true;
                }
                if (!z4) {
                    m mVar = chromeActivity.H0.C;
                    if (mVar != null && mVar.k()) {
                        C9861ss.c(8);
                        return;
                    } else {
                        chromeActivity.v1();
                        return;
                    }
                }
                C9861ss.c(7);
                return;
            }
            C9861ss.c(6);
            return;
        }
        k.e();
        C9861ss.c(5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6250iM(ChromeActivity chromeActivity) {
        super(true);
        this.c = chromeActivity;
    }
}
