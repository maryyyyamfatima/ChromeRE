package defpackage;

import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bp3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4008bp3 {
    public int a;
    public final int b;
    public C4008bp3 c;
    public final HashMap d = new HashMap(0);

    public C4008bp3(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        this.a = i;
        this.b = i2;
        this.c = null;
    }

    public final String toString() {
        return AbstractC9076qb1.a("Node", System.identityHashCode(this));
    }
}
