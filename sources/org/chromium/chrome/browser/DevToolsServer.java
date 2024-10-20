package org.chromium.chrome.browser;

import J.N;
import defpackage.AbstractC9771sd;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DevToolsServer {
    public final long a = N.M7TBtHQi(this, "chrome");

    public static boolean checkDebugPermission(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(V60.a.getPackageName());
        sb.append(".permission.DEBUG");
        return AbstractC9771sd.a(i, i2, V60.a, sb.toString()) == 0;
    }
}
