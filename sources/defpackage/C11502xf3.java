package defpackage;

import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import org.chromium.content.browser.sms.SmsProviderGms;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xf3 */
/* loaded from: classes2.dex */
public final class C11502xf3 extends BroadcastReceiver {
    public final SmsProviderGms a;
    public boolean b = false;
    public final C3677ar4 c;

    public static void b(int i) {
        if (i != 0) {
            EI2.h(i - 1, 4, "Blink.Sms.BackendAvailability");
            return;
        }
        throw null;
    }

    public C11502xf3(SmsProviderGms smsProviderGms, C3677ar4 c3677ar4) {
        this.a = smsProviderGms;
        this.c = c3677ar4;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED");
        V60.c(c3677ar4, this, intentFilter, "com.google.android.gms.auth.api.phone.permission.SEND");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.b || !"com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED".equals(intent.getAction()) || intent.getExtras() == null) {
            return;
        }
        try {
            int i = ((Status) intent.getParcelableExtra("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).g;
            SmsProviderGms smsProviderGms = this.a;
            if (i == 0) {
                N.MDAxNisW(smsProviderGms.a, intent.getExtras().getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE_LINE"), 2);
            } else {
                if (i != 15) {
                    return;
                }
                N.Mz9c1Rem(smsProviderGms.a);
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(final boolean z) {
        final C6423ir1 c6423ir1 = (C6423ir1) this.a.a().b;
        c6423ir1.getClass();
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.c = new Feature[]{DI0.a};
        c5531gF3.a = new InterfaceC5565gM2() { // from class: fr1
            @Override // defpackage.InterfaceC5565gM2
            public final void accept(Object obj, Object obj2) {
                C6423ir1.this.getClass();
                BinderC6080hr1 binderC6080hr1 = new BinderC6080hr1((C6905kF3) obj2);
                C0027Af1 c0027Af1 = (C0027Af1) ((InterfaceC0287Cf1) ((C8072nf3) obj).m());
                Parcel a = c0027Af1.a();
                AbstractC11786yV.c(a, binderC6080hr1);
                c0027Af1.h(6, a);
            }
        };
        c5531gF3.d = 1566;
        AF3 b = c6423ir1.b(1, c5531gF3.a());
        b.e(new InterfaceC7371ld2() { // from class: uf3
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                C11502xf3 c11502xf3 = C11502xf3.this;
                c11502xf3.getClass();
                C11502xf3.b(1);
                boolean z2 = z;
                SmsProviderGms smsProviderGms = c11502xf3.a;
                if (z2) {
                    C10130tf3 c10130tf3 = smsProviderGms.c;
                    if (c10130tf3 == null || c10130tf3.b) {
                        return;
                    }
                    c10130tf3.b = true;
                    c10130tf3.c.unregisterReceiver(c10130tf3);
                    return;
                }
                smsProviderGms.getClass();
            }
        });
        b.c(new InterfaceC2872Wc2() { // from class: vf3
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(Exception exc) {
                C11502xf3 c11502xf3 = C11502xf3.this;
                c11502xf3.getClass();
                C10114td c10114td = (C10114td) exc;
                int i = c10114td.a.g;
                boolean z2 = z;
                SmsProviderGms smsProviderGms = c11502xf3.a;
                if (i == 17) {
                    C11502xf3.b(2);
                    if (smsProviderGms.b == 2 || !z2) {
                        N.M$UJTj5O(smsProviderGms.a);
                    }
                } else if (i == 36500) {
                    C11502xf3.b(3);
                    if (smsProviderGms.b == 2 || !z2) {
                        N.M$UJTj5O(smsProviderGms.a);
                    }
                } else if (i == 36501) {
                    C11502xf3.b(4);
                    if (smsProviderGms.b == 2 || !z2) {
                        N.M$UJTj5O(smsProviderGms.a);
                    }
                } else if (i == 36502) {
                    C11502xf3.b(1);
                    N.MqHdTL15(smsProviderGms.a);
                } else if (i != 6) {
                    AbstractC4851eH1.f("SmsVerification", "Unexpected exception", exc);
                } else if (c10114td instanceof AO2) {
                    try {
                        smsProviderGms.e.A(((AO2) c10114td).a.i, new C11159wf3(c11502xf3, z2), null);
                    } catch (Exception e) {
                        C11502xf3.b(1);
                        N.MqHdTL15(smsProviderGms.a);
                        AbstractC4851eH1.a("SmsVerification", "Cannot launch user permission", e);
                    }
                }
                if (!z2) {
                    smsProviderGms.getClass();
                    return;
                }
                C11502xf3 c11502xf32 = smsProviderGms.d;
                if (c11502xf32 == null || c11502xf32.b) {
                    return;
                }
                c11502xf32.b = true;
                c11502xf32.c.unregisterReceiver(c11502xf32);
            }
        });
    }
}
