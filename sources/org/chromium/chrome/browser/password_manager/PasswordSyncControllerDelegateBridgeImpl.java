package org.chromium.chrome.browser.password_manager;

import J.N;
import android.content.Context;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import defpackage.AF3;
import defpackage.AbstractC10681vF3;
import defpackage.AbstractC1658Mt3;
import defpackage.AbstractC4676dm2;
import defpackage.C10103tb0;
import defpackage.C10114td;
import defpackage.C1627Mn2;
import defpackage.C3995bn2;
import defpackage.H31;
import defpackage.InterfaceC0978Hn2;
import defpackage.InterfaceC2872Wc2;
import defpackage.InterfaceC7371ld2;
import defpackage.V60;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.password_manager.PasswordSyncControllerDelegateBridgeImpl;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PasswordSyncControllerDelegateBridgeImpl {
    public final InterfaceC0978Hn2 a;
    public final long b;

    public PasswordSyncControllerDelegateBridgeImpl(long j, H31 h31) {
        this.b = j;
        this.a = h31;
    }

    public static PasswordSyncControllerDelegateBridgeImpl create(long j) {
        Context context;
        Object obj = ThreadUtils.a;
        if (C1627Mn2.a == null) {
            C1627Mn2.a = new C1627Mn2();
        }
        C1627Mn2.a.getClass();
        return new PasswordSyncControllerDelegateBridgeImpl(j, (AbstractC4676dm2.a() && (context = V60.a) != null) ? new H31(new C10103tb0(context)) : null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [In2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Jn2] */
    public void notifyCredentialManagerWhenSyncing() {
        String b = CoreAccountInfo.b(AbstractC1658Mt3.b().c());
        final ?? r1 = new Runnable() { // from class: In2
            @Override // java.lang.Runnable
            public final void run() {
                long j = PasswordSyncControllerDelegateBridgeImpl.this.b;
                if (j == 0) {
                    return;
                }
                N.M0$1FnRl(j);
            }
        };
        final ?? r2 = new Callback() { // from class: Jn2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PasswordSyncControllerDelegateBridgeImpl.this.a((Exception) obj);
            }
        };
        H31 h31 = (H31) this.a;
        h31.getClass();
        if (b != null) {
            AF3 f = ((C10103tb0) h31.a).f(new CredentialManagerAccount(b));
            InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: D31
                @Override // defpackage.InterfaceC7371ld2
                public final void a(Object obj) {
                    r1.run();
                }
            };
            f.getClass();
            f.f(AbstractC10681vF3.a, interfaceC7371ld2);
            f.c(new InterfaceC2872Wc2() { // from class: E31
                @Override // defpackage.InterfaceC2872Wc2
                public final void c(Exception exc) {
                    r2.onResult(exc);
                }
            });
            return;
        }
        r2.onResult(new C3995bn2("Cannot call API without account when syncing.", 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Kn2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [Ln2] */
    public void notifyCredentialManagerWhenNotSyncing() {
        final ?? r0 = new Runnable() { // from class: Kn2
            @Override // java.lang.Runnable
            public final void run() {
                long j = PasswordSyncControllerDelegateBridgeImpl.this.b;
                if (j == 0) {
                    return;
                }
                N.M0$1FnRl(j);
            }
        };
        final ?? r1 = new Callback() { // from class: Ln2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                PasswordSyncControllerDelegateBridgeImpl.this.a((Exception) obj);
            }
        };
        H31 h31 = (H31) this.a;
        h31.getClass();
        AF3 f = ((C10103tb0) h31.a).f(new CredentialManagerAccount("pwm.constant.LocalAccount"));
        InterfaceC7371ld2 interfaceC7371ld2 = new InterfaceC7371ld2() { // from class: F31
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                r0.run();
            }
        };
        f.getClass();
        f.f(AbstractC10681vF3.a, interfaceC7371ld2);
        f.c(new InterfaceC2872Wc2() { // from class: G31
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(Exception exc) {
                r1.onResult(exc);
            }
        });
    }

    public final void a(Exception exc) {
        long j = this.b;
        if (j == 0) {
            return;
        }
        int i = 0;
        int i2 = exc instanceof C3995bn2 ? ((C3995bn2) exc).a : 0;
        if (exc instanceof C10114td) {
            i = ((C10114td) exc).a.g;
            i2 = 7;
        }
        N.MPJM$fow(j, i2, i);
    }
}
