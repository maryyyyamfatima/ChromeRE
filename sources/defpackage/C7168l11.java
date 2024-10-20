package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7168l11 extends C6824k11 {
    public final C4502dG0 a;

    public C7168l11(C4502dG0 c4502dG0) {
        this.a = c4502dG0;
    }

    @Override // defpackage.C6824k11
    public final void a(String str, Activity activity) {
        if (this.a.a(new U44())) {
            activity.startActivityForResult(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 224).putExtra("extra.accountName", str), 0);
        }
    }
}
