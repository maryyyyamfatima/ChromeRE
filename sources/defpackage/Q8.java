package defpackage;

import android.widget.PopupWindow;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Q8 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ T8 a;

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        T8 t8 = this.a;
        if (t8.w) {
            return;
        }
        t8.i.removeCallbacks(t8.m);
        Iterator it = t8.o.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                t8.l.b();
                return;
            }
            ((PopupWindow.OnDismissListener) c11814ya2.next()).onDismiss();
        }
    }

    public Q8(T8 t8) {
        this.a = t8;
    }
}
