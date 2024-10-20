package defpackage;

import J.N;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.api.Status;
import org.chromium.content.browser.sms.SmsProviderGms;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tf3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10130tf3 extends BroadcastReceiver {
    public final SmsProviderGms a;
    public boolean b = false;
    public final C3677ar4 c;

    public C10130tf3(SmsProviderGms smsProviderGms, C3677ar4 c3677ar4) {
        this.a = smsProviderGms;
        this.c = c3677ar4;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        V60.c(c3677ar4, this, intentFilter, "com.google.android.gms.auth.api.phone.permission.SEND");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.b || !"com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction()) || intent.getExtras() == null) {
            return;
        }
        try {
            int i = ((Status) intent.getParcelableExtra("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).g;
            SmsProviderGms smsProviderGms = this.a;
            if (i == 0) {
                smsProviderGms.e.B((Intent) intent.getExtras().getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT"), new InterfaceC4352cp4() { // from class: rf3
                    @Override // defpackage.InterfaceC4352cp4
                    public final void b(Intent intent2, int i2) {
                        SmsProviderGms smsProviderGms2 = C10130tf3.this.a;
                        if (i2 == -1) {
                            N.MDAxNisW(smsProviderGms2.a, intent2.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"), 1);
                        } else if (i2 == 0) {
                            N.MqHdTL15(smsProviderGms2.a);
                        }
                    }
                }, null);
            } else {
                if (i != 15) {
                    return;
                }
                N.Mz9c1Rem(smsProviderGms.a);
            }
        } catch (ActivityNotFoundException unused) {
        }
    }
}
