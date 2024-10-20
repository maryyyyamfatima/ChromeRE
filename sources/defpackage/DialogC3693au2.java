package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.SystemClock;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: au2 */
/* loaded from: classes2.dex */
public final class DialogC3693au2 extends DialogC5834h8 implements InterfaceC4380cu2 {
    public final ViewOnClickListenerC9876su2 k;
    public final C3347Zt2 l;
    public boolean m;

    @Override // defpackage.DialogC0805Gf, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        C3347Zt2 c3347Zt2 = this.l;
        if (!c3347Zt2.g || this.m) {
            super.dismiss();
            ViewOnClickListenerC9876su2 viewOnClickListenerC9876su2 = this.k;
            C10027tM0 c10027tM0 = viewOnClickListenerC9876su2.D;
            if (c10027tM0 != null) {
                c10027tM0.a(true);
                viewOnClickListenerC9876su2.D = null;
            }
            BinderC2640Ui0 binderC2640Ui0 = viewOnClickListenerC9876su2.l;
            if (binderC2640Ui0 != null) {
                if (binderC2640Ui0.s) {
                    binderC2640Ui0.a.unbindService(binderC2640Ui0.u);
                }
                binderC2640Ui0.s = false;
                viewOnClickListenerC9876su2.l = null;
            }
            viewOnClickListenerC9876su2.a = null;
            c3347Zt2.c();
        }
    }

    @Override // defpackage.DialogC8536p00, android.app.Dialog
    public final void onBackPressed() {
        if (this.k.H.b()) {
            return;
        }
        super.onBackPressed();
    }

    public DialogC3693au2(WindowAndroid windowAndroid, ContentResolver contentResolver, InterfaceC4037bu2 interfaceC4037bu2, boolean z, ArrayList arrayList) {
        super((Context) windowAndroid.j.get(), R.style.f105230_resource_name_obfuscated_res_0x7f150548);
        C3347Zt2 c3347Zt2 = new C3347Zt2(interfaceC4037bu2);
        this.l = c3347Zt2;
        ViewOnClickListenerC9876su2 viewOnClickListenerC9876su2 = new ViewOnClickListenerC9876su2(windowAndroid, contentResolver, z, this);
        this.k = viewOnClickListenerC9876su2;
        viewOnClickListenerC9876su2.a = this;
        viewOnClickListenerC9876su2.k = c3347Zt2;
        viewOnClickListenerC9876su2.G = new ArrayList(arrayList);
        C10027tM0 c10027tM0 = viewOnClickListenerC9876su2.D;
        if (c10027tM0 != null) {
            c10027tM0.a(true);
        }
        viewOnClickListenerC9876su2.E = SystemClock.elapsedRealtime();
        C10027tM0 c10027tM02 = new C10027tM0(viewOnClickListenerC9876su2.g, viewOnClickListenerC9876su2, new C7337lX1(viewOnClickListenerC9876su2.G), viewOnClickListenerC9876su2.G, viewOnClickListenerC9876su2.h);
        viewOnClickListenerC9876su2.D = c10027tM02;
        c10027tM02.c(AbstractC0185Bl.e);
        viewOnClickListenerC9876su2.a.setOnCancelListener(new DialogInterfaceOnCancelListenerC7817mu2(viewOnClickListenerC9876su2));
        C5146f8 c5146f8 = this.j;
        c5146f8.h = viewOnClickListenerC9876su2;
        c5146f8.i = 0;
        c5146f8.j = false;
    }
}
