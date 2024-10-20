package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5539gH1 extends GW1 {
    @Override // defpackage.GW1
    public final void b(Iterator it, C0102Au1 c0102Au1) {
        if (it.hasNext()) {
            Object next = it.next();
            boolean hasNext = it.hasNext();
            String str = this.a;
            if (!hasNext) {
                c0102Au1.a(next, str);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            sb.append(']');
            c0102Au1.a(sb.toString(), str);
        }
    }

    public C5539gH1() {
        super("group_by", Object.class, true, true);
    }
}
