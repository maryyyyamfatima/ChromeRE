package org.chromium.chrome.browser.infobar;

import android.content.Context;
import com.android.chrome.R;
import defpackage.C1530Lu0;
import defpackage.C2440Su0;
import defpackage.V60;
import defpackage.ViewOnClickListenerC1876Ol1;
import java.io.File;
import org.chromium.chrome.browser.download.DownloadUtils;
import org.chromium.chrome.browser.infobar.DuplicateDownloadInfoBar;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.components.infobars.ConfirmInfoBar;
import org.chromium.components.infobars.InfoBar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DuplicateDownloadInfoBar extends ConfirmInfoBar {
    public final String s;
    public final boolean t;
    public final String u;
    public final OTRProfileID v;
    public final boolean w;

    public static InfoBar createInfoBar(String str, boolean z, String str2, OTRProfileID oTRProfileID, boolean z2) {
        return new DuplicateDownloadInfoBar(V60.a, str, z, str2, oTRProfileID, z2);
    }

    public DuplicateDownloadInfoBar(Context context, String str, boolean z, String str2, OTRProfileID oTRProfileID, boolean z2) {
        super(R.drawable.0_resource_name_obfuscated_res_0x7f09035d, R.color.0_resource_name_obfuscated_res_0x7f0705af, null, null, null, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140460), context.getString(R.string.0_resource_name_obfuscated_res_0x7f1402f4));
        this.s = str;
        this.t = z;
        this.u = str2;
        this.v = oTRProfileID;
        this.w = z2;
    }

    @Override // org.chromium.components.infobars.ConfirmInfoBar, org.chromium.components.infobars.InfoBar
    public final void m(ViewOnClickListenerC1876Ol1 viewOnClickListenerC1876Ol1) {
        super.m(viewOnClickListenerC1876Ol1);
        Context context = viewOnClickListenerC1876Ol1.getContext();
        boolean z = this.t;
        int i = R.string.0_resource_name_obfuscated_res_0x7f140461;
        if (z) {
            C2440Su0 c2440Su0 = new C2440Su0(this, context);
            String str = this.s;
            if (this.w) {
                i = R.string.0_resource_name_obfuscated_res_0x7f140462;
            }
            viewOnClickListenerC1876Ol1.j(DownloadUtils.d(context.getString(i), str, false, 0L, c2440Su0));
            return;
        }
        Runnable runnable = new Runnable() { // from class: Ru0
            @Override // java.lang.Runnable
            public final void run() {
                DuplicateDownloadInfoBar.this.getClass();
                EI2.h(3, 5, "Download.DuplicateInfobarEvent.Download");
            }
        };
        OTRProfileID oTRProfileID = this.v;
        String str2 = this.s;
        viewOnClickListenerC1876Ol1.j(DownloadUtils.d(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140461), new File(str2).getName(), false, 0L, new C1530Lu0(str2, runnable, oTRProfileID, 5)));
    }
}
