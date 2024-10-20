package defpackage;

import J.N;
import android.accounts.Account;
import org.chromium.components.signin.ChildAccountInfoFetcher;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5891hJ implements Q2 {
    public final /* synthetic */ ChildAccountInfoFetcher a;

    @Override // defpackage.Q2
    public final void a(boolean z, Account account) {
        ChildAccountInfoFetcher childAccountInfoFetcher = this.a;
        CoreAccountInfo coreAccountInfo = childAccountInfoFetcher.b;
        coreAccountInfo.getEmail();
        N.MBZpZMbr(childAccountInfoFetcher.a, coreAccountInfo.getId(), z);
    }
}
