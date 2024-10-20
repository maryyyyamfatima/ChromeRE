package org.chromium.chrome.browser.browserservices.ui.trustedwebactivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.AbstractC4851eH1;
import defpackage.C7549m72;
import defpackage.InterfaceC7205l72;
import defpackage.O83;
import defpackage.QC;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DisclosureAcceptanceBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int c = 0;
    public final InterfaceC7205l72 a;
    public final QC b;

    public DisclosureAcceptanceBroadcastReceiver() {
        C7549m72 c7549m72 = new C7549m72(V60.a);
        QC qc = new QC(O83.a);
        this.a = c7549m72;
        this.b = qc;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !intent.hasExtra("TWADisclosureResp.tag_extra") || !intent.hasExtra("TWADisclosureResp.id_extra") || !intent.hasExtra("TWADisclosureResp.package_extra")) {
            AbstractC4851eH1.f("TWADisclosureRec", "Started with null or incomplete Intent.", new Object[0]);
            return;
        }
        String stringExtra = intent.getStringExtra("TWADisclosureResp.tag_extra");
        int intExtra = intent.getIntExtra("TWADisclosureResp.id_extra", -1);
        String stringExtra2 = intent.getStringExtra("TWADisclosureResp.package_extra");
        ((C7549m72) this.a).a(intExtra, stringExtra);
        this.b.a.b("trusted_web_activity_disclosure_accepted_packages", stringExtra2);
    }
}
