package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.android.chrome.R;
import org.chromium.chrome.browser.password_manager.settings.ExportWarningDialogFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PF0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ QF0 g;

    public PF0(QF0 qf0, int i) {
        this.g = qf0;
        this.a = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        QF0 qf0 = this.g;
        if (i != -1) {
            if (i == -2) {
                qf0.a = 0;
                return;
            }
            return;
        }
        int i2 = this.a;
        if (i2 == R.string.0_resource_name_obfuscated_res_0x7f1407d8) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/drive/answer/2424384"));
            intent.setPackage(qf0.g.a().getPackageName());
            qf0.g.a().startActivity(intent);
        } else if (i2 == R.string.0_resource_name_obfuscated_res_0x7f140b5f) {
            qf0.a = 1;
            ExportWarningDialogFragment exportWarningDialogFragment = new ExportWarningDialogFragment();
            qf0.f = exportWarningDialogFragment;
            exportWarningDialogFragment.r0 = new NF0(qf0);
            exportWarningDialogFragment.Q0(qf0.g.a.x, null);
        }
    }
}
