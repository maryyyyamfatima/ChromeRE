package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Eb */
/* loaded from: classes.dex */
public final class C0525Eb implements InterfaceC1045Ib {
    @Override // defpackage.InterfaceC1045Ib
    public final void a(Object obj) {
    }

    @Override // defpackage.InterfaceC1045Ib
    public final String getName() {
        return "width";
    }

    @Override // defpackage.InterfaceC1045Ib
    public final float c(C10926vy1 c10926vy1) {
        return c10926vy1.j.width();
    }

    @Override // defpackage.InterfaceC1045Ib
    public final float get(Object obj) {
        int width;
        if (obj instanceof View) {
            width = ((View) obj).getWidth();
        } else if (obj instanceof Drawable) {
            width = ((Drawable) obj).getBounds().width();
        } else {
            throw new UnsupportedOperationException("Getting width from unsupported mount content: ".concat(String.valueOf(obj)));
        }
        return width;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC1045Ib
    public final void b(Object obj, float f) {
        if (obj instanceof J91) {
            J91 j91 = (J91) obj;
            if (j91 instanceof InterfaceC1305Kb) {
                C11703yE1 c11703yE1 = (C11703yE1) ((InterfaceC1305Kb) j91);
                c11703yE1.L = (int) f;
                c11703yE1.requestLayout();
            } else {
                int left = j91.getLeft();
                AbstractC7574mC.a(left, j91.getTop(), (int) (left + f), j91.getBottom(), null, j91, false);
            }
            ArrayList c = AbstractC0915Hb.c(j91);
            if (c != null) {
                int i = (int) f;
                int height = j91.getHeight();
                for (int i2 = 0; i2 < c.size(); i2++) {
                    AbstractC9737sW3.b((Drawable) c.get(i2), i, height);
                }
                return;
            }
            return;
        }
        if (obj instanceof View) {
            View view = (View) obj;
            int left2 = view.getLeft();
            AbstractC7574mC.a(left2, view.getTop(), (int) (left2 + f), view.getBottom(), null, view, false);
            return;
        }
        if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            AbstractC9737sW3.b(drawable, (int) f, drawable.getBounds().height());
            return;
        }
        throw new UnsupportedOperationException("Setting width on unsupported mount content: ".concat(String.valueOf(obj)));
    }
}
