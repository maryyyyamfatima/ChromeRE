package defpackage;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ht1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1007Ht1 {
    public final String a;

    public C1007Ht1(String str) {
        this.a = str;
    }

    public final void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String b(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }
}
