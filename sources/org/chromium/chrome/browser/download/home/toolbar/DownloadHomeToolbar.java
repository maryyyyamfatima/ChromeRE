package org.chromium.chrome.browser.download.home.toolbar;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import com.android.chrome.R;
import defpackage.AbstractViewOnClickListenerC4089c33;
import defpackage.FI2;
import defpackage.QZ3;
import java.util.ArrayList;
import org.chromium.chrome.browser.download.home.toolbar.DownloadHomeToolbar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DownloadHomeToolbar extends AbstractViewOnClickListenerC4089c33 {
    public static final /* synthetic */ int C0 = 0;
    public QZ3 B0;

    public DownloadHomeToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s(R.menu.f62120_resource_name_obfuscated_res_0x7f100003);
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        post(new Runnable() { // from class: Ar0
            @Override // java.lang.Runnable
            public final void run() {
                int i = DownloadHomeToolbar.C0;
                DownloadHomeToolbar downloadHomeToolbar = DownloadHomeToolbar.this;
                downloadHomeToolbar.getClass();
                QZ3 qz3 = new QZ3(downloadHomeToolbar);
                downloadHomeToolbar.B0 = qz3;
                downloadHomeToolbar.t0 = downloadHomeToolbar.getResources().getDimensionPixelSize(R.dimen.f42470_resource_name_obfuscated_res_0x7f080814);
                downloadHomeToolbar.s0 = qz3;
                qz3.a(downloadHomeToolbar);
            }
        });
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        QZ3 qz3 = this.B0;
        if (qz3 != null) {
            qz3.c();
        }
    }

    @Override // defpackage.AbstractViewOnClickListenerC4089c33, defpackage.InterfaceC7182l33
    public final void d(ArrayList arrayList) {
        boolean z = this.W;
        super.d(arrayList);
        if (this.W) {
            int size = this.a0.c.size();
            View findViewById = findViewById(R.id.selection_mode_share_menu_id);
            if (findViewById != null) {
                findViewById.setContentDescription(getResources().getQuantityString(R.plurals.f62310_resource_name_obfuscated_res_0x7f120009, size, Integer.valueOf(size)));
            }
            View findViewById2 = findViewById(R.id.selection_mode_delete_menu_id);
            if (findViewById2 != null) {
                findViewById2.setContentDescription(getResources().getQuantityString(R.plurals.f62300_resource_name_obfuscated_res_0x7f120008, size, Integer.valueOf(size)));
            }
            if (z) {
                return;
            }
            FI2.a("Android.DownloadManager.SelectionEstablished");
        }
    }
}
