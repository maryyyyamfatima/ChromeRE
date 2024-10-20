package defpackage;

import android.util.Log;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC6693jf0 implements ViewTreeObserver.OnPreDrawListener {
    public final WeakReference a;

    public ViewTreeObserverOnPreDrawListenerC6693jf0(C7037kf0 c7037kf0) {
        this.a = new WeakReference(c7037kf0);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (Log.isLoggable("CustomViewTarget", 2)) {
            String.valueOf(this);
        }
        C7037kf0 c7037kf0 = (C7037kf0) this.a.get();
        if (c7037kf0 != null) {
            ArrayList arrayList = c7037kf0.b;
            if (!arrayList.isEmpty()) {
                int c = c7037kf0.c();
                int b = c7037kf0.b();
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
                    ViewTreeObserver viewTreeObserver = c7037kf0.a.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(c7037kf0.c);
                    }
                    c7037kf0.c = null;
                    arrayList.clear();
                }
            }
        }
        return true;
    }
}
