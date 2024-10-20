package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y41, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11647y41 {
    public final C4294cg0 a;
    public RV3 d;
    public final C11304x41 b = new C11304x41();
    public final ArrayList c = new ArrayList();
    public boolean e = false;
    public boolean f = false;

    public C11647y41(C4294cg0 c4294cg0) {
        this.a = c4294cg0;
    }

    public final void a(M74 m74, M74 m742, String str) {
        if (this.f) {
            throw new RuntimeException("Trying to add binding after DataFlowGraph has already been activated.");
        }
        C11304x41 c11304x41 = this.b;
        c11304x41.a.add(m74);
        c11304x41.b.add(m742);
        c11304x41.c.add(str);
        ArrayList arrayList = this.c;
        arrayList.add(m74);
        arrayList.add(m742);
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        int i = 0;
        this.e = false;
        C4294cg0 c4294cg0 = this.a;
        synchronized (c4294cg0) {
            if (c4294cg0.b.remove(this)) {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    M74 m74 = (M74) arrayList.get(i2);
                    HashMap hashMap = c4294cg0.d;
                    C3951bg0 c3951bg0 = (C3951bg0) hashMap.get(m74);
                    int i3 = c3951bg0.b - 1;
                    c3951bg0.b = i3;
                    if (i3 == 0) {
                        hashMap.remove(m74);
                    }
                }
                if (c4294cg0.b.isEmpty()) {
                    ((C5557gL) c4294cg0.a).a();
                    c4294cg0.c.clear();
                    if (!c4294cg0.d.isEmpty()) {
                        throw new RuntimeException("Failed to clean up all nodes");
                    }
                }
                c4294cg0.e = true;
            } else {
                throw new RuntimeException("Tried to unregister non-existent binding");
            }
        }
        C11304x41 c11304x41 = this.b;
        while (true) {
            ArrayList arrayList2 = c11304x41.a;
            if (i >= arrayList2.size()) {
                return;
            }
            M74 m742 = (M74) arrayList2.get(i);
            M74 m743 = (M74) c11304x41.b.get(i);
            String str = (String) c11304x41.c.get(i);
            LinkedHashMap linkedHashMap = m743.a;
            if ((linkedHashMap == null ? null : (M74) linkedHashMap.get(str)) == m742) {
                C11304x41.a(m742, m743, str);
            }
            i++;
        }
    }
}
