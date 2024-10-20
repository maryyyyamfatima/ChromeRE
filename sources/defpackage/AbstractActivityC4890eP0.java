package defpackage;

import J.N;
import android.R;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.metrics.UmaUtils;
import org.chromium.chrome.browser.signin.services.FREMobileIdentityConsistencyFieldTrial;
import org.chromium.components.policy.PolicyService;
import org.chromium.components.signin.AccountManagerFacade;
import org.chromium.components.signin.AccountManagerFacadeProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eP0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC4890eP0 extends AbstractActivityC7416ll {
    public boolean T;
    public final C5578gP0 U;
    public final C0538Ed2 V;
    public final C5773gx2 W;
    public final long X;
    public long Y;
    public C8297oJ Z;

    @Override // defpackage.AbstractActivityC7416ll
    public final boolean L0(Intent intent) {
        return false;
    }

    @Override // defpackage.LC
    public final boolean o() {
        return true;
    }

    public AbstractActivityC4890eP0() {
        Object obj = ThreadUtils.a;
        C5578gP0 c5578gP0 = C5578gP0.g;
        if (c5578gP0 == null) {
            c5578gP0 = new C5578gP0();
        } else {
            C5578gP0.g = null;
        }
        this.U = c5578gP0;
        C0538Ed2 c0538Ed2 = new C0538Ed2();
        this.V = c0538Ed2;
        C5773gx2 c5773gx2 = new C5773gx2(c5578gP0, c0538Ed2);
        this.W = c5773gx2;
        this.X = SystemClock.elapsedRealtime();
        c5773gx2.j(new Callback() { // from class: cP0
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                AbstractActivityC4890eP0.this.R0(((Boolean) obj2).booleanValue());
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }
        });
    }

    @Override // defpackage.AbstractActivityC7416ll
    public void P0() {
        AccountManagerFacade accountManagerFacadeProvider = AccountManagerFacadeProvider.getInstance();
        if (FREMobileIdentityConsistencyFieldTrial.isEnabled()) {
            this.Z = new C8297oJ(accountManagerFacadeProvider, this.U);
        } else {
            this.Z = new C8297oJ(accountManagerFacadeProvider, null);
        }
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.VS0, android.app.Activity
    public final void onPause() {
        super.onPause();
        UmaUtils.d = SystemClock.uptimeMillis();
        if (this.T) {
            AbstractC11008wC2.a();
        }
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.VS0, android.app.Activity
    public final void onResume() {
        super.onResume();
        UmaUtils.d();
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.LC
    public void l() {
        super.l();
        this.T = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.Y = elapsedRealtime;
        EI2.n(elapsedRealtime - this.X, "MobileFre.NativeInitialized");
        this.V.a((PolicyService) N.MXHPjU6q());
    }

    @Override // defpackage.AbstractActivityC7416ll, defpackage.LM, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C5773gx2 c5773gx2 = this.W;
        c5773gx2.a.a();
        if (c5773gx2.i != null) {
            PolicyService policyService = (PolicyService) c5773gx2.h.get();
            InterfaceC6459ix2 interfaceC6459ix2 = c5773gx2.i;
            C12157za2 c12157za2 = policyService.b;
            c12157za2.d(interfaceC6459ix2);
            if (c12157za2.isEmpty()) {
                N.MU0pXsSP(policyService.a, policyService);
            }
            c5773gx2.i = null;
        }
        C5578gP0 c5578gP0 = this.U;
        C5234fP0 c5234fP0 = c5578gP0.f;
        if (c5234fP0 != null) {
            c5234fP0.a(true);
        }
        c5578gP0.d.clear();
        c5578gP0.e.clear();
    }

    public final boolean S0() {
        C4547dP0 c4547dP0;
        PendingIntent pendingIntent = (PendingIntent) AbstractC2281Ro1.s(getIntent(), "Extra.FreChromeLaunchIntent");
        boolean j = AbstractC2281Ro1.j(getIntent(), "Extra.FreChromeLaunchIntentIsCct", false);
        if (pendingIntent == null) {
            return false;
        }
        if (j) {
            try {
                c4547dP0 = new C4547dP0(this);
            } catch (PendingIntent.CanceledException e) {
                AbstractC4851eH1.a("FirstRunActivity", "Unable to send PendingIntent.", e);
                return false;
            }
        } else {
            c4547dP0 = null;
        }
        pendingIntent.send(-1, c4547dP0, (Handler) null);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        return true;
    }

    public void R0(boolean z) {
        if (this.T) {
            EI2.n(SystemClock.elapsedRealtime() - this.Y, z ? "MobileFre.PolicyServiceInitDelayAfterNative.WithPolicy2" : "MobileFre.PolicyServiceInitDelayAfterNative.WithoutPolicy2");
        }
    }

    public static void Q0(Intent intent, boolean z) {
        if (AbstractC2281Ro1.j(intent, "Extra.FreChromeLaunchIntentIsCct", false)) {
            CustomTabsConnection.g().u(AbstractC2281Ro1.k(intent, "Extra.FreChromeLaunchIntentExtras"), z);
        }
    }
}
