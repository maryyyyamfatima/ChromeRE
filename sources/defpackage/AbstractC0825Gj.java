package defpackage;

import org.chromium.chrome.browser.vr.ArDelegateImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Gj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0825Gj {
    public static ArDelegateImpl a;
    public static boolean b;

    public static ArDelegateImpl a() {
        if (b) {
            return a;
        }
        try {
            a = (ArDelegateImpl) ArDelegateImpl.class.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        } catch (Throwable th) {
            b = true;
            throw th;
        }
        b = true;
        return a;
    }
}
