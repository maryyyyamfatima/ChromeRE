package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XI1 implements InterfaceC5857hC0 {
    public final /* synthetic */ YI1 a;

    @Override // defpackage.InterfaceC5857hC0
    public final void a(int i) {
        if (i == 5 || i == 4) {
            return;
        }
        this.a.q.d.d(this);
    }

    @Override // defpackage.InterfaceC5857hC0
    public final void b(Size size, Point point) {
        int i;
        YI1 yi1 = this.a;
        yi1.q.d.d(this);
        final C6201iC0 c6201iC0 = yi1.q;
        C8867py c8867py = c6201iC0.c;
        C8370oX2 c8370oX2 = c6201iC0.f;
        int i2 = c8370oX2.e;
        int i3 = i2 * 7;
        int max = Math.max(c8370oX2.d.y - (i2 * 2), 0);
        if (max == 0) {
            i = Math.min(i3, c8370oX2.c.getHeight());
        } else {
            int min = Math.min((c8370oX2.e * 5) + c8370oX2.d.y, c8370oX2.c.getHeight());
            if (min == c8370oX2.c.getHeight()) {
                max = Math.max(c8370oX2.c.getHeight() - i3, 0);
            }
            i = min;
        }
        QI1 qi1 = new QI1(c8867py, new Rect(0, max, 0, i), new Callback() { // from class: fC0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int intValue = ((Integer) obj).intValue();
                C6201iC0.this.getClass();
                int i4 = intValue / 1024;
            }
        });
        c6201iC0.c(qi1, false);
        qi1.e = new WI1(this, qi1);
        int i4 = qi1.c;
        if (i4 != 0) {
            qi1.b(i4);
        }
    }

    public XI1(YI1 yi1) {
        this.a = yi1;
    }
}
