package defpackage;

import android.content.pm.PackageManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xu4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11593xu4 extends RuntimeException {
    public C11593xu4(PackageManager.NameNotFoundException nameNotFoundException) {
        super("Failed to initialize FileStorage", nameNotFoundException);
    }

    public C11593xu4(String str) {
        super(str);
    }
}
