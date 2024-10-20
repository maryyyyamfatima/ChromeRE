package defpackage;

import J.N;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.View;
import org.chromium.chrome.browser.toolbar.top.d;
import org.chromium.chrome.browser.toolbar.top.e;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class YO3 extends ViewOnLayoutChangeListenerC10125te4 {
    public final int[] m;
    public final Rect n;
    public final Rect o;
    public final View p;
    public DO3 q;
    public int r;

    @Override // defpackage.ViewOnLayoutChangeListenerC10125te4, defpackage.InterfaceC3470aG
    public final void c(Canvas canvas, Rect rect) {
        EI2.h(1, 3, "Android.Toolbar.BitmapCapture");
        canvas.save();
        View view = this.p;
        canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        canvas.restore();
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ((e) this.q).a.R(true);
    }

    public YO3(View view, boolean z) {
        super(view, z);
        this.m = new int[2];
        this.n = new Rect();
        this.o = new Rect();
        this.p = view;
    }

    @Override // defpackage.ViewOnLayoutChangeListenerC10125te4
    public final boolean g() {
        if (!super.g()) {
            EI2.h(2, 9, "Android.TopToolbar.BlockCaptureReason");
            return false;
        }
        DO3 do3 = this.q;
        C3814bG p = do3 == null ? null : ((e) do3).a.p();
        if (p == null) {
            EI2.h(1, 9, "Android.TopToolbar.BlockCaptureReason");
        } else if (p.a) {
            int i = p.c;
            EI2.h(i, 3, "Android.TopToolbar.AllowCaptureReason");
            if (i == 2) {
                EI2.h(p.d, 13, "Android.TopToolbar.SnapshotDifference");
            }
        } else {
            EI2.h(p.b, 9, "Android.TopToolbar.BlockCaptureReason");
        }
        if (p == null) {
            return false;
        }
        return p.a;
    }

    @Override // defpackage.ViewOnLayoutChangeListenerC10125te4, defpackage.InterfaceC3470aG
    public final void d() {
        ((e) this.q).a.R(false);
        ((e) this.q).a.K(false);
    }

    @Override // defpackage.ViewOnLayoutChangeListenerC10125te4
    public final long e() {
        d dVar = ((e) this.q).a;
        dVar.getClass();
        View view = this.p;
        int[] iArr = this.m;
        Ge4.c(view, dVar, iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = view.getWidth();
        int height = ((e) this.q).a.getHeight() + iArr[1];
        Rect rect = this.o;
        rect.set(i, i2, width, height);
        d dVar2 = ((e) this.q).a;
        Rect rect2 = this.n;
        dVar2.i(rect2);
        rect2.offset(iArr[0], iArr[1]);
        return N.MbtZqOic(rect.left, rect.top, rect.right, rect.bottom, rect2.left, rect2.top, rect2.right, rect2.bottom, (view.getHeight() - ((e) this.q).a.getHeight()) - this.r);
    }
}
