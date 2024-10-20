package org.chromium.chrome.browser.history;

import android.os.Bundle;
import defpackage.AbstractActivityC0159Bf3;
import defpackage.AbstractC2281Ro1;
import defpackage.C8490os;
import defpackage.InterfaceC8146ns;
import defpackage.X81;
import java.util.Objects;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.widget.selectable_list.SelectableListLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class HistoryActivity extends AbstractActivityC0159Bf3 {
    public X81 C;

    @Override // defpackage.AbstractActivityC0159Bf3, defpackage.AbstractActivityC4038bu3, defpackage.LM, defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        X81 x81 = new X81(this, true, this.B, AbstractC2281Ro1.j(getIntent(), "org.chromium.chrome.browser.incognito_mode", false), null, AbstractC2281Ro1.j(getIntent(), "org.chromium.chrome.browser.history_clusters.show", false), AbstractC2281Ro1.w(getIntent(), "org.chromium.chrome.browser.history_clusters.query"), new BrowsingHistoryBridge(Profile.d()));
        this.C = x81;
        setContentView(x81.k);
        final X81 x812 = this.C;
        Objects.requireNonNull(x812);
        C8490os.a(this, this.l, new InterfaceC8146ns() { // from class: X71
            @Override // defpackage.InterfaceC8146ns
            public final boolean onBackPressed() {
                SelectableListLayout selectableListLayout;
                X81 x813 = X81.this;
                if (x813.v() || (selectableListLayout = x813.m) == null) {
                    return false;
                }
                C7526m33 c7526m33 = selectableListLayout.m.a0;
                if (c7526m33.e()) {
                    c7526m33.b();
                } else {
                    AbstractViewOnClickListenerC4089c33 abstractViewOnClickListenerC4089c33 = selectableListLayout.m;
                    if (!abstractViewOnClickListenerC4089c33.b0) {
                        return false;
                    }
                    abstractViewOnClickListenerC4089c33.I();
                }
                return true;
            }
        });
    }

    @Override // defpackage.LM, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onDestroy() {
        this.C.p();
        this.C = null;
        super.onDestroy();
    }
}
