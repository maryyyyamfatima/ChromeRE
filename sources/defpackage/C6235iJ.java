package defpackage;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.base.ThreadUtils;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.components.signin.ChildAccountInfoFetcher;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6235iJ extends BroadcastReceiver {
    public final /* synthetic */ ChildAccountInfoFetcher a;

    public C6235iJ(ChildAccountInfoFetcher childAccountInfoFetcher) {
        this.a = childAccountInfoFetcher;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object obj = ThreadUtils.a;
        Account account = (Account) intent.getParcelableExtra("account");
        String str = account.name;
        ChildAccountInfoFetcher childAccountInfoFetcher = this.a;
        if (childAccountInfoFetcher.b.getEmail().equals(account.name)) {
            CoreAccountInfo coreAccountInfo = childAccountInfoFetcher.b;
            coreAccountInfo.getEmail();
            AccountManagerFacadeProvider.getInstance().d(CoreAccountInfo.a(coreAccountInfo), new C5891hJ(childAccountInfoFetcher));
        }
    }
}
