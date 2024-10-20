package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eW3 */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC4928eW3 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final QV3 a;
    public final ViewGroup g;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewTreeObserverOnPreDrawListenerC4928eW3(ViewGroup viewGroup, QV3 qv3) {
        this.a = qv3;
        this.g = viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c8 A[EDGE_INSN: B:122:0x01c8->B:123:0x01c8 BREAK  A[LOOP:1: B:17:0x0082->B:29:0x01bf], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewTreeObserverOnPreDrawListenerC4928eW3.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.g;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        AbstractC6990kW3.c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) AbstractC6990kW3.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((QV3) it.next()).y(viewGroup);
            }
        }
        this.a.j(true);
    }
}
