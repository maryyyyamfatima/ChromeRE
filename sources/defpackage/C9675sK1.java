package defpackage;

import android.view.View;
import android.widget.Magnifier;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sK1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9675sK1 implements InterfaceC8990qK1 {
    public Magnifier a;
    public final C9242r33 b;

    public C9675sK1(C9242r33 c9242r33) {
        this.b = c9242r33;
    }

    public final void a(float f, float f2) {
        View view;
        C9242r33 c9242r33 = this.b;
        c9242r33.getClass();
        boolean z = SelectionPopupControllerImpl.N;
        SelectionPopupControllerImpl selectionPopupControllerImpl = c9242r33.a;
        if (z) {
            WindowAndroid windowAndroid = selectionPopupControllerImpl.i;
            view = windowAndroid == null ? null : windowAndroid.t();
        } else {
            view = selectionPopupControllerImpl.q;
        }
        if (view == null) {
            return;
        }
        if (this.a == null) {
            this.a = new Magnifier(view);
        }
        this.a.show(f, f2);
    }
}
