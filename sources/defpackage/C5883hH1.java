package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hH1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5883hH1 extends GW1 {
    public C5883hH1() {
        super("tags", ME3.class, false, true);
    }

    @Override // defpackage.GW1
    public final void a(Object obj, C0102Au1 c0102Au1) {
        FE3 fe3 = ((ME3) obj).a.h;
        fe3.getClass();
        int i = 0;
        while (true) {
            if (!(i < fe3.size())) {
                return;
            }
            if (i < fe3.size()) {
                Object obj2 = fe3.g.a[fe3.a() + i];
                i++;
                Map.Entry entry = (Map.Entry) obj2;
                if (!((Set) entry.getValue()).isEmpty()) {
                    Iterator it = ((Set) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        c0102Au1.a(it.next(), (String) entry.getKey());
                    }
                } else {
                    c0102Au1.a(null, (String) entry.getKey());
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
