package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.android.chrome.R;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eO2 */
/* loaded from: classes.dex */
public final class C4887eO2 implements TE3 {
    public final C7037kf0 a;
    public final View g;

    @Override // defpackage.GA1
    public final /* bridge */ /* synthetic */ void a() {
    }

    @Override // defpackage.GA1
    public final /* bridge */ /* synthetic */ void b() {
    }

    @Override // defpackage.TE3
    public final void d(Object obj, OV3 ov3) {
    }

    @Override // defpackage.TE3
    public final void i(Drawable drawable) {
    }

    @Override // defpackage.TE3
    public final /* bridge */ /* synthetic */ void k(Drawable drawable) {
    }

    @Override // defpackage.GA1
    public final /* bridge */ /* synthetic */ void onDestroy() {
    }

    public C4887eO2(View view) {
        AbstractC6464iy2.b(view);
        this.g = view;
        this.a = new C7037kf0(view);
    }

    /* renamed from: f */
    public final String toString() {
        return "Target for: ".concat(String.valueOf(this.g));
    }

    @Override // defpackage.TE3
    public final void e(GN2 gn2) {
        this.g.setTag(R.id.glide_custom_view_target_tag, gn2);
    }

    @Override // defpackage.TE3
    public final GN2 l() {
        Object tag = this.g.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof GN2) {
            return (GN2) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // defpackage.TE3
    public final void c(InterfaceC11153we3 interfaceC11153we3) {
        C7037kf0 c7037kf0 = this.a;
        int c = c7037kf0.c();
        int b = c7037kf0.b();
        boolean z = false;
        if (c > 0 || c == Integer.MIN_VALUE) {
            if (b > 0 || b == Integer.MIN_VALUE) {
                z = true;
            }
        }
        if (z) {
            ((C3133Yc3) interfaceC11153we3).m(c, b);
            return;
        }
        ArrayList arrayList = c7037kf0.b;
        if (!arrayList.contains(interfaceC11153we3)) {
            arrayList.add(interfaceC11153we3);
        }
        if (c7037kf0.c == null) {
            ViewTreeObserver viewTreeObserver = c7037kf0.a.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC6693jf0 viewTreeObserverOnPreDrawListenerC6693jf0 = new ViewTreeObserverOnPreDrawListenerC6693jf0(c7037kf0);
            c7037kf0.c = viewTreeObserverOnPreDrawListenerC6693jf0;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC6693jf0);
        }
    }

    @Override // defpackage.TE3
    public final void h(InterfaceC11153we3 interfaceC11153we3) {
        this.a.b.remove(interfaceC11153we3);
    }

    @Override // defpackage.TE3
    public final void m(Drawable drawable) {
        C7037kf0 c7037kf0 = this.a;
        ViewTreeObserver viewTreeObserver = c7037kf0.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c7037kf0.c);
        }
        c7037kf0.c = null;
        c7037kf0.b.clear();
    }
}
