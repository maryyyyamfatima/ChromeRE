package defpackage;

import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bc3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0144Bc3 {
    public static C11622y00 a(C11622y00 c11622y00, Map map, C11198wm0 c11198wm0) {
        boolean z = B10.a;
        if (map == null) {
            return c11622y00;
        }
        for (Map.Entry entry : map.entrySet()) {
            c11622y00.a(entry.getValue(), (String) entry.getKey());
        }
        c11622y00.c = (C5524gE1) c11198wm0.b;
        return c11622y00;
    }
}
