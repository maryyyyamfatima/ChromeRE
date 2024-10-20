package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: x41, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11304x41 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public static void a(M74 m74, M74 m742, String str) {
        if (!m74.b.remove(m742)) {
            throw new RuntimeException("Tried to remove non-existent input!");
        }
        LinkedHashMap linkedHashMap = m742.a;
        if (linkedHashMap == null || linkedHashMap.remove(str) == null) {
            throw new RuntimeException(AbstractC4809e90.a("Tried to remove non-existent input with name: ", str));
        }
    }
}
