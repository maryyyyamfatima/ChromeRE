package defpackage;

import android.view.View;
import java.util.Iterator;
import org.chromium.chrome.browser.infobar.InfoBarContainer;
import org.chromium.components.browser_ui.bottomsheet.m;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rl1 */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC9478rl1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ InfoBarContainer a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        InfoBarContainer infoBarContainer = this.a;
        if (infoBarContainer.s == null) {
            infoBarContainer.s = new C9136ql1(this);
            infoBarContainer.t = UB.a(infoBarContainer.l.m());
            ((m) infoBarContainer.t).a(infoBarContainer.s);
        }
        Iterator it = infoBarContainer.i.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            }
            InterfaceC9821sl1 interfaceC9821sl1 = (InterfaceC9821sl1) c11814ya2.next();
            infoBarContainer.h.isEmpty();
            interfaceC9821sl1.getClass();
        }
    }

    public ViewOnAttachStateChangeListenerC9478rl1(InfoBarContainer infoBarContainer) {
        this.a = infoBarContainer;
    }
}
