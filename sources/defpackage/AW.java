package defpackage;

import java.util.Comparator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AW implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        BW bw = (BW) obj;
        BW bw2 = (BW) obj2;
        return (((bw2.i - bw2.h) + 1) * (((bw2.g - bw2.f) + 1) * ((bw2.e - bw2.d) + 1))) - (((bw.i - bw.h) + 1) * (((bw.g - bw.f) + 1) * ((bw.e - bw.d) + 1)));
    }
}
