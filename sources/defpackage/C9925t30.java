package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.signin.services.SigninManager;
import org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t30, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9925t30 implements InterfaceC5461g30, InterfaceC7867n30 {
    public final C8843pt3 b;
    public final String c;
    public final String d;
    public final C11640y30 e;
    public boolean g;
    public Boolean h;
    public RunnableC8554p30 i;
    public int a = 0;
    public final Handler f = new Handler();

    public C9925t30(C11640y30 c11640y30, String str, String str2, C8843pt3 c8843pt3) {
        Object obj = ThreadUtils.a;
        this.e = c11640y30;
        this.c = str;
        this.d = str2;
        this.b = c8843pt3;
        AbstractC9966tA.a(C1202Jg1.a()).k(new C9239r30(this), str2);
        c();
    }

    public final void a(boolean z) {
        Object obj = ThreadUtils.a;
        RunnableC8554p30 runnableC8554p30 = this.i;
        if (runnableC8554p30 != null) {
            this.f.removeCallbacks(runnableC8554p30);
            this.i = null;
        }
        this.a = 4;
        if (z) {
            return;
        }
        SyncConsentFragmentBase syncConsentFragmentBase = this.b.b;
        syncConsentFragmentBase.o0 = null;
        syncConsentFragmentBase.i0 = false;
        this.e.a();
    }

    public final void c() {
        int i = this.a;
        C11640y30 c11640y30 = this.e;
        if (i == 0) {
            this.a = 1;
            String str = this.c;
            if (TextUtils.isEmpty(str) || this.d.equals(str)) {
                c();
                return;
            }
            String str2 = this.c;
            String str3 = this.d;
            c11640y30.a();
            c11640y30.e = new C5805h30(c11640y30.b, c11640y30.a, this, str2, str3);
            return;
        }
        if (i == 1) {
            this.a = 2;
            if (this.h != null) {
                b();
                return;
            }
            C8897q30 c8897q30 = new C8897q30(this);
            c11640y30.a();
            c11640y30.c = new C10611v30(c11640y30.b, c11640y30.a, c8897q30);
            if (this.i == null) {
                this.i = new RunnableC8554p30(this);
            }
            this.f.postDelayed(this.i, 30000L);
            return;
        }
        if (i != 2) {
            if (i == 4) {
                throw new IllegalStateException("Can't progress from DONE state!");
            }
            return;
        }
        this.a = 4;
        final boolean z = this.g;
        final C8843pt3 c8843pt3 = this.b;
        SyncConsentFragmentBase syncConsentFragmentBase = c8843pt3.b;
        syncConsentFragmentBase.o0 = null;
        if (syncConsentFragmentBase.getActivity().isDestroyed()) {
            return;
        }
        final SigninManager a = AbstractC9966tA.a(C1202Jg1.a());
        final boolean z2 = c8843pt3.a;
        a.u(new Runnable() { // from class: lt3
            @Override // java.lang.Runnable
            public final void run() {
                final C8843pt3 c8843pt32 = C8843pt3.this;
                boolean z3 = z;
                final boolean z4 = z2;
                if (z3) {
                    c8843pt32.getClass();
                    a.j(new Runnable() { // from class: mt3
                        @Override // java.lang.Runnable
                        public final void run() {
                            final C8843pt3 c8843pt33 = C8843pt3.this;
                            SyncConsentFragmentBase syncConsentFragmentBase2 = c8843pt33.b;
                            syncConsentFragmentBase2.O0(syncConsentFragmentBase2.g0, z4, new Runnable() { // from class: ot3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C8843pt3.this.b.i0 = false;
                                }
                            });
                        }
                    });
                } else {
                    SyncConsentFragmentBase syncConsentFragmentBase2 = c8843pt32.b;
                    syncConsentFragmentBase2.O0(syncConsentFragmentBase2.g0, z4, new Runnable() { // from class: nt3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8843pt3.this.b.i0 = false;
                        }
                    });
                }
            }
        });
    }

    public final void b() {
        boolean booleanValue = this.h.booleanValue();
        C11640y30 c11640y30 = this.e;
        if (booleanValue) {
            String t = AbstractC9966tA.a(C1202Jg1.a()).t(this.d);
            c11640y30.a();
            c11640y30.f = new C8211o30(c11640y30.b, c11640y30.a, this, t);
        } else {
            c11640y30.a();
            c();
        }
    }
}
