package defpackage;

import java.util.Iterator;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.toolbar.top.ToolbarControlContainer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xC */
/* loaded from: classes.dex */
public final class RunnableC11348xC implements Runnable {
    public final /* synthetic */ CC a;

    @Override // java.lang.Runnable
    public final void run() {
        CC cc = this.a;
        int i = cc.n() ? 0 : 4;
        B80 b80 = cc.l;
        if (b80 == null || ((ToolbarControlContainer) b80).getVisibility() == i) {
            return;
        }
        TraceEvent i2 = TraceEvent.i("BrowserControlsManager.onAndroidVisibilityChanged", null);
        try {
            ToolbarControlContainer toolbarControlContainer = (ToolbarControlContainer) cc.l;
            toolbarControlContainer.getClass();
            toolbarControlContainer.setVisibility(i);
            ToolbarControlContainer toolbarControlContainer2 = (ToolbarControlContainer) cc.l;
            toolbarControlContainer2.getClass();
            toolbarControlContainer2.requestLayout();
            Iterator it = cc.y.iterator();
            while (true) {
                C11814ya2 c11814ya2 = (C11814ya2) it;
                if (!c11814ya2.hasNext()) {
                    break;
                } else {
                    ((GC) c11814ya2.next()).e();
                }
            }
            if (i2 != null) {
                i2.close();
            }
        } catch (Throwable th) {
            if (i2 != null) {
                try {
                    i2.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public RunnableC11348xC(CC cc) {
        this.a = cc;
    }
}
