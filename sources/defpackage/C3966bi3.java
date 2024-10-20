package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bi3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3966bi3 implements Iterable {
    public final /* synthetic */ CharSequence a;
    public final /* synthetic */ C4996ei3 g;

    public final String toString() {
        C1007Ht1 c1007Ht1 = new C1007Ht1(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        c1007Ht1.a(sb, iterator());
        sb.append(']');
        return sb.toString();
    }

    public C3966bi3(C4996ei3 c4996ei3, String str) {
        this.g = c4996ei3;
        this.a = str;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C4996ei3 c4996ei3 = this.g;
        return c4996ei3.c.a(c4996ei3, this.a);
    }
}
