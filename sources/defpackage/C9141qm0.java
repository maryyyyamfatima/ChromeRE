package defpackage;

import android.app.Dialog;
import android.os.IBinder;
import android.view.WindowManager;
import org.chromium.base.ThreadUtils;
import org.chromium.content.browser.androidoverlay.DialogOverlayImpl;
import org.chromium.gfx.mojom.Rect;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qm0 */
/* loaded from: classes2.dex */
public final class C9141qm0 {
    public InterfaceC8798pm0 a;
    public Dialog b;
    public SurfaceHolderCallback2C8455om0 c;
    public WindowManager.LayoutParams d;
    public boolean e;

    public final boolean a(Rect rect) {
        WindowManager.LayoutParams layoutParams = this.d;
        int i = layoutParams.x;
        int i2 = rect.b;
        if (i == i2 && layoutParams.y == rect.c && layoutParams.width == rect.d && layoutParams.height == rect.e) {
            return false;
        }
        layoutParams.x = i2;
        layoutParams.y = rect.c;
        layoutParams.width = rect.d;
        layoutParams.height = rect.e;
        return true;
    }

    public final void c(IBinder iBinder) {
        InterfaceC8798pm0 interfaceC8798pm0;
        WindowManager.LayoutParams layoutParams;
        IBinder iBinder2;
        Dialog dialog = this.b;
        if (dialog == null || (interfaceC8798pm0 = this.a) == null) {
            return;
        }
        if (iBinder == null || !((iBinder2 = (layoutParams = this.d).token) == null || iBinder == iBinder2)) {
            DialogOverlayImpl dialogOverlayImpl = (DialogOverlayImpl) interfaceC8798pm0;
            Object obj = ThreadUtils.a;
            if (dialogOverlayImpl.h != null) {
                dialogOverlayImpl.e();
                dialogOverlayImpl.c();
            }
            this.a = null;
            b();
            return;
        }
        if (iBinder2 == iBinder) {
            return;
        }
        layoutParams.token = iBinder;
        dialog.getWindow().setAttributes(this.d);
        this.c = new SurfaceHolderCallback2C8455om0(this);
        this.b.getWindow().takeSurface(this.c);
        this.b.show();
    }

    public final void b() {
        Dialog dialog = this.b;
        if (dialog != null && dialog.isShowing()) {
            try {
                this.b.dismiss();
            } catch (Exception unused) {
                AbstractC4851eH1.f("DSCore", "Failed to dismiss overlay dialog.  \"WindowLeaked\" is ignorable.", new Object[0]);
            }
        }
        this.b = null;
        this.c = null;
    }
}
