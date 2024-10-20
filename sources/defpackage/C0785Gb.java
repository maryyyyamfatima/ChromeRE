package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0785Gb implements InterfaceC1045Ib {
    @Override // defpackage.InterfaceC1045Ib
    public final String getName() {
        return "y";
    }

    @Override // defpackage.InterfaceC1045Ib
    public final float c(C10926vy1 c10926vy1) {
        return c10926vy1.j.top;
    }

    @Override // defpackage.InterfaceC1045Ib
    public final float get(Object obj) {
        if ((obj instanceof J91) && (obj instanceof InterfaceC10392uQ2)) {
            return ((J91) obj).getY();
        }
        if (obj instanceof View) {
            return AbstractC0915Hb.d((View) obj, false);
        }
        if (obj instanceof Drawable) {
            return AbstractC0915Hb.d(AbstractC0915Hb.b((Drawable) obj), false) + r3.getBounds().top;
        }
        throw new UnsupportedOperationException("Getting Y from unsupported mount content: ".concat(String.valueOf(obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC1045Ib
    public final void b(Object obj, float f) {
        if ((obj instanceof J91) && (obj instanceof InterfaceC10392uQ2)) {
            ((View) obj).setY(f);
            return;
        }
        if (obj instanceof View) {
            View view = (View) obj;
            view.setY(f - AbstractC0915Hb.d((View) view.getParent(), false));
            return;
        }
        if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            float d = AbstractC0915Hb.d(AbstractC0915Hb.b(drawable), false);
            int i = drawable.getBounds().left;
            int i2 = (int) (f - d);
            Rect bounds = drawable.getBounds();
            drawable.setBounds(i, i2, bounds.width() + i, bounds.height() + i2);
            if (drawable instanceof InterfaceC9394rW3) {
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Setting Y on unsupported mount content: ".concat(String.valueOf(obj)));
    }

    @Override // defpackage.InterfaceC1045Ib
    public final void a(Object obj) {
        if (obj instanceof View) {
            ((View) obj).setTranslationY(0.0f);
        } else {
            boolean z = obj instanceof Drawable;
        }
    }
}
