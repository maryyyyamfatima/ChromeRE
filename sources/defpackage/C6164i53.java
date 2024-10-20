package defpackage;

import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i53, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6164i53 extends AbstractC11620y {
    public final Iterator h;
    public final /* synthetic */ C6506j53 i;

    public C6164i53(C6506j53 c6506j53) {
        this.i = c6506j53;
        this.h = c6506j53.a.iterator();
    }

    @Override // defpackage.AbstractC11620y
    public final Object a() {
        Object next;
        do {
            Iterator it = this.h;
            if (!it.hasNext()) {
                this.a = 3;
                return null;
            }
            next = it.next();
        } while (!this.i.g.contains(next));
        return next;
    }
}
