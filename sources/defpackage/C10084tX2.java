package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.fragment.app.h;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.share.screenshot.ScreenshotShareSheetDialog;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tX2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10084tX2 extends AbstractC5420fw {
    public static int o;
    public final WindowAndroid l;
    public final ScreenshotShareSheetDialog m;
    public final InterfaceC10140th1 n;

    public C10084tX2(Activity activity, WindowAndroid windowAndroid, String str, QO qo, QB qb, InterfaceC10140th1 interfaceC10140th1) {
        super(activity, str, qo, qb);
        this.l = windowAndroid;
        this.m = new ScreenshotShareSheetDialog();
        this.n = interfaceC10140th1;
    }

    @Override // defpackage.AbstractC5420fw
    public final void e() {
        if (this.k == null) {
            return;
        }
        if (this.n != null) {
            if (AbstractC9797sh1.a.g()) {
                g();
                return;
            }
            int i = o;
            if (i < 5) {
                o = i + 1;
                f(true, null);
                return;
            } else {
                i();
                return;
            }
        }
        i();
    }

    public final void g() {
        ((C10483uh1) this.n).getClass();
        ((InterfaceC10826vh1) AbstractC9797sh1.a.b()).a().a(this.a, this.k, this.l, this.g, this.h);
        this.k = null;
    }

    public final void i() {
        Bitmap bitmap = this.k;
        Callback callback = new Callback() { // from class: pX2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Runnable runnable = (Runnable) obj;
                C10084tX2 c10084tX2 = C10084tX2.this;
                if (c10084tX2.n == null) {
                    return;
                }
                if (AbstractC9797sh1.a.g()) {
                    c10084tX2.g();
                } else {
                    c10084tX2.f(false, runnable);
                }
            }
        };
        h h0 = ((VS0) this.a).h0();
        ScreenshotShareSheetDialog screenshotShareSheetDialog = this.m;
        screenshotShareSheetDialog.s0 = bitmap;
        screenshotShareSheetDialog.w0 = callback;
        screenshotShareSheetDialog.t0 = this.l;
        screenshotShareSheetDialog.u0 = this.g;
        screenshotShareSheetDialog.v0 = this.h;
        screenshotShareSheetDialog.Q0(h0, null);
        this.k = null;
    }

    public final void f(final boolean z, final Runnable runnable) {
        final DY1 dy1 = new DY1(new C9398rX2(this), R.string.f74850_resource_name_obfuscated_res_0x7f140520, new C9741sX2(this, z, runnable));
        dy1.b();
        InterfaceC2401Sm1 interfaceC2401Sm1 = new InterfaceC2401Sm1() { // from class: qX2
            @Override // defpackage.InterfaceC2401Sm1
            public final void a(boolean z2) {
                C10084tX2 c10084tX2 = C10084tX2.this;
                c10084tX2.getClass();
                if (!z2) {
                    if (z) {
                        c10084tX2.i();
                    }
                } else {
                    dy1.c();
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    c10084tX2.g();
                }
            }
        };
        ((C10483uh1) this.n).getClass();
        C10431uY1 c10431uY1 = AbstractC9797sh1.a;
        if (!c10431uY1.g()) {
            c10431uY1.d(interfaceC2401Sm1);
        } else {
            interfaceC2401Sm1.a(true);
        }
    }
}
