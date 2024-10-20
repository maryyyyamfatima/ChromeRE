package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0655Fb implements InterfaceC1045Ib {
    @Override // defpackage.InterfaceC1045Ib
    public final String getName() {
        return "x";
    }

    @Override // defpackage.InterfaceC1045Ib
    public final float get(Object obj) {
        if ((obj instanceof J91) && (obj instanceof InterfaceC10392uQ2)) {
            return ((J91) obj).getX();
        }
        if (obj instanceof View) {
            return AbstractC0915Hb.d((View) obj, true);
        }
        if (obj instanceof Drawable) {
            return AbstractC0915Hb.d(AbstractC0915Hb.b((Drawable) obj), true) + r3.getBounds().left;
        }
        throw new UnsupportedOperationException("Getting X from unsupported mount content: ".concat(String.valueOf(obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC1045Ib
    public final void b(Object obj, float f) {
        if ((obj instanceof J91) && (obj instanceof InterfaceC10392uQ2)) {
            ((View) obj).setX(f);
            return;
        }
        if (obj instanceof View) {
            View view = (View) obj;
            view.setX(f - AbstractC0915Hb.d((View) view.getParent(), true));
        } else {
            if (obj instanceof Drawable) {
                Drawable drawable = (Drawable) obj;
                int d = (int) (f - AbstractC0915Hb.d(AbstractC0915Hb.b(drawable), true));
                int i = drawable.getBounds().top;
                Rect bounds = drawable.getBounds();
                drawable.setBounds(d, i, bounds.width() + d, bounds.height() + i);
                if (drawable instanceof InterfaceC9394rW3) {
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Setting X on unsupported mount content: ".concat(String.valueOf(obj)));
        }
    }

    @Override // defpackage.InterfaceC1045Ib
    public final float c(C10926vy1 c10926vy1) {
        return c10926vy1.j.left;
    }

    @Override // defpackage.InterfaceC1045Ib
    public final void a(Object obj) {
        if (obj instanceof View) {
            ((View) obj).setTranslationX(0.0f);
        } else {
            boolean z = obj instanceof Drawable;
        }
    }
}
