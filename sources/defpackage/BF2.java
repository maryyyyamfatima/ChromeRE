package defpackage;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 BF2, still in use, count: 1, list:
  (r1v1 BF2) from 0x004b: INVOKE (r11v3 android.util.SparseArray), (1 int), (r1v1 BF2) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:34)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BF2 {
    a,
    /* JADX INFO: Fake field, exist only in values array */
    EF1,
    /* JADX INFO: Fake field, exist only in values array */
    EF3,
    /* JADX INFO: Fake field, exist only in values array */
    EF5,
    /* JADX INFO: Fake field, exist only in values array */
    EF7,
    /* JADX INFO: Fake field, exist only in values array */
    EF9;

    public static BF2[] values() {
        return (BF2[]) g.clone();
    }

    static {
        BF2 bf2 = a;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, bf2);
        sparseArray.put(1, r1);
        sparseArray.put(2, r3);
        sparseArray.put(3, r5);
        sparseArray.put(4, r7);
        sparseArray.put(-1, r9);
    }

    public BF2() {
    }
}
