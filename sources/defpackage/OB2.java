package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OB2 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        int i = T60.a.getInt("android_restore_status", 0);
        if (i != 5) {
            EI2.h(i, 5, "Android.RestoreResult");
            HM.a(5);
        }
    }
}
