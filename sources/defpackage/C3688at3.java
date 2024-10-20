package defpackage;

import android.accounts.Account;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.ui.signin.SyncConsentFragmentBase;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: at3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3688at3 implements Callback {
    public final /* synthetic */ SyncConsentFragmentBase a;
    public final /* synthetic */ String g;
    public final /* synthetic */ Runnable h;
    public final /* synthetic */ boolean i;

    public /* synthetic */ C3688at3(SyncConsentFragmentBase syncConsentFragmentBase, String str, Runnable runnable, boolean z) {
        this.a = syncConsentFragmentBase;
        this.g = str;
        this.h = runnable;
        this.i = z;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        int i = SyncConsentFragmentBase.q0;
        SyncConsentFragmentBase syncConsentFragmentBase = this.a;
        syncConsentFragmentBase.getClass();
        Account d = B4.d(this.g, (List) obj);
        Runnable runnable = this.h;
        if (d == null) {
            runnable.run();
        } else {
            AbstractC9966tA.a(C1202Jg1.a()).d(syncConsentFragmentBase.m0, d, new C7124kt3(syncConsentFragmentBase, this.i, runnable));
        }
    }
}
