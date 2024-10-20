package defpackage;

import J.N;
import android.app.Activity;
import java.util.Objects;
import org.chromium.chrome.browser.download.DownloadManagerService;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ed0 */
/* loaded from: classes.dex */
public final class C0536Ed0 extends BA0 {
    public final Activity a;
    public final C2468Sz3 g;

    public C0536Ed0(Activity activity, C2468Sz3 c2468Sz3) {
        this.a = activity;
        this.g = c2468Sz3;
        c2468Sz3.h.add(this);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [Cr0] */
    @Override // defpackage.BA0
    public final void t0(final TabImpl tabImpl, NavigationHandle navigationHandle) {
        if ((navigationHandle.d & (-939524096)) != 0) {
            C7928nE c7928nE = UN.a;
            if (N.M09VlOh_("CCTNewDownloadTab") && navigationHandle.h) {
                Objects.requireNonNull(tabImpl);
                C0276Cd0 c0276Cd0 = new C0276Cd0(tabImpl);
                String i = tabImpl.z().i();
                final WindowAndroid windowAndroid = tabImpl.j;
                C0606Er0 c0606Er0 = new C0606Er0(c0276Cd0, i, AbstractC0653Fa2.a(), AbstractC1329Kf3.a(windowAndroid), new Runnable() { // from class: Cr0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6493j32.V0(WindowAndroid.this);
                    }
                });
                C3637al0.b().a(new Runnable() { // from class: Dd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1910Os0 c1910Os0 = DownloadManagerService.i().n;
                        c1910Os0.j.add(tabImpl.z());
                    }
                });
                K44 k44 = tabImpl.G;
                C6493j32 c6493j32 = (C6493j32) k44.b(C6493j32.class);
                if (c6493j32 == null) {
                    c6493j32 = (C6493j32) k44.d(C6493j32.class, new C6493j32(tabImpl, c0606Er0, this.a));
                }
                Tab tab = c6493j32.a;
                tab.v(c6493j32);
                if (c6493j32.h.a.a != null && tab.q().b(c6493j32)) {
                    return;
                }
                c6493j32.a.q().a(c6493j32);
                return;
            }
            return;
        }
        this.g.h.remove(this);
    }
}
