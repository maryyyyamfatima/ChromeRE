package defpackage;

import J.N;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import org.chromium.chrome.browser.vr.VrShell;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Fi4 implements InterfaceC0322Cm1 {
    public View a;
    public final Ei4 b;

    @Override // defpackage.InterfaceC0322Cm1
    public final void a(WindowAndroid windowAndroid) {
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void d(View view, CursorAnchorInfo cursorAnchorInfo) {
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void f() {
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void h() {
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void i(View view, int i, ExtractedText extractedText) {
    }

    public Fi4(Ei4 ei4) {
        this.b = ei4;
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void j(View view) {
        view.onCreateInputConnection(new EditorInfo());
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void c(View view, ResultReceiver resultReceiver) {
        this.a = view;
        view.onCreateInputConnection(new EditorInfo());
        VrShell vrShell = (VrShell) this.b;
        N.MYCeEYIp(vrShell.A, vrShell, true);
        resultReceiver.send(0, null);
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final boolean e(View view) {
        View view2 = this.a;
        return view2 != null && view2 == view;
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final boolean b(IBinder iBinder) {
        VrShell vrShell = (VrShell) this.b;
        N.MYCeEYIp(vrShell.A, vrShell, false);
        this.a = null;
        return false;
    }

    @Override // defpackage.InterfaceC0322Cm1
    public final void g(View view, int i, int i2, int i3, int i4) {
        VrShell vrShell = (VrShell) this.b;
        N.MP893CNH(vrShell.A, vrShell, i, i2, i3, i4);
    }
}
