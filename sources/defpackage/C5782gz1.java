package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5782gz1 implements InterfaceC9607s71 {
    public final Map b;
    public volatile Map c;

    public C5782gz1(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    @Override // defpackage.InterfaceC9607s71
    public final Map a() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((C5438fz1) list.get(i)).a;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put((String) entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final String toString() {
        return AbstractC4199cO1.a("LazyHeaders{headers=", String.valueOf(this.b), "}");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5782gz1) {
            return this.b.equals(((C5782gz1) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
