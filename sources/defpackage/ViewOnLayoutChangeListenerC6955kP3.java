package defpackage;

import android.view.View;
import org.chromium.chrome.browser.toolbar.top.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kP3 */
/* loaded from: classes2.dex */
public final class ViewOnLayoutChangeListenerC6955kP3 implements View.OnLayoutChangeListener {
    public final /* synthetic */ d a;

    public ViewOnLayoutChangeListenerC6955kP3(d dVar) {
        this.a = dVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        d dVar = this.a;
        if (dVar.n && dVar.l.getParent() != null) {
            dVar.l.e();
        }
        dVar.removeOnLayoutChangeListener(this);
    }
}
