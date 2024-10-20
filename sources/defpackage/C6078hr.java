package defpackage;

import android.util.Pair;
import java.text.Collator;
import java.util.Comparator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6078hr implements Comparator {
    public final /* synthetic */ Collator a;

    public C6078hr(Collator collator) {
        this.a = collator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C1021Hw0 c1021Hw0 = (C1021Hw0) obj;
        C1021Hw0 c1021Hw02 = (C1021Hw0) obj2;
        int compare = this.a.compare((CharSequence) ((Pair) c1021Hw0).second, (CharSequence) ((Pair) c1021Hw02).second);
        return compare == 0 ? ((String) ((Pair) c1021Hw0).first).compareTo((String) ((Pair) c1021Hw02).first) : compare;
    }
}
