package defpackage;

import android.content.DialogInterface;
import org.chromium.components.browser_ui.site_settings.AllSiteSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class K8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AllSiteSettings a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        final AllSiteSettings allSiteSettings = this.a;
        if (allSiteSettings.p0 == null) {
            return;
        }
        FI2.a("MobileSettingsStorageClearAll");
        final int[] iArr = {allSiteSettings.p0.size()};
        for (int i2 = 0; i2 < allSiteSettings.p0.size(); i2++) {
            ((Qo4) allSiteSettings.p0.get(i2)).d0.a(allSiteSettings.j0.b, new InterfaceC6065ho4() { // from class: H8
                @Override // defpackage.InterfaceC6065ho4
                public final void b() {
                    int i3 = AllSiteSettings.r0;
                    AllSiteSettings allSiteSettings2 = AllSiteSettings.this;
                    allSiteSettings2.getClass();
                    int[] iArr2 = iArr;
                    int i4 = iArr2[0] - 1;
                    iArr2[0] = i4;
                    if (i4 <= 0) {
                        allSiteSettings2.S0();
                    }
                }
            });
        }
    }

    public K8(AllSiteSettings allSiteSettings) {
        this.a = allSiteSettings;
    }
}
