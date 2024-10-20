package defpackage;

import android.util.SparseArray;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 W22, still in use, count: 1, list:
  (r0v0 W22) from 0x0108: INVOKE (r4v8 android.util.SparseArray), (0 int), (r0v0 W22) VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:52)
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
public final class W22 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("MOBILE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("WIFI"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("MOBILE_MMS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("MOBILE_SUPL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("MOBILE_DUN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("MOBILE_HIPRI"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("WIMAX"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("BLUETOOTH"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("DUMMY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("ETHERNET"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("MOBILE_FOTA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("MOBILE_IMS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("MOBILE_CBS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("WIFI_P2P"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("MOBILE_IA"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("MOBILE_EMERGENCY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("PROXY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("VPN"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("NONE");

    public static final SparseArray a;

    public static W22[] values() {
        return (W22[]) g.clone();
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
        sparseArray.put(-1, r2);
    }

    public W22(String str) {
    }
}
