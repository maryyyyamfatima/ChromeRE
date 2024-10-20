package org.chromium.chrome.browser.crash;

import defpackage.AbstractC6218iF2;
import defpackage.V60;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ChromePureJavaExceptionReporter extends AbstractC6218iF2 {
    public static void d(Throwable th) {
        new ChromePureJavaExceptionReporter().b(th);
    }

    public ChromePureJavaExceptionReporter() {
        super(V60.a.getCacheDir());
    }
}
