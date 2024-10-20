package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MT0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public MT0(View view) {
        this.a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.a;
        view2.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = Ec4.a;
        view2.requestApplyInsets();
    }
}
