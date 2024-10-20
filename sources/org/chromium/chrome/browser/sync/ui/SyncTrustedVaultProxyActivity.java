package org.chromium.chrome.browser.sync.ui;

import J.N;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import defpackage.AbstractActivityC7416ll;
import defpackage.AbstractC4851eH1;
import defpackage.V60;
import org.chromium.chrome.browser.sync.TrustedVaultClient;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SyncTrustedVaultProxyActivity extends AbstractActivityC7416ll {
    public int T;
    public int U;

    @Override // defpackage.LC
    public final boolean o() {
        return false;
    }

    public static Intent Q0(PendingIntent pendingIntent, int i, int i2) {
        Intent intent = new Intent(V60.a, (Class<?>) SyncTrustedVaultProxyActivity.class);
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.putExtra("proxied_intent", pendingIntent);
        intent.putExtra("request_code", i2);
        intent.putExtra("user_action_trigger", i);
        return intent;
    }

    @Override // defpackage.AbstractActivityC7416ll
    public final void P0() {
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("proxied_intent");
        this.U = getIntent().getIntExtra("request_code", -1);
        this.T = getIntent().getIntExtra("user_action_trigger", -1);
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.U, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            AbstractC4851eH1.f("SyncUI", "Error sending trusted vault intent: ", e);
        }
        F0();
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.LC
    public final void l() {
        super.l();
        if (this.I != null) {
            return;
        }
        int i = this.U;
        if (i == 1) {
            TrustedVaultClient a = TrustedVaultClient.a();
            int i2 = this.T;
            a.getClass();
            N.M5G1GV5m(i2);
            return;
        }
        if (i != 2) {
            return;
        }
        TrustedVaultClient a2 = TrustedVaultClient.a();
        int i3 = this.T;
        a2.getClass();
        N.MUbRl2B_(i3);
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.InterfaceC7968nM
    public final boolean C(int i, int i2, Intent intent) {
        boolean C = super.C(i, i2, intent);
        if (i == 1) {
            long j = TrustedVaultClient.a().b;
            if (j != 0) {
                N.MlSGBpm_(j);
            }
        } else if (i == 2) {
            long j2 = TrustedVaultClient.a().b;
            if (j2 != 0) {
                N.Mv4bfVgt(j2);
            }
        }
        finish();
        return C;
    }
}
