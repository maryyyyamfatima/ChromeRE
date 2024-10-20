package defpackage;

import android.content.Intent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class T31 extends Exception {
    public final Intent a;
    public final int g;

    public T31(int i, Intent intent) {
        super("Google Play Services not available");
        this.a = intent;
        this.g = i;
    }
}
