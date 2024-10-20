package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qN2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9006qN2 {
    public final C9006qN2 a;
    public final C9645sE1 b;
    public final Object c;
    public final Rect d;
    public final int e;
    public final int f;
    public ArrayList g;

    public C9006qN2(C9006qN2 c9006qN2, C9645sE1 c9645sE1, HashMap hashMap, Rect rect, Rect rect2, int i) {
        this.a = c9006qN2;
        this.b = c9645sE1;
        this.c = hashMap;
        this.d = rect;
        this.e = c9006qN2 != null ? c9006qN2.e + rect.left : 0;
        this.f = c9006qN2 != null ? rect.top + c9006qN2.f : 0;
    }

    public final int a() {
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }
}
