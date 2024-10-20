package org.chromium.content.browser.sms;

import android.os.Parcel;
import com.google.android.gms.common.Feature;
import defpackage.AbstractC4851eH1;
import defpackage.C10130tf3;
import defpackage.C11502xf3;
import defpackage.C3677ar4;
import defpackage.C5531gF3;
import defpackage.C6423ir1;
import defpackage.C8543p11;
import defpackage.C9102qf3;
import defpackage.C9787sf3;
import defpackage.DI0;
import defpackage.InterfaceC5565gM2;
import defpackage.V60;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class SmsProviderGms {
    public final long a;
    public final int b;
    public final C10130tf3 c;
    public final C11502xf3 d;
    public WindowAndroid e;
    public Wrappers$SmsRetrieverClientWrapper f;

    public SmsProviderGms(long j, int i, boolean z) {
        this.a = j;
        this.b = i;
        C3677ar4 c3677ar4 = new C3677ar4(V60.a);
        if (z) {
            this.d = new C11502xf3(this, c3677ar4);
        }
        if (i == 0 || i == 1) {
            this.c = new C10130tf3(this, c3677ar4);
        }
        AbstractC4851eH1.d("SmsProviderGms", "construction successfull %s, %s", this.d, this.c);
    }

    public static SmsProviderGms create(long j, int i) {
        return new SmsProviderGms(j, i, C8543p11.d.c(V60.a, 202990000) == 0);
    }

    public final void destroy() {
        C11502xf3 c11502xf3 = this.d;
        if (c11502xf3 != null && !c11502xf3.b) {
            c11502xf3.b = true;
            c11502xf3.c.unregisterReceiver(c11502xf3);
        }
        C10130tf3 c10130tf3 = this.c;
        if (c10130tf3 == null || c10130tf3.b) {
            return;
        }
        c10130tf3.b = true;
        c10130tf3.c.unregisterReceiver(c10130tf3);
    }

    public void listen(WindowAndroid windowAndroid, boolean z) {
        this.e = windowAndroid;
        int i = this.b;
        C11502xf3 c11502xf3 = this.d;
        boolean z2 = (c11502xf3 == null || (z && i == 1)) ? false : true;
        C10130tf3 c10130tf3 = this.c;
        boolean z3 = (c10130tf3 == null || !z || i == 2 || windowAndroid == null) ? false : true;
        if (z2) {
            c11502xf3.a(z);
        }
        if (z3) {
            final C9102qf3 c9102qf3 = (C9102qf3) c10130tf3.a.a().a;
            c9102qf3.getClass();
            C5531gF3 c5531gF3 = new C5531gF3();
            c5531gF3.a = new InterfaceC5565gM2() { // from class: of3
                public final /* synthetic */ String b = null;

                @Override // defpackage.InterfaceC5565gM2
                public final void accept(Object obj, Object obj2) {
                    C9102qf3.this.getClass();
                    InterfaceC0287Cf1 interfaceC0287Cf1 = (InterfaceC0287Cf1) ((C8072nf3) obj).m();
                    BinderC8759pf3 binderC8759pf3 = new BinderC8759pf3((C6905kF3) obj2);
                    C0027Af1 c0027Af1 = (C0027Af1) interfaceC0287Cf1;
                    Parcel a = c0027Af1.a();
                    a.writeString(this.b);
                    AbstractC11786yV.c(a, binderC8759pf3);
                    c0027Af1.h(2, a);
                }
            };
            c5531gF3.c = new Feature[]{DI0.b};
            c5531gF3.d = 1568;
            c9102qf3.b(1, c5531gF3.a()).c(new C9787sf3());
        }
    }

    public final Wrappers$SmsRetrieverClientWrapper a() {
        Wrappers$SmsRetrieverClientWrapper wrappers$SmsRetrieverClientWrapper = this.f;
        if (wrappers$SmsRetrieverClientWrapper != null) {
            return wrappers$SmsRetrieverClientWrapper;
        }
        C10130tf3 c10130tf3 = this.c;
        C9102qf3 c9102qf3 = c10130tf3 != null ? new C9102qf3(c10130tf3.c) : null;
        C11502xf3 c11502xf3 = this.d;
        Wrappers$SmsRetrieverClientWrapper wrappers$SmsRetrieverClientWrapper2 = new Wrappers$SmsRetrieverClientWrapper(c9102qf3, c11502xf3 != null ? new C6423ir1(c11502xf3.c) : null);
        this.f = wrappers$SmsRetrieverClientWrapper2;
        return wrappers$SmsRetrieverClientWrapper2;
    }

    public final void setClientAndWindow(Wrappers$SmsRetrieverClientWrapper wrappers$SmsRetrieverClientWrapper, WindowAndroid windowAndroid) {
        this.f = wrappers$SmsRetrieverClientWrapper;
        this.e = windowAndroid;
        wrappers$SmsRetrieverClientWrapper.getClass();
    }
}
