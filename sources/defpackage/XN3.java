package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class XN3 extends ContextWrapper {
    public XN3(Context context) {
        super(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ApplicationInfo getApplicationInfo() {
        ApplicationInfo applicationInfo = new ApplicationInfo(super.getApplicationInfo());
        applicationInfo.targetSdkVersion = 19;
        applicationInfo.flags &= -536870913;
        return applicationInfo;
    }
}
