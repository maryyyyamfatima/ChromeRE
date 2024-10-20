package defpackage;

import J.N;
import android.app.Activity;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.permissions.PermissionUpdateRequester;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Or2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1907Or2 implements InterfaceC11179wj {
    public final /* synthetic */ PermissionUpdateRequester a;

    public C1907Or2(PermissionUpdateRequester permissionUpdateRequester) {
        this.a = permissionUpdateRequester;
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        PermissionUpdateRequester permissionUpdateRequester = this.a;
        if (i == 6) {
            ApplicationStatus.h(this);
            permissionUpdateRequester.e = null;
            N.ML3pG92D(permissionUpdateRequester.d, false);
        } else if (i == 3) {
            ApplicationStatus.h(this);
            permissionUpdateRequester.e = null;
            permissionUpdateRequester.a();
        }
    }
}
