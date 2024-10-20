package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.android.chrome.R;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class P40 extends DialogC5834h8 implements S40 {
    public P40(WindowAndroid windowAndroid, C5233fP c5233fP, R40 r40, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str) {
        super((Context) windowAndroid.j.get(), R.style.f105230_resource_name_obfuscated_res_0x7f150548);
        final ViewOnClickListenerC10219tu2 viewOnClickListenerC10219tu2 = new ViewOnClickListenerC10219tu2(windowAndroid, c5233fP, z, z2, z3, z4, z5, z6, str, this);
        viewOnClickListenerC10219tu2.g = this;
        viewOnClickListenerC10219tu2.i = r40;
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: lu2
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ViewOnClickListenerC10219tu2.this.c(null, 0, 0);
            }
        });
        viewOnClickListenerC10219tu2.l.t();
        C5146f8 c5146f8 = this.j;
        c5146f8.h = viewOnClickListenerC10219tu2;
        c5146f8.i = 0;
        c5146f8.j = false;
    }
}
