package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5564gM1 {
    public final ArrayList a;
    public final ArrayList b;
    public final List c;

    public C5564gM1(List list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(((C5220fM1) list.get(i)).b.a());
            this.b.add(((C5220fM1) list.get(i)).c.a());
        }
    }
}
