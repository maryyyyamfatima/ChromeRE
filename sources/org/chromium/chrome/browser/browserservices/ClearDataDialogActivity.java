package org.chromium.chrome.browser.browserservices;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.a;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC6122hy2;
import defpackage.C10712vM;
import defpackage.C10776vY3;
import defpackage.C12185zf0;
import defpackage.C2680Uq0;
import defpackage.C6971kT;
import defpackage.C7432ln3;
import defpackage.C7629mN;
import defpackage.InterfaceC3241Yy1;
import defpackage.Q83;
import java.util.ArrayList;
import org.chromium.chrome.browser.browserservices.ClearDataDialogActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ClearDataDialogActivity extends a {
    public static final /* synthetic */ int y = 0;

    @Override // defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new AlertDialog.Builder(this, R.style.Theme.DeviceDefault.Light.Dialog.Alert).setTitle(getString(com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f140b66, AbstractC2281Ro1.w(getIntent(), "org.chromium.chrome.extra.app_name"))).setMessage(com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f140b65).setPositiveButton(com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f140a00, new DialogInterface.OnClickListener() { // from class: gT
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = ClearDataDialogActivity.y;
                ClearDataDialogActivity clearDataDialogActivity = ClearDataDialogActivity.this;
                clearDataDialogActivity.n0(true);
                ArrayList v = AbstractC2281Ro1.v(clearDataDialogActivity.getIntent(), "org.chromium.chrome.extra.origins");
                ArrayList v2 = AbstractC2281Ro1.v(clearDataDialogActivity.getIntent(), "org.chromium.chrome.extra.domains");
                if (v != null && !v.isEmpty() && v2 != null && !v2.isEmpty()) {
                    AbstractC9062qY3.a(clearDataDialogActivity, v, v2);
                }
                clearDataDialogActivity.finish();
            }
        }).setNegativeButton(com.android.chrome.R.string.0_resource_name_obfuscated_res_0x7f140b64, new DialogInterface.OnClickListener() { // from class: hT
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = ClearDataDialogActivity.y;
                ClearDataDialogActivity clearDataDialogActivity = ClearDataDialogActivity.this;
                clearDataDialogActivity.n0(false);
                clearDataDialogActivity.finish();
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: iT
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                int i = ClearDataDialogActivity.y;
                ClearDataDialogActivity clearDataDialogActivity = ClearDataDialogActivity.this;
                clearDataDialogActivity.n0(false);
                clearDataDialogActivity.finish();
            }
        }).create().show();
    }

    public final void n0(final boolean z) {
        final boolean j = AbstractC2281Ro1.j(getIntent(), "org.chromium.chrome.extra.app_uninstalled", false);
        C12185zf0 e = C10712vM.e();
        InterfaceC3241Yy1 a = C2680Uq0.a(e.e);
        e.a.getClass();
        C7629mN a2 = C7629mN.a();
        AbstractC6122hy2.a(a2);
        final C6971kT c6971kT = new C6971kT(a, a2, (C10776vY3) e.f.get());
        if (z || a2.f) {
            a2.f(new Runnable() { // from class: jT
                @Override // java.lang.Runnable
                public final void run() {
                    C6971kT.this.b.getClass();
                    EI2.b(j ? "TrustedWebActivity.ClearDataDialogOnUninstallAccepted" : "TrustedWebActivity.ClearDataDialogOnClearAppDataAccepted", z);
                }
            });
            return;
        }
        String str = j ? "twa_dialog_number_of_dismissals_on_uninstall" : "twa_dialog_number_of_dismissals_on_clear_data";
        C7432ln3 c = C7432ln3.c();
        try {
            ((Q83) a.get()).q(((Q83) a.get()).f(0, str) + 1, str);
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
