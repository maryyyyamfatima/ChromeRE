package defpackage;

import android.util.Log;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ze4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC12183ze4 implements ViewTreeObserver.OnPreDrawListener {
    public final WeakReference a;

    public ViewTreeObserverOnPreDrawListenerC12183ze4(Ae4 ae4) {
        this.a = new WeakReference(ae4);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (Log.isLoggable("ViewTarget", 2)) {
            String.valueOf(this);
        }
        Ae4 ae4 = (Ae4) this.a.get();
        if (ae4 != null) {
            ArrayList arrayList = ae4.b;
            if (!arrayList.isEmpty()) {
                int c = ae4.c();
                int b = ae4.b();
                boolean z = false;
                if (c > 0 || c == Integer.MIN_VALUE) {
                    if (b > 0 || b == Integer.MIN_VALUE) {
                        z = true;
                    }
                }
                if (z) {
                    Iterator it = new ArrayList(arrayList).iterator();
                    while (it.hasNext()) {
                        ((C3133Yc3) ((InterfaceC11153we3) it.next())).m(c, b);
                    }
                    ViewTreeObserver viewTreeObserver = ae4.a.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(ae4.c);
                    }
                    ae4.c = null;
                    arrayList.clear();
                }
            }
        }
        return true;
    }
}
