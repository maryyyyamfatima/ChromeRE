package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.android.chrome.R;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6026hi1 extends AbstractC0370Cw implements NV3 {
    public final View a;
    public final Ae4 g;
    public Animatable h;

    public abstract void f(Object obj);

    public AbstractC6026hi1(ImageView imageView) {
        AbstractC6464iy2.b(imageView);
        this.a = imageView;
        this.g = new Ae4(imageView);
    }

    @Override // defpackage.TE3
    public void d(Object obj, OV3 ov3) {
        if (ov3 != null) {
            ov3.a(this);
        }
        f(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.h = animatable;
            animatable.start();
            return;
        }
        this.h = null;
    }

    @Override // defpackage.GA1
    public final void b() {
        Animatable animatable = this.h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.GA1
    public final void a() {
        Animatable animatable = this.h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // defpackage.TE3
    public void i(Drawable drawable) {
        f(null);
        this.h = null;
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.TE3
    public void k(Drawable drawable) {
        f(null);
        this.h = null;
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "Target for: ".concat(String.valueOf(this.a));
    }

    @Override // defpackage.TE3
    public final void e(GN2 gn2) {
        this.a.setTag(R.id.glide_custom_view_target_tag, gn2);
    }

    @Override // defpackage.TE3
    public final GN2 l() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof GN2) {
            return (GN2) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // defpackage.TE3
    public void c(InterfaceC11153we3 interfaceC11153we3) {
        Ae4 ae4 = this.g;
        int c = ae4.c();
        int b = ae4.b();
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
        ArrayList arrayList = ae4.b;
        if (!arrayList.contains(interfaceC11153we3)) {
            arrayList.add(interfaceC11153we3);
        }
        if (ae4.c == null) {
            ViewTreeObserver viewTreeObserver = ae4.a.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC12183ze4 viewTreeObserverOnPreDrawListenerC12183ze4 = new ViewTreeObserverOnPreDrawListenerC12183ze4(ae4);
            ae4.c = viewTreeObserverOnPreDrawListenerC12183ze4;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC12183ze4);
        }
    }

    @Override // defpackage.TE3
    public final void h(InterfaceC11153we3 interfaceC11153we3) {
        this.g.b.remove(interfaceC11153we3);
    }

    @Override // defpackage.TE3
    public void m(Drawable drawable) {
        Ae4 ae4 = this.g;
        ViewTreeObserver viewTreeObserver = ae4.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(ae4.c);
        }
        ae4.c = null;
        ae4.b.clear();
        Animatable animatable = this.h;
        if (animatable != null) {
            animatable.stop();
        }
        f(null);
        this.h = null;
        ((ImageView) this.a).setImageDrawable(drawable);
    }
}
