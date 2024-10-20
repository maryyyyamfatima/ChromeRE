package defpackage;

import J.N;
import android.content.Context;
import android.widget.CheckBox;
import android.widget.Spinner;
import com.android.chrome.R;
import java.io.File;
import org.chromium.chrome.browser.download.DownloadDialogBridge;
import org.chromium.chrome.browser.download.dialogs.DownloadLocationCustomView;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.widget.text.AlertDialogEditText;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yr0 */
/* loaded from: classes.dex */
public final class C3205Yr0 implements InterfaceC3906bY1 {
    public DownloadDialogBridge a;
    public PropertyModel g;
    public PropertyModel h;
    public UD2 i;
    public DownloadLocationCustomView j;
    public ZX1 k;
    public long l;
    public int m;
    public String n;
    public Context o;
    public boolean p;
    public boolean q;
    public boolean r;

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        if (i == 0) {
            this.k.c(1, propertyModel);
        } else {
            if (i != 1) {
                return;
            }
            this.k.c(2, propertyModel);
        }
    }

    public final String b() {
        int i;
        Context context = this.o;
        if (!this.r) {
            boolean z = this.q;
            C7928nE c7928nE = UN.a;
            if (!(N.M09VlOh_("IncognitoDownloadsWarning") && z) || this.p) {
                i = R.string.0_resource_name_obfuscated_res_0x7f140418;
                return context.getString(i);
            }
        }
        i = R.string.0_resource_name_obfuscated_res_0x7f140419;
        return context.getString(i);
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        String str;
        if (i == 1) {
            DownloadLocationCustomView downloadLocationCustomView = this.j;
            AlertDialogEditText alertDialogEditText = downloadLocationCustomView.j;
            String obj = (alertDialogEditText == null || alertDialogEditText.getText() == null) ? null : downloadLocationCustomView.j.getText().toString();
            Spinner spinner = this.j.l;
            C0461Do0 c0461Do0 = spinner == null ? null : (C0461Do0) spinner.getSelectedItem();
            CheckBox checkBox = this.j.n;
            boolean z = checkBox != null && checkBox.isChecked();
            if (c0461Do0 == null || (str = c0461Do0.b) == null || obj == null) {
                DownloadDialogBridge downloadDialogBridge = this.a;
                downloadDialogBridge.getClass();
                long j = downloadDialogBridge.a;
                if (j != 0) {
                    N.M9BtabC7(j, downloadDialogBridge);
                    WindowAndroid windowAndroid = downloadDialogBridge.c;
                    if (windowAndroid != null) {
                        C6493j32.V0(windowAndroid);
                        downloadDialogBridge.c = null;
                    }
                }
            } else {
                N.MQzHQbrF(str);
                EI2.h(c0461Do0.e, 3, "MobileDownload.Location.Dialog.DirectoryType");
                this.a.a(new File(str, obj).getAbsolutePath());
                if (!this.r) {
                    N.MPBZLcVx(R44.a(Profile.d()).a, "download.prompt_for_download_android", z ? 2 : 1);
                }
            }
        } else {
            DownloadDialogBridge downloadDialogBridge2 = this.a;
            downloadDialogBridge2.getClass();
            long j2 = downloadDialogBridge2.a;
            if (j2 != 0) {
                N.M9BtabC7(j2, downloadDialogBridge2);
                WindowAndroid windowAndroid2 = downloadDialogBridge2.c;
                if (windowAndroid2 != null) {
                    C6493j32.V0(windowAndroid2);
                    downloadDialogBridge2.c = null;
                }
            }
        }
        this.g = null;
        this.j = null;
    }
}
