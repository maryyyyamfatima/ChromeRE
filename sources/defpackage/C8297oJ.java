package defpackage;

import android.accounts.Account;
import android.os.SystemClock;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.components.signin.AccountManagerFacade;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8297oJ implements InterfaceC0408Dd2 {
    public final C0538Ed2 a = new C0538Ed2();
    public final long g = SystemClock.elapsedRealtime();
    public Boolean h;
    public Boolean i;

    @Override // defpackage.InterfaceC0079Ap3
    public final /* synthetic */ boolean i() {
        return AbstractC12248zp3.a(this);
    }

    public C8297oJ(final AccountManagerFacade accountManagerFacade, C5578gP0 c5578gP0) {
        if (c5578gP0 != null) {
            Callback callback = new Callback() { // from class: lJ
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Boolean valueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
                    C8297oJ c8297oJ = C8297oJ.this;
                    c8297oJ.h = valueOf;
                    c8297oJ.a();
                }
            };
            Object obj = ThreadUtils.a;
            if (c5578gP0.a) {
                callback.onResult(Boolean.valueOf(c5578gP0.b));
            } else {
                c5578gP0.d.add(callback);
            }
        }
        accountManagerFacade.a().g(new Callback() { // from class: mJ
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                final C8297oJ c8297oJ = C8297oJ.this;
                c8297oJ.getClass();
                Q2 q2 = new Q2() { // from class: nJ
                    @Override // defpackage.Q2
                    public final void a(boolean z, Account account) {
                        Boolean valueOf = Boolean.valueOf(z);
                        C8297oJ c8297oJ2 = C8297oJ.this;
                        c8297oJ2.i = valueOf;
                        c8297oJ2.a();
                    }
                };
                B4.b(accountManagerFacade, (List) obj2, q2);
            }
        });
    }

    @Override // defpackage.InterfaceC0408Dd2
    public final Object j(Callback callback) {
        return (Boolean) this.a.j(callback);
    }

    @Override // defpackage.InterfaceC0079Ap3
    public final Object get() {
        return (Boolean) this.a.get();
    }

    public final void a() {
        C0538Ed2 c0538Ed2 = this.a;
        if (c0538Ed2.get() != null) {
            return;
        }
        Boolean bool = this.i;
        if (bool == null) {
            Boolean bool2 = this.h;
            bool = bool2 != null && !bool2.booleanValue() ? Boolean.FALSE : null;
        }
        if (bool == null) {
            return;
        }
        EI2.n(SystemClock.elapsedRealtime() - this.g, "MobileFre.ChildAccountStatusDuration");
        c0538Ed2.a(bool);
    }
}
