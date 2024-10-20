package defpackage;

import android.os.SystemClock;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hy1 */
/* loaded from: classes.dex */
public final class C6121hy1 extends C9554ry1 {
    public final /* synthetic */ C6463iy1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6121hy1(C6463iy1 c6463iy1) {
        super(c6463iy1);
        this.g = c6463iy1;
    }

    @Override // defpackage.C9554ry1, defpackage.InterfaceC8876pz3
    public final void D(Tab tab, boolean z) {
        if (z) {
            int id = tab.getId();
            C6463iy1 c6463iy1 = this.g;
            InterfaceC10590uz3 interfaceC10590uz3 = c6463iy1.l;
            if ((interfaceC10590uz3 == null ? null : ((AbstractC11276wz3) interfaceC10590uz3).m(id)) == null) {
                return;
            }
            if (!c6463iy1.r.q()) {
                if (c6463iy1.U) {
                    if (c6463iy1.s != null) {
                        return;
                    }
                    c6463iy1.Y(c6463iy1.Z, false);
                    AbstractC2976Wx1 abstractC2976Wx1 = c6463iy1.r;
                    SystemClock.uptimeMillis();
                    abstractC2976Wx1.w(id);
                    return;
                }
                return;
            }
            AbstractC2976Wx1 abstractC2976Wx12 = c6463iy1.r;
            SystemClock.uptimeMillis();
            abstractC2976Wx12.w(id);
        }
    }
}
