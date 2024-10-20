package defpackage;

import org.chromium.chrome.browser.ChromeBackupWatcher;
import org.chromium.components.signin.base.AccountInfo;
import org.chromium.components.signin.identitymanager.PrimaryAccountChangeEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class JM implements InterfaceC1072Ig1 {
    public final /* synthetic */ ChromeBackupWatcher a;

    @Override // defpackage.InterfaceC1072Ig1
    public final /* synthetic */ void m(AccountInfo accountInfo) {
    }

    @Override // defpackage.InterfaceC1072Ig1
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.InterfaceC1072Ig1
    public final void o(PrimaryAccountChangeEvent primaryAccountChangeEvent) {
        this.a.onBackupPrefsChanged();
    }

    public JM(ChromeBackupWatcher chromeBackupWatcher) {
        this.a = chromeBackupWatcher;
    }
}
