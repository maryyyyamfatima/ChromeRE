package org.chromium.chrome.browser.app.feed.feedmanagement;

import android.os.Bundle;
import defpackage.AbstractActivityC0159Bf3;
import defpackage.C8984qJ0;
import defpackage.InterfaceC11384xJ0;
import defpackage.InterfaceC11727yJ0;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class FeedManagementActivity extends AbstractActivityC0159Bf3 implements InterfaceC11727yJ0, InterfaceC11384xJ0 {
    @Override // defpackage.AbstractActivityC0159Bf3, defpackage.AbstractActivityC4038bu3, defpackage.LM, defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(new C8984qJ0(this, this, this, getIntent().getIntExtra("feed_management_initiating_stream_type_extra", 0)).b);
    }
}
