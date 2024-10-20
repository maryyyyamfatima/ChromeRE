package defpackage;

import android.content.ComponentName;
import org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wG1 */
/* loaded from: classes.dex */
public final class C11027wG1 implements UX3 {
    public boolean a;
    public final /* synthetic */ C1193Je2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ C11370xG1 d;

    public C11027wG1(C11370xG1 c11370xG1, C1193Je2 c1193Je2, long j) {
        this.d = c11370xG1;
        this.b = c1193Je2;
        this.c = j;
    }

    @Override // defpackage.UX3
    public final void b(ComponentName componentName, int i) {
        if (this.a) {
            return;
        }
        this.a = true;
        C11370xG1 c11370xG1 = this.d;
        c11370xG1.getClass();
        boolean z = i == 1;
        c11370xG1.a.f(this.b, componentName.getPackageName(), 4, i);
        c11370xG1.c.getClass();
        EI2.b("TrustedWebActivity.LocationPermissionRequestIsGranted", z);
        InstalledWebappBridge.b(i, this.c);
    }

    @Override // defpackage.UX3
    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.d.a.e(4, this.b);
        InstalledWebappBridge.b(2, this.c);
    }
}
