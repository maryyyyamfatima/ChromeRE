package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.BundleUtils;
import org.chromium.chrome.browser.image_editor.ImageEditorDialogFragment;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gh1 */
/* loaded from: classes5.dex */
public final class C5676gh1 extends AbstractC0185Bl {
    public final /* synthetic */ Activity h;
    public final /* synthetic */ Bitmap i;
    public final /* synthetic */ WindowAndroid j;
    public final /* synthetic */ String k;
    public final /* synthetic */ QO l;
    public final /* synthetic */ C6020hh1 m;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        if (C6020hh1.a) {
            return null;
        }
        C6020hh1.a = true;
        InterfaceC3046Xl1 interfaceC3046Xl1 = new InterfaceC3046Xl1() { // from class: fh1
            @Override // defpackage.InterfaceC3046Xl1
            public final void a() {
                System.load(BundleUtils.getNativeLibraryPath("sketchology_native", "image_editor"));
            }
        };
        synchronized (AbstractC3176Yl1.class) {
            AbstractC3176Yl1.a = interfaceC3046Xl1;
        }
        AbstractC3176Yl1.a();
        return null;
    }

    public C5676gh1(C6020hh1 c6020hh1, Activity activity, Bitmap bitmap, WindowAndroid windowAndroid, String str, QO qo) {
        this.m = c6020hh1;
        this.h = activity;
        this.i = bitmap;
        this.j = windowAndroid;
        this.k = str;
        this.l = qo;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        VS0 vs0 = (VS0) this.h;
        int c = ApplicationStatus.c(vs0);
        if (c == 6 || c == 5) {
            return;
        }
        ImageEditorDialogFragment imageEditorDialogFragment = new ImageEditorDialogFragment();
        this.m.getClass();
        imageEditorDialogFragment.r0 = this.i;
        imageEditorDialogFragment.s0 = this.j;
        imageEditorDialogFragment.t0 = this.k;
        imageEditorDialogFragment.u0 = this.l;
        imageEditorDialogFragment.Q0(vs0.h0(), null);
    }
}
