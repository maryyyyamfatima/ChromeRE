package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsSessionToken;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: df0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4632df0 {
    public final /* synthetic */ CustomTabsSessionToken a;

    public C4632df0(CustomTabsSessionToken customTabsSessionToken) {
        this.a = customTabsSessionToken;
    }

    public final void a(String str, Bundle bundle) {
        try {
            ((C7702mb1) this.a.a).a(str, bundle);
        } catch (RemoteException unused) {
            Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
        }
    }
}
