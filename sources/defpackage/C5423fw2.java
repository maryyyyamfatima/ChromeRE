package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Size;
import org.chromium.base.TraceEvent;
import org.chromium.base.UnguessableToken;
import org.chromium.components.paintpreview.player.PlayerCompositorDelegateImpl;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fw2 */
/* loaded from: classes2.dex */
public final class C5423fw2 {
    public C4735dw2 a;
    public C4735dw2 b;
    public final UnguessableToken c;
    public final C11603xw2 d;
    public final Size e;
    public final PlayerCompositorDelegateImpl f;
    public final InterfaceC8517ow2 g;

    public C5423fw2(UnguessableToken unguessableToken, C11603xw2 c11603xw2, Size size, PlayerCompositorDelegateImpl playerCompositorDelegateImpl, InterfaceC8517ow2 interfaceC8517ow2) {
        this.c = unguessableToken;
        this.d = c11603xw2;
        this.e = size;
        this.f = playerCompositorDelegateImpl;
        if (playerCompositorDelegateImpl != null) {
            playerCompositorDelegateImpl.c.add(new Runnable() { // from class: ew2
                @Override // java.lang.Runnable
                public final void run() {
                    boolean[][] zArr;
                    C5423fw2 c5423fw2 = C5423fw2.this;
                    C4735dw2 c4735dw2 = c5423fw2.b;
                    if (c4735dw2 == null) {
                        return;
                    }
                    if (c4735dw2.d != null && (zArr = c4735dw2.g) != null) {
                        TraceEvent.b("PlayerFrameBitmapState.releaseNotVisibleTiles", null);
                        for (int i = 0; i < c4735dw2.d.length; i++) {
                            int i2 = 0;
                            while (true) {
                                Bitmap[] bitmapArr = c4735dw2.d[i];
                                if (i2 < bitmapArr.length) {
                                    Bitmap bitmap = bitmapArr[i2];
                                    if (!zArr[i][i2] && bitmap != null) {
                                        bitmap.recycle();
                                        c4735dw2.d[i][i2] = null;
                                    }
                                    i2++;
                                }
                            }
                        }
                        TraceEvent.c("PlayerFrameBitmapState.releaseNotVisibleTiles");
                    }
                    c5423fw2.b(c5423fw2.b);
                }
            });
        }
        this.g = interfaceC8517ow2;
    }

    public final C4735dw2 a(boolean z) {
        C4735dw2 c4735dw2 = this.a;
        C4735dw2 c4735dw22 = c4735dw2 == null ? this.b : c4735dw2;
        if (!z && c4735dw22 != null) {
            return c4735dw22;
        }
        if (c4735dw2 != null) {
            c4735dw2.c();
            this.a = null;
        }
        C11603xw2 c11603xw2 = this.d;
        Size size = c11603xw2.f;
        C4735dw2 c4735dw23 = new C4735dw2(this.c, size.getWidth(), size.getHeight(), c11603xw2.b(), this.e, this.f, this);
        this.a = c4735dw23;
        if (this.b != null) {
            return c4735dw23;
        }
        c4735dw23.j = null;
        c(c4735dw23);
        return this.b;
    }

    public final void c(C4735dw2 c4735dw2) {
        C4735dw2 c4735dw22 = this.b;
        if (c4735dw22 != null) {
            c4735dw22.c();
        }
        this.b = c4735dw2;
        this.a = null;
        C8173nw2 c8173nw2 = (C8173nw2) this.g;
        C4735dw2 a = c8173nw2.p.a(false);
        Matrix matrix = c8173nw2.n;
        matrix.reset();
        c8173nw2.o.set(0, 0);
        c8173nw2.d(1.0f, matrix);
        PD2 pd2 = AbstractC8860pw2.b;
        Size size = a.b;
        PropertyModel propertyModel = c8173nw2.g;
        propertyModel.o(pd2, size);
        PD2 pd22 = AbstractC8860pw2.c;
        C11603xw2 c11603xw2 = c8173nw2.i;
        propertyModel.o(pd22, c11603xw2.d);
        propertyModel.o(AbstractC8860pw2.d, c11603xw2.e(c8173nw2.j));
        propertyModel.o(AbstractC8860pw2.a, a.d);
    }

    public final void b(C4735dw2 c4735dw2) {
        if (c4735dw2 == this.b) {
            ((C8173nw2) this.g).g.o(AbstractC8860pw2.a, c4735dw2.d);
        } else {
            if (c4735dw2.j == null) {
                c(c4735dw2);
            }
        }
    }
}
