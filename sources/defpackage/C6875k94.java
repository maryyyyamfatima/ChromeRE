package defpackage;

import java.util.Comparator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k94, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6875k94 implements Comparator {
    public final /* synthetic */ int a;

    public C6875k94(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C7219l94 c7219l94 = (C7219l94) obj;
        C7219l94 c7219l942 = (C7219l94) obj2;
        int i = c7219l94.a;
        int i2 = i < 8000 ? i * 1 : ((i - 8000) * 4) + 8000;
        int i3 = c7219l94.b;
        int i4 = this.a;
        int abs = Math.abs(i4 - i3);
        int i5 = (abs < 5000 ? abs * 1 : ((abs - 5000) * 3) + 5000) + i2;
        int i6 = c7219l942.a;
        int i7 = i6 < 8000 ? i6 * 1 : ((i6 - 8000) * 4) + 8000;
        int abs2 = Math.abs(i4 - c7219l942.b);
        return i5 - ((abs2 < 5000 ? abs2 * 1 : ((abs2 - 5000) * 3) + 5000) + i7);
    }
}
