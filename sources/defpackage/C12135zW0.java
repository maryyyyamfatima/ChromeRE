package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zW0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C12135zW0 {
    public C11792yW0 a;

    public final synchronized void a(C11792yW0 c11792yW0) {
        c11792yW0.getClass();
        synchronized (C11792yW0.y) {
            c11792yW0.g = true;
        }
        if (this.a == c11792yW0) {
            this.a = null;
        }
        notifyAll();
    }
}
