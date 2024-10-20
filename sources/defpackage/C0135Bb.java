package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bb */
/* loaded from: classes.dex */
public final class C0135Bb implements InterfaceC1045Ib {
    @Override // defpackage.InterfaceC1045Ib
    public final void a(Object obj) {
    }

    @Override // defpackage.InterfaceC1045Ib
    public final String getName() {
        return "height";
    }

    @Override // defpackage.InterfaceC1045Ib
    public final float c(C10926vy1 c10926vy1) {
        return c10926vy1.j.height();
    }

    @Override // defpackage.InterfaceC1045Ib
    public final float get(Object obj) {
        int height;
        if (obj instanceof View) {
            height = ((View) obj).getHeight();
        } else if (obj instanceof Drawable) {
            height = ((Drawable) obj).getBounds().height();
        } else {
            throw new UnsupportedOperationException("Getting height from unsupported mount content: ".concat(String.valueOf(obj)));
        }
        return height;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC1045Ib
    public final void b(Object obj, float f) {
        if (obj instanceof J91) {
            J91 j91 = (J91) obj;
            if (j91 instanceof InterfaceC1305Kb) {
                C11703yE1 c11703yE1 = (C11703yE1) ((InterfaceC1305Kb) j91);
                c11703yE1.M = (int) f;
                c11703yE1.requestLayout();
            } else {
                int top = j91.getTop();
                AbstractC7574mC.a(j91.getLeft(), top, j91.getRight(), (int) (top + f), null, j91, false);
            }
            ArrayList c = AbstractC0915Hb.c(j91);
            if (c != null) {
                int width = j91.getWidth();
                int i = (int) f;
                for (int i2 = 0; i2 < c.size(); i2++) {
                    AbstractC9737sW3.b((Drawable) c.get(i2), width, i);
                }
                return;
            }
            return;
        }
        if (obj instanceof View) {
            View view = (View) obj;
            int top2 = view.getTop();
            AbstractC7574mC.a(view.getLeft(), top2, view.getRight(), (int) (top2 + f), null, view, false);
            return;
        }
        if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            AbstractC9737sW3.b(drawable, drawable.getBounds().width(), (int) f);
            return;
        }
        throw new UnsupportedOperationException("Setting height on unsupported mount content: ".concat(String.valueOf(obj)));
    }
}
