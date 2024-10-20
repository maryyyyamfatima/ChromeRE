package org.chromium.components.javascript_dialogs;

import J.N;
import android.content.Context;
import com.android.chrome.R;
import defpackage.AbstractC8498ot1;
import defpackage.ZX1;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class JavascriptAppModalDialog extends AbstractC8498ot1 {
    public long o;

    public JavascriptAppModalDialog(String str, String str2, String str3, boolean z, int i, int i2) {
        super(str, str2, str3, z, i, i2);
    }

    public static JavascriptAppModalDialog createAlertDialog(String str, String str2, boolean z) {
        return new JavascriptAppModalDialog(str, str2, null, z, R.string.0_resource_name_obfuscated_res_0x7f140717, 0);
    }

    public static JavascriptAppModalDialog createConfirmDialog(String str, String str2, boolean z) {
        return new JavascriptAppModalDialog(str, str2, null, z, R.string.0_resource_name_obfuscated_res_0x7f140717, R.string.0_resource_name_obfuscated_res_0x7f1402f4);
    }

    public static JavascriptAppModalDialog createBeforeUnloadDialog(String str, String str2, boolean z, boolean z2) {
        return new JavascriptAppModalDialog(str, str2, null, z2, z ? R.string.0_resource_name_obfuscated_res_0x7f14094a : R.string.0_resource_name_obfuscated_res_0x7f1405b0, R.string.0_resource_name_obfuscated_res_0x7f1402f4);
    }

    public static JavascriptAppModalDialog createPromptDialog(String str, String str2, boolean z, String str3) {
        return new JavascriptAppModalDialog(str, str2, str3, z, R.string.0_resource_name_obfuscated_res_0x7f140717, R.string.0_resource_name_obfuscated_res_0x7f1402f4);
    }

    public final void dismiss() {
        ZX1 zx1 = this.l;
        if (zx1 != null) {
            zx1.c(4, this.m);
        }
        this.o = 0L;
    }

    @Override // defpackage.AbstractC8498ot1
    public final void b(String str, boolean z) {
        long j = this.o;
        if (j != 0) {
            N.Mo6rag0q(j, this, str, z);
        }
    }

    @Override // defpackage.AbstractC8498ot1
    public final void d(boolean z, boolean z2) {
        long j = this.o;
        if (j != 0) {
            N.MOSW2s7O(j, this, z2);
        }
    }

    public void showJavascriptAppModalDialog(WindowAndroid windowAndroid, long j) {
        Context context = (Context) windowAndroid.j.get();
        if (context != null && windowAndroid.s() != null) {
            this.o = j;
            e(context, windowAndroid.s(), 1);
        } else {
            N.MOSW2s7O(j, this, false);
        }
    }
}
