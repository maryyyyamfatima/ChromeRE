package defpackage;

import java.util.ArrayDeque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C9593s5 {
    public final ArrayDeque a = new ArrayDeque(100);
    public final IS0 b;

    public C9593s5(IS0 is0) {
        this.b = is0;
    }

    public final synchronized void a(InterfaceC6882kB0 interfaceC6882kB0) {
        if (this.a.isEmpty()) {
            IS0 is0 = this.b;
            is0.k = true;
            if (is0.i.a() > 0 || is0.k) {
                is0.a();
            }
        }
        this.a.add(interfaceC6882kB0);
    }
}
