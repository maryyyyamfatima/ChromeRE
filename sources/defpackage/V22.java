package defpackage;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 V22, still in use, count: 1, list:
  (r0v0 V22) from 0x011f: INVOKE (r2v11 android.util.SparseArray), (0 int), (r0v0 V22) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:119)
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
public final class V22 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("UNKNOWN_MOBILE_SUBTYPE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("GPRS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("EDGE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("UMTS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("CDMA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("EVDO_0"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("EVDO_A"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("RTT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("HSDPA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("HSUPA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("HSPA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("IDEN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("EVDO_B"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("LTE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("EHRPD"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("HSPAP"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("GSM"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("TD_SCDMA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("IWLAN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("LTE_CA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF196("COMBINED");

    public static final SparseArray a;

    public static V22[] values() {
        return (V22[]) g.clone();
    }

    static {
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, r0);
        sparseArray.put(1, r1);
        sparseArray.put(2, r3);
        sparseArray.put(3, r5);
        sparseArray.put(4, r7);
        sparseArray.put(5, r9);
        sparseArray.put(6, r11);
        sparseArray.put(7, r13);
        sparseArray.put(8, r15);
        sparseArray.put(9, r14);
        sparseArray.put(10, r12);
        sparseArray.put(11, r10);
        sparseArray.put(12, r8);
        sparseArray.put(13, r6);
        sparseArray.put(14, r4);
        sparseArray.put(15, r2);
        sparseArray.put(16, r6);
        sparseArray.put(17, r4);
        sparseArray.put(18, r2);
        sparseArray.put(19, r6);
    }

    public V22(String str) {
    }
}
