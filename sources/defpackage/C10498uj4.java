package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.PopupWindow;
import android.widget.Toast;
import org.chromium.chrome.browser.vr.VrShell;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uj4 */
/* loaded from: classes4.dex */
public final class C10498uj4 extends C9225r04 {
    public final VrShell b;
    public final ZX1 c;

    public C10498uj4(VrShell vrShell, ZX1 zx1) {
        this.b = vrShell;
        this.c = zx1;
    }

    @Override // defpackage.C9225r04
    public final PopupWindow b(Context context) {
        return new Ti4(context, this.b);
    }

    @Override // defpackage.C9225r04
    public final Toast c(Context context) {
        return new C9812sj4(context, this.b);
    }

    @Override // defpackage.C9225r04
    public final AlertDialog a(Context context) {
        return new AlertDialogC3967bi4(context, this.c);
    }
}
