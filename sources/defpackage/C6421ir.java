package defpackage;

import android.util.Pair;
import java.text.Collator;
import java.util.Comparator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ir, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6421ir implements Comparator {
    public final /* synthetic */ Collator a;

    public C6421ir(Collator collator) {
        this.a = collator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare((CharSequence) ((Pair) ((C1021Hw0) obj)).second, (CharSequence) ((Pair) ((C1021Hw0) obj2)).second);
    }
}
