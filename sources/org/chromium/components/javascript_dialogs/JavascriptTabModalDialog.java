package org.chromium.components.javascript_dialogs;

import J.N;
import android.content.Context;
import com.android.chrome.R;
import defpackage.AbstractC8498ot1;
import defpackage.ZX1;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class JavascriptTabModalDialog extends AbstractC8498ot1 {
    public long o;

    public JavascriptTabModalDialog(String str, int i, String str2, String str3) {
        super(str, str2, str3, false, R.string.0_resource_name_obfuscated_res_0x7f140717, i);
    }

    public static JavascriptTabModalDialog createAlertDialog(String str, String str2) {
        return new JavascriptTabModalDialog(str, 0, str2, null);
    }

    public static JavascriptTabModalDialog createConfirmDialog(String str, String str2) {
        return new JavascriptTabModalDialog(str, R.string.0_resource_name_obfuscated_res_0x7f1402f4, str2, null);
    }

    public static JavascriptTabModalDialog createPromptDialog(String str, String str2, String str3) {
        return new JavascriptTabModalDialog(str, R.string.0_resource_name_obfuscated_res_0x7f1402f4, str2, str3);
    }

    public final String getUserInput() {
        return this.n.a.getText().toString();
    }

    @Override // defpackage.AbstractC8498ot1
    public final void b(String str, boolean z) {
        long j = this.o;
        if (j == 0) {
            return;
        }
        N.M9yPJzg8(j, this, str);
    }

    public final void dismiss() {
        ZX1 zx1 = this.l;
        if (zx1 != null) {
            zx1.c(4, this.m);
        }
        this.o = 0L;
    }

    @Override // defpackage.AbstractC8498ot1
    public final void d(boolean z, boolean z2) {
        long j = this.o;
        if (j == 0) {
            return;
        }
        N.M0YaeICP(j, this, z);
    }

    public final void showDialog(WindowAndroid windowAndroid, long j) {
        Context context = (Context) windowAndroid.j.get();
        ZX1 s = windowAndroid.s();
        if (context != null && s != null) {
            this.o = j;
            e(context, s, 0);
        } else {
            N.M0YaeICP(j, this, false);
        }
    }
}
