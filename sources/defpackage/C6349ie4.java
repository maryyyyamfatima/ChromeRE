package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ie4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6349ie4 {
    public final WeakReference a;

    public C6349ie4(View view) {
        this.a = new WeakReference(view);
    }

    public final void c(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void e(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void d(InterfaceC7379le4 interfaceC7379le4) {
        View view = (View) this.a.get();
        if (view != null) {
            if (interfaceC7379le4 != null) {
                view.animate().setListener(new C6005he4(interfaceC7379le4, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }
}
