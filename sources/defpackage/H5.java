package defpackage;

import android.R;
import android.app.Activity;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class H5 extends C11939yv1 implements View.OnLayoutChangeListener {
    public boolean h;
    public final WeakReference i;

    public H5(WeakReference weakReference) {
        this.i = weakReference;
    }

    @Override // defpackage.C11939yv1
    public final void g() {
        Activity activity = (Activity) this.i.get();
        if (activity == null) {
            return;
        }
        View findViewById = activity.findViewById(R.id.content);
        this.h = f(activity, findViewById);
        findViewById.addOnLayoutChangeListener(this);
    }

    @Override // defpackage.C11939yv1
    public final void j() {
        Activity activity = (Activity) this.i.get();
        if (activity == null) {
            return;
        }
        activity.findViewById(R.id.content).removeOnLayoutChangeListener(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean f;
        Activity activity = (Activity) this.i.get();
        if (activity == null || this.h == (f = f(activity, view))) {
            return;
        }
        this.h = f;
        Iterator it = this.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC11596xv1) c11814ya2.next()).g(f);
            }
        }
    }
}
