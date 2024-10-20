package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K71 implements View.OnAttachStateChangeListener {
    public final ArrayList a = new ArrayList();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            C11703yE1 c11703yE1 = (C11703yE1) pair.first;
            c11703yE1.getOverlay().remove((Drawable) pair.second);
            c11703yE1.invalidate();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        a();
    }
}
