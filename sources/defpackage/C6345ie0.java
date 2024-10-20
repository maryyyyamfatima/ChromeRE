package defpackage;

import android.graphics.Bitmap;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ie0 */
/* loaded from: classes.dex */
public final class C6345ie0 extends AbstractC2338Rz3 {
    public final /* synthetic */ C6687je0 a;

    @Override // defpackage.BA0
    public final void x0(Tab tab, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        this.a.b(bitmap);
    }

    public C6345ie0(C6687je0 c6687je0) {
        this.a = c6687je0;
    }

    @Override // defpackage.BA0
    public final void T0(Tab tab, boolean z, boolean z2) {
        if (z) {
            C6687je0 c6687je0 = this.a;
            c6687je0.s = null;
            c6687je0.d();
        }
    }

    @Override // defpackage.BA0
    public final void O0(TabImpl tabImpl) {
        if (AbstractC6832k23.a(tabImpl.l) == 5) {
            C6687je0 c6687je0 = this.a;
            c6687je0.s = null;
            c6687je0.d();
        }
    }
}
