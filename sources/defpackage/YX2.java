package defpackage;

import J.N;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.util.Size;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YX2 implements InterfaceC5857hC0 {
    public final /* synthetic */ CancellationSignal a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ C3563aY2 c;

    @Override // defpackage.InterfaceC5857hC0
    public final void a(int i) {
        if (i == 5 || i == 4) {
            return;
        }
        C3563aY2 c3563aY2 = this.c;
        c3563aY2.c.d.d(this);
        c3563aY2.c.b();
        this.a.cancel();
        N.M9gwtxem();
        if (i == 1) {
            EI2.h(1, 3, "Sharing.ScrollCapture.BitmapGeneratorStatus");
        } else {
            EI2.h(2, 3, "Sharing.ScrollCapture.BitmapGeneratorStatus");
        }
    }

    @Override // defpackage.InterfaceC5857hC0
    public final void b(Size size, Point point) {
        C3563aY2 c3563aY2 = this.c;
        c3563aY2.c.d.d(this);
        if (size.getWidth() == 0 || size.getHeight() == 0) {
            c3563aY2.c.b();
            this.a.cancel();
            EI2.h(2, 3, "Sharing.ScrollCapture.BitmapGeneratorStatus");
        } else {
            c3563aY2.d = new Rect(0, 0, (int) Math.floor(size.getWidth() * c3563aY2.f), (int) Math.floor(size.getHeight() * c3563aY2.f));
            c3563aY2.e = (int) Math.floor(point.y * c3563aY2.f);
            EI2.h(0, 3, "Sharing.ScrollCapture.BitmapGeneratorStatus");
            this.b.run();
        }
    }

    public YX2(C3563aY2 c3563aY2, CancellationSignal cancellationSignal, Runnable runnable) {
        this.c = c3563aY2;
        this.a = cancellationSignal;
        this.b = runnable;
    }
}
