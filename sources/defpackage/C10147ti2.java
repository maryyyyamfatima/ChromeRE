package defpackage;

import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ti2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10147ti2 {
    public static final C9119qi2 e = new C9119qi2();
    public final List a;
    public final C9804si2 d;
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final C1439Lb3 b = new C1439Lb3(0);

    public C10147ti2(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        int size = arrayList.size();
        int i = Integer.MIN_VALUE;
        C9804si2 c9804si2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            C9804si2 c9804si22 = (C9804si2) arrayList.get(i2);
            int i3 = c9804si22.e;
            if (i3 > i) {
                c9804si2 = c9804si22;
                i = i3;
            }
        }
        this.d = c9804si2;
    }
}
